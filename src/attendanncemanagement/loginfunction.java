package attendanncemanagement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class loginfunction {

public static void login(JTextField jTextField5, JPasswordField jPasswordField1, JFrame currentFrame) {
        String userId = jTextField5.getText().trim();
        String password = String.valueOf(jPasswordField1.getPassword()).trim();

        if (verifyCredentials(userId, password)) {
            JOptionPane.showMessageDialog(currentFrame, "Login successful!");
            GeneralForm generalForm = new GeneralForm();
            generalForm.setVisible(true);
            generalForm.pack();
            generalForm.setLocationRelativeTo(null);
            currentFrame.dispose();
        } else {
            JOptionPane.showMessageDialog(currentFrame, "Invalid email or password");
        }
    }

    private static boolean verifyCredentials(String userId, String password) {
        try {
            File file = new File("data.txt");
            if (!file.exists()) {
                System.out.println("No user data found. Please sign up first.");
                return false;
            }

            Scanner fileScanner = new Scanner(file);
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine().trim(); // Read the whole line
                String[] credentials = line.split("\\s+"); // Split by whitespace
                if (credentials.length >= 4) { // Ensure there are enough elements
                    String id = credentials[0];
                    String pass = credentials[1];

                    // Debug output
                    System.out.println("Checking ID: " + id + ", Password: " + pass);

                    if (id.equals(userId) && pass.equals(password)) {
                        fileScanner.close();
                        return true;
                    }
                }
            }
            fileScanner.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return false;
    }
       
    public static void forgetPassword(JFrame currentFrame) {
        String userId = JOptionPane.showInputDialog(currentFrame, "Enter your username:");
        String securityAnswer = JOptionPane.showInputDialog(currentFrame, "Enter your security answer:");

        String password = retrievePassword(userId, securityAnswer);

        if (password != null) {
            JOptionPane.showMessageDialog(currentFrame, "Your password is: " + password);
        } else {
            JOptionPane.showMessageDialog(currentFrame, "Invalid username or security answer");
        }
    }

    private static String retrievePassword(String userId, String securityAnswer) {
        try {
            File file = new File("data.txt");
            if (!file.exists()) {
                System.out.println("No user data found. Please sign up first.");
                return null;
            }

            Scanner fileScanner = new Scanner(file);
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine().trim(); // Read the whole line
                String[] credentials = line.split("\\s+"); // Split by whitespace
                if (credentials.length >= 4) { // Ensure there are enough elements
                    String id = credentials[0];
                    String pass = credentials[1];
                    String secAnswer = credentials[3];

                    if (id.equals(userId) && secAnswer.equals(securityAnswer)) {
                        fileScanner.close();
                        return pass;
                    }
                }
            }
            fileScanner.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return null;
    }
    
    public static void gotoSignupFrame(JFrame currentFrame) {
        SignUpForm signupFrame = new SignUpForm();
        signupFrame.setVisible(true);
        signupFrame.pack();
        signupFrame.setLocationRelativeTo(null);
        currentFrame.dispose();
    }

}

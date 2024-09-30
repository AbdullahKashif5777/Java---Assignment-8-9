package attendanncemanagement;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class signupfunction {

    static void signup(JTextField jTextField1, JPasswordField jPasswordField1, JTextField jTextField2, JTextField jTextField3, JComboBox<String> jComboBox1, JFrame currentFrame) {
        String userId = jTextField1.getText();
        String password = new String(jPasswordField1.getPassword());
        String securityQuestion = jTextField2.getText();
        String securityAnswer = jTextField3.getText();
        String selectedOption = (String) jComboBox1.getSelectedItem(); // Get selected item from JComboBox

        if (userId.isEmpty() || password.isEmpty() || securityQuestion.isEmpty() || securityAnswer.isEmpty() || selectedOption == null) {
            JOptionPane.showMessageDialog(currentFrame, "Please fill in all fields.");
            return;
        }

        try {
            File file = new File("data.txt");
            if (!file.exists()) {
                file.createNewFile();
            }

            boolean userExists = false;

            // Check if user already exists
            Scanner fileScanner = new Scanner(file);
            while (fileScanner.hasNext()) {
                String i = fileScanner.next();
                String p = fileScanner.next();
                String sq = fileScanner.nextLine().trim();

                if (i.equals(userId)) {
                    userExists = true;
                    break;
                }
            }
            fileScanner.close();

            if (userExists) {
                JOptionPane.showMessageDialog(currentFrame, "User ID already exists.");
            } else {
                // Write new user to the file, including the JComboBox selection
                PrintWriter writer = new PrintWriter(new FileWriter(file, true));
                writer.println(userId + " " + password + " " + securityQuestion + ": " + securityAnswer + " " + selectedOption);
                writer.close();

                JOptionPane.showMessageDialog(currentFrame, "New User's Account Created Successfully.");
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(currentFrame, "Error: " + e.getMessage());
        }
        
        // Navigate to the login page
        LoginForm loginFrame = new LoginForm();
        loginFrame.setVisible(true);
        loginFrame.pack();
        loginFrame.setLocationRelativeTo(null);
        currentFrame.dispose();
    }

    static void gotoLoginPage() {
        LoginForm loginframe = new LoginForm();
        loginframe.setVisible(true);
    }
}

package attendanncemanagement;

import java.awt.*;
import javax.swing.*;

public class functions {
    
public static void showHomeScreen(JPanel jPanel2) {
    // Create a new JPanel for the information display
    JPanel infoPanel = new JPanel();
    infoPanel.setLayout(new GridLayout(3, 1)); // Vertical layout for 3 labels
    infoPanel.setBackground(Color.GRAY); // Set background color to grey

    // Create labels
    JLabel label1 = new JLabel("Total Registered Courses: " + getTotalCourses());
    JLabel label2 = new JLabel("Total Registered Students: " + getTotalStudents());
    JLabel label3 = new JLabel("Total Registered Teachers: " + getTotalTeachers());

    // Set font for labels
    label1.setFont(new Font("Segoe UI", Font.BOLD, 24));
    label2.setFont(new Font("Segoe UI", Font.BOLD, 24));
    label3.setFont(new Font("Segoe UI", Font.BOLD, 24));

    // Set border for rectangle shape
    label1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
    label2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
    label3.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

    // Add labels to infoPanel
    infoPanel.add(label1);
    infoPanel.add(label2);
    infoPanel.add(label3);

    // Set jPanel2 layout to BorderLayout
    jPanel2.setLayout(new BorderLayout());

    // Remove any previous components but not the JList
    jPanel2.removeAll(); 

    // Add the existing JList (jScrollPane1) to the left part of jPanel2
    JScrollPane jScrollPane1 = (JScrollPane) jPanel2.getComponent(0);
    jPanel2.add(jScrollPane1, BorderLayout.WEST);

    // Add the infoPanel to the right part of jPanel2
    jPanel2.add(infoPanel, BorderLayout.CENTER);

    // Set preferred size for infoPanel to take more than half of jPanel2's width
    Dimension preferredSize = new Dimension((int) (jPanel2.getWidth() * 0.6), jPanel2.getHeight());
    infoPanel.setPreferredSize(preferredSize);

    // Refresh the panel
    jPanel2.revalidate();
    jPanel2.repaint();
}


    public static void showTeacherManagement(JPanel jPanel2) {
        jPanel2.removeAll(); // Clear the panel

        JLabel label = new JLabel("Manage Teachers");
        label.setFont(new Font("Segoe UI", Font.BOLD, 24));
        jPanel2.add(label);

        // Add more components (like buttons, tables) as needed

        jPanel2.revalidate(); // Refresh the panel
        jPanel2.repaint();    // Repaint the panel
    }

    public static void showCourseManagement(JPanel jPanel2) {
        jPanel2.removeAll(); // Clear the panel

        JLabel label = new JLabel("Manage Courses");
        label.setFont(new Font("Segoe UI", Font.BOLD, 24));
        jPanel2.add(label);

        // Add components for course management

        jPanel2.revalidate(); // Refresh the panel
        jPanel2.repaint();    // Repaint the panel
    }

    public static void showStudentManagement(JPanel jPanel2) {
        jPanel2.removeAll(); // Clear the panel

        JLabel label = new JLabel("Manage Students");
        label.setFont(new Font("Segoe UI", Font.BOLD, 24));
        jPanel2.add(label);

        // Add components for student management

        jPanel2.revalidate(); // Refresh the panel
        jPanel2.repaint();    // Repaint the panel
    }

    public static void showEnrollmentManagement(JPanel jPanel2) {
        jPanel2.removeAll(); // Clear the panel

        JLabel label = new JLabel("Manage Enrollments");
        label.setFont(new Font("Segoe UI", Font.BOLD, 24));
        jPanel2.add(label);

        // Add components for enrollment management

        jPanel2.revalidate(); // Refresh the panel
        jPanel2.repaint();    // Repaint the panel
    }

    public static void showAttendancePortal(JPanel jPanel2) {
        jPanel2.removeAll(); // Clear the panel

        JLabel label = new JLabel("Attendance Portal");
        label.setFont(new Font("Segoe UI", Font.BOLD, 24));
        jPanel2.add(label);

        // Add components for attendance management

        jPanel2.revalidate(); // Refresh the panel
        jPanel2.repaint();    // Repaint the panel
    }

    // Sample methods to retrieve total counts
    private static int getTotalCourses() {
        return 5; // Replace with actual logic
    }

    private static int getTotalStudents() {
        return 100; // Replace with actual logic
    }

    private static int getTotalTeachers() {
        return 10; // Replace with actual logic
    }
    
}

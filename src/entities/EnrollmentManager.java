/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.io.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class EnrollmentManager {

    // Method to enroll a student in a course with a section and update the JTable and file
    public static void enrollStudent(JComboBox<String> select_student, JComboBox<String> select_course_enroll, JComboBox<String> select_section_enroll, JTable enrolled_courses) {
        String studentName = (String) select_student.getSelectedItem(); // Get student name
        String courseName = (String) select_course_enroll.getSelectedItem(); // Get course name
        String sectionName = (String) select_section_enroll.getSelectedItem(); // Get section name
        String status = "Active"; // Enrollment status

        // Validate that all required fields are selected
        if (studentName != null && courseName != null && sectionName != null) {
            // Add enrollment details to the JTable
            DefaultTableModel tableModel = (DefaultTableModel) enrolled_courses.getModel();
            tableModel.addRow(new Object[] {studentName, courseName, sectionName, status});

            // Save enrollment details to the file
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("enrollments.txt", true))) {
                writer.write("Student: " + studentName);
                writer.newLine();
                writer.write("Course: " + courseName);
                writer.newLine();
                writer.write("Section: " + sectionName);
                writer.newLine();
                writer.write("Status: " + status);
                writer.newLine();
                writer.newLine(); // Blank line for separation
                System.out.println("Enrollment details saved successfully.");
            } catch (IOException e) {
                System.out.println("Error saving enrollment details: " + e.getMessage());
            }

            // Optionally, reset the JComboBoxes (if required after enrollment)
            select_student.setSelectedIndex(-1); // Clear selection
            select_course_enroll.setSelectedIndex(-1); // Clear selection
            select_section_enroll.setSelectedIndex(-1); // Clear selection
        } else {
            // Display error message if required fields are not selected
            JOptionPane.showMessageDialog(null, "Please select a student, course, and section.", "Missing Information", JOptionPane.ERROR_MESSAGE);
        }
    }
}


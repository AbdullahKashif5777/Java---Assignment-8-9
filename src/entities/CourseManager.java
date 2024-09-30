
package entities;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class CourseManager {
    
        public static void addCourseRow(JTable course_list, String courseName, String courseCode)
    {
        DefaultTableModel model = (DefaultTableModel) course_list.getModel();

        model.addRow(new Object[]{courseName, courseCode});
    }
        
    public static void removeCourseRow(JTable course_list, int rowIndex) 
            
    {
        DefaultTableModel model = (DefaultTableModel) course_list.getModel();
        if (rowIndex >= 0 && rowIndex < model.getRowCount()) {
            model.removeRow(rowIndex);
        } else {
            System.out.println("Invalid row index: " + rowIndex);
        }
    }

    public static void saveCourseDetails(JTextField courseNameField, JTextField courseCodeField, JTable courseList, JComboBox<String> select_course_a, JComboBox<String> select_section_a, JComboBox<String> select_course_enroll, JComboBox<String> select_course)
            
    {
        String courseName = courseNameField.getText();
        String courseCode = courseCodeField.getText(); 
        int rowCount = courseList.getRowCount(); 

        if (rowCount > 0) {
            StringBuilder sectionInfo = new StringBuilder();
            DefaultTableModel model = (DefaultTableModel) courseList.getModel();
            for (int row = 0; row < rowCount; row++) {
                sectionInfo.append(model.getValueAt(row, 0)).append(", ");
            }

            if (sectionInfo.length() > 0) {
                sectionInfo.setLength(sectionInfo.length() - 2);
            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter("courses.txt", true))) {
                writer.write("Course Name: " + courseName);
                writer.newLine();
                writer.write("Course Code: " + courseCode);
                writer.newLine();
                writer.write("Sections: " + sectionInfo.toString());
                writer.newLine();
                writer.newLine(); 
                System.out.println("Course details saved successfully.");
            } catch (IOException e) {
                System.out.println("Error saving course details: " + e.getMessage());
            }

            DefaultComboBoxModel<String> courseModelA = (DefaultComboBoxModel<String>) select_course_a.getModel();
            DefaultComboBoxModel<String> courseModelEnroll = (DefaultComboBoxModel<String>) select_course_enroll.getModel();
            DefaultComboBoxModel<String> courseModelSelect = (DefaultComboBoxModel<String>) select_course.getModel();

            if (courseModelA.getIndexOf(courseName) == -1) {
                select_course_a.addItem(courseName);
            }

            if (courseModelEnroll.getIndexOf(courseName) == -1) {
                select_course_enroll.addItem(courseName);
            }

            if (courseModelSelect.getIndexOf(courseName) == -1) {
                select_course.addItem(courseName);
            }

            courseNameField.setText(""); 
            courseCodeField.setText(""); 
            model.setRowCount(0); 
        } else {
            System.out.println("No rows in the table. Please add section data.");
        }
    }

    public static void updateSectionComboBox(JComboBox<String> select_course_a, JComboBox<String> select_section_a)
            
    {
        String selectedCourse = (String) select_course_a.getSelectedItem(); 

        if (selectedCourse != null) {
            select_section_a.removeAllItems();

            try (BufferedReader reader = new BufferedReader(new FileReader("courses.txt"))) {
                String line;
                boolean courseFound = false;
                while ((line = reader.readLine()) != null) {
                    if (line.startsWith("Course Name: ")) {
                        String courseName = line.substring(13); 
                        if (courseName.equals(selectedCourse)) {
                            courseFound = true;
                        } else {
                            courseFound = false;
                        }
                    } else if (courseFound && line.startsWith("Sections: ")) {
                        String[] sections = line.substring(10).split(", "); 
                        for (String section : sections) {
                            select_section_a.addItem(section); 
                        }
                        break;
                    }
                }
            } catch (IOException e) {
                System.out.println("Error reading course sections: " + e.getMessage());
            }
        }
    }
    
}

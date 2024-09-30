
package attendanncemanagement;

import entities.Course;
import entities.CourseManager;
import entities.EnrollmentManager;
import entities.Section;
import entities.University;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class GeneralForm extends javax.swing.JFrame {
private ArrayList<Section> sections;
    public GeneralForm() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        st_count = new javax.swing.JLabel();
        pic_slider = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        course_name = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        add_section = new javax.swing.JLabel();
        delete_section = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        course_code = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        section_list = new javax.swing.JTable();
        course_add = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        active_attendance = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        fetch_a = new javax.swing.JButton();
        select_section_a = new javax.swing.JComboBox<>();
        select_course_a = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        attendance_sheet = new javax.swing.JTable();
        fetch_a1 = new javax.swing.JButton();
        time1 = new javax.swing.JTextField();
        date1 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel13 = new javax.swing.JPanel();
        stname = new javax.swing.JLabel();
        search_student_name = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        student_list = new javax.swing.JTable();
        jPanel14 = new javax.swing.JPanel();
        select_student = new javax.swing.JComboBox<>();
        select_course_enroll = new javax.swing.JComboBox<>();
        course_reg = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        enrolled_courses = new javax.swing.JTable();
        select_section_enroll = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        profile_name = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        profile_u_name = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        profile_pass = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        profile_security_a = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        profile_security_q = new javax.swing.JComboBox<>();
        profile_role = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        profile_update = new javax.swing.JButton();
        active_update = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel16 = new javax.swing.JPanel();
        stname2 = new javax.swing.JLabel();
        search_student_name2 = new javax.swing.JTextField();
        jScrollPane8 = new javax.swing.JScrollPane();
        student_list2 = new javax.swing.JTable();
        profile_update1 = new javax.swing.JButton();
        status_combo = new javax.swing.JComboBox<>();
        jPanel17 = new javax.swing.JPanel();
        stname1 = new javax.swing.JLabel();
        search_student_name1 = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        student_list1 = new javax.swing.JTable();
        jPanel18 = new javax.swing.JPanel();
        select_teacher = new javax.swing.JComboBox<>();
        select_course = new javax.swing.JComboBox<>();
        course_assign = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        workloadList = new javax.swing.JTable();
        select_section = new javax.swing.JComboBox<>();
        jPanel9 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        user_full_name = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        user_u_name = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        user_pass = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        user_security_a = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        user_security_q = new javax.swing.JComboBox<>();
        user_role = new javax.swing.JComboBox<>();
        jLabel31 = new javax.swing.JLabel();
        user_reg = new javax.swing.JButton();

        jTabbedPane2.setBackground(new java.awt.Color(204, 204, 255));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/home.png"))); // NOI18N
        jLabel1.setText("Home");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/course_icon.png"))); // NOI18N
        jLabel2.setText("Courses Portal");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/student.png"))); // NOI18N
        jLabel3.setText("Student Portal");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/attendance.png"))); // NOI18N
        jLabel4.setText("A-Portal");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/setting.png"))); // NOI18N
        jLabel5.setText("Setting");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/teacher.png"))); // NOI18N
        jLabel6.setText("Teacher Portal");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/logout.png"))); // NOI18N
        jLabel7.setText("Logout");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/user.png"))); // NOI18N
        jLabel8.setText("User Portal");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/list.png"))); // NOI18N
        jLabel9.setText("ADMIN PORTAL");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(75, 75, 75))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(68, 68, 68))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(35, 35, 35)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(53, 53, 53))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel9)
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 600));

        jTabbedPane3.setBackground(new java.awt.Color(204, 204, 255));
        jTabbedPane3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane3MouseClicked(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jPanel10.setToolTipText("Total Registered students in university");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Students");
        jLabel12.setToolTipText("Total Registered students in university");

        st_count.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        st_count.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        st_count.setText("70+");
        st_count.setToolTipText("Total Registered students in university");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pic_slider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                    .addComponent(st_count, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(st_count, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(16, Short.MAX_VALUE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(pic_slider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(25, 25, 25))))
        );

        jPanel3.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 290, 130));

        jPanel11.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jPanel11.setToolTipText("Total instructors in university");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Teachers");
        jLabel13.setToolTipText("Total instructors in university");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("250+");
        jLabel14.setToolTipText("Total instructors in university");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE)
            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 561, -1));

        jPanel12.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jPanel12.setToolTipText("Total Courses offer by university");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Coureses");
        jLabel10.setToolTipText("Total Courses offer by university");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("150+");
        jLabel15.setToolTipText("Total Courses offer by university");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 260, 130));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attendanncemanagement/time-network - Copy.png"))); // NOI18N
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 6, 573, 528));

        jTabbedPane3.addTab("Welcome", jPanel3);

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));

        course_name.setToolTipText("Enter new course name");
        course_name.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Course Name");
        jLabel11.setToolTipText("");

        add_section.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        add_section.setForeground(new java.awt.Color(102, 102, 102));
        add_section.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add_section.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/add.png"))); // NOI18N
        add_section.setText("Section");
        add_section.setToolTipText("Press to create a new section");
        add_section.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_sectionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                add_sectionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                add_sectionMouseExited(evt);
            }
        });

        delete_section.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        delete_section.setForeground(new java.awt.Color(102, 102, 102));
        delete_section.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        delete_section.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/delete.png"))); // NOI18N
        delete_section.setText("Section");
        delete_section.setToolTipText("Press to delete a section");
        delete_section.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delete_sectionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                delete_sectionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                delete_sectionMouseExited(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Course Code");
        jLabel17.setToolTipText("");

        course_code.setToolTipText("Enter new Course Code");
        course_code.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        section_list.setAutoCreateRowSorter(true);
        section_list.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));
        section_list.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        section_list.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Section Name", "days", "Time"
            }
        ));
        section_list.setToolTipText("List of sections created");
        section_list.setShowGrid(true);
        section_list.setSurrendersFocusOnKeystroke(true);
        jScrollPane1.setViewportView(section_list);

        course_add.setBackground(new java.awt.Color(153, 153, 255));
        course_add.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        course_add.setForeground(new java.awt.Color(255, 255, 255));
        course_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/add1.png"))); // NOI18N
        course_add.setText("Create Course");
        course_add.setToolTipText("Press to create a new Course");
        course_add.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        course_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                course_addMouseClicked(evt);
            }
        });
        course_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                course_addActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11)
                                .addComponent(course_name, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(course_code, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel17)))
                        .addComponent(course_add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(add_section)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(delete_section)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 367, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(126, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(course_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(course_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_section)
                    .addComponent(delete_section))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(course_add, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );

        jTabbedPane3.addTab("Course Portal", jPanel4);

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));

        active_attendance.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        active_attendance.setForeground(new java.awt.Color(102, 102, 102));
        active_attendance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/editing.png"))); // NOI18N
        active_attendance.setText("Active");
        active_attendance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                active_attendanceMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                active_attendanceMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                active_attendanceMouseExited(evt);
            }
        });

        date.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        date.setForeground(new java.awt.Color(102, 102, 102));
        date.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        date.setText("Date");
        date.setToolTipText("");
        date.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        time.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        time.setForeground(new java.awt.Color(102, 102, 102));
        time.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        time.setText("time");
        time.setToolTipText("");
        time.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        fetch_a.setBackground(new java.awt.Color(153, 153, 255));
        fetch_a.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        fetch_a.setForeground(new java.awt.Color(255, 255, 255));
        fetch_a.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/list.png"))); // NOI18N
        fetch_a.setText("Create Attendance");

        select_section_a.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        select_section_a.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select Section--", "W1", "W2", "W3", "W4", "W5", "W6" }));
        select_section_a.setToolTipText("Section");
        select_section_a.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));
        select_section_a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select_section_aActionPerformed(evt);
            }
        });

        select_course_a.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        select_course_a.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select Course--", "Programming Fundamental", "Object Oriented Programming", "Mobile App Development", "Web App Development ", "Machine Learning" }));
        select_course_a.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));
        select_course_a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select_course_aActionPerformed(evt);
            }
        });

        attendance_sheet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student  Name", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        attendance_sheet.setToolTipText("Attendance sheet");
        attendance_sheet.setShowGrid(true);
        attendance_sheet.setSurrendersFocusOnKeystroke(true);
        jScrollPane4.setViewportView(attendance_sheet);

        fetch_a1.setBackground(new java.awt.Color(153, 153, 255));
        fetch_a1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        fetch_a1.setForeground(new java.awt.Color(255, 255, 255));
        fetch_a1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/list.png"))); // NOI18N
        fetch_a1.setText("Save");

        time1.setToolTipText("Enter new course name");
        time1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        date1.setToolTipText("Enter new course name");
        date1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                        .addComponent(select_course_a, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                        .addComponent(active_attendance)
                                        .addGap(119, 119, 119)))
                                .addComponent(select_section_a, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addComponent(date)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(date1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fetch_a)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(time)
                                .addGap(18, 18, 18)
                                .addComponent(time1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(76, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fetch_a1))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(date)
                            .addComponent(time)
                            .addComponent(time1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(date1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(active_attendance)
                        .addGap(13, 13, 13)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(select_course_a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(select_section_a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fetch_a))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fetch_a1)
                .addGap(23, 23, 23))
        );

        jTabbedPane3.addTab("A-Portal", jPanel5);

        jPanel6.setBackground(new java.awt.Color(204, 204, 255));

        jTabbedPane4.setBackground(new java.awt.Color(204, 204, 255));
        jTabbedPane4.setForeground(new java.awt.Color(102, 102, 102));
        jTabbedPane4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jPanel13.setBackground(new java.awt.Color(204, 204, 255));

        stname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        stname.setForeground(new java.awt.Color(102, 102, 102));
        stname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stname.setText("Search Student by Name");
        stname.setToolTipText("");

        search_student_name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        search_student_name.setToolTipText("Enter the name of the student to search");
        search_student_name.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        student_list.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Student List", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 255))); // NOI18N
        student_list.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student Name", "Role", "User Name", "Password", "Security Question", "Security Answer"
            }
        ));
        student_list.setToolTipText("List of all students");
        student_list.setEnabled(false);
        student_list.setShowGrid(true);
        jScrollPane2.setViewportView(student_list);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
                    .addComponent(search_student_name))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel13Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(stname)
                    .addContainerGap(451, Short.MAX_VALUE)))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(search_student_name)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel13Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(stname)
                    .addContainerGap(475, Short.MAX_VALUE)))
        );

        jTabbedPane4.addTab("List of Students", jPanel13);

        jPanel14.setBackground(new java.awt.Color(204, 204, 255));

        select_student.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        select_student.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select Student--", "Ali Ahamad", "Junaid Sultan", "Aila Arshad", " " }));
        select_student.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));
        select_student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select_studentActionPerformed(evt);
            }
        });

        select_course_enroll.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        select_course_enroll.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select Course--", "Programming Fundamental", "Object Oriented Programming", "Mobile App Development", "Web App Development ", "Machine Learning" }));
        select_course_enroll.setToolTipText("");
        select_course_enroll.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));
        select_course_enroll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select_course_enrollActionPerformed(evt);
            }
        });

        course_reg.setBackground(new java.awt.Color(153, 153, 255));
        course_reg.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        course_reg.setForeground(new java.awt.Color(255, 255, 255));
        course_reg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/course_icon.png"))); // NOI18N
        course_reg.setText("Enroll");
        course_reg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                course_regMouseClicked(evt);
            }
        });
        course_reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                course_regActionPerformed(evt);
            }
        });

        enrolled_courses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student  Name", "Course", "Section", "Status"
            }
        ));
        enrolled_courses.setToolTipText("Attendance sheet");
        enrolled_courses.setShowGrid(true);
        enrolled_courses.setSurrendersFocusOnKeystroke(true);
        jScrollPane5.setViewportView(enrolled_courses);

        select_section_enroll.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        select_section_enroll.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select Section--", "W1", "W2", "W3", "W4", "W5", "W6" }));
        select_section_enroll.setToolTipText("Section");
        select_section_enroll.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));
        select_section_enroll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select_section_enrollActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 102, 102));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/teacher.png"))); // NOI18N
        jLabel18.setText("Bilal Arif");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 102, 102));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Teacher Name");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(select_course_enroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(select_section_enroll, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(23, 23, 23))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(course_reg)
                        .addGap(46, 46, 46)
                        .addComponent(jLabel19)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel14Layout.createSequentialGroup()
                    .addGap(9, 9, 9)
                    .addComponent(select_student, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(423, Short.MAX_VALUE)))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(select_section_enroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(select_course_enroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(course_reg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel14Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(select_student, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(467, Short.MAX_VALUE)))
        );

        jTabbedPane4.addTab("Enrollment Portal", jPanel14);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Student Portal", jPanel6);

        jPanel7.setBackground(new java.awt.Color(204, 204, 255));

        jPanel15.setBackground(new java.awt.Color(204, 204, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Profile", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(102, 102, 255))); // NOI18N

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 102, 102));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Full Name");
        jLabel20.setToolTipText("");

        profile_name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        profile_name.setToolTipText("Enter full name of the user");
        profile_name.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 102, 102));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("User Name");
        jLabel21.setToolTipText("");

        profile_u_name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        profile_u_name.setToolTipText("Enter user name");
        profile_u_name.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 102, 102));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Password");
        jLabel22.setToolTipText("");

        profile_pass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        profile_pass.setToolTipText("Enter password");
        profile_pass.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(102, 102, 102));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Security Question");
        jLabel23.setToolTipText("");

        profile_security_a.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        profile_security_a.setToolTipText("Enter the answer of security question");
        profile_security_a.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(102, 102, 102));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Role");
        jLabel24.setToolTipText("");

        profile_security_q.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        profile_security_q.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select Security Questions--", "What is your Mother name?", "Your First Pet Name?", "Your First Teacher Name?" }));
        profile_security_q.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        profile_role.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        profile_role.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select Role--", "Student", "Teacher" }));
        profile_role.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(102, 102, 102));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Security Answer");
        jLabel25.setToolTipText("");

        profile_update.setBackground(new java.awt.Color(153, 153, 255));
        profile_update.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        profile_update.setForeground(new java.awt.Color(255, 255, 255));
        profile_update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/editing.png"))); // NOI18N
        profile_update.setText("Update Info");
        profile_update.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(profile_update, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(profile_name, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22)
                            .addComponent(profile_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25)
                            .addComponent(profile_security_a, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel21)
                                .addComponent(profile_u_name)
                                .addComponent(jLabel23)
                                .addComponent(profile_security_q, 0, 238, Short.MAX_VALUE))
                            .addComponent(profile_role, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27))))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(profile_name))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(profile_u_name, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(profile_security_q)
                            .addComponent(profile_pass)))
                    .addComponent(jLabel23))
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(profile_role)
                    .addComponent(profile_security_a))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(profile_update, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        active_update.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        active_update.setForeground(new java.awt.Color(102, 102, 102));
        active_update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/editing.png"))); // NOI18N
        active_update.setText("Active");
        active_update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                active_updateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                active_updateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                active_updateMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(active_update)))
                .addGap(34, 34, 34))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(active_update)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(163, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Settings", jPanel7);

        jPanel8.setBackground(new java.awt.Color(204, 204, 255));

        jTabbedPane5.setBackground(new java.awt.Color(204, 204, 255));
        jTabbedPane5.setForeground(new java.awt.Color(102, 102, 102));
        jTabbedPane5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jPanel16.setBackground(new java.awt.Color(204, 204, 255));

        stname2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        stname2.setForeground(new java.awt.Color(102, 102, 102));
        stname2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stname2.setText("Search Student by Name");
        stname2.setToolTipText("");

        search_student_name2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        search_student_name2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        student_list2.setAutoCreateRowSorter(true);
        student_list2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));
        student_list2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        student_list2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Student Name", "Course", "Section", "Status"
            }
        ));
        student_list2.setRowMargin(3);
        student_list2.setShowGrid(true);
        jScrollPane8.setViewportView(student_list2);

        profile_update1.setBackground(new java.awt.Color(153, 153, 255));
        profile_update1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        profile_update1.setForeground(new java.awt.Color(255, 255, 255));
        profile_update1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/upload.png"))); // NOI18N
        profile_update1.setText("Resolve");
        profile_update1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        status_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pending", "Approved", "Cancelled" }));
        status_combo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));
        status_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                status_comboActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(search_student_name2, javax.swing.GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                        .addComponent(profile_update1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(status_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE))
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel16Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(stname2)
                    .addContainerGap(451, Short.MAX_VALUE)))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(search_student_name2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(profile_update1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(status_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel16Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(stname2)
                    .addContainerGap(457, Short.MAX_VALUE)))
        );

        jTabbedPane5.addTab("Advisor Portal", jPanel16);

        jPanel17.setBackground(new java.awt.Color(204, 204, 255));

        stname1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        stname1.setForeground(new java.awt.Color(102, 102, 102));
        stname1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stname1.setText("Search Teacher by Name");
        stname1.setToolTipText("");

        search_student_name1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        search_student_name1.setToolTipText("Search Teacher by name ");
        search_student_name1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        student_list1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Student List", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 255))); // NOI18N
        student_list1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Teacher Name", "Role", "User Name", "Password", "Security Question", "Security Answer"
            }
        ));
        student_list1.setEnabled(false);
        student_list1.setShowGrid(true);
        jScrollPane6.setViewportView(student_list1);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(search_student_name1)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE))
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel17Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(stname1)
                    .addContainerGap(450, Short.MAX_VALUE)))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(search_student_name1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel17Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(stname1)
                    .addContainerGap(457, Short.MAX_VALUE)))
        );

        jTabbedPane5.addTab("List of Teacher", jPanel17);

        jPanel18.setBackground(new java.awt.Color(204, 204, 255));

        select_teacher.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        select_teacher.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select Teacher--", "Ali Ahamad", "Junaid Sultan", "Aila Arshad", " " }));
        select_teacher.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));
        select_teacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select_teacherActionPerformed(evt);
            }
        });

        select_course.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        select_course.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select Course--", "Programming Fundamental", "Object Oriented Programming", "Mobile App Development", "Web App Development ", "Machine Learning" }));
        select_course.setToolTipText("Section");
        select_course.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));
        select_course.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select_courseActionPerformed(evt);
            }
        });

        course_assign.setBackground(new java.awt.Color(153, 153, 255));
        course_assign.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        course_assign.setForeground(new java.awt.Color(255, 255, 255));
        course_assign.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/course_icon.png"))); // NOI18N
        course_assign.setText("Assigned");

        workloadList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course", "Teacher", "Section", "Class Days", "Class Timing"
            }
        ));
        workloadList.setToolTipText("Attendance sheet");
        workloadList.setShowGrid(true);
        workloadList.setSurrendersFocusOnKeystroke(true);
        jScrollPane7.setViewportView(workloadList);

        select_section.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        select_section.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select Section--", "W1", "W2", "W3", "W4", "W5", "W6" }));
        select_section.setToolTipText("Section");
        select_section.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));
        select_section.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select_sectionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(select_course, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(select_section, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(22, 22, 22))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(course_assign)
                        .addContainerGap(510, Short.MAX_VALUE))))
            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel18Layout.createSequentialGroup()
                    .addGap(9, 9, 9)
                    .addComponent(select_teacher, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(423, Short.MAX_VALUE)))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(select_section, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(select_course, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(course_assign)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel18Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(select_teacher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(449, Short.MAX_VALUE)))
        );

        jTabbedPane5.addTab("Workload Portal", jPanel18);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jTabbedPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Teacher Portal", jPanel8);

        jPanel9.setBackground(new java.awt.Color(204, 204, 255));

        jPanel19.setBackground(new java.awt.Color(204, 204, 255));
        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "User info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(102, 102, 255))); // NOI18N

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(102, 102, 102));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Full Name");
        jLabel26.setToolTipText("");

        user_full_name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        user_full_name.setToolTipText("Enter full name");
        user_full_name.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(102, 102, 102));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("User Name");
        jLabel27.setToolTipText("");

        user_u_name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        user_u_name.setToolTipText("Enter user name");
        user_u_name.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(102, 102, 102));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Password");
        jLabel28.setToolTipText("");

        user_pass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        user_pass.setToolTipText("Enter password");
        user_pass.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(102, 102, 102));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Security Question");
        jLabel29.setToolTipText("");

        user_security_a.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        user_security_a.setToolTipText("Enter the answer of security question");
        user_security_a.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(102, 102, 102));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Role");
        jLabel30.setToolTipText("");

        user_security_q.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        user_security_q.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select Security Questions--", "What is your Mother name?", "Your First Pet Name?", "Your First Teacher Name?" }));
        user_security_q.setToolTipText("Choose security questions for password recovery");
        user_security_q.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        user_role.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        user_role.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select Role--", "Student", "Teacher" }));
        user_role.setToolTipText("Choose the role of user");
        user_role.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(102, 102, 102));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Security Answer");
        jLabel31.setToolTipText("");

        user_reg.setBackground(new java.awt.Color(153, 153, 255));
        user_reg.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        user_reg.setForeground(new java.awt.Color(255, 255, 255));
        user_reg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/add1.png"))); // NOI18N
        user_reg.setText("Register");
        user_reg.setToolTipText("Press to register a new user");
        user_reg.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(user_reg, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26)
                            .addComponent(user_full_name, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28)
                            .addComponent(user_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31)
                            .addComponent(user_security_a, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30)
                            .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel27)
                                .addComponent(user_u_name)
                                .addComponent(jLabel29)
                                .addComponent(user_security_q, 0, 238, Short.MAX_VALUE))
                            .addComponent(user_role, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27))))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(user_full_name))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(user_u_name, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(user_security_q, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addComponent(user_pass)
                                .addGap(3, 3, 3))))
                    .addComponent(jLabel29))
                .addGap(18, 18, 18)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30)
                    .addComponent(jLabel31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(user_role)
                    .addComponent(user_security_a))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(user_reg, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(180, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("User", jPanel9);

        jPanel1.add(jTabbedPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, -40, -1, 640));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void add_sectionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_sectionMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) section_list.getModel();
        model.addRow(new Object[1]);

    }//GEN-LAST:event_add_sectionMouseClicked

    private void add_sectionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_sectionMouseEntered
        // TODO add your handling code here:
        add_section.setBorder(new MatteBorder(0,0,2,0,Color.WHITE));
    }//GEN-LAST:event_add_sectionMouseEntered

    private void add_sectionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_sectionMouseExited
        // TODO add your handling code here:
        add_section.setBorder(null);
    }//GEN-LAST:event_add_sectionMouseExited

    private void delete_sectionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_sectionMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) section_list.getModel();
        int index = model.getRowCount()-1;
        if (index>=0) {
            model.removeRow(index);
        }
        else{
            JOptionPane.showMessageDialog(null, "section table already empty");
        }

    }//GEN-LAST:event_delete_sectionMouseClicked

    private void delete_sectionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_sectionMouseEntered
        // TODO add your handling code here:
        delete_section.setBorder(new MatteBorder(0,0,2,0,Color.WHITE));
    }//GEN-LAST:event_delete_sectionMouseEntered

    private void delete_sectionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_sectionMouseExited
        // TODO add your handling code here:
        delete_section.setBorder(null);
    }//GEN-LAST:event_delete_sectionMouseExited

    private void course_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_course_addActionPerformed
        // TODO add your handling code here:
        if (!course_name.getText().isEmpty()
            && !course_code.getText().isEmpty()) {
            Course c = new Course();
            c.setName(course_name.getText());
            c.setC_code(course_code.getText());
            DefaultTableModel model = (DefaultTableModel) section_list.getModel();
            Section section = null;
            if (model.getRowCount() > 0 && model != null) {
                section = new Section();
                for (int i = 0; i < model.getRowCount(); i++) {//rows
                    for (int j = 0; j < model.getColumnCount(); j++) {//columns
                        section.setName(model.getValueAt(i, j).toString());
                        section.setClass_days(model.getValueAt(i, j).toString());
                        section.setClass_time_slot(model.getValueAt(i, j).toString());
                    }
                    sections.add(section);
                }
                c.setSections(sections);
                boolean dis = University.createCourse(c);
                String msg = (dis)?"course create successfully":"something went wrong";
                University.dialogeMsg(msg);
            } else {
                University.dialogeMsg("No section created till now");
            }
        }
    }//GEN-LAST:event_course_addActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        jTabbedPane3.setSelectedIndex(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        jTabbedPane3.setSelectedIndex(1);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        jTabbedPane3.setSelectedIndex(2);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        jTabbedPane3.setSelectedIndex(3);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        jTabbedPane3.setSelectedIndex(4);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void active_attendanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_active_attendanceMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_active_attendanceMouseClicked

    private void active_attendanceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_active_attendanceMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_active_attendanceMouseEntered

    private void active_attendanceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_active_attendanceMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_active_attendanceMouseExited

    private void select_section_aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select_section_aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_select_section_aActionPerformed

    private void select_course_aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select_course_aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_select_course_aActionPerformed

    private void select_studentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select_studentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_select_studentActionPerformed

    private void select_course_enrollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select_course_enrollActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_select_course_enrollActionPerformed

    private void course_regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_course_regActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_course_regActionPerformed

    private void select_section_enrollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select_section_enrollActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_select_section_enrollActionPerformed

    private void active_updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_active_updateMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_active_updateMouseClicked

    private void active_updateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_active_updateMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_active_updateMouseEntered

    private void active_updateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_active_updateMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_active_updateMouseExited

    private void status_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_status_comboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_status_comboActionPerformed

    private void select_teacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select_teacherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_select_teacherActionPerformed

    private void select_courseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select_courseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_select_courseActionPerformed

    private void select_sectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select_sectionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_select_sectionActionPerformed

    private void jTabbedPane3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane3MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTabbedPane3MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        jTabbedPane3.setSelectedIndex(6);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        jTabbedPane3.setSelectedIndex(5);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void course_addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_course_addMouseClicked
        // TODO add your handling code here:
        CourseManager.saveCourseDetails(course_name, course_code, section_list, select_course_a, select_section_a, select_course_enroll, select_course);
//        CourseManager.updateSectionComboBox(select_course_a, select_section_a);
    }//GEN-LAST:event_course_addMouseClicked

    private void course_regMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_course_regMouseClicked
        // TODO add your handling code here:
      EnrollmentManager.enrollStudent(select_student, select_course_enroll, select_section_enroll, enrolled_courses);
    }//GEN-LAST:event_course_regMouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        signupfunction.gotoLoginPage();
        this.dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GeneralForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GeneralForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GeneralForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GeneralForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GeneralForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel active_attendance;
    private javax.swing.JLabel active_update;
    private javax.swing.JLabel add_section;
    private javax.swing.JTable attendance_sheet;
    private javax.swing.JButton course_add;
    private javax.swing.JButton course_assign;
    private javax.swing.JTextField course_code;
    private javax.swing.JTextField course_name;
    private javax.swing.JButton course_reg;
    private javax.swing.JLabel date;
    private javax.swing.JTextField date1;
    private javax.swing.JLabel delete_section;
    private javax.swing.JTable enrolled_courses;
    private javax.swing.JButton fetch_a;
    private javax.swing.JButton fetch_a1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JLabel pic_slider;
    private javax.swing.JTextField profile_name;
    private javax.swing.JTextField profile_pass;
    private javax.swing.JComboBox<String> profile_role;
    private javax.swing.JTextField profile_security_a;
    private javax.swing.JComboBox<String> profile_security_q;
    private javax.swing.JTextField profile_u_name;
    private javax.swing.JButton profile_update;
    private javax.swing.JButton profile_update1;
    private javax.swing.JTextField search_student_name;
    private javax.swing.JTextField search_student_name1;
    private javax.swing.JTextField search_student_name2;
    private javax.swing.JTable section_list;
    private javax.swing.JComboBox<String> select_course;
    private javax.swing.JComboBox<String> select_course_a;
    private javax.swing.JComboBox<String> select_course_enroll;
    private javax.swing.JComboBox<String> select_section;
    private javax.swing.JComboBox<String> select_section_a;
    private javax.swing.JComboBox<String> select_section_enroll;
    private javax.swing.JComboBox<String> select_student;
    private javax.swing.JComboBox<String> select_teacher;
    private javax.swing.JLabel st_count;
    private javax.swing.JComboBox<String> status_combo;
    private javax.swing.JLabel stname;
    private javax.swing.JLabel stname1;
    private javax.swing.JLabel stname2;
    private javax.swing.JTable student_list;
    private javax.swing.JTable student_list1;
    private javax.swing.JTable student_list2;
    private javax.swing.JLabel time;
    private javax.swing.JTextField time1;
    private javax.swing.JTextField user_full_name;
    private javax.swing.JTextField user_pass;
    private javax.swing.JButton user_reg;
    private javax.swing.JComboBox<String> user_role;
    private javax.swing.JTextField user_security_a;
    private javax.swing.JComboBox<String> user_security_q;
    private javax.swing.JTextField user_u_name;
    private javax.swing.JTable workloadList;
    // End of variables declaration//GEN-END:variables
}

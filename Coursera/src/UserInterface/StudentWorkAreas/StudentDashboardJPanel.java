/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.StudentWorkAreas;

import UserInterface.FacultyWorkAreas.FacultyLoginJPanel;
import UserInterface.StudentWorkAreas.StudentAccountDetailsJPanel;
import UserInterface.StudentWorkAreas.MyCoursesJPanel;
import UserInterface.StudentWorkAreas.MainJFrame;
import UserInterface.StudentWorkAreas.ListCourseJPanel;
import UserInterface.StudentWorkAreas.StudentLoginJPanel;
import model.student.StudentDirectory;
/**
 *
 * @author anirudh
 */
public class StudentDashboardJPanel extends javax.swing.JPanel {

    /**
     * Creates new form StudentDashboardJPanel
     */
    ;
    public StudentDashboardJPanel() {

        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        MenuJPanel = new javax.swing.JPanel();
        btnViewUpdateProfile = new javax.swing.JButton();
        btnRegisterCourse = new javax.swing.JButton();
        btnMyCourses = new javax.swing.JButton();
        btnTranscript = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        StudentWorkAreaJPanel = new javax.swing.JPanel();

        jSplitPane1.setDividerLocation(180);

        btnViewUpdateProfile.setText("View/ Update Profile");
        btnViewUpdateProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewUpdateProfileActionPerformed(evt);
            }
        });

        btnRegisterCourse.setText("Register for a course");
        btnRegisterCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterCourseActionPerformed(evt);
            }
        });

        btnMyCourses.setText("My Courses");
        btnMyCourses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMyCoursesActionPerformed(evt);
            }
        });

        btnTranscript.setText("Transcript");
        btnTranscript.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTranscriptActionPerformed(evt);
            }
        });

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenuJPanelLayout = new javax.swing.GroupLayout(MenuJPanel);
        MenuJPanel.setLayout(MenuJPanelLayout);
        MenuJPanelLayout.setHorizontalGroup(
            MenuJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuJPanelLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(MenuJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLogout)
                    .addComponent(btnTranscript)
                    .addComponent(btnMyCourses)
                    .addComponent(btnRegisterCourse)
                    .addComponent(btnViewUpdateProfile))
                .addGap(15, 15, 15))
        );

        MenuJPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnLogout, btnMyCourses, btnRegisterCourse, btnTranscript});

        MenuJPanelLayout.setVerticalGroup(
            MenuJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuJPanelLayout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(btnViewUpdateProfile)
                .addGap(42, 42, 42)
                .addComponent(btnRegisterCourse)
                .addGap(53, 53, 53)
                .addComponent(btnMyCourses)
                .addGap(45, 45, 45)
                .addComponent(btnTranscript)
                .addGap(47, 47, 47)
                .addComponent(btnLogout)
                .addContainerGap(328, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(MenuJPanel);
        jSplitPane1.setRightComponent(StudentWorkAreaJPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1320, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewUpdateProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewUpdateProfileActionPerformed
        // TODO add your handling code here:
        StudentAccountDetailsJPanel panel = new StudentAccountDetailsJPanel();
        jSplitPane1.setRightComponent(panel);    
        
    }//GEN-LAST:event_btnViewUpdateProfileActionPerformed

    private void btnRegisterCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterCourseActionPerformed
        // TODO add your handling code here:
        
        ListCourseJPanel panel = new ListCourseJPanel();
        jSplitPane1.setRightComponent(panel);
    }//GEN-LAST:event_btnRegisterCourseActionPerformed

    private void btnTranscriptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTranscriptActionPerformed
        // TODO add your handling code here:
        TranscriptJPanel panel = new TranscriptJPanel();
        jSplitPane1.setRightComponent(panel);         
    }//GEN-LAST:event_btnTranscriptActionPerformed

    private void btnMyCoursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMyCoursesActionPerformed
        // TODO add your handling code here:
        MyCoursesJPanel panel = new MyCoursesJPanel();
        jSplitPane1.setRightComponent(panel);        
    }//GEN-LAST:event_btnMyCoursesActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        FacultyLoginJPanel panel = new FacultyLoginJPanel();
        MainJFrame.changeScreen(panel);
    }//GEN-LAST:event_btnLogoutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MenuJPanel;
    private javax.swing.JPanel StudentWorkAreaJPanel;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnMyCourses;
    private javax.swing.JButton btnRegisterCourse;
    private javax.swing.JButton btnTranscript;
    private javax.swing.JButton btnViewUpdateProfile;
    public static javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}

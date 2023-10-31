/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.StudentWorkAreas;

import UserInterface.StudentWorkAreas.AssignmentsListJPanel;
import model.courses.Course;

/**
 *
 * @author anirudh
 */
public class EachCourseJPanel extends javax.swing.JPanel {

    /**
     * Creates new form EachCourseJPanel
     */
    Course course;
    public EachCourseJPanel(Course course) {
        initComponents();
        this.course = course;
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
        CourseActionPanel = new javax.swing.JPanel();
        btnAssignment = new javax.swing.JButton();
        btnAssignment1 = new javax.swing.JButton();
        btnAssignment2 = new javax.swing.JButton();
        btnAssignment3 = new javax.swing.JButton();
        CourseWorkAreaJPanel = new javax.swing.JPanel();

        jSplitPane1.setDividerLocation(170);

        btnAssignment.setText("Assignment");
        btnAssignment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignmentActionPerformed(evt);
            }
        });

        btnAssignment1.setText("Syllabus");
        btnAssignment1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignment1ActionPerformed(evt);
            }
        });

        btnAssignment2.setText("Grades");
        btnAssignment2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignment2ActionPerformed(evt);
            }
        });

        btnAssignment3.setText("Back");
        btnAssignment3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignment3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CourseActionPanelLayout = new javax.swing.GroupLayout(CourseActionPanel);
        CourseActionPanel.setLayout(CourseActionPanelLayout);
        CourseActionPanelLayout.setHorizontalGroup(
            CourseActionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CourseActionPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(CourseActionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAssignment3)
                    .addComponent(btnAssignment2)
                    .addComponent(btnAssignment1)
                    .addComponent(btnAssignment))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        CourseActionPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAssignment, btnAssignment1, btnAssignment2, btnAssignment3});

        CourseActionPanelLayout.setVerticalGroup(
            CourseActionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CourseActionPanelLayout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(btnAssignment)
                .addGap(47, 47, 47)
                .addComponent(btnAssignment1)
                .addGap(51, 51, 51)
                .addComponent(btnAssignment2)
                .addGap(59, 59, 59)
                .addComponent(btnAssignment3)
                .addContainerGap(409, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(CourseActionPanel);

        javax.swing.GroupLayout CourseWorkAreaJPanelLayout = new javax.swing.GroupLayout(CourseWorkAreaJPanel);
        CourseWorkAreaJPanel.setLayout(CourseWorkAreaJPanelLayout);
        CourseWorkAreaJPanelLayout.setHorizontalGroup(
            CourseWorkAreaJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1139, Short.MAX_VALUE)
        );
        CourseWorkAreaJPanelLayout.setVerticalGroup(
            CourseWorkAreaJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 798, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(CourseWorkAreaJPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignment3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignment3ActionPerformed
        // TODO add your handling code here:
        MyCoursesJPanel panel = new MyCoursesJPanel();
        StudentDashboardJPanel.jSplitPane1.setRightComponent(panel);
    }//GEN-LAST:event_btnAssignment3ActionPerformed

    private void btnAssignmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignmentActionPerformed
        // TODO add your handling code here:
        AssignmentsListJPanel panel = new AssignmentsListJPanel(course);
        jSplitPane1.setRightComponent(panel);
    }//GEN-LAST:event_btnAssignmentActionPerformed

    private void btnAssignment1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignment1ActionPerformed
        // TODO add your handling code here:
        SyllabusJPanel panel = new SyllabusJPanel(course);
        jSplitPane1.setRightComponent(panel);
    }//GEN-LAST:event_btnAssignment1ActionPerformed

    private void btnAssignment2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignment2ActionPerformed
        // TODO add your handling code here:
        StudentGradesJPanel panel = new StudentGradesJPanel(course);
        jSplitPane1.setRightComponent(panel);
    }//GEN-LAST:event_btnAssignment2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CourseActionPanel;
    private javax.swing.JPanel CourseWorkAreaJPanel;
    private javax.swing.JButton btnAssignment;
    private javax.swing.JButton btnAssignment1;
    private javax.swing.JButton btnAssignment2;
    private javax.swing.JButton btnAssignment3;
    public static javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
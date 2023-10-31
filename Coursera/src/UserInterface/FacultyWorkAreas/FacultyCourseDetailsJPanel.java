/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.FacultyWorkAreas;

import model.courses.Course;

/**
 *
 * @author anirudh
 */
public class FacultyCourseDetailsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form FacultyCourseDetailsJPanel
     */
    Course course;
    public FacultyCourseDetailsJPanel(Course course) {
        this.course = course;
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

        jPanel1 = new javax.swing.JPanel();
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
                .addContainerGap(406, Short.MAX_VALUE))
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
            .addGap(0, 795, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(CourseWorkAreaJPanel);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1320, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 797, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1320, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignmentActionPerformed
        // TODO add your handling code here:
        FacultyCourseSpecificAssignmentJPanel panel = new FacultyCourseSpecificAssignmentJPanel(course);
        jSplitPane1.setRightComponent(panel);
    }//GEN-LAST:event_btnAssignmentActionPerformed

    private void btnAssignment1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignment1ActionPerformed
        // TODO add your handling code here:
        FacultySyllabusJPanel panel = new FacultySyllabusJPanel(course);
        jSplitPane1.setRightComponent(panel);
    }//GEN-LAST:event_btnAssignment1ActionPerformed

    private void btnAssignment2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignment2ActionPerformed
        // TODO add your handling code here:
        FacultyIndirectGradeJPanel panel = new FacultyIndirectGradeJPanel();
        jSplitPane1.setRightComponent(panel);
    }//GEN-LAST:event_btnAssignment2ActionPerformed

    private void btnAssignment3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignment3ActionPerformed
        // TODO add your handling code here:
        FacultyCourseListJPanel panel = new FacultyCourseListJPanel();
        FacultyDashboardJPanel.jSplitPane1.setRightComponent(panel);
    }//GEN-LAST:event_btnAssignment3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CourseActionPanel;
    private javax.swing.JPanel CourseWorkAreaJPanel;
    private javax.swing.JButton btnAssignment;
    private javax.swing.JButton btnAssignment1;
    private javax.swing.JButton btnAssignment2;
    private javax.swing.JButton btnAssignment3;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
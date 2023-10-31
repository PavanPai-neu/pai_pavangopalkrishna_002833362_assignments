/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.StudentWorkAreas;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.courses.Assignment;
import model.courses.AssignmentDirectory;
import model.courses.Course;
import model.student.StudentAssignmentDirectory;
import model.student.StudentDirectory;

/**
 *
 * @author anirudh
 */
public class StudentGradesJPanel extends javax.swing.JPanel {

    /**
     * Creates new form GradesJPanel
     */
    Course course;
    public static double totalActualScore;
    public static double totalScore;
    public StudentGradesJPanel(Course course) {
        initComponents();
        this.course = course;
        populateCourseAssignments();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblGradesTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCourseAssignments = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtTotalActualScore = new javax.swing.JTextField();
        txtTotalScore = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        lblGradesTitle.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lblGradesTitle.setText("Grades");

        tblCourseAssignments.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Assignment", "Due By", "Status", "Actual Score", "Total score"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCourseAssignments);

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel1.setText("Total Score: ");

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel2.setText("/");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(322, 322, 322)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(455, 455, 455)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotalActualScore, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotalScore, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(513, 513, 513)
                        .addComponent(lblGradesTitle)))
                .addContainerGap(372, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(lblGradesTitle)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTotalActualScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(313, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void populateCourseAssignments()
    {
            
        ArrayList<Assignment> courseAssignments = AssignmentDirectory.findAssignmentForCourse(course.getCourseId());
        DefaultTableModel model = (DefaultTableModel) tblCourseAssignments.getModel();
        model.setRowCount(0);
        totalActualScore =0;
        totalScore = 0;
//        System.out.println(courseAssignments.size());
        
        for(Assignment assignment : courseAssignments)
        {
            Object[] row = new Object[5];
            row[0] = assignment.getAssignmentId();
//            row[1] = assignment.getTitle();
            row[1] = assignment.getDueDate();
            row[2] = StudentAssignmentDirectory.findSubmissionStatus(assignment.getAssignmentId(), StudentDirectory.currentUser.getStudentId());     
            row[3] = StudentAssignmentDirectory.findSubmissionScore(assignment.getAssignmentId(), StudentDirectory.currentUser.getStudentId());
            totalActualScore+= StudentAssignmentDirectory.findSubmissionScore(assignment.getAssignmentId(), StudentDirectory.currentUser.getStudentId());
            row[4] = assignment.getTotalMarks();
            totalScore += assignment.getTotalMarks();

            model.addRow(row);  
            
        }
        
        txtTotalActualScore.setText(String.valueOf(totalActualScore));
        txtTotalScore.setText(String.valueOf(totalScore));
        
    
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblGradesTitle;
    private javax.swing.JTable tblCourseAssignments;
    private javax.swing.JTextField txtTotalActualScore;
    private javax.swing.JTextField txtTotalScore;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.StudentWorkAreas;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.CertificateAgency.CertificateAgency;
import model.CertificateAgency.StudentTranscript;
import model.CertificateAgency.TranscriptCourse;
import model.courses.Course;
import model.courses.CourseDirectory;
import model.courses.CourseRegistration;
import model.courses.Schedule;
import model.courses.ScheduleDirectory;
import model.professors.Professor;
import model.professors.ProfessorDirectory;
import model.student.StudentAssignmentDirectory;
import model.student.StudentDirectory;

/**
 *
 * @author anirudh
 */
public class TranscriptJPanel extends javax.swing.JPanel {

    /**
     * Creates new form TranscriptJPanel
     */
    
    StudentTranscript studentTranscript = new StudentTranscript();
            
    public TranscriptJPanel() {
        initComponents();
        populateTranscript();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblTranscript = new javax.swing.JTable();
        lblTranscriptTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtActualCredits = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTotalCredits = new javax.swing.JTextField();
        btnCheckavailability = new javax.swing.JButton();

        tblTranscript.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Course ID", "Title", "Credits", "Actual Score", "Total Score", "Grade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblTranscript);

        lblTranscriptTitle.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lblTranscriptTitle.setText("Final Transcript");

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel1.setText("Total Credits: ");

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel2.setText("/");

        btnCheckavailability.setText("Check Graduation Eligibility");
        btnCheckavailability.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckavailabilityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(494, 494, 494)
                        .addComponent(lblTranscriptTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(447, 447, 447)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCheckavailability)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtActualCredits, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtTotalCredits, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(500, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(230, 230, 230))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(lblTranscriptTitle)
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtActualCredits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtTotalCredits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(btnCheckavailability)
                .addContainerGap(170, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCheckavailabilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckavailabilityActionPerformed
        // TODO add your handling code here:
        if(Integer.parseInt(txtActualCredits.getText()) == Integer.parseInt(txtTotalCredits.getText()))
        {   
            boolean flag = CertificateAgency.evaluateTranscript(studentTranscript);
            if(flag)
            {
//                CertificateAgency.generatePdf(studentTranscript);
                JOptionPane.showMessageDialog(this, "Eligible to graduate");
            }
            System.out.println("Eligible");
        }
        else
        {
            System.out.println("Not Eligible");
            JOptionPane.showMessageDialog(this, "Not eligible to graduate");
        }
    }//GEN-LAST:event_btnCheckavailabilityActionPerformed

    public void populateTranscript()
    {
        System.out.println(StudentDirectory.currentUser.getStudentId());
        ArrayList <Course> studentCourses = CourseRegistration.courseForStudent(StudentDirectory.currentUser.getStudentId());
        DefaultTableModel model = (DefaultTableModel) tblTranscript.getModel();
        model.setRowCount(0);
        int totalActualCredits = 0;
        
        for(Course course : studentCourses)
        {
            Object[] row = new Object[6];
            row[0] = course.getCourseId();
            row[1] = course.getTitle();
            row[2] = course.getCredits();
            
            
            
            row[3] = StudentAssignmentDirectory.totalActualScoreinCourse(StudentDirectory.currentUser.getStudentId(), course.getCourseId());
            row[4] = StudentAssignmentDirectory.totalScoreForCourse(StudentDirectory.currentUser.getStudentId(), course.getCourseId());
            System.out.println(StudentAssignmentDirectory.totalActualScoreinCourse(StudentDirectory.currentUser.getStudentId(), course.getCourseId()));
            System.out.println(StudentAssignmentDirectory.totalScoreForCourse(StudentDirectory.currentUser.getStudentId(), course.getCourseId()));
            double percentage = (StudentAssignmentDirectory.totalActualScoreinCourse(StudentDirectory.currentUser.getStudentId(), course.getCourseId()) / StudentAssignmentDirectory.totalScoreForCourse(StudentDirectory.currentUser.getStudentId(), course.getCourseId())) *100;
            System.out.println(percentage);
            TranscriptCourse tCourse = new TranscriptCourse();
            tCourse.setActualScore(StudentAssignmentDirectory.totalActualScoreinCourse(StudentDirectory.currentUser.getStudentId(), course.getCourseId()));
            tCourse.setTotalScore(StudentAssignmentDirectory.totalScoreForCourse(StudentDirectory.currentUser.getStudentId(), course.getCourseId()));
            String grade="";
            if(percentage > 90.0)
            {
                row[5] = "S";
                grade = "S";
            }
            else if(percentage > 80.0)
            {
                row[5] = "A";
                grade = "A";
            }
            else if(percentage > 70.0)
            {
                row[5] = "B";
                grade = "B";
            }
            else if(percentage > 60.0)
            {
                row[5] = "C";
                grade = "C";
            }
            else if(percentage > 50.0)
            {
                row[5] = "D";
                grade = "D";
            }
            else if(percentage <= 50.0)
            {
                row[5] = "F";
                grade = "F";
            }
            tCourse.setGrade(grade);
            studentTranscript.courseEntry.put(course.getTitle(), tCourse);
            if(row[5].equals("F"))
                totalActualCredits+=0;
            else
                totalActualCredits+=course.getCredits();
            model.addRow(row);
        } 
        txtActualCredits.setText(String.valueOf(totalActualCredits));
        txtTotalCredits.setText(String.valueOf(24));
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCheckavailability;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTranscriptTitle;
    private javax.swing.JTable tblTranscript;
    private javax.swing.JTextField txtActualCredits;
    private javax.swing.JTextField txtTotalCredits;
    // End of variables declaration//GEN-END:variables
}
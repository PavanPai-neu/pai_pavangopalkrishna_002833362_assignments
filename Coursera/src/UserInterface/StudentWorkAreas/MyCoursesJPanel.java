/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.StudentWorkAreas;

import UserInterface.FacultyWorkAreas.FacultyDashboardJPanel;
import UserInterface.FacultyWorkAreas.FacultyDirectViewAssignmentJPanel;
import UserInterface.StudentWorkAreas.EachCourseJPanel;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.courses.Assignment;
import model.courses.AssignmentDirectory;
import model.courses.Course;
import model.courses.CourseDirectory;
import model.courses.CourseRegistration;
import model.courses.Schedule;
import model.courses.ScheduleDirectory;
import model.professors.Professor;
import model.professors.ProfessorDirectory;
import model.student.StudentDirectory;

/**
 *
 * @author anirudh
 */
public class MyCoursesJPanel extends javax.swing.JPanel {

    /**
     * Creates new form MyCoursesJPanel
     */
    int selectedCourse;
    public MyCoursesJPanel() {
        initComponents();
        populateMyCoursesTable();
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
        tblMyCourses = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        tblMyCourses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Course ID", "Title", "Credits", "Professor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblMyCourses);

        jButton1.setText("Open course");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(378, 378, 378)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(563, 563, 563)
                        .addComponent(jButton1)))
                .addContainerGap(486, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jButton1)
                .addContainerGap(288, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void populateMyCoursesTable()
    {   
        System.out.println(StudentDirectory.currentUser.getStudentId());
        ArrayList <Course> studentCourses = CourseRegistration.courseForStudent(StudentDirectory.currentUser.getStudentId());
        DefaultTableModel model = (DefaultTableModel) tblMyCourses.getModel();
        model.setRowCount(0);
        
        
        for(Course course : studentCourses)
        {
            Object[] row = new Object[4];
            row[0] = course.getCourseId();
            row[1] = course.getTitle();
            row[2] = course.getCredits();

            ArrayList<Schedule> schedule = ScheduleDirectory.findScheduleForCourse(course.getCourseId());
            Professor professor = ProfessorDirectory.findProfessor(schedule.get(0).getProfessorId());
            row[3] = professor.getProfessorName();
            model.addRow(row);
        }
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblMyCourses.getSelectedRow();
        if(selectedRow >= 0)
        {

            {   
//                System.out.println(selectedRow);
                Course course = CourseDirectory.searchCourse((Integer)tblMyCourses.getValueAt(selectedRow, 0));
//                System.out.println((Integer)tblMyCourses.getValueAt(selectedRow, 0));
                EachCourseJPanel panel = new EachCourseJPanel(course);
                StudentDashboardJPanel.jSplitPane1.setRightComponent(panel);
                
            }
            
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Please select a course to view");
        }   
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMyCourses;
    // End of variables declaration//GEN-END:variables
}

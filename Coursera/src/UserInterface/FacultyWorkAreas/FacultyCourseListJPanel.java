/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.FacultyWorkAreas;

import Business.Profiles.FacultyDirectory;
import UserInterface.FacultyWorkAreas.FacultyCourseDetailsJPanel;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.courses.Course;
import model.courses.CourseDirectory;
import model.courses.Schedule;
import model.courses.ScheduleDirectory;
import model.professors.Professor;
import model.professors.ProfessorDirectory;
import model.programs.Program;
import model.programs.ProgramDirectory;

/**
 *
 * @author anirudh
 */
public class FacultyCourseListJPanel extends javax.swing.JPanel {

    /**
     * Creates new form FacultyCourseListJPanel
     */
    public FacultyCourseListJPanel() {
        initComponents();
        populateCourses();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    public void populateCourses()
    {
//        System.out.println("Current professor: "+ ProfessorDirectory.currentProfessor.getProfessorName() +" "+ ProfessorDirectory.currentProfessor.getProfessorId());
        ArrayList <Schedule> professorSchedule = ScheduleDirectory.findScheduleForProfessor(ProfessorDirectory.currentProfessor.getProfessorId());
        System.out.println(professorSchedule.size());
        DefaultTableModel model = (DefaultTableModel) tblCourseList.getModel();
        model.setRowCount(0);
        
        
        for(Schedule schedule : professorSchedule)
        {
            System.out.println(schedule.getCourseId());
            Object[] row = new Object[5];
            row[0] = schedule.getCourseId();
            
            
            row[1] = CourseDirectory.searchCourse(schedule.getCourseId()).getTitle();
            row[2] = schedule.getSection();
            row[3] = CourseDirectory.searchCourse(schedule.getCourseId()).getCredits();
            row[4] = CourseDirectory.searchCourse(schedule.getCourseId()).getAvailability();
            model.addRow(row);  
            
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCourseList = new javax.swing.JTable();
        btnViewCourse = new javax.swing.JButton();

        tblCourseList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Course ID", "Course Name", "Section", "Credits", "Term"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCourseList);

        btnViewCourse.setText("View Course");
        btnViewCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewCourseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(351, 351, 351)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(589, 589, 589)
                        .addComponent(btnViewCourse)))
                .addContainerGap(390, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(btnViewCourse)
                .addContainerGap(206, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewCourseActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblCourseList.getSelectedRow();
        if(selectedRow >= 0)
        {

            {   
                System.out.println(selectedRow);
                Course course = CourseDirectory.searchCourse((Integer)tblCourseList.getValueAt(selectedRow, 0));
                FacultyCourseDetailsJPanel panel = new FacultyCourseDetailsJPanel(course);
                FacultyDashboardJPanel.jSplitPane1.setRightComponent(panel);
                
            }
            
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Please select a course to view");
        }        


    }//GEN-LAST:event_btnViewCourseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnViewCourse;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCourseList;
    // End of variables declaration//GEN-END:variables
}
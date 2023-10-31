/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.courses;

import java.util.ArrayList;
import model.professors.Professor;

/**
 *
 * @author anirudh
 */
public class AssignmentDirectory {
    
    public static ArrayList <Assignment> assignmentDirectory = new ArrayList<>();
    
    

    public ArrayList<Assignment> getAssignmentDirectory() {
        return assignmentDirectory;
    }

    public void setAssignmentDirectory(ArrayList<Assignment> assignmentDirectory) {
        this.assignmentDirectory = assignmentDirectory;
    }
    
    public void addAssignmentDirectly(Assignment assignment)
    {
        assignmentDirectory.add(assignment);
    }
    
    public static void removeAssignmentDirectly(Assignment assignment)
    {
        assignmentDirectory.remove(assignment);
    }
    
    public static Assignment findAssignment(int assignmentId)
    {
        for(Assignment assignment: assignmentDirectory)
        {
            if(assignment.getAssignmentId() == assignmentId)
                return assignment;
        }
        return null;
    }
    
    public static ArrayList<Assignment> findAssignmentForProfessor(ArrayList<Schedule> professorSchedule)
    {
        ArrayList <Assignment> assignmentListForprofessor = new ArrayList<>();
        for(Schedule schedule: professorSchedule)
        {
            for(Assignment assignment: assignmentDirectory)
            {
                if(assignment.getScheduleId() == schedule.getScheduleId())
                    assignmentListForprofessor.add(assignment);
            }
        }
        return assignmentListForprofessor;

    }
    
    public static ArrayList<Assignment> findAssignmentForCourse(int courseId ,ArrayList<Assignment> professorAssignments)
    {
        ArrayList <Assignment> assignmentListForCourse = new ArrayList<>();
        for(Assignment assignment: professorAssignments)
        {
            if(assignment.getCourseId() == courseId)
                assignmentListForCourse.add(assignment);
        }
        return assignmentListForCourse;


    }
    public static boolean checkIfAssignmentIdExists(int assignmentId)
    {
        for(Assignment assignment: assignmentDirectory)
        {
            if(assignment.getAssignmentId() == assignmentId)
                return true;
        }
        return false;
    }
    
        public static ArrayList<Assignment> findAssignmentForCourse(int courseId)
    {
        ArrayList <Assignment> assignmentListForCourse = new ArrayList<>();
        for(Assignment assignment: assignmentDirectory)
        {
            if(assignment.getCourseId() == courseId)
                assignmentListForCourse.add(assignment);
        }

        return assignmentListForCourse;

    }
        
        

    
}

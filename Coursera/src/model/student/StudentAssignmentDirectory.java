/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.student;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import static java.util.Map.entry;

/**
 *
 * @author anirudh
 */
public class StudentAssignmentDirectory {
    public static Map<Integer, StudentAssignment> assignmentSubmissionDirectory= new HashMap<>();
    
    public static boolean findSubmission(int assignmentId, int studentId)
    {
        System.out.println("Assignment ID from EachAssignmentClass: "+assignmentId);
        System.out.println("Student ID from EachAssignmentClass: "+studentId);
        for(Map.Entry<Integer, StudentAssignment> entry: assignmentSubmissionDirectory.entrySet())
        {   
            System.out.println("Assignment ID: "+entry.getKey());
            System.out.println("Student ID: "+entry.getValue().getStudentId());
            if(entry.getKey() == assignmentId && entry.getValue().getStudentId() == studentId)
                return true;
        }
        return false;
    }   
    
    
    public static ArrayList<Student> fetchStudentsForAssignment(int assignmentId)
    {
        ArrayList <Student> studentssList = new ArrayList<>();
        for(Map.Entry<Integer, StudentAssignment> entry: assignmentSubmissionDirectory.entrySet())
        {
            if(entry.getKey() == assignmentId)
                studentssList.add(StudentDirectory.findStudent(entry.getValue().getStudentId()));
        }
        return studentssList;
    }
    
        public static  String findSubmissionStatus(int assignmentId, int studentId)
    {
        System.out.println("Assignment ID from EachAssignmentClass: "+assignmentId);
        System.out.println("Student ID from EachAssignmentClass: "+studentId);
        for(Map.Entry<Integer, StudentAssignment> entry: assignmentSubmissionDirectory.entrySet())
        {   
            
            if(entry.getKey() == assignmentId && entry.getValue().getStudentId() == studentId)
                return entry.getValue().getStatus();
        }
        return null;
    } 
        
                public static  double findSubmissionScore(int assignmentId, int studentId)
    {
//        System.out.println("Assignment ID from EachAssignmentClass: "+assignmentId);
//        System.out.println("Student ID from EachAssignmentClass: "+studentId);
        for(Map.Entry<Integer, StudentAssignment> entry: assignmentSubmissionDirectory.entrySet())
        {   
            
            if(entry.getKey() == assignmentId && entry.getValue().getStudentId() == studentId)
                return entry.getValue().getAllottedMarks();
        }
        return 0;
    }
                
                public static StudentAssignment searchSubmission(int assignmentId, int studentId)
                {
                            for(Map.Entry<Integer, StudentAssignment> entry: assignmentSubmissionDirectory.entrySet())
        {   
            
            if(entry.getKey() == assignmentId && entry.getValue().getStudentId() == studentId)
                return entry.getValue();
        }
        return null;
                    
                }
                
        public static double totalActualScoreinCourse(int studentId, int courseId)
        {
                    for(Map.Entry<Integer, StudentAssignment> entry: assignmentSubmissionDirectory.entrySet())
        {   
            
            if(entry.getValue().getCourseId() ==  courseId && entry.getValue().getStudentId() == studentId)
                return entry.getValue().getAllottedMarks();
        }
                    return 0;
        }
    
                public static double totalScoreForCourse(int studentId, int courseId)
        {
                    for(Map.Entry<Integer, StudentAssignment> entry: assignmentSubmissionDirectory.entrySet())
        {   
            
            if(entry.getValue().getCourseId() ==  courseId && entry.getValue().getStudentId() == studentId)
                return entry.getValue().getTotalMarks();
        }
                    return 0;
        }
}

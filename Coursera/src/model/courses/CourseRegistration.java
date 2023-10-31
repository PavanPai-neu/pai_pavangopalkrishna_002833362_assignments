/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.courses;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author anirudh
 */
public class CourseRegistration {
    
    public static Map <Integer, Integer>  courseRegistrationDirectory = new HashMap<>();
    
    public static ArrayList<Course> courseForStudent(int studentId)
    {
        ArrayList<Course> studentCourses = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry: courseRegistrationDirectory.entrySet())
        {
            if(entry.getValue() == studentId)
            {
                Course course = CourseDirectory.searchCourse(entry.getKey());
                studentCourses.add(course);
            
            }
        }
        return studentCourses;
    }
    
    public static void displayCourseRegistration()
    {
        for(Map.Entry<Integer, Integer> entry: courseRegistrationDirectory.entrySet())
        {
            System.out.println("Course ID: "+entry.getKey() + "StudentId: "+ entry.getValue());
        }
    }
    
}

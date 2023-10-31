/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.courses;

import java.util.ArrayList;

/**
 *
 * @author anirudh
 */
public class CourseDirectory {
    public static ArrayList <Course> courseDirectory = new ArrayList<>();

    public ArrayList<Course> getCourseDirectory() {
        return courseDirectory;
    }

    public void setCourseDirectory(ArrayList<Course> courseDirectory) {
        this.courseDirectory = courseDirectory;
    }
    
    public void addCourse(Course course)
    {
        courseDirectory.add(course);
    }
    
    public void removeCourse(Course course)
    {
        courseDirectory.remove(course);
    }
    
    public static Course searchCourse(int courseId)
    {
        for(Course course: courseDirectory)
        {
            if(course.getCourseId() == courseId)
                return course;
        }
        return null;
    }
    
    public static ArrayList<Course> professorCourses(int professorId, ArrayList<Schedule> professorSchedule)
    {
        ArrayList <Course> professorCourseList = new ArrayList<>();
        for(Schedule schedule: professorSchedule)
        {
            professorCourseList.add(searchCourse(schedule.getCourseId()));
        }
        return professorCourseList;
    }
    
    public static ArrayList<Course> getCoursesForPrograms(int programId)
    {
        ArrayList<Course> programCourses = new ArrayList<>();
        for(Course course: courseDirectory)
        {
            if(course.getProgramsItBelongsTo().get(0).getProgramId() == programId)
                programCourses.add(course);
        }
        return programCourses;
    }
    
    public static Course findCourse(String title)
    {
        for(Course course: courseDirectory)
        {
            if(course.getTitle().equals(title))
                return course;
        }
        return null;
    }
    
    
}

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
public class ScheduleDirectory {
    public static  ArrayList <Schedule> scheduleDirectory = new ArrayList<>();

    public ArrayList<Schedule> getScheduleDirectory() {
        return scheduleDirectory;
    }

    public void setScheduleDirectory(ArrayList<Schedule> scheduleDirectory) {
        this.scheduleDirectory = scheduleDirectory;
    }
    
    public void addSchedule(Schedule schedule)
    {
        scheduleDirectory.add(schedule);
    }
    
    public static void removeSchedule(Schedule schedule)
    {
        scheduleDirectory.remove(schedule);
    }
    
    public static ArrayList<Schedule> findScheduleForCourse(int courseId)
    {
        ArrayList <Schedule> courseSchedules = new ArrayList<>();
        for(Schedule schedule: scheduleDirectory)
        {
            if(schedule.getCourseId() == courseId)
                courseSchedules.add(schedule);
        }
        return courseSchedules;
        
        // check for empty arrylist
    }
    
        public static ArrayList<Schedule> findScheduleForProfessor(int professorId)
    {
        ArrayList <Schedule> professorSchedules = new ArrayList<>();
        for(Schedule schedule: scheduleDirectory)
        {
            if(schedule.getProfessorId() == professorId)
                professorSchedules.add(schedule);
        }
        return professorSchedules;
        
        // check for empty arrylist
    }
    
    public static ArrayList<String> sectionsInCourse(int courseId, int professorId)
    {
        ArrayList <String> sections = new ArrayList<>();
        for(Schedule schedule: scheduleDirectory)
        {
            if(schedule.getCourseId() == courseId && schedule.getProfessorId() == professorId)
                sections.add(schedule.getSection());
        }
        
        return sections;
                
    }
    
        public static Schedule findScheduleForSection(String section, int professorId)
    {
//        Schedule reqschedule = new Schedule();
        for(Schedule schedule: scheduleDirectory)
        {
            if(schedule.getSection().equals(section) && schedule.getProfessorId() == professorId){
                Schedule reqschedule = schedule;
                return reqschedule;
            }
        }
        
        return null;
                
    }
      
     public static ArrayList<Schedule> scheduleForProfessor(int professorId)
     {
         ArrayList <Schedule> professorSchedule = new ArrayList<>();
         for(Schedule schedule: scheduleDirectory)
         {
             if(schedule.getProfessorId() == professorId)
             {
                 professorSchedule.add(schedule);
             }
         }
         return professorSchedule;
     }
     
     public static Schedule findScheduleByScheduleId(int scheduleId)
     {
         for(Schedule schedule: scheduleDirectory)
         {
             if(schedule.getScheduleId() == scheduleId)
                 return schedule;
         }
         return null;
     }
    
}

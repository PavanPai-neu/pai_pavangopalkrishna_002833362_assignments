/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.courses;

/**
 *
 * @author anirudh
 */
public class Schedule {
    private int scheduleId;
    private int courseId;
    private String section;

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }
    private int professorId;
    private String days;
    private String timeFrames;
    private int noOofSeats;

    public int getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(int scheduleId) {
        this.scheduleId = scheduleId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getProfessorId() {
        return professorId;
    }

    public void setProfessorId(int professorId) {
        this.professorId = professorId;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public String getTimeFrames() {
        return timeFrames;
    }

    public void setTimeFrames(String timeFrames) {
        this.timeFrames = timeFrames;
    }

    public int getNoOofSeats() {
        return noOofSeats;
    }

    public void setNoOofSeats(int noOofSeats) {
        this.noOofSeats = noOofSeats;
    }
    
    
    
    
}

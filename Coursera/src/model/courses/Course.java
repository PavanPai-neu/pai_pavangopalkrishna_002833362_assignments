/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.courses;

import java.util.ArrayList;
import java.util.HashMap;
import model.programs.Program;

/**
 *
 * @author anirudh
 */
public class Course {
    
    private int courseId;
    private String title;
    private String description;
    private int credits;
    private String availability;
    private ArrayList <Program> programsItBelongsTo;
    private HashMap<String, String> syllabus;

    public HashMap<String, String> getSyllabus() {
        return syllabus;
    }

    public void setSyllabus(HashMap<String, String> syllabus) {
        this.syllabus = syllabus;
    }
    
    
    
    // create schedule in schedule and assign it to course

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public ArrayList<Program> getProgramsItBelongsTo() {
        return programsItBelongsTo;
    }

    public void setProgramsItBelongsTo(ArrayList<Program> programsItBelongsTo) {
        this.programsItBelongsTo = programsItBelongsTo;
    }
    

    
}

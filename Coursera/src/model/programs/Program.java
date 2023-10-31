/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.programs;

import java.util.ArrayList;
import model.professors.Professor;

/**
 *
 * @author anirudh
 */
public class Program {
    private int programId;
    private String programName;
    private String description;
    private String level;
    private int duration;

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
    private int rating;
    private String term;
    private int totalCredits;
    private ArrayList <Professor> professors;

    public int getProgramId() {
        return programId;
    }

    public void setProgramId(int programId) {
        this.programId = programId;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public int getTotalCredits() {
        return totalCredits;
    }

    public void setTotalCredits(int totalCredits) {
        this.totalCredits = totalCredits;
    }

    public ArrayList<Professor> getProfessors() {
        return professors;
    }

    public void setProfessors(ArrayList<Professor> professors) {
        this.professors = professors;
    }
    
    public String generateProgramString()
    {
    StringBuilder combinedString = new StringBuilder();
    combinedString.append("Program ID: ").append(programId).append("\n");
    combinedString.append("Program Name: ").append(programName).append("\n");
    combinedString.append("Description: ").append(description).append("\n");
    combinedString.append("Level: ").append(level);
    return combinedString.toString();
    }
        
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.programs;

import java.util.ArrayList;

/**
 *
 * @author anirudh
 */
public class ProgramDirectory {
    
    public static ArrayList <Program> programDirectory = new ArrayList<>();

    public ArrayList<Program> getProgramDirectory() {
        return programDirectory;
    }

    public void setProgramDirectory(ArrayList<Program> programDirectory) {
        this.programDirectory = programDirectory;
    }
    
    public void setProgramDirectoryFromListings(ArrayList<Program> programDirectory)
    {
        this.programDirectory = programDirectory;
    }
    
    public void addProgram(Program program)
    {
        programDirectory.add(program);
    }
    
    public void removeProgram(Program program)
    {
        programDirectory.remove(program);
    }
    
    public Program searchProgram(String programName)
    {
        for(Program program: programDirectory )
        {
            if(program.getProgramName().equals(programName))
                return program;
        }
        return null;
    }

    public boolean isEmpty() {
        return false;
    }
    
    public static Program findProgramByName(String name)
    {
        for(Program program : programDirectory)
        {
            if(program.getProgramName().equals(name))
                return program;
        }
        return null;
    }
    
    public static Program findProgramById(int programId)
    {
        for(Program program : programDirectory)
        {
            if(program.getProgramId() == programId)
                return program;
        }
        return null;
    }
    
    public Program searchProgramHistoryRecord(String programName)
    {
        for(Program program: programDirectory )
        {
            if(program.getProgramName().equals(programName))
                return program;
        }
        return null;
    }

    public boolean isEmptyHistory() {
        return false;
    }
    
    public static Program findProgramByNameAndProfessorTD(String name)
    {
        for(Program program : programDirectory)
        {
            if(program.getProgramName().equals(name))
                return program;
        }
        return null;
    }
    
    public static Program findProgramByIdAndCourseSeats(int programId)
    {
        for(Program program : programDirectory)
        {
            if(program.getProgramId() == programId)
                return program;
        }
        return null;
    }
    
}

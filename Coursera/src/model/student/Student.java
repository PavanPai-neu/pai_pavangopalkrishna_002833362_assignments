/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.student;

import Business.Person.Person;
import Business.Profiles.Profile;
import java.util.Date;

/**
 *
 * @author yk385
 */


public class Student{
    private String name;
    private Date dateOfBirth;
    private String email;
    private String degree;
    private String term;
    private String username;
    private String passw;
    private int hashedpassw;
    private int prevHashedPassw;
    private boolean restricted;
    private int studentId;
    private int programId;
    Person person;
    public Student(Person p)
    {
        person = p;
    }
    
    public int getProgramId() {
        return programId;
    }

    public void setProgramId(int programId) {
        this.programId = programId;
    }

    public int getPrevHashedPassw() {
        return prevHashedPassw;
    }

    public void setPrevHashedPassw(int prevHashedPassw) {
        this.prevHashedPassw = prevHashedPassw;
    }
    
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    
    
     public boolean isRestricted(){                                  //Method for sending access restricted tag
        return restricted;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassw() {
        return passw;
    }

    public void setPassw(String passw) {
        this.passw = passw;
    }

    public int getHashedpassw() {
        return hashedpassw;
    }

    public void setHashedpassw(int hashedpassw) {
        this.hashedpassw = hashedpassw;
    }
    
    
    public static int hashPassword(String password)         //method for hashing password
    {
        int hash = 0;
    for (char c : password.toCharArray()) {
      hash += c;
    }
    return hash;
        

    }

    
    public String getRole() {
        return "Student"; 
    }
}

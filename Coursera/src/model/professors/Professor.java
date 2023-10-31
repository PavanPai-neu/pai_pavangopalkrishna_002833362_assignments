/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.professors;

import Business.Person.Person;
import Business.Profiles.Profile;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author anirudh
 */
public class Professor{
    private int professorId;
    private String professorName;
    private String username;
    private int professorRating;
    private String passw;
    Person person;
    
    public Professor(Person p)
    {
        person = p;
    }
    
    public Person getPerson()
    {
        return person;
    }


    public String getUsername() {
        return username;
    }
//
    public void setUsername(String username) {
        this.username = username;
    }
    private int hashedpassw;
    private int prevHashedPassw;

    public String getPassw() {
        return passw;
    }
////
    public void setPassw(String passw) {
        this.passw = passw;
    }
//
    public int getHashedpassw() {
        return hashedpassw;
    }
//
    public void setHashedpassw(int hashedpassw) {
        this.hashedpassw = hashedpassw;
    }
//
    public int getPrevHashedPassw() {
        return prevHashedPassw;
    }
//
    public void setPrevHashedPassw(int prevHashedPassw) {
        this.prevHashedPassw = prevHashedPassw;
    }


    public int getProfessorId() {
        return professorId;
    }

    public void setProfessorId(int professorId) {
        this.professorId = professorId;
    }

    public String getProfessorName() {
        return professorName;
    }

    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }

    public int getProfessorRating() {
        return professorRating;
    }

    public void setProfessorRating(int professorRating) {
        this.professorRating = professorRating;
    }
    
        public static int hashPassword(String password)         //method for hashing password
    {
        int hash = 0;
    for (char c : password.toCharArray()) {
      hash += c;
    }
    return hash;
        

    }

//    @Override
//    public String getRole() {
//        return "Professor"; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
        public static String hashedGenearteValue(String input) {
        
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(input.getBytes());
            StringBuilder hexString = new StringBuilder(2 * hash.length);

            for (byte b : hash) {
                String hex = String.format("%02x", b);
                hexString.append(hex);
            }

            return hexString.toString();
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Professor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
        
    
    
    
}
}

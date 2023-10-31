/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Profiles;

import Business.Person.Person;

/**
 *
 * @author anirudh
 */


public class FacultyProfile extends Profile{
        
    private int professorId;
    private int professorRating;
  
//    private String professorName;
//    private String username;
//
//    private String passw;

    public int getProfessorId() {
        return professorId;
    }

    public void setProfessorId(int professorId) {
        this.professorId = professorId;
    }

    public int getProfessorRating() {
        return professorRating;
    }

    public void setProfessorRating(int professorRating) {
        this.professorRating = professorRating;
    }

//    public String getProfessorName() {
//        return professorName;
//    }
//
//    public void setProfessorName(String professorName) {
//        this.professorName = professorName;
//    }

//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getPassw() {
//        return passw;
//    }
//
//    public void setPassw(String passw) {
//        this.passw = passw;
//    }
    
//    private int hashedpassw;
//    private int prevHashedPassw;
    
    public FacultyProfile(Person p, int professorId, int professorRating) {

        super(p);
        this.professorRating = professorRating;
        this.professorId = professorId;



    }

//    public int getHashedpassw() {
//        return hashedpassw;
//    }
//
//    public void setHashedpassw(int hashedpassw) {
//        this.hashedpassw = hashedpassw;
//    }
//
//    public int getPrevHashedPassw() {
//        return prevHashedPassw;
//    }
//
//    public void setPrevHashedPassw(int prevHashedPassw) {
//        this.prevHashedPassw = prevHashedPassw;
//    }
   
    
    public static int hashPassword(String password)         //method for hashing password
    {
        int hash = 0;
    for (char c : password.toCharArray()) {
      hash += c;
    }
    return hash;
        

    }
    

    @Override
    public String getRole() {
        return "Faculty"; 
    }
    
}

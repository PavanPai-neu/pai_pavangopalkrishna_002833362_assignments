/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Profiles;

import Business.Business;
import Business.Person.Person;
import java.util.ArrayList;
import javax.swing.JOptionPane;
//import model.professors.Professor;
//import static model.professors.ProfessorDirectory.professorDirectory;

/**
 *
 * @author anirudh
 */
public class FacultyDirectory {

    Business business;
    public static ArrayList<FacultyProfile> facultylist;
    public static FacultyProfile currentProfessor;

    public FacultyDirectory(Business d) {

        business = d;
        facultylist = new ArrayList();

    }

    public FacultyProfile newFacultyProfile(Person p, int professorId, int professorRating) {

        FacultyProfile sp = new FacultyProfile(p, professorId, professorRating);
        facultylist.add(sp);
        return sp;
    }

    public FacultyProfile findFaculty(int id) {

        for (FacultyProfile sp : facultylist) {

            if (sp.isMatch(id)) {
                return sp;
            }
        }
            return null; //not found after going through the whole list
         }
    
    
    public static void updateCurrentProfessor(FacultyProfile professor)
    {
        currentProfessor = professor;
    }
    
//        public static boolean canLogin(String username, int password) {
//    for (FacultyProfile professor : facultylist) {
//        System.out.println(professor.getHashedpassw() + " " + password);
//        if (professor.getUsername().equals(username) && professor.getHashedpassw()==(password)) {
////            if (.isRestricted()) {
////                JOptionPane.showMessageDialog(null, "Your access has been restricted. Contact admin.");
////                return false; // User is restricted, deny login
////            }
//            return true;  // User is not restricted, allow login
//        }
//    }
//    JOptionPane.showMessageDialog(null, "Invalid username or password.");
//    return false; // Username or password does not match any user, deny login

        
//    public static FacultyProfile getRequiredUser(String userName){
//        
//        for(FacultyProfile user : professorDirecto){
//            if(user.getUsername().equals(userName)){
//                return user;
//            }
//        }
//        if(usersList.size() < 1){
//            usersList.add(new UserInfo("admin", "admin","-","Administration","0000",0000,Boolean.FALSE));
//        }
//        return professorDirectory.get(0);
//    }

//    public ArrayList<Professor> getProfessorDirectory() {
//        return professorDirectory;
//    }
//
//    public void setProfessorDirectory(ArrayList<Professor> professorDirectory) {
//        this.professorDirectory = professorDirectory;
//    }
//    
//    public void addProfessor(Professor professor)
//    {
//        professorDirectory.add(professor);
//    }
//    
//    public void deleteProfessor(Professor professor)
//    {
//        professorDirectory.remove(professor);
//    }
//    
//    public static Professor findProfessor(int professorId)
//    {
//        for(Professor professor: professorDirectory)
//        {
//            if(professor.getProfessorId() == professorId)
//                return professor;
//        }
//        return null;
//    }    
    
}


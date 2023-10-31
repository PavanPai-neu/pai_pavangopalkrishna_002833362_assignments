/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.student;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author yk385
 */
public class StudentDirectory {
    
    public static ArrayList<Student> usersList = new ArrayList<>();
    public static Student currentUser;
    
    public static void updateCurrentUser(Student user){
        currentUser = user;
    }
    
   
    
    public static boolean canLogin(String username, int password) {
    for (Student User : usersList) {
        System.out.println(User.getHashedpassw() + " " + password);
        if (User.getUsername().equals(username) && User.getHashedpassw()==(password)) {
            if (User.isRestricted()) {
                JOptionPane.showMessageDialog(null, "Your access has been restricted. Contact admin.");
                return false; // User is restricted, deny login
            }
            return true;  // User is not restricted, allow login
        }
    }
    JOptionPane.showMessageDialog(null, "Invalid username or password.");
    return false; // Username or password does not match any user, deny login
}
    public static Student getRequiredUser(String userName){
        
        for(Student user : usersList){
            if(user.getUsername().equals(userName)){
                return user;
            }
        }
//        if(usersList.size() < 1){
//            usersList.add(new UserInfo("admin", "admin","-","Administration","0000",0000,Boolean.FALSE));
////        }
//        return usersList.get(0);
//    }
    return null;
}
    
    
    public static Student findStudent(int studentId)
    {
        for(Student student: usersList)
        {
            if(student.getStudentId() == studentId)
                return student;
        }
        return null;
    }
}

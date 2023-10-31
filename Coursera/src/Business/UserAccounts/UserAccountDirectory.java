/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccounts;

import Business.Profiles.FacultyProfile;
import Business.Profiles.Profile;

import java.util.ArrayList;
import model.professors.Professor;
import static model.professors.ProfessorDirectory.professorDirectory;

/**
 *
 * @author kal bugrara
 */
public class UserAccountDirectory {
    
      public static ArrayList<UserAccount> useraccountlist ;
      public static UserAccount currentUser;
      public UserAccountDirectory (){
          
       useraccountlist = new ArrayList();

    }

    public UserAccount newUserAccount(Profile p, String un, String pw) {

        UserAccount ua = new UserAccount (p,  un,  pw);
        useraccountlist.add(ua);
        return ua;
    }

    public UserAccount findUserAccount(int id) {

        for (UserAccount ua : useraccountlist) {

            if (ua.isMatch(id)) {
                return ua;
            }
        }
            return null; //not found after going through the whole list
         }
     public static UserAccount AuthenticateUser(String un, String pw) {

        for (UserAccount ua : useraccountlist) {
              if(ua.username.equals(un) && ua.password.equals(pw))
              {
                  currentUser = ua;
                  return currentUser;
              }
            
            }
        return null; //not found after going through the whole list
        }
     
    public static int hashPassword(String password)         //method for hashing password
    {
        int hash = 0;
    for (char c : password.toCharArray()) {
      hash += c;
    }
    return hash;
        

    }
       
    
    public static boolean canLogin(String username, int password) {
    for (UserAccount ua: useraccountlist) {
//        System.out.println(professor.getHashedpassw() + " " + password);
        if (ua.getUserLoginName().equals(username) && ua.hashedPassword==(password)) {
//            if (.isRestricted()) {
//                JOptionPane.showMessageDialog(null, "Your access has been restricted. Contact admin.");
//                return false; // User is restricted, deny login
//            }
            return true;  // User is not restricted, allow login
        }
    }
    return false;
    }
    
    public static UserAccount getRequiredUser(String userName){
        
//        for(Professor user : professorDirectory){
//            if(user.getUsername().equals(userName)){
//                return user;
//            }

    for (UserAccount ua: useraccountlist) {
//        System.out.println(professor.getHashedpassw() + " " + password);
        if (ua.getUserLoginName().equals(userName)) {
//            if (.isRestricted()) {
//                JOptionPane.showMessageDialog(null, "Your access has been restricted. Contact admin.");
//                return false; // User is restricted, deny login
//            }
            return ua;  // User is not restricted, allow login
        }
    }
    return null;


        }
            
//     public ArrayList<UserAccount> getUserAccountList()
//     {
//         return useraccountlist;
//     }
     
//    public static FacultyProfile getRequiredUser(String userName){
//        
//        for(FacultyProfile user : professorDirecto){
//            if(user.getUsername().equals(userName)){
//                return user;
//            }
//        }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccounts;

import Business.Profiles.Profile;
import javax.swing.text.PasswordView;



/**
 *
 * @author kal bugrara
 */
public class UserAccount {
    
    public Profile profile;
    public int i=0;
    public static String username;
    public static String password;
    int hashedPassword;
    int prevHashedPassword;
    String status;
    String[] useraaAccounts = {"User1", "User2", "User3", "User4", "User5"};

        // Initialize a variable to count the user accounts
        int userAccountCount = 0;

        // Iterate through the user accounts using a for loop
        
    
    public UserAccount (Profile profile, String username, String password ){

         this.profile = profile;
         this.username = username;
         this.password = password;

    }

    public int getPersonId(){
        return profile.getPerson().getPersonId();
    }
    public String getUserLoginName(){
        return username;
    }

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        UserAccount.username = username;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        UserAccount.password = password;
    }
    
//    public static String getPassword()
//    {
//        return password;
//    }

        public boolean isMatch(int id){
        if(getPersonId() == id) return true;
        return false;
    }
//        public boolean IsValidUser(String un, String pw){
//        
//            if (username.equalsIgnoreCase(un) && password.equals(pw)) return true;
//            else return false;
//        
//        }
        public String getRole(){
            return profile.getRole();
        }
        
        public Profile getAssociatedPersonProfile(){
            return profile;
        }
        
    @Override
        public String toString(){
            
            return getUserLoginName();
        }
        
       public void gothroughAccounts()
       {
           for(i = 0; i < 50; i++) 
        {
            userAccountCount++; // Increment the count for each user account
        }
       }
       
}


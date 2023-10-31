/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.admin;

import java.util.ArrayList;

/**
 *
 * @author anirudh
 */
public class AdminDirectory {
    
    public static ArrayList <Admin> adminList = new ArrayList<>();
        public static Admin currentAdmin;
    
    public static void updateCurrentAdmin(Admin admin)
    {
        currentAdmin = admin;
    }
        public static Admin getRequiredUser(String userName){
        
        for(Admin user : adminList){
            if(user.getUsername().equals(userName)){
                return user;
            }
        }
        return null;
        }
        
    public static boolean canLogin(String username, int password) {
    for (Admin admin : adminList) {
//        System.out.println(professor.getHashedpassw() + " " + password);
        if (admin.getUsername().equals(username) && admin.getHashedPassword()==(password)) {
//            if (.isRestricted()) {
//                JOptionPane.showMessageDialog(null, "Your access has been restricted. Contact admin.");
//                return false; // User is restricted, deny login
//            }
            return true;  // User is not restricted, allow login
        }
    }
    return false;
    
}
}

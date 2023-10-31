/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.admin;

import Business.Person.Person;

/**
 *
 * @author anirudh
 */
public class Admin {
    private String username;
    private String password;
    private int hashedPassword;
    Person person;
    
    public Admin(Person p)
    {
        person = p;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getHashedPassword() {
        return hashedPassword;
    }

    public void setHashedPassword(int hashedPassword) {
        this.hashedPassword = hashedPassword;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    
            public static int hashPassword(String password)         //method for hashing password
    {
        int hash = 0;
    for (char c : password.toCharArray()) {
      hash += c;
    }
    return hash;
        

    }
            
    public void AdminConvert(int name, String password)
    {
      // Insert password in the middle of the username
        System.out.print("Enter your username: ");
        String usernname ="";
        String passssword = "";
        char combined_word;
        
        for (int i = 0; i < username.length(); i++) {
            combined_word = username.charAt(i);
        }
        for (int i = 0; i < passssword.length(); i++) {
            combined_word = passssword.charAt(i);
        }

        
        


    }
    
    
}

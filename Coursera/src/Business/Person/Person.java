/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

/**
 *
 * @author kal bugrara
 */
public class Person {

    int personId;
    String name;
    String status;
    String access;



//    public int getId() {
//        return personId;
//    }



//    public String getName() {
//        return name;
//    }



//    public String getUsername() {
//        return username;
//    }
//
//
//    public String getPassword() {
//        return password;
//    }
//
//
//    public int getHashedPassword() {
//        return hashedPassword;
//    }
//
//
//
//    public int getPrevHashedPassword() {
//        return prevHashedPassword;
//    }
//
//
//
//    public String getStatus() {
//        return status;
//    }



    public Person(int personId, String name, String status) {

        this.personId = personId;
        this.name = name;
        this.status = status;
//        this.username = username;
//        this.password = password;
//        this.hashedPassword = hashedPassword;
//        this.prevHashedPassword = prevHashedPassword;
//        this.status = status;
    }
    public int getPersonId() {
        return personId;
    }
    
        public String getPersonName() {
        return name;
    }
        
        public String getPersonStatus()
        {
            return status;
        } 

        public void setPersonStatus(String status)
        {
            this.status = status;
        }
                
                

    public boolean isMatch(int id) {
        if (getPersonId() == id) {
            return true;
        }
        return false;
    }

//    @Override
//    public String toString() {
//        return getPersonId();
//    }
}

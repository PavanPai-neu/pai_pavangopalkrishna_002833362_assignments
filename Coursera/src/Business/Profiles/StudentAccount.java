/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Profiles;

/**
 *
 * @author kal bugrara
 */
public class StudentAccount {
    
    private String name;
    private int age;
    private String studentID;
    private String address;
    private String email;
    private String phoneNumber;
    private double gpa;
    private boolean isEnrolled;
    private String major;
    //private ArrayList<String> coursesEnrolled;
    
    public void Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.studentID = studentID;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.gpa = gpa;
        this.isEnrolled = isEnrolled;
        this.major = major;
    }

    @Override
    public String toString() {
        return "StudentAccount{" + "age=" + age + ", studentID=" + studentID + ", phoneNumber=" + phoneNumber + ", gpa=" + gpa + ", isEnrolled=" + isEnrolled + ", major=" + major + '}';
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Profiles;

import Business.Business;
import Business.Person.Person;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author kal bugrara
 */
public class StudentDirectory {


    ArrayList<StudentProfile> studentlist;
    Business business;
    public StudentDirectory(Business b) {
     business = b;
     studentlist = new ArrayList();

    }

    public StudentProfile newStudentProfile(Person p, int studentId, int programId, String degree, String term, Date dateOfBirth, String email) {

        StudentProfile sp = new StudentProfile(p, studentId, programId, degree, term, dateOfBirth, email);
        studentlist.add(sp);
        return sp;
    }

    public StudentProfile findStudent(int id) {

        for (StudentProfile sp : studentlist) {

            if (sp.isMatch(id)) {
                return sp;
            }
        }
            return null; //not found after going through the whole list
         }
    
}

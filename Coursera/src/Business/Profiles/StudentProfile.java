/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Profiles;

import Business.Person.Person;
import java.util.Date;

/**
 *
 * @author kal bugrara
 */
public class StudentProfile extends Profile {

    Person person;
    private String degree;
    private String term;
    private String email;
    private Date dateOfBirth;
    private int studentId;
    private int programId;
//    Transcript transcript;
    //   EmploymentHistroy employmenthistory;

    public StudentProfile(Person p, int studentId, int programId, String degree, String term, Date dateOfBirth, String email) {
        super(p);
        this.dateOfBirth = dateOfBirth;
        this.degree = degree;
        this.email =email;
        this.programId = programId;
        this.studentId = studentId;
        this.term = term;

//        transcript = new Transcript(this);
//        employmenthistory = new EmploymentHistroy();
    }

    @Override
    public String getRole() {
        return "Student";
    }

    public boolean isMatch(int id) {
        return person.getPersonId() == id;
    }

}

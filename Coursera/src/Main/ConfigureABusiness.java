/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

*/
package Main;

import Business.Business;
import Business.Person.Person;
import Business.Person.PersonDirectory;
import Business.Profiles.EmployeeDirectory;
import Business.Profiles.EmployeeProfile;
import Business.Profiles.FacultyDirectory;
import Business.Profiles.FacultyProfile;
//import Business.Profiles.StudentDirectory;
import Business.Profiles.StudentProfile;

import Business.UserAccounts.UserAccount;
import Business.UserAccounts.UserAccountDirectory;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;
import model.admin.Admin;
import model.admin.AdminDirectory;
import model.courses.Assignment;
import model.courses.AssignmentDirectory;
import model.courses.Course;
import model.courses.CourseDirectory;
import model.courses.Schedule;
import model.courses.ScheduleDirectory;
import model.professors.Professor;
import model.professors.ProfessorDirectory;
import model.programs.Program;
import model.programs.ProgramDirectory;
import model.student.Student;
import model.student.StudentDirectory;


/**
 *
 * @author kal bugrara
 */
public class ConfigureABusiness {
    
    public static int i =1;

    public static Business initialize() {
        Business business = new Business("Coursera Application");

// Create Persons
      PersonDirectory persondirectory = business.getPersonDirectory();
// person representing sales organization        
//        Person xeroxsalesperson001 = persondirectory.newPerson("Xerox sales");
//        Person xeroxmarketingperson001 = persondirectory.newPerson("Xerox marketing");
//        Person xeroxadminperson001 = persondirectory.newPerson("Xerox admin");
//        Person firstUser = persondirectory.newPerson("first user");

            
            
//            Professor professor1 = new Professor();
//            professor1.setProfessorId(i++);
//            professor1.setProfessorName("ani");
//            professor1.setUsername("ani");
//            professor1.setPassw("ani");
//            professor1.setHashedpassw(Professor.hashPassword("ani"));
//            professor1.setPrevHashedPassw(Professor.hashPassword("ani"));
//            professor1.setProfessorRating(5);
//            ProfessorDirectory.professorDirectory.add(professor1);

// Create person objects to represent customer organizations. 

        
            
//        Person person005 = persondirectory.newPerson("Dell");
          Person admin1 =   persondirectory.newPerson(i++, "Admin", "Not Created");    
          Person person1 =  persondirectory.newPerson(i++, "ani", "Not Created");
          Person person2 =  persondirectory.newPerson(i++, "john", "Not Created");
          Person person3 =  persondirectory.newPerson(i++, "ann", "Not Created");
          Person person4 =  persondirectory.newPerson(i++, "ray", "Not Created");
          Person person5 =  persondirectory.newPerson(i++, "adam", "Not Created");
          Person person6 =  persondirectory.newPerson(i++, "jack", "Not Created");
          Person person7 =  persondirectory.newPerson(i++, "manny", "Not Created");
          Person person8 =  persondirectory.newPerson(i++, "chris", "Not Created");
          Person person9 =  persondirectory.newPerson(i++, "harry", "Not Created");
          Person person10 =  persondirectory.newPerson(i++, "ben", "Not Created");
//        Person person006 = persondirectory.newPerson("Microsoft");
//        Person person007 = persondirectory.newPerson("Google");
//        Person person008 = persondirectory.newPerson("JP Morgan");
//        Person person009 = persondirectory.newPerson("State street"); //we use this as customer

// Create Customers


// Create Admins to manage the business
//        EmployeeDirectory employeedirectory = business.getEmployeeDirectory();
//        EmployeeProfile employeeprofile0 = employeedirectory.newEmployeeProfile(xeroxadminperson001);
//        StudentDirectory studentDirectory = business.getStudentDirectory();
//        StudentProfile studentProfile0 = studentDirectory.newStudentProfile(firstUser);
        Admin adminAccount = new Admin(admin1);
        adminAccount.setUsername("Admin");
        adminAccount.setPassword("Admin");
        adminAccount.setHashedPassword(Admin.hashPassword("Admin"));
        AdminDirectory.adminList.add(adminAccount);
        
        int prid = 1;
        Professor professor1 = new Professor(person1);
        person1.setPersonStatus("Professor");
        professor1.setProfessorName(professor1.getPerson().getPersonName());
        professor1.setProfessorId(prid++);
        professor1.setUsername("ani");
        professor1.setPassw("ani");
        professor1.setHashedpassw(Professor.hashPassword("ani"));
        professor1.setPrevHashedPassw(Professor.hashPassword("ani"));
        professor1.setProfessorRating(5);
        ProfessorDirectory.professorDirectory.add(professor1);
        
        Professor professor2 = new Professor(person2);
        person2.setPersonStatus("Professor");
        professor2.setProfessorName(professor2.getPerson().getPersonName());
        professor2.setProfessorId(prid++);
        professor2.setUsername("john");
        professor2.setPassw("john");
        professor2.setHashedpassw(Professor.hashPassword("john"));
        professor2.setPrevHashedPassw(Professor.hashPassword("john"));
        professor2.setProfessorRating(5);
        ProfessorDirectory.professorDirectory.add(professor2);
        
        Professor professor3 = new Professor(person3);
        person3.setPersonStatus("Professor");
        professor3.setProfessorName(professor3.getPerson().getPersonName());
        professor3.setProfessorId(prid++);
        professor3.setUsername("ann");
        professor3.setPassw("ann");
        professor3.setHashedpassw(Professor.hashPassword("ann"));
        professor3.setPrevHashedPassw(Professor.hashPassword("ann"));
        professor3.setProfessorRating(5);
        ProfessorDirectory.professorDirectory.add(professor3);
        
        Professor professor4 = new Professor(person4);
        person4.setPersonStatus("Professor");
        professor4.setProfessorName(professor4.getPerson().getPersonName());
        professor4.setProfessorId(prid++);
        professor4.setUsername("ray");
        professor4.setPassw("ray");
        professor4.setHashedpassw(Professor.hashPassword("ray"));
        professor4.setPrevHashedPassw(Professor.hashPassword("ray"));
        professor4.setProfessorRating(5);
        ProfessorDirectory.professorDirectory.add(professor4);
        
        Professor professor5 = new Professor(person5);
        person5.setPersonStatus("Professor");
        professor5.setProfessorName(professor5.getPerson().getPersonName());
        professor5.setProfessorId(prid++);
        professor5.setUsername("adam");
        professor5.setPassw("adam");
        professor5.setHashedpassw(Professor.hashPassword("adam"));
        professor5.setPrevHashedPassw(Professor.hashPassword("adam"));
        professor5.setProfessorRating(5);
        ProfessorDirectory.professorDirectory.add(professor5);
        
                Professor professor6 = new Professor(person6);
        person6.setPersonStatus("Professor");        
        professor6.setProfessorName(professor6.getPerson().getPersonName());
        professor6.setProfessorId(prid++);
        professor6.setUsername("jack");
        professor6.setPassw("jack");
        professor6.setHashedpassw(Professor.hashPassword("jack"));
        professor6.setPrevHashedPassw(Professor.hashPassword("jack"));
        professor6.setProfessorRating(5);
        ProfessorDirectory.professorDirectory.add(professor6);
        
        
                Professor professor7 = new Professor(person7);
        person7.setPersonStatus("Professor");
        professor7.setProfessorName(professor7.getPerson().getPersonName());
        professor7.setProfessorId(prid++);
        professor7.setUsername("manny");
        professor7.setPassw("manny");
        professor7.setHashedpassw(Professor.hashPassword("manny"));
        professor7.setPrevHashedPassw(Professor.hashPassword("manny"));
        professor7.setProfessorRating(5);
        ProfessorDirectory.professorDirectory.add(professor7);
        
        
                Professor professor8 = new Professor(person8);
        person8.setPersonStatus("Professor");
        professor8.setProfessorName(professor8.getPerson().getPersonName());
        professor8.setProfessorId(prid++);
        professor8.setUsername("chris");
        professor8.setPassw("chris");
        professor8.setHashedpassw(Professor.hashPassword("chris"));
        professor8.setPrevHashedPassw(Professor.hashPassword("chris"));
        professor8.setProfessorRating(5);
        ProfessorDirectory.professorDirectory.add(professor8);
        
        
        Professor professor9 = new Professor(person9);
        person9.setPersonStatus("Professor");
        professor9.setProfessorName(professor5.getPerson().getPersonName());
        professor9.setProfessorId(prid++);
        professor9.setUsername("harry");
        professor9.setPassw("harry");
        professor9.setHashedpassw(Professor.hashPassword("harry"));
        professor9.setPrevHashedPassw(Professor.hashPassword("harry"));
        professor9.setProfessorRating(5);
        ProfessorDirectory.professorDirectory.add(professor9);
        
        
        Professor professor10 = new Professor(person10);
        person10.setPersonStatus("Professor");
        professor10.setProfessorName(professor5.getPerson().getPersonName());
        professor10.setProfessorId(prid++);
        professor10.setUsername("ben");
        professor10.setPassw("ben");
        professor10.setHashedpassw(Professor.hashPassword("ben"));
        professor10.setPrevHashedPassw(Professor.hashPassword("ben"));
        professor10.setProfessorRating(5);
        ProfessorDirectory.professorDirectory.add(professor10);
        
        
//        FacultyDirectory facultyDirectory = business.getFacultyDirectory();
//        FacultyProfile facultyProfile1 = facultyDirectory.newFacultyProfile(professor1,prid++,5);
//        FacultyProfile facultyProfile2 = facultyDirectory.newFacultyProfile(professor2,prid++,5);
//        FacultyProfile facultyProfile3 = facultyDirectory.newFacultyProfile(professor3,prid++,5);
//        FacultyProfile facultyProfile4 = facultyDirectory.newFacultyProfile(professor4,prid++,5);
//        FacultyProfile facultyProfile5 = facultyDirectory.newFacultyProfile(professor5,prid++,5);
//        FacultyProfile facultyProfile6 = facultyDirectory.newFacultyProfile(professor6,prid++,5);
//        FacultyProfile facultyProfile7 = facultyDirectory.newFacultyProfile(professor7,prid++,5);
//        FacultyProfile facultyProfile8 = facultyDirectory.newFacultyProfile(professor8,prid++,5);
//        FacultyProfile facultyProfile9 = facultyDirectory.newFacultyProfile(professor9,prid++,5);
//        FacultyProfile facultyProfile10 = facultyDirectory.newFacultyProfile(professor10,prid++,5);

        
            int p =1;
            Program program1 = new Program();
            program1.setProgramId(p++);
            program1.setDescription("Organizations can make smarter decisions when they effectively harness the power of data. The business analytics concentration is designed to provide students");
            program1.setDuration(24);
            ArrayList <Professor> professorsforProgram1 = new ArrayList();
            professorsforProgram1.add(professor1);
            program1.setProfessors(professorsforProgram1);
            program1.setProgramName("Business Analytics");
            program1.setLevel("Bachelors");
            program1.setRating(5);
            program1.setTotalCredits(24);
            program1.setTerm("Fall");
            ProgramDirectory.programDirectory.add(program1);
            
            Program program2 = new Program();
            program2.setProgramId(p++);
            program2.setDescription("Civil engineers play a vital role in human progress and well-being worldwide. ");
            program2.setDuration(18);
            ArrayList <Professor> professorsforProgram2 = new ArrayList();
            professorsforProgram2.add(professor6);
            professorsforProgram2.add(professor4);
            professorsforProgram2.add(professor3);
            program2.setProfessors(professorsforProgram2);
            program2.setProgramName("Civil Engineering");
            program2.setRating(4);
            program2.setLevel("Bachelors");
            program2.setTotalCredits(24);
            program2.setTerm("Summer");
            ProgramDirectory.programDirectory.add(program2);
            
            Program program3 = new Program();
            program3.setProgramId(p++);
            program3.setDescription("Cybersecurity combines essential computer science with conceptual and practical specialization in security to prepare students for hands-on, deeply technical work in the field.");
            program3.setDuration(24);
            program3.setLevel("Bachelors");
            ArrayList <Professor> professorsforProgram3 = new ArrayList();
            professorsforProgram3.add(professor7);
            professorsforProgram3.add(professor10);
            professorsforProgram3.add(professor1);
            professorsforProgram3.add(professor9);
            program3.setProfessors(professorsforProgram3);
            program3.setProgramName("Cybersecurity");
            program3.setRating(5);
            program3.setTotalCredits(24);
            program3.setTerm("Fall");
            ProgramDirectory.programDirectory.add(program3);
            
            Program program4 = new Program();
            program4.setProgramId(p++);
            program4.setDescription("The components of the Information Age—global communication systems; computers and computer chips");
            program4.setDuration(20);
            ArrayList <Professor> professorsforProgram4 = new ArrayList();
            professorsforProgram4.add(professor10);
            program4.setProfessors(professorsforProgram4);
            program4.setProgramName("Electrical Engineering");
            program4.setRating(4);
            program4.setLevel("Bachelors");
            program4.setTotalCredits(24);
            program4.setTerm("Summer");
            ProgramDirectory.programDirectory.add(program4);
            
            Program program5 = new Program();
            program5.setProgramId(p++);
            program5.setDescription("Our Bachelor of Science in Marine Biology aims to provide students with a solid foundation in marine biology");
            program5.setDuration(24);
            ArrayList <Professor> professorsforProgram5 = new ArrayList();
            professorsforProgram5.add(professor3);
            professorsforProgram5.add(professor10);
            program5.setProfessors(professorsforProgram5);
            program5.setProgramName("Marine Biology");
            program5.setRating(3);
            program5.setLevel("Bachelors");
            program5.setTotalCredits(24);
            program5.setTerm("Fall");
            ProgramDirectory.programDirectory.add(program5);
            
            Program program6 = new Program();
            program6.setProgramId(p++);
            program6.setDescription("The program prepares graduates to play pivotal roles in today’s cutting-edge life science, biotechnology");
            program6.setDuration(24);
            ArrayList <Professor> professorsforProgram6 = new ArrayList();
            professorsforProgram6.add(professor7);
            professorsforProgram6.add(professor10);
            professorsforProgram6.add(professor3);
            professorsforProgram6.add(professor9);
            program6.setProfessors(professorsforProgram6);
            program6.setProgramName("Bioinformatics");
            program6.setRating(5);
            program6.setLevel("Masters");
            program6.setTotalCredits(24);
            program6.setTerm("Summer");
            ProgramDirectory.programDirectory.add(program6);
            
            Program program7 = new Program();
            program7.setProgramId(p++);
            program7.setDescription("he Master of Science in Information Systems offers cutting-edge expertise in a variety of courses that combine technological advances and business practices.");
            program7.setDuration(24);
            ArrayList <Professor> professorsforProgram7 = new ArrayList();
            professorsforProgram7.add(professor7);
            professorsforProgram7.add(professor3);
            professorsforProgram7.add(professor2);
            program7.setProfessors(professorsforProgram7);
            program7.setProgramName("Information Systems");
            program7.setLevel("Masters");
            program7.setRating(5);
            program7.setTotalCredits(24);
            program7.setTerm("Fall");
            ProgramDirectory.programDirectory.add(program7);
            
            Program program8 = new Program();
            program8.setProgramId(p++);
            program8.setDescription("Prepare to take on new projects, learn new technologies, hold a leadership role, and help advance the field of computer science");
            program8.setDuration(24);
            ArrayList <Professor> professorsforProgram8 = new ArrayList();
            professorsforProgram8.add(professor8);
            professorsforProgram8.add(professor6);
            professorsforProgram8.add(professor3);
            professorsforProgram8.add(professor9);
            program8.setProfessors(professorsforProgram8);
            program8.setProgramName("Computer Science");
            program8.setLevel("Masters");
            program8.setRating(5);
            program8.setTotalCredits(24);
            program8.setTerm("Summer");
            ProgramDirectory.programDirectory.add(program8);
            
            Program program9 = new Program();
            program9.setProgramId(p++);
            program9.setDescription("he Master of Science in Engineering Management offers graduate students an opportunity to develop the technical expertise and the business competence");
            program9.setDuration(24);
            ArrayList <Professor> professorsforProgram9 = new ArrayList();
            professorsforProgram9.add(professor3);
            professorsforProgram9.add(professor1);
            program9.setProfessors(professorsforProgram9);
            program9.setProgramName("Engineering Management");
            program9.setLevel("Masters");
            program9.setRating(5);
            program9.setTotalCredits(24);
            program9.setTerm("Fall");
            ProgramDirectory.programDirectory.add(program9);
            
            Program program10 = new Program();
            program10.setProgramId(p++);
            program10.setDescription("The Master of Science in Software Engineering Systems degree prepares students for in-demand careers as software developers engineering complex");
            program10.setDuration(24);
            ArrayList <Professor> professorsforProgram10 = new ArrayList();
            professorsforProgram10.add(professor2);
            professorsforProgram10.add(professor6);
            professorsforProgram10.add(professor3);
            program10.setProfessors(professorsforProgram10);
            program10.setProgramName("Software Engineering");
            program10.setLevel("Masters");
            program10.setRating(5);
            program10.setTotalCredits(24);
            program10.setTerm("Summer");
            ProgramDirectory.programDirectory.add(program10);
            
            
            
            
//            int courseno = 1;
//                Course course = new Course();
//                course.setCourseId(courseno);
//                course.setTitle("AED"+courseno);
//                course.setCredits(4);
//                course.setDescription("AED"+courseno);
//                courseno++;
//                ArrayList <Program> relatedPrograms = new ArrayList<>();
//                relatedPrograms.add(ProgramDirectory.programDirectory.get(0));
//                HashMap<String, String> syllabus = new HashMap<>();
//                syllabus.put("week1", "week1 syllabus");
//                syllabus.put("week2", "week2 syllabus");
//                syllabus.put("week3", "week3 syllabus");
//                syllabus.put("week4", "week4 syllabus");
//                course.setProgramsItBelongsTo(relatedPrograms);
//                course.setAvailability("Fall");
//                course.setSyllabus(syllabus);
//                CourseDirectory.courseDirectory.add(course);

            int courseno = 1;
            for(int o= 0;o<10;o++)
            {
                for(int k =1; k<=3;k++)
                {
                Course course = new Course();
                course.setCourseId(courseno);
                course.setTitle("AED"+courseno);
                course.setCredits(8);
                course.setDescription("AED"+courseno);
                courseno++;
                ArrayList <Program> relatedPrograms = new ArrayList<>();
                relatedPrograms.add(ProgramDirectory.programDirectory.get(o));
                HashMap<String, String> syllabus = new HashMap<>();
                syllabus.put("week1", "week1 syllabus");
                syllabus.put("week2", "week2 syllabus");
                syllabus.put("week3", "week3 syllabus");
                syllabus.put("week4", "week4 syllabus");
                course.setProgramsItBelongsTo(relatedPrograms);
                course.setAvailability("Fall");
                course.setSyllabus(syllabus);
                CourseDirectory.courseDirectory.add(course);
                }
                
                
            }
            
            for(Course course: CourseDirectory.courseDirectory)
            {
                ArrayList<Program> programs= course.getProgramsItBelongsTo();
                for(Program program: programs)
                {
                    System.out.println(course.getCourseId()+" "+program.getProgramId());
                }
            }

            Random random_method = new Random();
//            
            int scheduleId = 1;
            for(int q =0;q<10;q++)
            {
                Program program = ProgramDirectory.programDirectory.get(q);
                
                ArrayList<Professor> programProfessors = program.getProfessors();
                System.out.println(program.getProgramName() + " " + program.getProgramId() + " " + programProfessors.size());
                System.out.println(programProfessors.size());
                ArrayList <Course> programCourses = CourseDirectory.getCoursesForPrograms(program.getProgramId());
                String []sections = new String[]{"A","B","C"};
                ArrayList <String> days = new ArrayList<>();
                days.add("Monday");
                days.add("Tuesday");
                days.add("Wednesday");
                days.add("Thursday");
                days.add("Friday");
//                String []timeslots = new String[]{"9:00-11:00", "11:00-1:00", "1:00-3:00", "3:00-5:00", "5:00-7:00"};
                ArrayList <String> timeslots = new ArrayList<>();
                timeslots.add("9:00AM-11:00AM");
                timeslots.add("11:00AM-1:00PM");
                timeslots.add("1:00PM-3:00PM");
                timeslots.add("3:00PM-5:00PM");
                timeslots.add("5:00PM-7:00PM");
                for(int courseIndex = 0; courseIndex<3; courseIndex++)
                {
                    Schedule schedule = new Schedule();
                    schedule.setCourseId(programCourses.get(courseIndex).getCourseId());
                    schedule.setScheduleId(scheduleId++);
//                    System.out.println(programProfessors.size());
                    int index = random_method.nextInt(programProfessors.size());
                    schedule.setProfessorId(programProfessors.get(index).getProfessorId());
                    int sectionIndex = random_method.nextInt(sections.length);
                    schedule.setSection(sections[sectionIndex]);
                    int dayIndex = random_method.nextInt(days.size());
                    String scheduleDays = days.get(dayIndex)+",";
                    days.remove(days.get(dayIndex));
                    dayIndex = random_method.nextInt(days.size());
                    scheduleDays+= days.get(dayIndex);
                    schedule.setDays(scheduleDays);
                    int timeIndex = random_method.nextInt(timeslots.size());
                    String scheduleTimes = timeslots.get(timeIndex)+",";
                    timeslots.remove(timeslots.get(timeIndex));
                    timeIndex = random_method.nextInt(timeslots.size());
                    scheduleTimes+=timeslots.get(timeIndex);
                    schedule.setTimeFrames(scheduleTimes);
                    schedule.setNoOofSeats(20);
                    ScheduleDirectory.scheduleDirectory.add(schedule);
                    System.out.println("Program Name: "+ program.getProgramName());
                    System.out.println("Schedule ID: "+schedule.getScheduleId());
                    System.out.println("Course ID: "+schedule.getCourseId());
                    System.out.println("Professor ID: "+schedule.getProfessorId());
//                    System.out.println(programProfessors.get(index).getProfessorId());
                    System.out.println("Section: "+schedule.getSection());
                    System.out.println("Days: "+schedule.getDays());
                    System.out.println("TimeFrames: "+schedule.getTimeFrames());
                    System.out.println("Seats: "+schedule.getNoOofSeats());
//                    System.out.println(schedule.get);
                    
                }
                
                
                
            }            
                
//            int scheduleId =1;
//            Schedule schedule1 = new Schedule();
//            schedule1.setCourseId(1);
//            schedule1.setProfessorId(1);
//            schedule1.setScheduleId(scheduleId);
//            schedule1.setSection("A");
//            schedule1.setDays("Thursday");
//            schedule1.setTimeFrames("9:00-11:00");
//            schedule1.setNoOofSeats(20);
//            ScheduleDirectory.scheduleDirectory.add(schedule1);
//            


            int assignmentId = 1;
            for(Schedule schedule: ScheduleDirectory.scheduleDirectory)
            {
                Assignment assignment = new Assignment();
                assignment.setAssignmentId(assignmentId++);
                assignment.setCourseId(schedule.getCourseId());
                assignment.setScheduleId(schedule.getScheduleId());
                assignment.setTitle("Assignment");
                assignment.setDescription("Description");
                assignment.setStatus("UNGRADED");
                assignment.setTotalMarks(30);
                assignment.setDueDate("10/12/2025");
                AssignmentDirectory.assignmentDirectory.add(assignment);
            }
            
            
            int studentId = 1;
            String []studentNames = {"Keyon", "Jocelynn", "Avah", "Aubree", "Reyna", "Oliver", "Jayleen", "Derrick", "Andy", "Sloane", "Kaden", "Jean", "Ayden", "Kelly", "Marlene", "Davian", "Raegan", "Allie", "Alannah", "Ernesto", "Gwendolyn", "Sanai", "Aisha", "Dwayne", "Denise", "Fernanda", "Elyse", "Camille", "Skyler", "Brycen", "Joy", "Raelynn"
, "Emanuel", "Deven", "Susan", "Malakai", "Nikhil", "Audrey", "Maria", "Marcos", "Joe", "Francesca", "Kael", "Ali", "Casey", "Carlos", "Aryana", "Elliott", "Marquise", "Josiah"};  
            ArrayList <Program> studentPrograms = ProgramDirectory.programDirectory;
            
            for(int iu = 0; iu<50; iu++)
            {
                
                int programId = random_method.nextInt(studentPrograms.size())+1;
                System.out.println(programId);
                Person person = persondirectory.newPerson(i, studentNames[iu], "Not Created");
                Student student = new Student(person);
                person.setPersonStatus("Student");
                student.setStudentId(studentId++);
                student.setName(studentNames[iu]);
                student.setDateOfBirth(new Date());
                student.setEmail("abc@gmail.com");
                student.setUsername(studentNames[iu]);
                student.setPassw(studentNames[iu]);
                int hashedpassword = Student.hashPassword(studentNames[iu]);
                student.setHashedpassw(hashedpassword);
                student.setPrevHashedPassw(hashedpassword);
                student.setDegree(ProgramDirectory.findProgramById(programId).getProgramName());
                student.setProgramId(programId);
                student.setTerm(ProgramDirectory.findProgramById(programId).getTerm());
                StudentDirectory.usersList.add(student);
                
            }

                    
            
                    
                    
        
        
        
        
        
        

   





          

        return business;

    }

}

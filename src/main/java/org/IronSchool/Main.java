package org.IronSchool;
import org.IronSchool.ASCIIartTEST.ASCIIartTEST;
import org.IronSchool.ASCIIartTEST.AdvancedASCIItest;
import org.IronSchool.ASCIIartTEST.AskingNameSchoolToASCIIart;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        String name = AskingNameSchoolToASCIIart.askingSchoolNameASCIIMethod();


        //int numberTeacher=InitialMenu.askedNumberTeachersCreated();
        List<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher("Anthony",10000));
        teachers.add(new Teacher("Diego",10000));
        teachers.add(new Teacher("Sebastian",10000));


        //InitialMenu.enterDetailsEachTeacher(numberTeacher);
        System.out.println(teachers.toString());



        //int numberCourses=InitialMenu.askedNumberCoursesCreated();
        List<Course> courses =  new ArrayList<>();
        courses.add(new Course("Matematicas",120));
        courses.add(new Course("Java",320));
        courses.add(new Course("SQL",220));

        //InitialMenu.enterDetailsEachCourse(numberCourses);
        System.out.println(courses.toString());



        //int numberStudents=InitialMenu.askedNumberStudentsCreated();
        List<Student> students= new ArrayList<>();
        students.add(new Student("Pere","street 5","pere@pere.com"));

                //InitialMenu.enterDetailsEachStudent(numberStudents);
        System.out.println(students.toString());



        Commands command=Commands.ENROLL;
        int studentId=students.get(0).getStudentId();
        int courseId=courses.get(0).getId();

        //8




        switch (command){
            case ENROLL:
                InitialMenu.enrollStudent(studentId,courseId, students, courses);
                break;
            case ASSIGN:
                //InitialMenu.assignTeacher(studentId,courseId, teachers, courses);
                break;
            case SHOW_COURSES:
                InitialMenu.showCourses(courses);
                break;

            case LOOKUP_COURSE:
            case SHOW_STUDENTS:
                InitialMenu.showStudents(students);
                break;
            case LOOKUP_STUDENT:
            case SHOW_TEACHERS:
                InitialMenu.showTeachers(teachers);
                break;
            case LOOKUP_TEACHER:
            case SHOW_PROFIT:
        }
    }
}
package org.IronSchool;
import org.IronSchool.ASCIIartTEST.AskingNameSchoolToASCIIart;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {





        String name = AskingNameSchoolToASCIIart.askingSchoolNameASCIIMethod();


        //int numberTeacher=InitialMenu.askedNumberTeachersCreated();
        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(new Teacher("Anthony",10000));
        teacherList.add(new Teacher("Diego",10000));
        teacherList.add(new Teacher("Sebastian",10000));


        //InitialMenu.enterDetailsEachTeacher(numberTeacher);
        System.out.println(teacherList.toString());



        //int numberCourses=InitialMenu.askedNumberCoursesCreated();
        List<Course> courseList =  new ArrayList<>();
        courseList.add(new Course("Matematicas",120));
        courseList.add(new Course("Java",320));
        courseList.add(new Course("SQL",220));

        //InitialMenu.enterDetailsEachCourse(numberCourses);
        System.out.println(courseList.toString());



        //int numberStudents=InitialMenu.askedNumberStudentsCreated();
        List<Student> studentList= new ArrayList<>();
        studentList.add(new Student("Pere","street 5","pere@pere.com"));
        studentList.add(new Student("BOb","street 55","a@a.com"));
        studentList.add(new Student("Daniel","street 25","dan@dan.com"));

                //InitialMenu.enterDetailsEachStudent(numberStudents);
        System.out.println(studentList.toString());




        School.setName(name);
        School.setTeacherList(teacherList);
        School.setCourseList(courseList);
        School.setStudentList(studentList);



        Commands command=Commands.ENROLL;
        int studentId=studentList.get(0).getStudentId();
        int courseId=courseList.get(0).getCourseId();
        int teacherId=teacherList.get(0).getTeacherId();

        //8




        switch (command){
            case ENROLL:
                InitialMenu.enrollStudent(studentId,courseId);
                System.out.println(studentList.get(0).getListCourses());
                break;
            case ASSIGN:
                InitialMenu.assignTeacher(teacherId,courseId);
                System.out.println(teacherList.get(0).getCourseList());
                break;
            case SHOW_COURSES:
                InitialMenu.showCourses(courseList);
                break;

            case LOOKUP_COURSE:
            case SHOW_STUDENTS:
                InitialMenu.showStudents(studentList);
                break;
            case LOOKUP_STUDENT:
            case SHOW_TEACHERS:
                InitialMenu.showTeachers(teacherList);
                break;
            case LOOKUP_TEACHER:
            case SHOW_PROFIT:
        }





    }
}
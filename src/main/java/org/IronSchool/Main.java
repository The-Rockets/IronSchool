package org.IronSchool;
import org.IronSchool.ASCIIartTEST.AskingNameSchoolToASCIIart;
import org.IronSchool.ASCIIartTEST.GodByAsciiArt;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);


        String name = AskingNameSchoolToASCIIart.askingSchoolNameASCIIMethod();
        List<Teacher> teacherList = InitialSchoolSetUp.initialTeachersSetUp();
        List<Course> courseList = InitialSchoolSetUp.initialCoursesSetUp();
        List<Student> studentList = InitialSchoolSetUp.initialStudentSetUp();


        School.setName(name);
        School.setTeacherList(teacherList);
        School.setCourseList(courseList);
        School.setStudentList(studentList);

        int studentId = School.getStudentList().get(2).getStudentId();
        int studentId1 = School.getStudentList().get(1).getStudentId();
        int studentId2 = School.getStudentList().get(0).getStudentId();

        int courseId = courseList.get(0).getCourseId();
        int courseId1 = courseList.get(1).getCourseId();
        int courseId2 = courseList.get(2).getCourseId();

        int teacherId = teacherList.get(0).getTeacherId();
        int teacherId1 = teacherList.get(1).getTeacherId();
        int teacherId2 = teacherList.get(2).getTeacherId();

        //8
        InitialMenu.assignTeacher(teacherId, courseId);
        InitialMenu.assignTeacher(teacherId2, courseId2);
        InitialMenu.enrollStudent(studentId1, courseId);
        InitialMenu.enrollStudent(studentId2, courseId1);





        boolean test = false;
        while (!test) {
            System.out.println("========================================================================");
            System.out.println("- - - - - - - - - - - - " + name.toUpperCase() +" School MAIN Menu  - - - - - - - - - - - - ");
            System.out.println("========================================================================");
            System.out.println("       Press 'c' --> to Commands Menu" + "\n" +
                    "       Press 'b' --> to Input data menu." + "\n" +
                    "       Press 'e' --> to EXIT");
            String choice = scanner.next().toLowerCase();
            while (!choice.equals("c") && !choice.equals("e") && !choice.equals("b")) {

                System.out.println("Invalid input. Please enter 'C' back to Commands Menu, 'E' to exit or 'B' to Input menu");
                choice = scanner.next().toLowerCase();
            }
            switch (choice) {
                case ("c"):
                    CommandMenu.comandMenu(scanner);
                    break;
                case ("e"):
                    System.out.println("fin de la aplicacion");
                    GodByAsciiArt.goodBy();
                    test = true;
                    break;
                case ("b"):
                    AskingNameSchoolToASCIIart.askingSchoolNameASCIIMethod();
                        int numberTeacher = InitialMenu.askedNumberTeachersCreated();
                        InitialMenu.enterDetailsEachTeacher(numberTeacher);
                        int numberCourses = InitialMenu.askedNumberCoursesCreated();
                        InitialMenu.enterDetailsEachCourse(numberCourses);
                        int numberStudents = InitialMenu.askedNumberStudentsCreated();
                        InitialMenu.enterDetailsEachStudent(numberStudents);
                    break;
            }
        }
    }


}

package org.IronSchool;
import org.IronSchool.ASCIIartTEST.AskingNameSchoolToASCIIart;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String name = AskingNameSchoolToASCIIart.askingSchoolNameASCIIMethod();


        //int numberTeacher=InitialMenu.askedNumberTeachersCreated();
        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(new Teacher("Anthony", 100));
        teacherList.add(new Teacher("Diego", 100));
        teacherList.add(new Teacher("Sebastian", 200));

        //InitialMenu.enterDetailsEachTeacher(numberTeacher);
        System.out.println(teacherList.toString());

        //int numberCourses=InitialMenu.askedNumberCoursesCreated();
        List<Course> courseList = new ArrayList<>();
        courseList.add(new Course("Matematicas", 120));
        courseList.add(new Course("Java", 320));
        courseList.add(new Course("SQL", 220));

        //InitialMenu.enterDetailsEachCourse(numberCourses);
        System.out.println(courseList.toString());

        //int numberStudents=InitialMenu.askedNumberStudentsCreated();
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Pere", "street 5", "pere@pere.com"));
        studentList.add(new Student("BOb", "street 55", "a@a.com"));
        studentList.add(new Student("Daniel", "street 25", "dan@dan.com"));

        //InitialMenu.enterDetailsEachStudent(numberStudents);
        System.out.println(studentList.toString());

        //CommandMenu.comandMenu(scanner);


        School.setName(name);
        School.setTeacherList(teacherList);
        School.setCourseList(courseList);
        School.setStudentList(studentList);

        int studentId = School.getStudentList().get(2).getStudentId();
        int studentId1 = School.getStudentList().get(1).getStudentId();
        int studentId2 = School.getStudentList().get(2).getStudentId();

        int courseId = courseList.get(1).getCourseId();
        int teacherId = teacherList.get(0).getTeacherId();

        //8
        InitialMenu.assignTeacher(teacherId, courseId);

        InitialMenu.enrollStudent(studentId1, courseId);
        InitialMenu.enrollStudent(studentId2, courseId);
        InitialMenu.enrollStudent(studentId, courseId);




        boolean test = false;
        while (!test) {
            System.out.println("Press 'c' --back to Commands Menu" + "\n" +
                    "Press 'b' -- back to Input menu.." + "\n" +
                    "Press 'e' -- to EXIT");
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

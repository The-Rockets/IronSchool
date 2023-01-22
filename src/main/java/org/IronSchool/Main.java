package org.IronSchool;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //String name=InitialMenu.askingNameSchool();

        /*
        int numberTeacher=InitialMenu.askedNumberTeachersCreated();
        List<Teacher> teachers= InitialMenu.enterDetailsEachTeacher(numberTeacher);
        System.out.println(teachers.toString());
         */

        /*
        int numberCourses=InitialMenu.askedNumberCoursesCreated();
        List<Course> courses= InitialMenu.enterDetailsEachCourse(numberCourses);
        System.out.println(courses.toString());
         */


        int numberStudents=InitialMenu.askedNumberStudentsCreated();
        List<Student> students= InitialMenu.enterDetailsEachStudent(numberStudents);
        System.out.println(students.toString());


    }
}
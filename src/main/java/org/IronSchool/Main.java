package org.IronSchool;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        //String name=InitialMenu.askingNameSchool();

        /*
        int numberTeacher=InitialMenu.askedNumberTeachersCreated();
        List<Teacher> teachers= InitialMenu.enterDetailsEachTeacher(numberTeacher);
        System.out.println(teachers.toString());
         */
        int numberCourses=InitialMenu.askedNumberCoursesCreated();
        List<Course> courses= InitialMenu.enterDetailsEachCourse(numberCourses);
        System.out.println(courses.toString());




    }
}
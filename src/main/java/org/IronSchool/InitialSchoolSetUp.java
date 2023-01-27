package org.IronSchool;

import java.util.ArrayList;
import java.util.List;

public class InitialSchoolSetUp {

    static List<Student> initialStudentSetUp() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Bob", "street 5", "email@email.com"));
        studentList.add(new Student("Laura", "street 55", "email@email.com"));
        studentList.add(new Student("Ana", "street 25", "email@email.com"));

        for (Student s : studentList) {
            System.out.println(s);
        }
        System.out.println("========================================================================");
        return studentList;
    }

    static List<Course> initialCoursesSetUp() {
        List<Course> courseList = new ArrayList<>();
        courseList.add(new Course("Matematicas", 1000));
        courseList.add(new Course("Fisica", 1000));
        courseList.add(new Course("Quimica", 1000));

        for (Course c : courseList) {
            System.out.println(c);
        }
        System.out.println("========================================================================");
        return courseList;
    }

    static List<Teacher> initialTeachersSetUp() {
        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(new Teacher("Anthony", 200));
        teacherList.add(new Teacher("Diego", 200));
        teacherList.add(new Teacher("Sebastian", 200));

        for (Teacher t : teacherList) {
            System.out.println(t);
        }
        System.out.println("========================================================================");
        return teacherList;
    }
}

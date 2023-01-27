package org.IronSchool;

import java.util.List;

public class School {

    private static String name;
    private static List<Course> courseList;
    private static List<Teacher> teacherList;

    private static List<Student> studentList;


    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        School.name = name;
    }

    public static List<Course> getCourseList() {
        return courseList;
    }

    public static void setCourseList(List<Course> courseList) {
        School.courseList = courseList;
    }

    public static List<Teacher> getTeacherList() {
        return teacherList;
    }

    public static void setTeacherList(List<Teacher> teacherList) {
        School.teacherList = teacherList;
    }

    public static List<Student> getStudentList() {
        return studentList;
    }

    public static void setStudentList(List<Student> studentList) {
        School.studentList = studentList;
    }
}

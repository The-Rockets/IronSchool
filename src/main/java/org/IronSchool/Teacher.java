package org.IronSchool;

import java.util.HashMap;

public class Teacher {

    private static int counter=0;
    private final String teacherId;
    private String name;
    private double salary;
    private HashMap<String,Course> mapTeacherCourses;

    public Teacher(String name, double salary) {
        this.teacherId="tchr"+counter;
        this.name = name;
        this.salary = salary;
        counter++;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId='" + teacherId + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

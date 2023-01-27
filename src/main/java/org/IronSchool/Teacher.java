package org.IronSchool;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class Teacher {

    private final int teacherId;
    private String name;
    private double salary;
    private List<Course> courseList=new ArrayList<>();

    private static int counter = 0;

    public Teacher(String name, double salary) {
        this.teacherId= counter;
        setName(name);
        setSalary(salary);
        counter++;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
    public void addCourse(Course course) {
        courseList.add(course);
    }


    public List<Course> getCourseList() {
        return courseList;
    }

    @Override
    public String toString() {
        return
                "teacherId='" + teacherId + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", Courses=" + courseList +
                '}';
    }
}

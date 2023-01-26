package org.IronSchool;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class Student {
    private final int studentId;
    private String name;
    private String address;
    private String email;

    private List<Course> listCourses = new ArrayList<>();
    private List<Teacher> listTeachers = new ArrayList<>();


    private int counter = 0;


    public Student(String name, String address, String email) {
        this.studentId = counter;
        setName(name);
        setAddress(address);
        setEmail(email);
        counter++;
    }

    public int getStudentId() {
        return this.studentId;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public String getEmail() {
        return this.email;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void addCourse(Course course) {
        listCourses.add(course);
    }

    public List<Course> getListCourses() {
        return listCourses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", listCourses=" + listCourses +
                ", listTeachers=" + listTeachers +
                ", counter=" + counter +
                '}';
    }
}

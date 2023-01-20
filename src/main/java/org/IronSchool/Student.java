package org.IronSchool;

import java.util.UUID;

public class Student {
    private final String studentId;
    private String name;
    private String address;
    private String email;
    private Course course;

    public Student(String name, String address, String email,Course course) {
        this.studentId = UUID.randomUUID().toString();
        setName(name);
        setAddress(address);
        setEmail(email);
        setCourse(course);
    }

    public String getStudentId() {
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

    public Course getCourse() {
        return this.course;
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

    public void setCourse(Course course) {
        this.course = course;
    }
}

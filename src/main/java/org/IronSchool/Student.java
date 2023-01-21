package org.IronSchool;

import java.util.HashMap;
import java.util.UUID;

public class Student {
    private final String studentId;
    private String name;
    private String address;
    private String email;

    private HashMap<String,Course> mapStudentCourses;
    private HashMap<String,Teacher> mapStudentTeachers;


    public Student(String name, String address, String email) {
        this.studentId = UUID.randomUUID().toString();
        setName(name);
        setAddress(address);
        setEmail(email);
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


    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}

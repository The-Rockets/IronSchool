package org.IronSchool;

import java.util.HashMap;
import java.util.UUID;

public class Teacher {

    private final UUID id;

    private String name;
    private double salary;
    private HashMap<String,Course> mapTeacherCourses;

    public Teacher(String name, double salary) {
        this.id= UUID.randomUUID();
        this.name = name;
        this.salary = salary;

    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId='" + id + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

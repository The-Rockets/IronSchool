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
        setName(name);
        setSalary(salary);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
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

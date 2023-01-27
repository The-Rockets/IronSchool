package org.IronSchool;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private final int courseId;
    private String name;
    private double price;


    private Teacher teacher;
    private List<Student> studentList = new ArrayList<>();

    private int counter = 0;

    public Course(String name, double price) {
        this.courseId = counter;
        setName(name);
        setPrice(price);
        counter++;
    }

    public int getCourseId() {
        return courseId;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getMoneyEarned() {
        return getPrice()* studentList.size();
    }


    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + courseId +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }


    public void addStudent(Student student) {
        studentList.add(student);
    }
    public void addTeacher(Teacher teacher) {
        this.teacher=teacher;
    }
}


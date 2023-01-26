package org.IronSchool;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Course {
    private final int id;
    private String name;
    private double price;
    private double moneyEarned;
    private List<Teacher> teacherList = new ArrayList<>();

    private List<Student> studentList = new ArrayList<>();

    private int counter = 0;

    public Course(String name, double price) {
        this.id = counter;
        setName(name);
        setPrice(price);
        counter++;
    }

    public int getId() {
        return id;
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

    public void setMoneyEarned(double money_earned) {
        this.moneyEarned = money_earned;
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(List<Teacher> teacherList) {
        this.teacherList = teacherList;
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
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }


    public void addStudent(Student student) {
        studentList.add(student);
    }
    public void addStudent(Teacher teacher) {
        teacherList.add(teacher);
    }
}


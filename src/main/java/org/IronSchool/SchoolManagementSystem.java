package org.IronSchool;

import java.util.ArrayList;

/*class SchoolManagementSystem {
    private ArrayList<Teacher> teachers;
    private ArrayList<Course> courses;
    private ArrayList<Student> students;
    private double totalProfit;

    public SchoolManagementSystem() {
        teachers = new ArrayList<>();
        courses = new ArrayList<>();
        students = new ArrayList<>();
    }

    public void enrollStudent(String studentId, String courseId) {
        Student student = findStudentById(studentId);
        if (student == null) {
            System.out.println("Student not found.");
            return;
        }
        Course course = findCourseById(courseId);
        if (course == null) {
            System.out.println("Course not found.");
            return;
        }
        student.setCourse(course);
        course.updateMoneyEarned(course.getPrice());
        System.out.println("Student successfully enrolled in course.");
    }


    public void assignTeacher(String teacherId, String courseId) {
        Teacher teacher = findTeacherById(teacherId);
        if (teacher == null) {
            System.out.println("Teacher not found.");
            return;
        }
        Course course = findCourseById(courseId);
        if (course == null) {
            System.out.println("Course not found.");
            return;
        }
        course.setTeacher(teacher);
        System.out.println("Teacher successfully assigned to course.");
    }

    public void showCourses() {
        if (courses.isEmpty()) {
            System.out.println("No courses found.");
            return;
        }
        for (Course course : courses) {
            System.out.println(course.getName());
        }
    }

    public void lookupCourse(String courseId) {
        Course course = findCourseById(courseId);
        if (course == null) {
            System.out.println("Course not found.");
            return;
        }
        System.out.println("ID: " + course.getCourseId());
        System.out.println("Name: " + course.getName());
        System.out.println("Price: " + course.getPrice());
        System.out.println("Money earned: " + course.getMoneyEarned());
        if (course.getTeacher() != null) {
            System.out.println("Teacher: " + course.getTeacher().getName());
        } else {
            System.out.println("Teacher: Not assigned");
        }
    }

    public void showStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        for (Student student : students) {
            System.out.println(student.getName());
        }
    }

    public void lookupStudent(String studentId) {
        Student student = findStudentById(studentId);
        if (student == null) {
            System.out.println("Student not found.");
            return;
        }
    }

    */


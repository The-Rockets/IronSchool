package org.IronSchool;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class InitialMenu{

    public static String statStringFilter(String statName) {
        Scanner scanner = new Scanner(System.in);
        boolean  invalidStat= false;
        String stat=null;
        while (!invalidStat && stat==null) {
            System.out.println("Enter a "+statName+" that must not be a null string or an empty string");
            stat = scanner.nextLine().trim();
            if (!stat.isEmpty()) {
                invalidStat = true;
            }else {
                System.err.println("The "+statName+" must not be a null string or an empty string");
                stat=null;
            }
        }
        return stat.substring(0,1).toUpperCase()+stat.substring(1).toLowerCase();
    }

    public static int statIntegerFilter(String statName) {
        Scanner scanner = new Scanner(System.in);
        boolean  invalidStat= false;
        int stat=0;
        while (!invalidStat) {
            try {
                System.out.println("Enter a number of "+statName+" which must be a positive integer");
                stat = scanner.nextInt();
                if (stat >0) {
                    invalidStat = true;
                }else {
                    System.err.println("The number of "+statName+" must be a positive integer");
                }
            } catch (InputMismatchException e) {
                System.err.println("The number of "+statName+" must be a positive integer");
                scanner.nextLine();
            }
        }
        return stat;
    }


    //1
    public static String askingNameSchool() {
        return statStringFilter("School name");
    }

    //2
    public static int askedNumberTeachersCreated() {
        return statIntegerFilter("Teachers");
    }

    //3
    public static List<Teacher> enterDetailsEachTeacher(int numberTeachers) {
        List<Teacher> teachers=new ArrayList<>();
        for(int i=0; i<numberTeachers;i++){
            System.out.println("================================");
            System.out.println("Enter the data of Teacher "+(i+1));
            System.out.println("================================");
            String firstName= statStringFilter("Teacher first name");
            String lastName= statStringFilter("Teacher last name");
            String fullName=firstName+" "+lastName;
            double salary=statIntegerFilter("salary");
            teachers.add(new Teacher(fullName,salary));
        }
        return teachers;
    }

    //4
    public static int askedNumberCoursesCreated() {
        return statIntegerFilter("Courses");
    }

    //5
    public static List<Course> enterDetailsEachCourse(int numberCourses) {
        List<Course> courses=new ArrayList<>();
        for(int i=0; i<numberCourses;i++){
            System.out.println("================================");
            System.out.println("Enter the data of Course "+(i+1));
            System.out.println("================================");
            String name= statStringFilter("Course name");
            double price=statIntegerFilter("price");
            courses.add(new Course(name,price));
        }
        return courses;
    }

    //6
    public static int askedNumberStudentsCreated() {
        return statIntegerFilter("Student");
    }

    //7
    public static List<Student> enterDetailsEachStudent(int numberStudents) {
        List<Student> students=new ArrayList<>();
        for(int i=0; i<numberStudents;i++){
            System.out.println("================================");
            System.out.println("Enter the data of Student "+(i+1));
            System.out.println("================================");
            String firstName= statStringFilter("Student first name");
            String lastName= statStringFilter("Student last name");
            String fullName=firstName+" "+lastName;
            String address= statStringFilter("Student address");
            String email="";
            while (!email.contains("@")) {
                email=statStringFilter("Student email");
                if(!email.contains("@")){
                    System.err.println("The email must have a symbol '@'");
                }
            }
            students.add(new Student(fullName,address,email));
        }
        return students;
    }

    //8
    public static void enterCommandOfListToExecuteAction(Commands command) {
        switch (command){
            case ENROLL:
            case ASSIGN:
            case SHOW_COURSES:
            case LOOKUP_COURSE:
            case SHOW_STUDENTS:
            case LOOKUP_STUDENT:
            case SHOW_TEACHERS:
            case LOOKUP_TEACHER:
            case SHOW_PROFIT:
        }

    }
}
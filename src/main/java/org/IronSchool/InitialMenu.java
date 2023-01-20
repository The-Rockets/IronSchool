package org.IronSchool;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InitialMenu{



    public static String askingNameSchool() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the name of the school");
        String name=scanner.next();
        return name;
    }

    //2

    public static int statIntegerFilter(String statName) {
        Scanner scanner = new Scanner(System.in);
        boolean  invalidStat= false;
        int stat=0;
        while (!invalidStat) {
            try {
                System.out.println("Enter a positive integer value of numbers of " +statName );
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
    public static int askedNumberTeachersCreated() {
        return statIntegerFilter("Teachers");
    }

    //3
    public static void enterDetailsEachTeacher(int numberTeachers) {

    }

    //4
    public static int askedNumberCoursesCreated() {
        return statIntegerFilter("Courses");
    }

    //5
    public static void enterDetailsEachCourse(int numberCourses) {

    }

    //6
    public static int askedNumberStudentsCreated() {
        return statIntegerFilter("Student");
    }

    //7
    public static void enterDetailsEachStudent(int numberStudents) {

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
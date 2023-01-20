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

    public static int statFilter(String statName) {
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
        return statFilter("Teachers");
    }

    //3
    public void enterDetailsEachTeacher(int numberTeachers) {

    }

    //4
    public int askedNumberCoursesCreated() {
        return statFilter("Courses");
    }

    //5
    public void enterDetailsEachCourse(int numberCourses) {

    }

    //6
    public int askedNumberStudentsCreated() {
        return statFilter("Student");
    }

    //7
    public void enterDetailsEachStudent(int numberStudents) {

    }

    //8
    public void enterCommandOfListToExecuteAction(Commands command) {

    }
}

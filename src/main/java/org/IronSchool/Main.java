package org.IronSchool;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String name=InitialMenu.askingNameSchool();
        int numberTeacher=InitialMenu.askedNumberTeachersCreated();
        List<Teacher> teachers= InitialMenu.enterDetailsEachTeacher(numberTeacher);

        System.out.println(teachers.toString());








    }
}
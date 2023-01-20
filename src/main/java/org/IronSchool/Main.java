package org.IronSchool;

public class Main {
    public static void main(String[] args) {
        String name=InitialMenu.askingNameSchool();
        int numberTeacher=InitialMenu.askedNumberTeachersCreated();

        System.out.println(name);
        System.out.println(numberTeacher);
    }
}
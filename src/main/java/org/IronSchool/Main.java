package org.IronSchool;

public class Main {
    public static void main(String[] args) {
        Teacher teacher1=new Teacher("teacher1",100);
        Teacher teacher2=new Teacher("teacher2",200);

        System.out.println(teacher1.toString());
        System.out.println(teacher2.toString());
    }
}
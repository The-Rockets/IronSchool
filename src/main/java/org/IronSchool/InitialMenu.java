package org.IronSchool;

import java.util.Scanner;

public class InitialMenu implements applicationWorks{

    private Scanner scanner=new Scanner(System.in);

    @Override
    public String askingNameSchool() {
        System.out.println("Introduce el nombre de la escuela");
        String name=scanner.next();
        return name;

    }

    @Override
    public int askedNumberTeachersCreated() {
        return 0;
    }

    @Override
    public void enterDetailsEachTeacher(int numberTeachers) {

    }

    @Override
    public int askedNumberCoursesCreated() {
        return 0;
    }

    @Override
    public void enterDetailsEachCourse(int numberCourses) {

    }

    @Override
    public int askedNumberStudentsCreated() {
        return 0;
    }

    @Override
    public void enterDetailsEachStudent(int numberStudents) {

    }

    @Override
    public void enterCommandOfListToExecuteAction(Commands command) {

    }
}

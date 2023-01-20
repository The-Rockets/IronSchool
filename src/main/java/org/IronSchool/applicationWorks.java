package org.IronSchool;

public interface applicationWorks {
    //1
    String askingNameSchool();

    //2
    int askedNumberTeachersCreated();
    //3
    void enterDetailsEachTeacher(int numberTeachers);
    //4
    int askedNumberCoursesCreated();
    //5
    void enterDetailsEachCourse(int numberCourses);
    //6
    int askedNumberStudentsCreated();
    //7
    void enterDetailsEachStudent(int numberStudents);
    //8
    void enterCommandOfListToExecuteAction(Commands command);

}

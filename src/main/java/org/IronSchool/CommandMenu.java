package org.IronSchool;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CommandMenu {




public static void comandMenu(Scanner scanner){

    boolean test = false;
    Commands comando = null;
    while(!test){
        System.out.println("introduce uno de los siguientes comandos :"
                +"\n "+ "1.-ENROLL [STUDENT_ID] [COURSE_ID]: This command will help enroll the student specified in the corresponding course."
                +"\n "+ "2.-ASSIGN [TEACHER_ID] [COURSE_ID]: This command will help assign the teacher specified to the corresponding course"
                +"\n "+ "3.-SHOW COURSES: This command will display a list of all courses"
                +"\n "+ "4.-LOOKUP COURSE [COURSE_ID]: This command will display the full details of the specified course"
                +"\n "+ "5.-SHOW STUDENTS: This command will display a list of all students"
                +"\n "+ "6.-LOOKUP STUDENT [STUDENT_ID]: This command will display the full details of the specified student"
                +"\n "+ "7.-SHOW TEACHERS: This command will display a list of all teachers"
                +"\n "+ "8.-LOOKUP TEACHER [TEACHER_ID]: This command will display the full details of the specified teacher"
                +"\n "+ "9.-SHOW PROFIT: This command will calculate (The total money earned from all courses)");
        int opcion = scanner.nextInt();
        if(opcion >9 || opcion <1){
            System.err.println("comando no valido");
        }else{
            switch (opcion){
                case 1 : comando = Commands.ENROLL; break;
                case 2 : comando = Commands.ASSIGN; break;
                case 3 : comando = Commands.SHOW_COURSES; break;
                case 4 : comando = Commands.LOOKUP_COURSE; break;
                case 5 : comando = Commands.SHOW_STUDENTS; break;
                case 6 : comando = Commands.LOOKUP_STUDENT; break;
                case 7 : comando = Commands.SHOW_TEACHERS; break;
                case 8 : comando = Commands.LOOKUP_TEACHER; break;
                case 9 : comando = Commands.SHOW_PROFIT; break;
            }
            test = true;
        }
    }

    School.getName();
    List<Teacher> teacherList= School.getTeacherList();
    List<Course>courseList = School.getCourseList();
    List<Student>studentList = School.getStudentList();

        switch (comando){
        case ENROLL:

            int indiceStudent = InitialMenu.statIntegerFilterId("Student Id");
            int indiceCurso = InitialMenu.statIntegerFilterId("Curse Id");
            InitialMenu.enrollStudent(indiceStudent,indiceCurso);
            System.out.println(studentList.get(0).getListCourses());
            break;
        case ASSIGN:
            int indiceTecher = InitialMenu.statIntegerFilterId("Teacher Id");
            int indiceCurso2 = InitialMenu.statIntegerFilterId("Curse Id");
            InitialMenu.assignTeacher(indiceTecher,indiceCurso2);
            System.out.println(teacherList.get(0).getCourseList());
            break;
        case SHOW_COURSES:
            InitialMenu.showCourses();
            break;
        case LOOKUP_COURSE:
            int indiceCurso3 = InitialMenu.statIntegerFilterId("Course Id");
            InitialMenu.lookupCourse(indiceCurso3);
            break;
        case SHOW_STUDENTS:
            InitialMenu.showStudents();
            break;
        case LOOKUP_STUDENT:
            int indiceStudent1 = InitialMenu.statIntegerFilterId("Student Id");
            InitialMenu.lookupStudent(indiceStudent1);
            break;
        case SHOW_TEACHERS:
            InitialMenu.showTeachers();
            break;
        case LOOKUP_TEACHER:
            int indiceTecher4 = InitialMenu.statIntegerFilterId("Teacher Id");
            InitialMenu.lookupTeacher(indiceTecher4);
            break;
        case SHOW_PROFIT:
            InitialMenu.showProfit();
            break;
    }

}
}


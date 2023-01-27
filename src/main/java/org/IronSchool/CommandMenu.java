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
            System.out.println("seleciona un estudiante" );
            int indiceStudent = scanner.nextInt();
            System.out.println("seleciona un curso" );
            int indiceCurso = scanner.nextInt();
            InitialMenu.enrollStudent(indiceStudent,indiceCurso);
            System.out.println(studentList.get(0).getListCourses());
            break;
        case ASSIGN:
            System.out.println("seleciona un Teacher" );
            int indiceTecher = scanner.nextInt();
            System.out.println("seleciona un curso" );
            int indiceCurso2 = scanner.nextInt();
            InitialMenu.assignTeacher(indiceTecher,indiceCurso2);
            System.out.println(teacherList.get(0).getCourseList());
            break;
        case SHOW_COURSES:
            InitialMenu.showCourses();
            break;
        case LOOKUP_COURSE:
            System.out.println("seleciona un curso" );
            int indiceCurso3 = scanner.nextInt();
            InitialMenu.lookupCourse(indiceCurso3);
            break;
        case SHOW_STUDENTS:
            InitialMenu.showStudents();
            break;
        case LOOKUP_STUDENT:
            InitialMenu.lookupStudent(studentId);
            break;
        case SHOW_TEACHERS:
            InitialMenu.showTeachers();
            break;
        case LOOKUP_TEACHER:
            InitialMenu.lookupTeacher(teacherId);
            break;
        case SHOW_PROFIT:
            InitialMenu.showProfit();
            break;
    }

}
}


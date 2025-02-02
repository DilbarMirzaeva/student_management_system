package student_management;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student(1, "Ali", 19, 85.7);
        Student student2 = new Student(2, "Dilber", 18, 87.5);
        Student student3 = new Student(3, "Gunel", 22, 45.5);
        Student student4 = new Student(4, "Aynur", 20, 40.5);


        StudentManagement studentManagement1 = new StudentManagement();
        studentManagement1.addStudent(student1);
        studentManagement1.addStudent(student3);
        studentManagement1.addStudent(student2);
        studentManagement1.addStudent(student4);
        System.out.println("\n" + studentManagement1.getStudentList());

        Collections.sort(studentManagement1.getStudentList());

        studentManagement1.bubbleSort();
        studentManagement1.selectionSort();
        studentManagement1.mergeSort();

        studentManagement1.addFees(student2);
        studentManagement1.addFees(student4);
        studentManagement1.addFees(student1);
        studentManagement1.addFees(student3);
        System.out.println(studentManagement1.getOutStandingFees());

        System.out.println(studentManagement1.searchStudent(4));
        System.out.println(studentManagement1.searchStudent(8));
        studentManagement1.binarySearchStudent("Dilber");
        studentManagement1.binarySearchStudent("Albert");

        studentManagement1.removeStudent(student1);

        Course course1 = new Course(1L, "Back-End");
        Course course2 = new Course(2L, "Front-End");
        Course course3 = new Course(3L, "UI-UX");
        Course course4 = new Course(4L, "Front-end");


    }
}
package student_management;


import student_management.sort.BubbleSortAge;
import student_management.sort.MergeSortName;
import student_management.sort.SelectionSortGrade;

import java.util.*;

public class StudentManagement {

    private List<Student> studentList = new ArrayList<>();
    private LinkedList<Student> outStandingFees = new LinkedList<>();

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public void removeStudent(Student student) {
        studentList.remove(student);
        System.out.println(student.getName() + " removed");
    }

    public String searchStudent(Integer id) {
        SearchStudent searchStudent = new SearchStudent();
        return searchStudent.linearSearchStudent(studentList, id);
    }

    public void binarySearchStudent(String name) {
        SearchStudent searchStudent = new SearchStudent();
        searchStudent.BinarySearchName(studentList, name);
    }

    public void addFees(Student student) {
        if (student.getGrade() <= 50) {
            outStandingFees.add(student);
        }
    }

    public void bubbleSort() {
        BubbleSortAge b = new BubbleSortAge();
        b.bubbleMethod(studentList);
    }

    public void selectionSort() {
        SelectionSortGrade s = new SelectionSortGrade();
        s.selectionSort(studentList);
    }

    public void mergeSort() {
        System.out.println("\nbefore sort(merge)=> " + studentList);
        System.out.println("Merge sort starting..");
        MergeSortName m = new MergeSortName();
        m.mergeSort(studentList);
        System.out.println("after=> " + studentList);
    }

    @Override
    public String toString() {
        return "StudentManagement{" +
                "studentList=" + studentList +
                ", outStandingFees=" + outStandingFees +
                '}';
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public LinkedList<Student> getOutStandingFees() {
        System.out.print("\nStudents who failed exam: ");
        return outStandingFees;
    }

    public void setOutStandingFees(LinkedList<Student> outStandingFees) {
        this.outStandingFees = outStandingFees;
    }
}

package student_management.sort;

import student_management.Student;

import java.util.List;

public class SelectionSortGrade {

    public void selectionSort(List<Student> students) {
        System.out.println("\nbefore sort(selection)=> " + students);
        System.out.println("Selection sort starting..");
        int index = 0;
        for (int i = 0; i < students.size(); i++) {
            double min = students.get(i).getGrade();
            for (int j = i; j < students.size(); j++) {
                if (students.get(j).getGrade() < min) {
                    min = students.get(j).getGrade();
                    index = j;
                }

                if (students.get(i).getGrade() != min) {
                    Student temp = students.get(i);
                    students.set(i, students.get(index));
                    students.set(index, temp);
                }
            }
        }
        System.out.println("after sorting=> " + students);
    }
}

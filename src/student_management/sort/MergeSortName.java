package student_management.sort;


import student_management.Student;

import java.util.ArrayList;
import java.util.List;

public class MergeSortName {

    public void mergeSort(List<Student> students) {
        int size = students.size();
        if (size < 2) return;


        int mid = size / 2;
        List<Student> left = new ArrayList<>(students.subList(0, mid));
        List<Student> right = new ArrayList<>(students.subList(mid, size));

        mergeSort(left);
        mergeSort(right);

        merge(students, left, right);
    }

    public void merge(List<Student> students, List<Student> left, List<Student> right) {
        int i = 0, j = 0, k = 0;

        while (i < left.size() && j < right.size()) {
            if (left.get(i).getName().compareTo(right.get(j).getName())<0) {
                students.set(k,left.get(i));
                i++;
            }else {
                students.set(k,right.get(j));
                j++;
            }
            k++;
        }

        while (i<left.size()){
            students.set(k,left.get(i));
            i++;
            k++;
        }

        while (j<right.size()){
            students.set(k,right.get(j));
            j++;
            k++;
        }
    }
}


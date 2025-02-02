package student_management;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SearchStudent {

    public String linearSearchStudent(List<Student> students, int id) {
        System.out.print("\nSearch(linear) started.. ==>  ");
        for (int i = 0; i < students.size(); i++) {
            if (((students.get(i)).getId()).equals(id)) {
                return students.get(i).toString();
            }
        }
        return "Student could not find";
    }

    public void SortedName(List<Student> students) {
        Comparator<Student> comparator = new Comparator<>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        Collections.sort(students, comparator);
    }

    public void BinarySearchName(List<Student> students, String studentName) {
        SortedName(students);
        System.out.print("\nSearch(binary) started.. ==>  ");
        int left = 0;
        int right = students.size() - 1;
        boolean b = false;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (studentName.compareTo(students.get(mid).getName()) > 0) {
                left = mid + 1;
            } else if (studentName.compareTo(students.get(mid).getName()) < 0) {
                right = mid - 1;
            } else {
                System.out.println("Student(" + studentName + ") found ==> " + students.get(mid).toString());
                b = true;
                break;
            }
        }

        if (!b) {
            System.out.println("Student not found");
        }

    }

}

package student_management.sort;

import student_management.Student;

import java.util.List;

public class BubbleSortAge {

    public void bubbleMethod(List<Student> students) {
        System.out.println("\nBefore sorting(bubble)=> " + students);
        System.out.println("Bubble sorting start..");
        boolean bool;

        for (int i = 0; i < students.size(); i++) {
            bool = false;
            for (int j = i; j < students.size() - i - 1; j++) {
                if (students.get(j + 1).getAge() < students.get(j).getAge()) {
                    Student t = students.get(j);
                    students.set(j, students.get(j + 1));
                    students.set(j + 1, t);
                    bool = true;
                }
            }
            if (!bool) break;
        }
        System.out.println("Bubble Sort completely successfully!");
        System.out.println("After sorting=> " + students);

    }

}

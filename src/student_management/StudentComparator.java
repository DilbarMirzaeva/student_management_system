package student_management;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        int nameCompare = o1.getName().compareTo(o2.getName());
        if (nameCompare == 0) {
            int ageCompare = o1.getAge().compareTo(o2.getAge());
            if (ageCompare == 0) {
                return o1.getGrade().compareTo(o2.getGrade());
            }
            return ageCompare;

        }
        return nameCompare;
    }

}

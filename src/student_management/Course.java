package student_management;

import java.util.HashSet;
import java.util.Set;

public class Course {
    private Long id;
    private String name;
    private Set<String> uniqueCourses;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getUniqueCourses() {
        return uniqueCourses;
    }

    public void setUniqueCourses(Set<String> uniqueCourses) {
        this.uniqueCourses = uniqueCourses;
    }

    public Course(Long id, String name) {
        this.id = id;
        this.name = name;
        uniqueCourses = new HashSet<>();
    }

    public void addCourses(Course course) {
        if (course != null)
            uniqueCourses.add(course.name);
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", uniqueCourses=" + uniqueCourses +
                '}';
    }
}

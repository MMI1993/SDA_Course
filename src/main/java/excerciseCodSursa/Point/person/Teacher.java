package main.java.excerciseCodSursa.Point.person;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {
    private List<String> courses = new ArrayList<>();
    public Teacher(String name, String address) {
        super(name, address);
    }
    public List<String> getCourses() {
        return courses;
    }
    public void setCourses(List<String> courses) {
        this.courses = courses;
    }
    public void addCourse(String course) {
        courses.add(course);
    }
    public void removeCourse(String course) {
        courses.remove(course);
    }
    public String toString() {
        return "Teacher - " + super.toString();
    }
}

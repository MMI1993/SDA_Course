package main.java.excerciseCodSursa.Point.person;

import jdk.dynalink.linker.support.CompositeGuardingDynamicLinker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student extends Person {
    private int numCourses;

    private Map<String, List<Integer>> noteCursuri= new HashMap<>();

    public Student(String name, String address) {
        super(name, address);
    }
    public void addCourseGrade(String course, List<Integer> note) {
       noteCursuri.put(course, note);

    }
    public double getAvgGrade() {
        double sum = 0;
        for (Map.Entry<String, List<Integer>> entry : noteCursuri.entrySet()) {
            int sumMaterie = 0;
            List<Integer> note = entry.getValue();
            for (int i = 0; i < entry.getValue().size(); i++) {
                sumMaterie += entry.getValue().get(i);
                return sumMaterie / note.size();
            }
        }
        return sum / noteCursuri.size();
    }
    }
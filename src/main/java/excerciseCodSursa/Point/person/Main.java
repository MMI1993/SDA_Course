package main.java.excerciseCodSursa.Point.person;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        Student student1 = new Student("Marius", "Louis Pasteur nr 2");

        Map<String, List<Integer>> s1mate = new HashMap<String, List<Integer>>();
        s1mate.put("mate", new ArrayList<Integer>(Arrays.asList(10, 9, 10)));
        System.out.println(student1 + " + " + s1mate);

        Student student2 = new Student("Alex", "Louis Pasteur nr 6");
        Student student3 = new Student("Alina", "Louis Pasteur nr 5");
        Student student4 = new Student("Mihaela", "Louis Pasteur nr 7");
        Student student5 = new Student("Mitrut", "Louis Pasteur nr 3");


        Teacher teacher1 = new Teacher("Alexandra", "PAsteur nr 5");
        teacher1.addCourse("mate");
        Teacher teacher2 = new Teacher("Ioana", "Suceava nr 5");
        Teacher teacher3 = new Teacher("Maria", "Brancvanu nr 5");
        Teacher teacher4 = new Teacher("Alex", "Bracusi, nr 5");
        Teacher teacher5 = new Teacher("Marius", "Suceava nr 9");

    }
}

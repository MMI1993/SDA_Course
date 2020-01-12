package main.java.advanced.ziua2.annotation;

public class AnnotationApp {
    public static void main(String[] args) {
        Parent parent  =  new Parent("Andrei");
        Child child  = new Child("Junior");
        System.out.println(parent.getName());
        System.out.println(child.getName());
    }
}

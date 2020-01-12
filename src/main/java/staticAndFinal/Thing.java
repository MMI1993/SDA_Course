package main.java.staticAndFinal;


public class Thing {
    public final static int  LUCKY_NUMBER=7;
    private String name;
    public static String description;
    public static int count=0;
    private int id;
    public Thing(){
        id=count;
        count++;
    }
    public void showName(){
        System.out.println("Object id:" + id +","+ description + ":" + name);
    }
    public static void showInfo(){
        System.out.println(description);
        //System.out.println(name); //Won`t work (name nu apare intr-un context static si  metoda este statica).
    }
public static void main(String[]args){
    System.out.println(LUCKY_NUMBER);
}
}

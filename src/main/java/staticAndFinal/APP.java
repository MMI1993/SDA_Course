package main.java.staticAndFinal;



public class APP {
public static void main (String[]args){
    Thing.description ="I am a thing";
    Thing.showInfo();
   // Thing.showName();
    System.out.println("Before creating objects"+"count is:"+ Thing.count);
    Thing thing1 = new Thing();
    Thing thing2 = new Thing();
    System.out.println("After creating objects," + "count is:" + Thing.count);
    //thing1.name = "Bob";
    //thing2.name = "Sue";
    thing1.showName();
    thing2.showName();
    System.out.println(Math.PI);
    System.out.println(Thing.LUCKY_NUMBER);
}
}

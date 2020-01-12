package main.java.constructor;

public class Constructor_Demo {
    int x,y,z;
    Constructor_Demo () {
        x=100;
        y=200;
        System.out.println(x+y);
    }
    Constructor_Demo(int a, int b){
        x=a;
        y=b;
        System.out.println(x+y);
    }
    Constructor_Demo(int a, int b, int c){
        x=a;
        y=b;
        z=c;

        System.out.println(x+y+z);
    }
    public static void main(String[]args){
        Constructor_Demo paramConstructor1=new Constructor_Demo(15,20,3);
        Constructor_Demo paramConstructor2 = new Constructor_Demo(2,9);
        Constructor_Demo paramConstructor3= new Constructor_Demo();
    }
}

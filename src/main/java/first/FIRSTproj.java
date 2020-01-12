package main.java.first;

public class FIRSTproj extends Object {
    private  String s;
    public FIRSTproj () {
        s ="bau!";
    }
public void  sayFIRSTproj(){
        System.out.println (s);
    }
    public static void main (String [] args) {
        FIRSTproj hello = new FIRSTproj();
        hello.sayFIRSTproj();
    }
}

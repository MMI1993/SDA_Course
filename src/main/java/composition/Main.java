package main.java.composition;

public class Main {
    public static void main(String[]args){
    Dimension dimensions = new Dimension(20,20,5);
    Case_carcasa theCase= new Case_carcasa("2258","Dell", 240,dimensions);
    Monitor theMonitor= new Monitor("27 inch","Acer", 6,new Resolution(2540,1440) );
    Motherboard theMotherboard = new Motherboard("BJ-200","Acer",4,6,"V2.44");
    PC thePC = new PC (theCase, theMonitor, theMotherboard);
    thePC.getMonitor().draawPixelAat(1500, 1200,"red");
    thePC.getMotherboard().loadProgram("Windows 10");
    thePC.getTheCase().pressPowerButton();
    }
}

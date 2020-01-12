package main.java.constructor;
class Machine{
    private String name;
    private int code;
    public Machine(){
        this ("Arnie", 0);
        System.out.println("Constructor running");
    }
        public Machine (String name){
        this (name,0);
        System.out.println("Second constructor");
        }
        public Machine (String name, int code){
        System.out.println("Third constructor");
        this.name=name;
        this.code=code;
        }
}
public class App {
    public static void main(String[]args){
        Machine machine1=new Machine ();
        Machine machine2= new Machine ("Mada", 2 );
        Machine machine3= new Machine ("Mada");
    }

}

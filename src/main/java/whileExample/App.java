package main.java.whileExample;

public class App {
    public static void main(String[] args) {
        int counter = 0;
       /* while (true) {
            System.out.println("While loop" + "running" + counter);
            counter++;
        }*/
        boolean flag = true;
        while (flag) {
            counter++;
            System.out.println("Counter value is: " + counter);
            flag = false;
        }
int i= 1;
        while (i<=10){
            System.out.println(i);i++;
        }
      int j=2;
        while (j<=10){
            System.out.println(j);
            j= j+2;
        }
        int a =1;
        while (a<=10){
            System.out.println(a);
            a=a+2;
        }
        int y=10;
        while(y>0){
            System.out.println(y);
            y--;
        }
    }
}

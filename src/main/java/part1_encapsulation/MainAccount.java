package main.java.part1_encapsulation;

public class MainAccount {
    public static void  main (String[]args){
        Account bobsAccount = new Account();
        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());
        bobsAccount.withdrawal(100);
        bobsAccount.deposit(50);
        bobsAccount.withdrawal(50);
        bobsAccount.deposit(52);
        bobsAccount.withdrawal(150);
    }
}

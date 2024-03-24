package practice_list;

import java.text.DecimalFormat;

public class privateClass {
    public static void main(String[] args) {
        Account myAccount = new Account(1000000);
        System.out.println(myAccount);
//        Hacker.malcious(myAccount);
        System.out.println(myAccount);
    }
}
class Account {
    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }
    public String toString() {
        return "Account [balance = " + balance + "]";
    }
}
//class Hacker {
//    public static void malcious(Account account) {
//        account.balance = 0;
//    }
//}


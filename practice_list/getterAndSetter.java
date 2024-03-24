package practice_list;

import java.text.DecimalFormat;

public class getterAndSetter {
    public static void main(String[] args) {
        bankAccount myAccount = new bankAccount(0);
        user.deposit(myAccount, 60000000);
        user.check(myAccount);

    }
}
class bankAccount {
    private int balance;

    public bankAccount(int balance) {
        this.balance = balance;
    }

    public int getBalance() {//getter 사용
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
class user {
    public static void check(bankAccount account) {
        System.out.printf("현재 잔액 : %,d원\n", account.getBalance());
    }

    public static void deposit(bankAccount account, int amount) {
        int bal = account.getBalance();
        account.setBalance(bal + amount);
    }
}


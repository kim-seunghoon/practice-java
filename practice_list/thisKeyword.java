package practice_list;

public class thisKeyword {
    public static void main(String[] args) {
        accounxt a = new accounxt(10000);
        accounxt b = new accounxt(3000);
        a.send(4000, b);
    }
}
class accounxt {
    private int balance;

    accounxt(int balance) {
        this.balance = balance;
        System.out.println("계좌 생성 : \n\t" + this.totring());
    }

    public String totring() {
        return String.format("accounxt [balance=%d]", this.balance);
    }

    public void send(int amount, accounxt target) {
        System.out.println("송금 시작 : \n\t" + this.totring());
        this.balance -= amount;
        target.balance += amount;
        System.out.println("송금 완료 : \n\t" + this.totring());
    }
}

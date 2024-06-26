package chapter12;
class ATM implements Runnable {
	private int money = 100000;
	public void run() {
		try {
			Thread.sleep((int)(Math.random() * 1000));
		} catch(InterruptedException e) {}
		synchronized (this) {
			while (true) {
				if (money <= 0) {
					break;
				}
				withdraw();
			}
		}
	}
	private void withdraw() {
		if (money <= 0) {
			return;
		}
		money -= 10000;
		System.out.println(Thread.currentThread().getName() + "출금. 잔액 : " + money);
	}
}
public class ThreadEx12 {

	public static void main(String[] args) {
		ATM atm = new ATM();
		Thread alpha = new Thread(atm, "ALPHA");
		Thread beta = new Thread(atm, "BETA");
		alpha.start();beta.start();
	}

}

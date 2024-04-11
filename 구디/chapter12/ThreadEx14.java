package chapter12;
/*
 * 생성자, 소비자 스레드
 * 
 * 엄마와 아들이 하나의 계좌를 공유함
 * 계좌금액이 0이면 아들 wait()함
 * 계좌금액이 0보다 크면 엄마 wait()함
 * 엄마는 1만, 2만, 3만으로 계좌에 입금함
 * 엄마 : 0~3초 동안 임의로 sleep
 * 아들 : 0~1초 동안 임의로 sleep
 */
class Account{
	int money;
	synchronized void output() { //동기화 메서드 . son 스레드가 호출 하는 메서드
		while (money == 0) {
			try {
				wait();
			}catch(InterruptedException e) {}
		}
		notifyAll();
		System.out.println(Thread.currentThread().getName() + ":" + money + "원 출금");
		money = 0;
	}
	synchronized void input() {
		while (money > 0) {
			try {
				wait();
			}catch(InterruptedException e) {}
		}
		money = (int)((Math.random() * 3) + 1) * 10000;
		notifyAll();
		System.out.println(Thread.currentThread().getName() + ":" + money + "원 입금");
	}
	
}
class Mother extends Thread { //생산자 스레드
	Account account;
	Mother(Account account){
		super("Mother");
		this.account = account;
	}
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			account.input();
			try {
				sleep((int)(Math.random() * 3000));
			} catch(InterruptedException e) {}
		}
	}
	
}
class Son extends Thread {
	Account account;
	Son(Account account){
		super("Son");
		this.account = account;
	}
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			account.output();
			try {
				sleep((int)(Math.random() * 1000));
			} catch(InterruptedException e) {}
		}
	}
	
}
public class ThreadEx14 {

	public static void main(String[] args) {
		Account acc = new Account();
		Thread m = new Mother(acc);
		Thread s = new Son(acc);
		m.start();s.start();
	}

}

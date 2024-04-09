package chapter12;
/*
 * Thread 생성 벙법
 * 1. Thread 클래스를 상속 받기, run 메서드 오버라이딩 하기
 * 2. Runnable 인터페이스를 구현하기, run 메서드 오버라이딩하기, Thread 클래스에 입력하기
 * 	  Runnable 인터페이스는 FunctionalInterface 임 
 */
public class ThreadEx3 {

	public static void main(String[] args) {
		Runnable r = () -> {
			for (int i = 1; i <= 5; i++) {
				System.out.println(i + " : " + Thread.currentThread().getName());
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e) {}
			}
		};
		Thread t1 = new Thread(r, "First");
		Thread t2 = new Thread(r, "Second");
		t1.start();
		t2.start();
	}

}

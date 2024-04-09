package chapter12;
/*
 * Thread 생성 -2
 * 1.Runnable 인터페이스 구현
 * 2. run 메서드 오버라이딩
 * 3. new Thread (Runnable)
 */
//Runnable 인터페이스를 구현한 구현 클래스, Thread 클래스 아님
class Runnable1 implements Runnable {
	public void run () {
		for (int i = 1; i <= 5; i++) {
			//Thread.currentThread() : 현재 Running 상테의 스레드 객체 리턴
			System.out.println(i + " : " + Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {}
		}
	}
}
public class ThreadEx2 {

	public static void main(String[] args) {
		System.out.println("main 스레드 실행 시작");
		//t1 스레드가 실행해야 되는 Run 메서드는 Runnable1 객체의 run 메서드임
		Runnable r = new Runnable1();
		Thread t1 = new Thread(r, "First"); 
		Thread t2 = new Thread(r, "Second"); 
		t1.start();
		t2.start();
		System.out.println("main 스레드 실행 종료");
	}

}

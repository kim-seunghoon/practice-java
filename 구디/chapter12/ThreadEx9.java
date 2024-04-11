package chapter12;
/*
 * 데몬 스레드
 * 1. 일반 스레드의 보조 역할. 주로 무한반복함
 * 		가비지 콜렉터(쓰레기 수집기) : 데몬 스레드임
 * 2. 일반 스레드가 모두 종료되면 데몬 스레드도 자동 종료됨
 * 3. setDaemon(true) 실행 -> new 상태에서 실행해야 함
 */
class DaemonThread extends Thread {
	public void run() {
		while(true) {
			// this.toString() : Thread[Thread-0,5,main]
			/*
			 * Thread - 0 : 스레드의 이름 이름 설정이 안 됨, 기본 제공 스레드 객체 이름
			 * 5 : 우선순위. 1~10까지의 값 1 : 낮음 10 : 높음
			 * main : 스레드 그룹
			 */
			System.out.println(this); //Thread.toString()메서드 호출
			try {
				sleep(100);
			} catch(InterruptedException e) {}
		}
	}
}
public class ThreadEx9 {

	public static void main(String[] args) throws InterruptedException {
		//Thread.currentThread() : 현재 실행 중인 스레드 객체
		System.out.println(Thread.currentThread()); // Thread.toString() 메서드 호출
		DaemonThread t1 = new DaemonThread();
		DaemonThread t2 = new DaemonThread();
		t1.setDaemon(true);t2.setDaemon(true); //데몬 스레드로 설정
		t1.start();t2.start();
		Thread.sleep(2000);
		System.out.println("main 스레드 종료");
		//일반 스레드 종료, 데몬 스레드도 함께 종료
	}

}

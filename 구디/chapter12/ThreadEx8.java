package chapter12;
/*
 * 동기화 영역 : 동기화 메서드 방식
 * 
 * 1. 동기화 블럭 방식
 * 		스레드 실행 중 synchronized(lock) {...}
 * 2. 동기화 메서드 방식
 * 		synchronized void 메서드명() {...}
 * 
 * lock 해제 시점
 * 1. 동기화 블럭 종료
 * 2. 동기화 메서드 종료
 * 3. 동기화 영역 종료시 lock풀 대기중인 다른 스레드는 자동으로 Runnable 상태로 상태가 변환됨
 * 
 * StringBuffer : 동기화 메서드 Thread에 대해서 safe한 메서드
 * StringBuilder : 일반 메서드 Thread에 대해서 unsafe한 메서드
 */
class PrintThread2 extends Thread {
	Printer ptr;
	char ch;
	PrintThread2(Printer ptr, char ch) {
		this.ch = ch;
		this.ptr = ptr;
	}
	public void run() {
		for (int i = 0; i < 20; i++) {
			ptr.printChar(ch);
		}
	}
}
class Printer {
	public synchronized void printChar(char ch) { //동기화 메서드
		for (int i = 0; i < 80; i++) {
			System.out.print(ch);
		}
		System.out.println();
	}//동기화 메서드 종료, lock 해제
}
public class ThreadEx8 {

	public static void main(String[] args) {
		Printer ptr = new Printer();
		PrintThread2 t1 = new PrintThread2(ptr,'A');
		PrintThread2 t2 = new PrintThread2(ptr,'B');
		PrintThread2 t3 = new PrintThread2(ptr,'C');
		t1.start();t2.start();t3.start();
	}

}

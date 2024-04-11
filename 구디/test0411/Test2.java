package test0411;


/*
 * ThreadEx8.java  소스의 PrintThread2 클래스를 
 * Runnable 인터페이스를 구현하는 방식으로 수정하기
 * PrintRunnable2 : Runnable 인터페이스 구현 클래스
 * 구동클래스 구현하기
 */
class PrintRunnable2 implements Runnable {
	Printer ptr;
	char ch;
	PrintRunnable2(Printer ptr, char ch) {
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
public class Test2 {
	public static void main(String[] args) {
		Printer ptr = new Printer();
		new Thread(new PrintRunnable2(ptr, 'A')).start();
		new Thread(new PrintRunnable2(ptr, 'B')).start();
		new Thread(new PrintRunnable2(ptr, 'C')).start();
	}
}
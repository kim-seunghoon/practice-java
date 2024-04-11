package chapter12;
/*
 * 동기화 예제 : 동기화 블럭 방식
 */
class PrintThread1 extends Thread {
	char ch;
	static Object lock = new Object();// 객체만 가능 = 기본 자료형 안 됨
//	static int lock = 0; //기본형은 사용 불가
//	static Integer lock =0; //객체이므로 사용 가능
	PrintThread1(char ch) {
		this.ch = ch;
	}
	public void run() {
		for (int i = 0; i < 20; i++) {
			synchronized(lock) { //lock : 스레드 객체가 공유하는 공유 객체여야 함
				for (int j = 0; j < 80; j++) {
					System.out.print(ch);
				}
				System.out.println();
			}
		}
	}
}
public class ThreadEx7 {

	public static void main(String[] args) {
		PrintThread1 t1 = new PrintThread1('A');
		PrintThread1 t2 = new PrintThread1('B');
		PrintThread1 t3 = new PrintThread1('C');
		t1.start();t2.start();t3.start();
	}

}

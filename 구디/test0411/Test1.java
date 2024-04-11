package test0411;

/*
 * ThreadEx7.java  소스의 PrintThread1 클래스를 
 * Runnable 인터페이스를 구현하는 방식으로 수정하기
 * PrintRunnable1 : Runnable 인터페이스 구현 클래스
 * 구동클래스도 구현하기. 
 */
class PrintRunnable1 implements Runnable {
	char ch;
	static Object lock = new Object();
	PrintRunnable1(char ch){
		this.ch = ch;
	}
	public void run() {
		for (int i = 0; i < 20; i++) {
			synchronized(lock) {
				for (int j = 0; j < 80; j++) {
					System.out.print(ch);
				}
				System.out.println();
			}
		}
	}
}
public class Test1 {
	public static void main(String[] args) {
		new Thread(new PrintRunnable1('A')).start();
		new Thread(new PrintRunnable1('B')).start();
		new Thread(new PrintRunnable1('C')).start();
		
			
		
	}
}
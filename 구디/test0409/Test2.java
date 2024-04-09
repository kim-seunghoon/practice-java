package test0409;



/*
 * ThreadEx4.java 소스의 SumThread클래스를 Runnable 인터페이스로 구현하는 방식으로 변경하여
 * 1~1000까지 계산하는 프로그램 구현하기.
 */
class SumThread extends Thread implements Runnable {
	int start, end, sum;
	SumThread(int start, int end){
		this.start = start;
		this.end = end;
	}
	public void run() {
		for (int i = start; i <= end; i++) {
			sum+= i;
		}
	}
}
public class Test2 {
	public static void main(String[] args) {
		SumThread t1 = new SumThread(1, 200);
		SumThread t2 = new SumThread(201, 400);
		SumThread t3 = new SumThread(401, 600);
		SumThread t4 = new SumThread(601, 800);
		SumThread t5 = new SumThread(801, 1000);
		t1.start();t2.start();t3.start();t4.start();t5.start();
		try {
			t1.join();t2.join();t3.join();t4.join();t5.join();
		}catch(InterruptedException e) {}
		System.out.println("1~1000까지의 합 : " + (t1.sum+ t2.sum+ t3.sum+ t4.sum+ t5.sum));
	
	}
}
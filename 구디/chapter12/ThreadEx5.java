package chapter12;
/*
 * ThreadEx4.java의 구동 클래스를 배열로 변경하기
 */
public class ThreadEx5 {

	public static void main(String[] args) throws InterruptedException {
		SumThread[] arr = new SumThread[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new SumThread(i*200+1, (i + 1) * 200);
			arr[i].start();
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i].join();
		}
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i].sum;
		}
		System.out.println("1~100까지의 합 : " + sum);
	}

}

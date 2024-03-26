package chapter4;

public class LoopEx1 {

	public static void main(String[] args) {
		for (int i = 1; i < 6; i++) {
			System.out.print(i);
		}
		System.out.println();
		
		
		int num = 1;
		while(num < 6) {
			System.out.print(num);
			num++;
		}
		System.out.println();
		System.out.println("num = " + num);
		
		num = 1;
		do {
			System.out.print(num);
			num++;
		} while (num < 6);
		System.out.println();
		System.out.println("num = " + num);
	}
}

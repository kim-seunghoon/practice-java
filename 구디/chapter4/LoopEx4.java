package chapter4;
/*
 * 중첩 반목문 반복문 내부에 반복문이 존재
 */
public class LoopEx4 {

	public static void main(String[] args) {
		for (int i = 2; i < 10; i++) {
			System.out.print(i + "단\t\t");
		}
		System.out.println();
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.print(j + " x " + i + " = " + (j*i) + "\t");
				
			}
			System.out.println();
		}
	}

}

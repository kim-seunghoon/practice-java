package chapter4;
/*
 * break : switch, 반복문 밖으로 제어 이동
 * continue : 반복문의 처음으로 제어 이동
 */
public class LoopEx5 {

	public static void main(String[] args) {
		for (int i = 2; i < 10; i++) {
			System.out.println(i + "단");
			for (int j = 1; j < 10; j++) {
//				if (j == 5) break;
				if (j == 5) continue;
				System.out.println(i + "x" + j + " = " + (i*j));
			}
			System.out.println();
		}
	}

}

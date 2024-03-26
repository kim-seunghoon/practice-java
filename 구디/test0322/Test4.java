package test0322;
/*
  1부터 100까지 임의의 수 10개를  배열에 저장하고, 정렬하여 출력하기
    1. 배열 선언, 생성.
    2. 임의의 수를 10개 배열에 저장
    3. 정렬
    4. 출력
 */
public class Test4 {
	public static void main(String[] args) {
		int[] num = new int[100];
		int[] randNum = new int[10];
		
		for (int i = 0; i < num.length; i++) {
			num[i] = i + 1;
		}
		
		//번호 섞기
		for (int i = 0; i <= 1000; i++) {
			int a = (int)(Math.random() * num.length);
			int b = (int)(Math.random() * num.length);
			int tmp = num[a];
			num[a] = num[b];
			num[b] = tmp;
		}
		
		//랜덤 번호 배열에 저장
		for (int i = 0; i < randNum.length; i++) {
			randNum[i] = num[i];
		}
		
		//번호 정렬
		for (int i = 1; i <= randNum.length; i++) {
			for (int j = 0; j < randNum.length - 1 - i; j++) {
				if (randNum[j] > randNum[j + 1]) {
					int tmp = randNum[j];
					randNum[j] = randNum[j + 1];
					randNum[j + 1] = tmp;
				}
			}
			System.out.printf("%2d : ", i);
			for (int b : randNum) {
				System.out.print("[" + b + "]");
			}
			System.out.println();
		}
	}
}
package chapter4;

public class LoopEx2 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i < 11; i++) {
			sum += i;
		}
		System.out.println("1~10의 합 : " + sum);
		System.out.println("-----------------");
		
		sum = 0;
		int i = 1;
		while(i < 11) {
			sum += i;
			i++;
		}
		System.out.println("1~10의 합 : " + sum);
		System.out.println("-----------------");
		
		sum = 0;
		i = 1;
		do {
			sum += i;
			i++;
		} while (i < 11);
		System.out.println("1~10의 합 : " + sum);
	}

}

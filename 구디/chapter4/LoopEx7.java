package chapter4;

public class LoopEx7 {

	public static void main(String[] args) {
		int sum = 0;
				
		for (int j = 1; j < 101; j++) {
			sum += j;
			if (sum >= 1000) break;
		}
		System.out.println(":" + sum);
		
		int sum2 = 0;
		int i = 0;
		while (true) {
			i++;
			sum += i;
			if(sum>100) break;
		}
		System.out.println(sum2);
	}

}

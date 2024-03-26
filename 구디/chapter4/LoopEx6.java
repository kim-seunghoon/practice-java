package chapter4;

public class LoopEx6 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i < 101; i++) {
			if(i%2 == 0 || i%3 == 0) continue;
//			if(i%3 == 0) continue;
			
//			if (i%2 != 0 && i%3 != 0) sum += i; 같지만 내가 생각하지 못한 방법
			sum += i;
		}
		System.out.println(sum);
	}

}

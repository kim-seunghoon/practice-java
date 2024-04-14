package chapter8;
/*
 * LambdaInterface1을 이용하여 1~100까지의 짝수의 합과 홀수의 합을 출력
 */
@FunctionalInterface
interface LambdaInterface1 {
	void method();
}
public class Exam1 {

	public static void main(String[] args) {
		int sum = 0, sum2 = 0;
		for (int i = 1; i < 101; i++) {
			if (i%2==0) {
				sum += i;
			}
			if (i%2 ==1) {
				sum2 += i;
			}
		}
		System.out.println(sum);
		System.out.println(sum2);
		LambdaInterface1 f1 = ()-> {
			int sum3 = 0, sum4 = 0;
			for (int i = 1; i < 101; i++) {
				if (i%2==0) {
					sum3 += i;
				}
				if (i%2==1) {
					sum4 +=i;
				}
			}
			System.out.println(sum3);
			System.out.println(sum4);
		};
		f1.method();
	}

}

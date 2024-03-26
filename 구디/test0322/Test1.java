package test0322;
/*
 * 대칭수 구하는 프로그램을 작성하기
   대칭수란 숫자를 거꾸로 읽어도 앞으로 읽는 것과  같은 수를 말한다.
   12321 : 대칭수
   12345 : 대칭수 아님
 */
public class Test1 {
	public static void main(String[] args) {
		int num =54677645;
		int result = 0;
		int temp = num;
		
		while (temp != 0) {
			result *= 10;
			result += temp % 10;
			temp /= 10; 
		}
		if (num == result) {
			System.out.println(num + " : 대칭수");
		} else {
			System.out.println(num + " : 대칭수 아님");
		}
		System.out.println(54677645/10);
	}
}
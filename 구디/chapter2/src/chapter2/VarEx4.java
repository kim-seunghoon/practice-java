package chapter2;
/*
 * 문자 데이터
 */
public class VarEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch1 = 'A';
		int num = ch1;
		System.out.println("ch1 : " + ch1 + ", num : " + num);
		num += 1;
		System.out.println("num : " + num + " = " + (char)num );
		byte b1 = 10;
		byte b2 = 20;
		int b3 = b1 + b2; //int 이하의 결과의 자료형은 int
		byte b4 = (byte) (b1 + b2);
		System.out.println(b3);
	}

}

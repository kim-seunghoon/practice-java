package chapter3;

public class Exam5 {

	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
		byte c = (byte)(a + b);
		
		char ch = 'A';
		ch = (char) (ch + 2);
		
		float f = 3f / 2;
		
		long l = 3000l * 3000 * 3000;
		
		float f2 = 0.1f;
		
		double d = 0.1f;
		
		boolean result = d == f2;
		
		System.out.println("c=" + c);
		System.out.println("ch=" + ch);
		System.out.println("f=" + f);
		System.out.println("l=" + l);
		System.out.println("result=" + result);
		
		System.out.printf("%.20f\n", 0.6);
		System.out.printf("%.20f", 0.6f);
	}

}

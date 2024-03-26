package chapter3;
/*
 * 관계(비교)연산자
 * 논리연산자
 */
public class OpEx4 {

	public static void main(String[] args) {
		int x = 1, y = 1;
		System.out.println(x + "==" + y + " : " + (x==y));
		System.out.println(x + "!=" + y + " : " + (x!=y));
		System.out.println(x + ">=" + y + " : " + (x>=y));
		System.out.println(x + ">" + y + " : " + (x>y));
		System.out.println(x + "<=" + y + " : " + (x<=y));
		System.out.println(x + "<" + y + " : " + (x<y));
		
		System.out.println(x == 1 && y == 1);
		System.out.println(x == 1 && y != 1);
		System.out.println(x != 1 && y == 1);
		System.out.println(x != 1 && y != 1);
		System.out.println(x == 1 || y == 1);
		System.out.println(x == 1 || y != 1);
		System.out.println(x != 1 || y == 1);
		System.out.println(x != 1 || y != 1);
		
		String str = null;
		if(str == null || str.equals("")) {
			System.out.println("str 변수에 값이 없음");
		}
	}

}

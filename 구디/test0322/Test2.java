package test0322;
/*
1.  다음은 주어진 문자열(value)이 숫자인지를 판별하는  프로그램을 작성하시오.
  String 함수 charAt(i), length() 을 사용함.
  [결과]
숫자만 입력하세요
123
123는 숫자 입니다.
  
  [결과]
숫자만 입력하세요
123@12
123@12는 숫자가 아닙니다.
 */
public class Test2 {
	public static void main(String[] args) {
		String str = "1344";
		int[] arr = new int[10];
		boolean count = false;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= '0' && ch <= '9') {
				count = true;
			} else {
				count = false;
				break;
			}
		}
		if (count) {
			System.out.println(str + "는 숫자입니다.");
		} else {
			System.out.println(str + "는 숫자가 아닙니다");
		}
		 
	}
}
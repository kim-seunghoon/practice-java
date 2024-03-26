package chapter4;
/*
 * switch 구문 : 조건문
 * 조건값 : 정수형값 또는 문자열만 가능
 * switch (조건값) {
 * case 값1 : 문장1;
 * case 값2 : 문장2;
 * 
 * default : 그외문장
 * }
 */
public class SwitchEx1 {

	public static void main(String[] args) {
		int score = 100;
		String result = null;
		switch (score/10) {
		case 10: result =  "A학점";
		case 9:
			break;
		case 8: result =  "B학점";
			break;
		case 7: result =  "C학점";
			break;
		case 6: result =  "D학점";
			break;
		default : result = "F학점";
			break;
		}
		System.out.println(score + " : " + result);
		
		switch (score/10) {
		case 10: result =  "pass";
		case 9:
		case 8: 	
		case 7: 
		case 6:
			break;
		default : result = "fail";
			
		}
		System.out.println(score + " : " + result);
	}

}

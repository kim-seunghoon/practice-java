package chapter10;
/*
 * finally 블럭 : try 블럭에서 정상/예외 모두 실행되는 블럭
 * 정상인 경우 				: 12356 출력
 * 2/0 예외일 경우 			: 1456 출력
 * 2/0 예외 catch return 	: 145 출력
 * 정상 return 			: 1235 출력
 */
public class ExceptionEx3 {

	public static void main(String[] args) {
		try {
			System.out.print(1);
			System.out.print(2/0);
			System.out.print(3);
//			return; //메서드 종료
		} catch(Exception e) {
			System.out.print(4);
			return;
		} finally {
			System.out.print(5);
		}
		System.out.print(6);
	}

}

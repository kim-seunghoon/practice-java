package chapter10;
/*
 * throws	: 예외 처리
 * throw	: 예외 발생
 */
public class ExceptionEx5 {

	public static void main(String[] args) throws Exception {
		first();
	}
	private static void first() throws Exception {
		second();
	}
	private static void second() throws Exception {
		//InterruptedException은 그 외 Exception이라 예외처리 생략 불가
		Thread.sleep(2000); //InterruptedException 예외처리가 필요한 메서드
		throw new Exception("예외 강제 발생");
	}
}

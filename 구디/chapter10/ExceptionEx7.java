package chapter10;
/*
 * 예외처리 생략 가능한 예외 클래스 생성
 */
class MyException extends RuntimeException {
	MyException(String msg) {
		super(msg);
	}
}
public class ExceptionEx7 {

	public static void main(String[] args) {
		throw new MyException("사용자 예외 발생");
	}

}

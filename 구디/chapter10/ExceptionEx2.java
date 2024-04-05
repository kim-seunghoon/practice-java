package chapter10;
/*
 * 다중 catch 구문
 * -한 개의 try 구문에 여려개의 catch 블럭이 존재 = try 블럭에서 발생되는 예외 종류에 따라 다른 예외처리가 가능함
 * -상위 예외클래스(Exception)은 catch 블럭 하단에 배치해야함
 * 
 * 예외 클래스 계층
 * 		Throwable > Error
 * 					Exception > RuntimeException > ArithmeticException
 * 								그외 Exception	   ArrayIndexOutOfBoundsException.......		
 * 
 * Exception 중 RuntiomeException(하위 클래스 포함)만 예외처리 생략 가능
 * 그 외 Exception은 예외처리가 필수임  	
 */
public class ExceptionEx2 {

	public static void main(String[] args) {
		System.out.print(1); //try 블럭 외부의 발생한 예외는 catch 구문이 처리하지 못함
		try {
			
			System.out.print(2);
			System.out.print(3);
			System.out.print(args[0]);
			System.out.print(Integer.parseInt("123"));
			String str = null;
			System.out.println(str.trim()); // NullPointerException 발생
			System.out.print(4);
		} catch(ArithmeticException e) {
			System.out.println(" => 0으로 나누지 마세요");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("command 라인에 파라미터를 입력하세요");
		} catch(NumberFormatException e) {
			System.out.println(" => 숫자만 입력하세요");
		} catch(Exception e) {
//			e.printStackTrace(); //에외가 발생한 history를 출력
			System.out.println(" => 전산부로 전화하세요. msg = " + e.getMessage());
		}
		System.out.print(5);
	}

}

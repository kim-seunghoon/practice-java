package chapter5;
/*
 *자바 프로그램 실행 순서 
 *1. 소스코딩 : ArrayEx6.java
 *2. 컴파일
 *	javac ArrayEx6.java
 *	=> ArrayEx6.class 바이트 코드 생성
 *3.실행(java 인터페이스)
 *	java AttayEx6 홍길동 김삿갓
 *	java인터페이스의 기능
 *	1. jvm 환경생성 => 클래스영역(메서드 영역, 상수풀), 스택영역, 힙영역
 *	2. 바이트코드 메모리에 로드, 검증 => 클래스정보 로드
 *	3. main 메서드 실행 => command 라인의 파라미터값을 문자열형 배열로 생성해서 main에 전달
 *	   args 배열 : command 라인의 파라미터값 저장
 */
public class ArrEx6 {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("command 라인에 파라미터를 입력하세요");
			return;
		}
		for (String string : args) {
			System.out.println(string);
		}
		for (int i = 0; i < args.length; i++) {
			System.out.println("arr[" + i + "] = " + args[i] );
		}
	}

}

package chapter2;

import java.util.Iterator;

public class VarEx1 {
/*
 * 자바 실행 단계
 * 1. 소스 코딩 : VarEx1.java
 * 2. 컴파일 단계 : 파일 저장하면 자동 컴파일 됨. 오류는 빨강'x'로 표시됨.
 * 				javac varex1.java 이클립스가 실행함.
 * 				바이트 코드 생성
 * 3. 실행 단계 :JVM 환경에서 실행함
 * 				java varex1 이클립스에서 실행함
 * 				1. JVM 환경 생성
 * 				2. 바이트코드 메모리에 로드함
 * 				3. main 메서드 찾아서 실행 시작
 */
	public static void main(String[] args) {
//		 TODO Auto-generated method stub 
		int num; //변수의 선언 : 메모리 4바이트 할당
		num = 100; //변수의 초기화 : num 변수에 100값을 할당
		System.out.println(num); //화면 num 변수에 저장된 값을 출력
		num = 200;
		System.out.println(num);
		int num2 = 100;
		System.out.println(num2);
		double d = 10.5;
		System.out.println(d);
		char c = 'A';
		System.out.println(c);
		String f = "A";
		System.out.println(f); 
		boolean b = false;
		System.out.println(b);
		
	}

}
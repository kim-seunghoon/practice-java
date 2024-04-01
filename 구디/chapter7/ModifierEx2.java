package chapter7;

import chapter7.test.Modifier2;//다른 패키지에 속한 클래스라 반드시 임포트를 해줘야함

public class ModifierEx2 {

	public static void main(String[] args) {
		Modifier2 m2 = new Modifier2();
//		m2.v1 = 10; //private 멤버
//		m2.v2 = 20; //default 멤버
//		m2.v3 = 30; //protected 멤버
		m2.v4 = 40; //public 멤버
		m2.method();//public 멤버
	}

}

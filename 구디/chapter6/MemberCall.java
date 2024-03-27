package chapter6;
/*
 * 클래스
 * 	변수(필드)-클래스 변수
 * 			-인스턴스 변수
 * 	메서드	-클래스 메서드
 * 			-인스턴스 메서드
 * 
 * 클래스 멤버 : 클래스 변수, 클래스메서드. 클래스명. 멤버명
 * 인스턴스 멤버 : 인스턴스 변수, 인스턴스 메서드. 참조변수명.멤버명
 * 
 * 클래스 멤버에서 클래스 멤버 호출 : 정상
 * 인스턴스 멤버에서 인스턴스 멤버 호출 : 정상
 * 클래스 멤버에서 인스턴스 멤버 호출 : 객체화 필요
 * 인스턴스 멤버에서 클래스 멤버 호출 : 정상
 * 
 * 같은 멤버들 간에는 클래스명, 참조변수명 생략 가능
 * 단, 클래스 멤버에서 인스턴스 멤버 호출 시 객체화가 필요하므로 참조변수명 사용
 */
public class MemberCall {
	static int cv1 = 10;//클래스 멤버
	static int cv2 = 20;//클래스 멤버
	int iv1 = 100;//인스턴스 멤버
	int iv2 = iv1;//인스턴스 멤버
	int iv3 = cv1;//인스턴스 멤버
	//static int cv3 = iv1;//클래스 멤버에서 인스턴스 멤버를 직접 호출 불가
	static int cv3 = new MemberCall().iv1;//객체화 한 모습
	void method1() { //인스턴스 멤버
		System.out.println("cv1 + cv2 =" + (cv1 + cv2));//이미 준비가 되어있어서 가능
		System.out.println("iv1 + iv2 =" + (iv1 + iv2));//같은 인스턴스
	}
	static void method2() { //클래스 멤버
		System.out.println("cv1 + cv2 =" + (cv1 + cv2));
		//System.out.println("iv1 + iv2 =" + (iv1 + iv2));//준비가 안된 인스턴스라 에러 발생
		MemberCall m = new MemberCall();
		System.out.println("iv1 + iv2 =" + (m.iv1 + m.iv2));
	}
	void method3() {//인스턴스 멤버
		method1();//인스턴스 멤버 
		method2();//클래스 멤버
	}
	static void method4() {//클래스 멤버
		new MemberCall().method1();
		//method1();//인스턴스 멤버 
		method2();//클래스 멤버
	}
	public static void main(String[] args) {
		MemberCall m = new MemberCall();
		m.method1();
		System.out.println("---------");
		method2(); //같은 멤버라 이렇게 써도 되고
		System.out.println("---------");
		m.method3();
		System.out.println("---------");
		MemberCall.method4();//이렇게 써도 됨
	}

}

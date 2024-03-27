package chapter6;
/*선언 위치에 따른 변수의 종류
 * 				선언위치		선언방법				메모리할당 시점		메모리할당 위치		특징
 * 클래스변수		클래스내부		static 자료형 변수명	클래스정보 로드 시	클래스 영역			객체화 필요x 모든 객체의 공통변수로 사용, 기본값으로 초기화
 * 인스턴스변수		클래스내부		       자료형 변수명	객체화 시			힙 영역			객체화 필요 객체별로 다른 메모리 할당됨, 기본값으로 초기화
 * 지역변수		메서드내부			   자료형 변수명	선언문 실행 시		스택 영역			메서드, 블럭 내에서만 사용, 기본값으로 초기화 안됨, 매개변수는 지역변수
 */

class Car {
	String color;//인스턴스변수
	int number;//인스턴스변수
	static int width = 200;//클래스변수
	static int height = 120;//클래스변수
	public String toString() {
		return color + " : " + number + "(" + width + ", " + height +")";
	}
}
public class CarEx1 {

	public static void main(String[] args) {//지역변수는 매개변수를 포함 args도 지역변수
		Car c1 = new Car();//c1지역변수
		c1.color = "white";
		c1.number = 1234;
		System.out.println("c1 : " + c1.toString());
		Car c2 = new Car();//c2지역변수
		c2.color = "black";
		c2.number = 1234;
		System.out.println("c2 : " + c2.toString());
		
		//static의 존재 유무로 인한 차이 비교
		c1.width = 80;//원래 사용 방법 = Car.width = 80;
		c1.height = 50;
		System.out.println("c1 : " + c1.toString());
		System.out.println("c2 : " + c2.toString());
	}

}

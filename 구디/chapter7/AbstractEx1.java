package chapter7;
/*
 * 추상클래스
 * 1. 추상 메서드를 멤버로 가질 수 있는 클래스 = abstract 예약어 사용함
 * 2. 객체화 불가 -> 상속으로 하위 클래스의 객체화로 객체화 가능
 * 3. 그 외 일반 클래스와 동일함(생성자, 멤버 변수, 멤버 메서드, 초기화 블럭, 상속 받기)
 * 
 * 추상메서드
 * 1. 메서드의 선언부만 존재함. 구현부{}기 없음 = abstract 예약어 사용
 * 2. 하위 클래스에서 반드시 오버라이딩 필요
 */

abstract class Shape { //추상클래스, 객체생성 못함
	String type;
	Shape(String type) {
		this.type = type;
	}
	abstract double area();//추상 메서드 : 하위 클래스에서 반드시 오버라이딩 필요
	abstract double length();//추상 메서드
	public String toString() {
		return type;
	}
}
class Circle extends Shape {
	int r;
	Circle(int r) {
		super("원");
		this.r = r;
	}
	@Override//오버라이딩을 강제화 함
	double area() {
		return r*r*Math.PI;
	}
	@Override
	double length() {
		return r*2*Math.PI;
	}
	public String toString() {
		return super.toString() + ": 반지름 : " + r + ", 면적 : " + area() + ", 둘레 : " +length();
		
	}
}
class Rectangle extends Shape {
	double width, height;
	Rectangle(double width, double height) {
		super("사각형");
		this.width = width;
		this.height = height;
	}
	@Override
	double area() {
		return width*height;
	}
	@Override
	double length() {
		return 2*(width+height);
	}
	public String toString() {
		return super.toString() + ": 가로 : " + width + ", 세로 : " + height + ", 면적 : " + area() + ", 둘레 : " +length();
	}
}
public class AbstractEx1 {

	public static void main(String[] args) {
//		Shape s = new Shape();//객체화 불가능 한 Shape클래스를 객체화 한다면?
		Shape[] sarr = new Shape[2];
		sarr[0] = new Circle(10);
		sarr[1] = new Rectangle(10, 10);
		double totArea = 0, totLength = 0;
		for (int i = 0; i < sarr.length; i++) {
			totArea += sarr[i].area();
			totLength += sarr[i].length();
		}
		System.out.printf("전체 도형의 면적의 합 : %.2f\n", totArea);
		System.out.printf("전체 도형의 둘레의 합 : %.2f\n", totLength);
		System.out.println("\n------------내가 한 방법------------");
		System.out.println(sarr[0]);
		System.out.println(sarr[1]);//몇 개밖에 없으면 이렇게 출력해도 될듯?
		System.out.println("\n-----여러 개가 있다면? 반복문 사용------");
		for (Shape s : sarr) {
			System.out.println(s);
		}
		System.out.println("\n-----------새로운 방법--------------");
		for (Shape s : sarr) {
			System.out.print(s.type + ":");
			if (s instanceof Circle) {
				Circle c = (Circle)s;
				System.out.print("반지름 =" + c.r);
			}
			if (s instanceof Rectangle) {
				Rectangle r = (Rectangle)s;
				System.out.print("가로 =" + r.width + "세로 = " + r.height);
			}
			System.out.println(", 넓이 =" + s.area() + ", 둘레 =" + s.length());
		}
	}

}

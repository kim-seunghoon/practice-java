package chapter6;
/*
 * 직사각형 클래스 구현하기
 * 멤버필드 : 가로 세로
 * 멤버메서드 : void area() = 넓이 출럭
 * 멤버메서드 : void length() = 둘레 출럭
 *
 */

class Rectangle {
	int width;
	int height;
	void area() {
		System.out.println("직사각형의 넓이 : " + width * height);
	}
	void length() {
		System.out.println("직사각형의 둘레 : " + (width + height) * 2);
	}
}

public class Exam1 {

	public static void main(String[] args) {
		Rectangle rec = new Rectangle();
		rec.width = 10;
		rec.height = 20;
		System.out.printf("가로 : %d  세로 : %d\n", rec.width, rec.height);
		rec.area();
		rec.length();
		
		Rectangle rec2 = new Rectangle();
		rec2.width = 10;
		rec2.height = 10;
		System.out.printf("가로 : %d  세로 : %d\n", rec2.width, rec2.height);
		rec2.area();
		rec2.length();
	}

}

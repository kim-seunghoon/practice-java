package chapter6;

class Rectangle3 {
	int width;
	int height;
	int sno;
	static int cnt;
	public Rectangle3(int w, int h) {
		width = w;
		height = h;
		sno = ++cnt;
	}
	
	int area() {
		return width * height;
	}
	int length() {
		return (width + height) * 2;
	}
	boolean isSquare() {
		return width == height;
	}
	public String toString() {
		return sno + "번 사각형\n" + "가로 : " + width + "\t세로 : " + height + "\n넓이 : " + area() + "\n둘레 : " + length()
		+ (isSquare() ? "\n정사각형" : "\n직사각형") + "\n생성된 사각형 갯수 : " + cnt;
	}
}
public class Exam2 {

	public static void main(String[] args) {
		Rectangle3 r = new Rectangle3(10, 20);
		System.out.println(r);
		Rectangle3 r2 = new Rectangle3(20, 20);
		System.out.println(r2);
	}

}

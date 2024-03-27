package chapter6;

public class Rectangle2 {
	int width;
	int height;
	int sno;
	static int cnt;
	
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
	public static void main(String[] args) {

	}

}

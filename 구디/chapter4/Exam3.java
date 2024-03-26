package chapter4;

public class Exam3 {

	public static void main(String[] args) {
		int num = (int) (Math.random()*3+1);
		switch(num) {
		case 1 : System.out.println("가위");
			break;
		case 2 : System.out.println("바위");
			break;
		case 3 : System.out.println("보");
			break;
		}
	}
}

package chapter4;

public class SwitchEx2 {

	public static void main(String[] args) {
		int num = (int) (Math.random() * 10) + 1;
		/*
		 * Math.random() 0 ~ 1.0보다 작은 임의의 실수
		 */
		System.out.print(num + " : ");
		switch (num) {
		case 1 : System.out.println("자전거");
			break;
		case 2 : System.out.println("usb");
			break;
		case 3 : System.out.println("마우스");
			break;
		default : System.out.println("다음 기회에");
			break;
		}
	}

}

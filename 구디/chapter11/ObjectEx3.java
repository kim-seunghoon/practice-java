package chapter11;
/*
 * Object 클래스 : toString 메서드
 * toString : 객체를 문자열로 변환 해주는 메서드, 참조 변수 이름으로 출력하면 자동으로 호출되는 메서드
 * 			  Object 클래스에서는 클래스명@16진수 해쉬코드로 구현함
 */
class Card {
	String kind;
	int number;
	Card(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	@Override
	public String toString() {
		return "Card [kind=" + kind + ", number=" + number + "]";
	}
	
}
public class ObjectEx3 {

	public static void main(String[] args) {
		Card c1 = new Card("Spade", 1);
		Card c2 = new Card("Spade", 1);
		//%x : 16진 정수를 소문자로 표현 X는 대문자로 표현
		System.out.printf("10진수 : %d, 16진수 : %x\n", c1.hashCode(), c1.hashCode());
		System.out.printf("10진수 : %d, 16진수 : %x\n", c2.hashCode(), c2.hashCode());
		System.out.println(c1);
		System.out.println(c2);
	}

}

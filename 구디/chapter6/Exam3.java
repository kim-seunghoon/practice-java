package chapter6;

class EastCard {
	int number;
	boolean isKwang;
	EastCard(int number, boolean isKwang) {
		this.number = number;
		this.isKwang = isKwang;
	}
	EastCard() {
		this(1, true);
	}
	public String toString() {
		return number + (isKwang?"k" : "");
	}
}
public class Exam3 {

	public static void main(String[] args) {
		EastCard card1 = new EastCard(3, false);
		EastCard card2 = new EastCard();
		System.out.println(card1);
		System.out.println(card2);
	}

}

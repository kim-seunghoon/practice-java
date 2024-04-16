package chapter13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * EastCard 클래스 구현하기
 */
class EastCard {
	final int num;
	final boolean isKwang;
	public EastCard(int num, boolean isKwang) {
		super();
		this.num = num;
		this.isKwang = isKwang;
	}
	@Override
	public String toString() {
		return num + ((isKwang)? "k":"");
	}
	
}
class CardDeck {
	List<EastCard> cards;
	static Map<String, Integer> jokbo;
	static {
		jokbo = new HashMap<>();
		jokbo.put("kk", 4000);
		for (int i = 1; i <= 10; i++) {
			jokbo.put(""+1+i, 3000+(i*10));
		}
		jokbo.put("12", 2060); jokbo.put("21", 2060);
		jokbo.put("14", 2050); jokbo.put("41", 2060);
		jokbo.put("19", 2040); jokbo.put("91", 2040);
		jokbo.put("110", 2030); jokbo.put("101", 2030);
		jokbo.put("410", 2020); jokbo.put("104", 2020);
		jokbo.put("46", 2010); jokbo.put("46", 2010);
	}
	CardDeck(){
		cards = new ArrayList<>();
		for (int i = 0; i < 20; i++) {
			cards.add(new EastCard(i%10+1, ((i==0||i==2||i==7)?true:false)));
		}
		System.out.println(cards);
	}
	public void shuffle() {
		Collections.shuffle(cards);
		System.out.println(cards);
	}
	public EastCard pick(int i) {
		return cards.remove(i);
	}
}
class Player {
	String name;
	EastCard card1, card2;
	public Player(String name, EastCard card1, EastCard card2) {
		super();
		this.name = name;
		this.card1 = card1;
		this.card2 = card2;
	}
	int getScore() {
		Integer score = 0;
		if (card1.isKwang && card2.isKwang) {
			score = CardDeck.jokbo.get("kk");
		} else {
			score = CardDeck.jokbo.get("" + card1.num + card2.num);
			if (score == null) {//jokbo에 없는 카드
				score = (card1.num + card2.num) % 10;
			}
		}
		return score;
	}
	@Override
	public String toString() {
		return name + "(" + card1 + ", " + card2 + ") : " + getScore();
	}
	
}
public class MapEx2 {

	public static void main(String[] args) {
		CardDeck deck = new CardDeck();
		deck.shuffle();
		List<Player> list = new ArrayList<>();
		list.add(new Player("홍길동", deck.pick(0), deck.pick(0)));// pick에서 리무브 했기 때문에 계속 위에 것을 주니까 0으로씀
		list.add(new Player("김삿갓", deck.pick(0), deck.pick(0)));
		list.add(new Player("이몽룡", deck.pick(0), deck.pick(0)));
		for (Player p : list) {
			System.out.println(p);
		}
		System.out.println("덱에 남은 카드 개수 : " + deck.cards.size());
		Collections.sort(list, (p1, p2) ->p2.getScore()-p1.getScore());
		if (list.get(0).getScore() == list.get(1).getScore()) {//이 식을 생각해낼 수 없었음
			System.out.println(list.get(0).name + ", " +list.get(1).name +" 비김");
		} else {
			System.out.println(list.get(0).name + " 승리"); 
		}
		
	}

}

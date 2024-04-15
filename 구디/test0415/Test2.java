package test0415;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;



/*
 * EastCard, CardDeck, Player를 이용하여 다음 구동 클래스를 완성하시오
 [결과]
[1K, 2, 3K, 4, 5, 6, 7, 8K, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
[6, 7, 5, 4, 5, 8, 9, 10, 2, 3, 10, 4, 1K, 6, 1, 7, 2, 3K, 9, 8K]

게임할 인원수를 입력하세요(최대:10)
5
1등:2번(5,4):9
1등:4번(9,10):9
3등:5번(2,3):5
4등:1번(6,7):3
4등:3번(5,8):3
 */
class EastCard {
	final int num;
	final boolean isKwang;
	public EastCard(int num, boolean isKwang) {
		super();
		this.num = num;
		this.isKwang = isKwang;
	}
	public String toString() {
		return num + ((isKwang)?"K":"");
	}
}
class CardDeck {
	List<EastCard> cards;
	static Map<String,Integer> jokbo;
	static {
		jokbo = new HashMap<>();
		jokbo.put("KK", 4000);
		for(int i=1;i<=10;i++) {
			jokbo.put(""+i+i, 3000+(i*10));
		}
		jokbo.put("12", 2060);	jokbo.put("21", 2060);
		jokbo.put("14", 2050);	jokbo.put("41", 2050);
		jokbo.put("19", 2040);	jokbo.put("91", 2040);
		jokbo.put("110", 2030);	jokbo.put("101", 2030);
		jokbo.put("410", 2020);	jokbo.put("104", 2020);
		jokbo.put("46", 2010);	jokbo.put("64", 2010);
	}
	CardDeck(){
		cards = new ArrayList<>();
		for(int i=0;i<20;i++) {
			cards.add(new EastCard(i%10+1,((i==0||i==2||i==7)?true:false)));
		}
		System.out.println(cards);
	}
	//cards 의 card를 섞기. 
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
	EastCard card1,card2;
	public Player(String name, EastCard card1, EastCard card2) {
		super();
		this.name = name;
		this.card1 = card1;
		this.card2 = card2;
	}
	int getScore() {
		Integer score=0;
		if(card1.isKwang && card2.isKwang)
		   score = CardDeck.jokbo.get("KK");
		else {
			score = CardDeck.jokbo.get(""+card1.num+card2.num);
			if(score == null) { //jokbo에 없는 카드
				score = (card1.num + card2.num) % 10;
			}
		}
		return score;
	}
	public String toString() {
		return name + "("+card1+","+card2+"):" + getScore();
	}
}
public class Test2 {
	public static void main(String[] args) {
		CardDeck deck = new CardDeck();
		deck.shuffle();
		Scanner scan = new Scanner(System.in);
		System.out.println("게임할 인원수를 입력하세요 (최대 10명)");
		int num = scan.nextInt();
		List<Player> list = new ArrayList<>();
		
		if (num >= 0 && num <= 10) {
			for (int i = 1; i <= num; i++) {
				list.add(new Player(i +"번", deck.pick(0), deck.pick(0)));
			}
		}
		
		Collections.sort(list, (p1, p2) ->p2.getScore()-p1.getScore());
		System.out.println(list);
		Integer[] result = new Integer[list];
		
			
		
//		if (list.get(0).getScore() == list.get(1).getScore()) {
//			System.out.println(list.get(0).name + ", " +list.get(1).name +" 비김");
//		} else {
//			System.out.println(list.get(0).name + " 승리"); 
//		}

	}
}
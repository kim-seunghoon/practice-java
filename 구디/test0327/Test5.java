package test0327;
/*
 * Test2.java 소스의 Coin 클래스를 이용하기.
 * 두개의 Coin 객체를 생성하기 myCoin, youCoin 객체 생성하기
 * 앞면이 연속해서 3번 나오면 승리. => myCoin 승리, youCoin 승리, 비김.
 * [결과]
 * myCoin	youCoin
 * 앞면	앞면
 * 뒷면	앞면
 * 앞면	뒷면
 * 뒷면	앞면
 * 뒷면	앞면
 * 앞면	앞면
 * youCoin 승리  
 */

public class Test5 {
	public static void main(String[] args) {
		Coin myCoin = new Coin();
		Coin youCoin = new Coin();
		int myf = 0, youf= 0;
		System.out.println("myCoin\tyouCoin");
		while (myf < 3 && youf < 3) {
			myCoin.flip();
			youCoin.flip();
			if (myCoin.side == 0) {
				myf++;
			} else {
				myf = 0;
			}
			if (youCoin.side == 0) {
				youf++;
			} else {
				youf = 0;
			}
			System.out.println((myCoin.side == 0 ? "앞면" : "뒷면") +"\t"+ (youCoin.side == 0 ? "앞면" : "뒷면"));
		}
		if (myf == youf) {
			System.out.println("비김");
		} else if (myf == 3) {
			System.out.println("myCoin 승리");
		} else {
			System.out.println("youCoin 승리");
		}
		
				
		
		
		
	
	}
}
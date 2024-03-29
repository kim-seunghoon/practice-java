package chapter7;
class Buyer {
	int money = 500;
	int point;
	Product[] cart = new Product[5];
	int cnt;

void buy(Product p) {
	money -= p.price;
	point += p.point;
	cart[cnt++] = p;
	System.out.println(p + " 구입");
}
void Summary() {
	int totPrice = 0, totPoint =0;
	for (int i = 0; i < cnt; i++) {
		totPrice += cart[i].price;
		totPoint += cart[i].point;
	}
	System.out.println("구매 제품 전체 가격 : " + totPrice + "원");
	System.out.println("구매 제품 전체 포인트 : " + totPoint + "원");
	System.out.println("구매 후 잔액 : " + money + "원");
	System.out.print("구매 물품 목록 : ");
	for (int i = 0; i < cnt; i++) {
		System.out.print(cart[i] + (i >= cnt-1?"":", "));
	}
	System.out.println();
	System.out.println("구매 후 포인트 : " + point + "점");
} 
}
public class ProductEx2 {

	public static void main(String[] args) {
		Tv t = new Tv();
		Computer c = new Computer();
		HandPhone h = new HandPhone();
		Buyer b = new Buyer();
		b.buy(t);b.buy(c);b.buy(h);
		b.Summary();
	}

}

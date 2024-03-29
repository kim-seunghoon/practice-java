package chapter7;
class Product {
	int price, point;
	Product(int price) {
		this.price = price;
		this.point = price/10;
	}
}
class Tv extends Product {
	Tv () {
		super(100);
	}
	public String toString() {
		return "Tv";
	}
}
class Computer extends Product {
	Computer () {
		super(200);
	}
	public String toString() {
		return "Computer";
	}
}
class HandPhone extends Product {
	HandPhone () {
		super(150);
	}
	public String toString() {
		return "HandPhone";
	}
}
public class ProductEx1 {

	public static void main(String[] args) {
		Product[] parr = new Product[3];
		//Tv[] parr = new Tv[3];로 만든다면, 컴퓨터와 핸드폰은 못 들어온다.
		parr[0] = new Tv();
		parr[1] = new Computer();
		parr[2] = new HandPhone();
		int totPrice =0;
		int totPoint =0;
		for (Product p : parr) {
			System.out.println(p + ":" + p.price + ", " + p.point);
			totPrice += p.price;
			totPoint += p.point;
		}
		System.out.println("전체 상품 가격의 합 : "+ totPrice);
		System.out.println("전체 상품 가격의 포인트 : "+ totPoint);
	}

}

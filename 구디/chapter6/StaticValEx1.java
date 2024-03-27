package chapter6;
class Car2 {
	String color;
	int num;
	int sno;
	static int cnt;
	//toString 메서드는 public 반드시 필요
	public String toString() {
		return "자동차번호 : " + sno + " => " + color + ", " + num + " 자동차 생산 갯수 : " + cnt;
	}
}
public class StaticValEx1 {

	public static void main(String[] args) {
		Car2 c1 = new Car2();
		c1.color = "white";
		c1.num = 1234;
		c1.sno = ++Car2.cnt;
		System.out.println(c1);//참조변수를 출력시 toString()메서드 호출함(약속)c1출력과 c1.toString()이 같음
		Car2 c2 = new Car2();
		c2.color = "black";
		c2.num = 5678;
		c2.sno = ++Car2.cnt;
		System.out.println(c2);
		
		for (int i = 0; i < 10; i++) {// i는 for구문 내부에서만 사용 가능
			System.out.println(i);
		}
	}

}

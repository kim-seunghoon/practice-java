package chapter8;
interface Complexerable extends Printerable, Scannerable, Faxable{}
class Complexer2 implements Complexerable {
	int ink;
	Complexer2() {
		ink =INK;
	}
	@Override
	public void print() {
	}
	@Override
	public void scan() {
	}
	@Override
	public void send(String no) {
	}
	@Override
	public void receive(String no) {
	}
}
public class InterfaceEx2 {

	public static void main(String[] args) {
		System.out.println("기본 잉크량 : " + Printerable.INK);//실제 존재 
		System.out.println("기본 잉크량 : " + Complexerable.INK);
		System.out.println("기본 잉크량 : " + Complexer.INK);
		System.out.println("기본 잉크량 : " + Complexer2.INK);
		System.out.println("FAX번호 : " + Faxable.FAX_NO);//실제 존재
		System.out.println("FAX번호 : " + Complexerable.FAX_NO);
		System.out.println("FAX번호 : " + Complexer.FAX_NO);
		System.out.println("FAX번호 : " + Complexer2.FAX_NO);
		
		Complexer2 com = new Complexer2();
		if (com instanceof Complexerable) {
			System.out.println("com 객체는 Complexerable 형으로 형변환이 가능함");
			Complexerable c = com;
			c.print();
			c.receive("02-222-333");
			c.send("02-222-333");
			c.scan();
		}
	}

}

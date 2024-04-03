package chapter9;
/*
 * 내부 클래스에서 외부 클래스의 private 멤버에 접근
 */
class Outer2 {
	private int outeriv = 10;
	private static int outercv = 20;
	class InstanceInner { //private라 하더라도 같은 멤버라 접근 가능
		int iiv = outeriv;				
		int iiv2 = outercv;				
	}									
	static class StaticInner {//static이 붙음으로써 error발생 객체화로 해결 가능
//		static int siv = outeriv;
		static int siv = new Outer2().outeriv;
		int siv2 = outercv; //같은 static 멤버라 문제 없이 가져옴
	}
	void method(int pv) {
//		pv--;
		int lv =500;
		class LocalInner { //지역 내부 클래스
			int liv = outeriv;
			int liv2 = outercv;
/*
 *  지역 내부클래스의 멤버 메서드에서 외부 메서드(method(int pv))의 지역 변수가 상수화 되어야 접근 가능함
 *  외부 메서드의 지역 변수가 변경이 없으면 상수로 판단함			
 *  외부 메서드의 지역 변수가 변경이 있으면 내부클래스의 멤버 메서드에서 오류 발생 됨			
 */
			void method(int num) {
//				lv += 10; //상수화 필요 
				System.out.println(lv);
				num++;
				System.out.println("outeriv = " + outeriv);
				System.out.println("outercv = " + outercv);
				System.out.println("liv = " + liv);
				System.out.println("liv2 = " + liv2);
				System.out.println("pv = " + pv); //상수화가 필요(변경되면 안된다)
				System.out.println("num = " + num);
			}
		}
		LocalInner li = new LocalInner();
		li.method(3);
	}
}
public class InnerEx2 {

	public static void main(String[] args) {
		//외부 클래스의 객체 생성
		Outer2 out = new Outer2();
//		System.out.println(out.outeriv); //private 멤버 InnerEx2 클래스에서 접근 불가
//		System.out.println(Outer2.outeriv);
		
		//InstanceInner, StaticInner 객체 생성하여 모든 멤버 값 출력하기
		Outer2.InstanceInner ins = out.new InstanceInner();
		System.out.println(ins.iiv);
		System.out.println(ins.iiv2);
		Outer2.StaticInner sta = new Outer2.StaticInner();
		System.out.println(sta.siv);
		System.out.println(sta.siv2);
		out.method(1000);
		int lv = 100;
		Runnable r = ()->{// 익명의 객체
			System.out.println(lv);
		};
		r.run();
	}

}

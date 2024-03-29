package chapter7;
/*
 * final 클래스 : 종단클래스. 변경불가 클래스. 다른클래스의 부모 클래스가 될 수 없다.
 * final의 의미 : 변경 불가
 * String, Math 클래스가 대표적인 final 클래스임
 */
final class Final {//다른 클래스의 상위 클래스가 될 수 없음
	
}
//class FinalSub extends Final {//상속해주려고 할 때 에러 발생
//	
//}
public class FinalClassEx1 {

	public static void main(String[] args) {
		Final f = new Final(); //객체화는 가능
	}

}

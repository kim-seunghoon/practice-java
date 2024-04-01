package chapter7;
/*
 * 생성자의 접근 제어자를 private로 설정 = 객체를 한 개만 생성함
 */
class SingleObject {
	private static SingleObject obj = new SingleObject();
	private SingleObject() {}; //생성자
	int value = 100;
	public static SingleObject getObject() {
		return obj;
	}
}
public class SingletonEx1 {

	public static void main(String[] args) {
//		SingleObject s = new SingleObject(); //생성자의 접근제한자가 private이라 접근 불가(객체 생성 못함)
//		SingleObject.obj //private 멤버 접근 불가
		SingleObject s1 = SingleObject.getObject();
		SingleObject s2 = SingleObject.getObject();
		System.out.println("s1.value = " + s1.value);
		System.out.println("s2.value = " + s2.value);
		s1.value = 200;
		System.out.println("s1.value = " + s1.value);
		System.out.println("s2.value = " + s2.value);
		SingleObject s3 = SingleObject.getObject();
		System.out.println("s3.value = " + s3.value);
	}

}

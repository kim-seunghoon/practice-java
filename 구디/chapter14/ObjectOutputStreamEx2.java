package chapter14;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * 상속 관계에서의 직렬화
 */
class UserInfo {
	protected String name;
	protected String password;
	public UserInfo() {}
	public UserInfo(String name, String password) {
		this.name = name;
		this.password = password;
	}
	@Override
	public String toString() {
		return name + ", " + password;
	};
	
}
class User extends UserInfo implements Serializable {
	private int age;
	public User(String name, String password, int age) {
		super(name, password);
		this.age = age;
	}
	//직렬화에 추가하기(하위클래스에서 상위 클래스 접근한 것)
	private void writeObject(ObjectOutputStream out) throws IOException {
		out.writeUTF(name);
		out.writeUTF(password);
		out.defaultWriteObject();//기존에 가야할 정보도 보내라는 뜻
	}
	//직렬화된 객체를 복원하기
	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException{
		name = in.readUTF();
		password = in.readUTF();
		in.defaultReadObject();
	}
	@Override
	public String toString() {
		return "[" + name + ", " + password + ", " + age + "]";
	}
	
}
public class ObjectOutputStreamEx2 {

	public static void main(String[] args) throws IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object2.ser"));
		User u1 = new User("홍길동", "1234", 20);
		User u2 = new User("김삿갓", "5678", 30);
		oos.writeObject(u1);
		oos.writeObject(u2);
		System.out.println("사용자1 : " + u1);
		System.out.println("사용자2 : " + u2);
	}

}

package chapter14;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * ObjectOutputStream 예제
 * 1. 객체를 외부로 전송할 수 있는 스트림
 * 2. 외부 전송이 가능한 객체는 Serializable 인터페이스를 구현해야한다 -> Serializable 구현한 클래스의 객체만 외부전송이 가능함 = 직렬화 
 */
class Customer implements Serializable {
	private String name;
	//transient : 직렬화 대상에서 제외되는 멤버변수
	private transient int age;
	public Customer(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return name + " : " + age;
	}
	
}
public class ObjectOutputStreamEx1 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("object.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Customer c1 = new Customer("홍길동", 20);
		Customer c2 = new Customer("김삿갓", 30);
		System.out.println(c1 + ", " + c2);
		oos.writeObject(c1); //Serializable 인터페이스를 구현한 클래스의 객체만 가능함
		oos.writeObject(c2);//구현 클래스가 아닌 경우 NotSerializableException 예외발생
		oos.close();
	}

}

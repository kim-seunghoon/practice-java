package chapter14;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

//object2.ser 파일의 객체 복원하기
public class ObjectInputStreamEx2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object2.ser"));
		User u1 = (User)ois.readObject();
		User u2 = (User)ois.readObject();
		System.out.println("사용자1 : " + u1);
		System.out.println("사용자2 : " + u2);
		
	}

}

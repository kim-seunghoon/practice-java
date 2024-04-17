package chapter14;

import java.io.FileReader;
import java.io.IOException;

/*
 * FileReader 예제
 * 
 * 주요메서드
 * int read() : 파일에서 1char 단위로 읽어 데이터 리턴
 * int read(char[] buf) : 파일에서 데이터를 읽어 buf에 저장. 실제 읽은 char 수를 리턴
 * int read(char[] buf, intstart, int len) : 파일에서 len 크기만큼 데이터를 읽어 buf start 인덱스부터 저장. 실제 읽은 char 수를 리턴
 */
public class FileReaderEx1 {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("src/chapter14/inputStreamEx1.java");
		int data = 0;
		System.out.println("====== read() 메서드로 읽기");
		while ((data=fr.read()) != -1) {
			System.out.print((char)data);
		}
		fr.close();
		
		fr = new FileReader("src/chapter14/inputStreamEx1.java");
		char[] buf = new char[8096];
		System.out.println("====== read(char[]) 메서드로 읽기");
		while ((data=fr.read(buf)) != -1) {
			System.out.print(new String(buf, 0, data));
		}
		fr.close();
		
		fr = new FileReader("src/chapter14/inputStreamEx1.java");
		buf = new char[8096];
		System.out.println("====== read(char[], int, int) 메서드로 읽기");
		while ((data=fr.read(buf, 0, buf.length)) != -1) {
			System.out.print(new String(buf, 0, data));
		}
		fr.close();
	}

}

package chapter14;

import java.io.FileInputStream;
import java.io.IOException;

/*
 * FileInputStream 예제
 * 파일로부터 데이터를 읽어서 화면에 출력하기
 * 
 * 주요 메서드
 * 	int read() : 1byte씩 읽어서 리턴
 * 	int read(byte[] buf) : buf의 크기만큼 읽어서 buf에 저장. 실제 읽은 바이트 수 리턴
 * 	int read(byte[] buf, int start, intlen) : len만큼 읽어서 buf의 start부터 buf에 저장. 실제 읽은 바이트 수 리턴
 * 	int available() : 읽기 가능 바이트 수
 */
public class FileInputStreamEx1 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("src/chapter14/InputStreamEx1.java");
		int data = 0;
		System.out.println("======= read() 메서드를 이용하여 읽기");
		while ((data=fis.read()) != -1) {
			System.out.print((char)data);
		}
		fis.close();
		
		fis = new FileInputStream("src/chapter14/InputStreamEx1.java");
		System.out.println("====== read(byte[]) 메서드를 이용하여 읽기");
		//fis.available() : 읽기 가능한 바이트 수 리턴
		byte[] buf = new byte[fis.available()];
		while ((data=fis.read(buf))!= -1) {
			System.out.print(new String(buf,0, data));
		}
		fis.close();
		
		fis = new FileInputStream("src/chapter14/InputStreamEx1.java");
		System.out.println("====== read(byte[], int, int) 메서드를 이용하여 읽기");
		//fis.available() : 읽기 가능한 바이트 수 리턴
		buf = new byte[fis.available()];
		buf[0] = (byte) '@';
		buf[1] = (byte) '@';
		while ((data=fis.read(buf, 2, buf.length-2))!= -1) {
			System.out.print(new String(buf,0, data));
		}
		fis.close();
	}

}

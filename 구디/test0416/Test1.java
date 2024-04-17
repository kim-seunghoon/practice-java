package test0416;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/*
 * 화면에서 파일명을 입력받아서 해당 파일의 내용을 화면에 출력하기.
 * 만약 파일이 없는 경우는 '해당 파일 없음' 을 출력하기
 * 한글은 깨지지 않아야 함.
 * FileInputStream 사용하기
 */
public class Test1 {
	public static void main(String[] args) throws IOException, Exception {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("파일명을 입력하세요");
			String fileName = scan.next();
			if (fileName.equals("종료")) {
				break;
			}
			try {	
				FileInputStream fis = new FileInputStream(fileName);
				int data = 0;
				byte[] buf = new byte[fis.available()];
				while ((data = fis.read(buf)) != -1) {
					System.out.print(new String(buf, 0, data));
				}
		
			} catch(FileNotFoundException e) {
				System.out.println("해당 파일 없음");
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}

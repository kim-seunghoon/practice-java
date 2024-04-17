package chapter14;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/*
 * 화면에서 입력받은 내용을 data.txt 파일로 저장하기
 */
public class Exam1 {

	public static void main(String[] args) throws IOException {
		System.out.println("data.txt 파일에 내용 저장하기");
		FileOutputStream fos = new FileOutputStream("data.txt", true);
		Scanner scan = new Scanner(System.in);
		System.out.println("data.txt에 저장할 내용을 입력하세요");
		while (true) {
			
			String data = scan.nextLine();
			fos.write((data + "\n").getBytes());
			if (data.equalsIgnoreCase("exit")) {

				break;
			}
		}
		fos.flush();
		fos.close();
	}

}

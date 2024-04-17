package chapter14;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) throws IOException {
		System.out.println("data2.txt 파일에 내용 저장하기");
		FileWriter fw = new FileWriter("data2.txt", true);
		Scanner scan = new Scanner(System.in);
		System.out.println("data2.txt에 저장할 내용을 입력하세요");
		while (true) {
			
			String data = scan.nextLine();
			fw.write((data + "\n").toCharArray());
			if (data.equalsIgnoreCase("exit")) {

				break;
			}
		}
		fw.flush();
		fw.close();
	}

}

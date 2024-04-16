package test0416;
/*
1. 반복문을 이용하여 
  파일명을 입력받아서 해당 파일이 존재하면 해당파일명.bak 파일 복사하기
  파일명에 exit 가 입력되면, 프로그램 종료.
  해당 파일이 없으면, 복사할 파일이 없습니다. 메세지 출력

[결과]
파일명을 입력하세요(종료:exit)
aaa.txt
aaa.txt=>aaa.bak 복사완료
파일명을 입력하세요(종료:exit)
bbb.txt  
복사할 파일이 없습니다.
파일명을 입력하세요(종료:exit)
exit
*/

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("파일명을 입력하세요 종료 : exit");
		String fileName = scan.next();
		File file = new File(fileName);
		
		while (true) {
			
			if (!file.exists()) {
				System.out.println("복사할 파일이 없습니다.");
			
			}
			if (fileName.equalsIgnoreCase("exit")) {
				break;
			}
			if (file.exists()) {
				FileWriter fw = new FileWriter(fileName.replace(".txt", ".bak"));
				System.out.println("파일명을 입력하세요 종료 : exit");
			}
		}
		
	}

}
package chapter14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * BufferedReader 보조스트림 : 
 * 	-다른 스트림을 매개변수로 입력받아 새로운 기능 추가
 * 	-readLine() 메서드 기능 추가
 * 	-new BufferedReader(Reader)
 */
public class BufferedReaderEx1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("저장할 내용을 입력하세요(종료 : ctrl+z)");
		FileWriter fw = new FileWriter("buffered.txt");
		String data = null;
		while ((data=br.readLine()) != null) {
			System.out.println(data);
			fw.write(data+"\n");
		}
		fw.flush();
		fw.close();
		br.close();
		//InputStreamEx1.java 소스의 라인번호를 출력하기
		br = new BufferedReader(new FileReader("src/chapter14/InputStreamEx1.java"));
		int line = 0;
		while ((data=br.readLine()) != null) {
			System.out.println(++line + " : " + data);
			fw.write(data+"\n");
		}
	}

}

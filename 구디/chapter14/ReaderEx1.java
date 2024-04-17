package chapter14;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/*
 * Reader 예제
 * 	Reader : 문자형 입력 스트림. 2byte 단위로 데이터 읽기
 */
public class ReaderEx1 {

	public static void main(String[] args) throws IOException {
		/*
		 * InputStramReader : InputStream 객체를 Reader로 변경해주는 기능의 스트림
		 */
		Reader in = new InputStreamReader(System.in);
		int data = 0;
		while ((data=in.read())!= -1) {
			System.out.print((char)data);
		}
	}

}

package chapter14;

import java.io.IOException;
import java.io.OutputStream;

/*
 * OutputStram 예제
 * OutputStram : 바이트형 출력 스트림. 1byte 단위로 쓰기 
 */
public class OutputStreamEx1 {

	public static void main(String[] args) throws IOException {
		OutputStream out = System.out;
		out.write('1'); out.write('2'); out.write('3');
		out.write('a'); out.write('b'); out.write('c');
		out.write('가'); out.write('나'); out.write('다');
//		out.flush();//버퍼의 내용을 강제로 목적지로 전송
		out.close();//출력스트림과 연결 해제. 버퍼의 내용을 강제로 목적지로 전송 후 해제
	}

}
package chapter14;

import java.io.IOException;
import java.io.InputStream;

/*
 * InputStream 예제
 * 
 * 입출력 스트림 : 데이터 이동통로. 단방향(입, 출력 구분)
 * 
 * 	입력 스트림
 * 		바이트형 : 1byte 단위로 읽기(동영상, 이미지, 텍스트 등의 데이터 처리) -> 최상위 클래스(InputStream)
 * 				하위 클래스 : FileInputStream, ObjectInputStream...
 * 
 * 		문자형 : 2byte 단위로 읽기(텍스트 데이터 처리) -> 최상위 클래스(Reader)
 * 				하위 클래스 : FileReader, StringReader...
 * 
 *  출력 스트림
 *  	바이트형 : 1byte 단위로 쓰기 (동영상, 이미지, 텍스트 등의 데이터 처러) -> 최상위 클래스(OutputStream)
 *  			하위 클래스 : FileOutputStream, ObjectOutputStream, PrintStream...
 *  
 *  	문자형 : 2byte 단위로 쓰기 (텍스트 데이터 처리) -> 최상위 클래스(Writer)
 *  			하위 클래스 : FileWriter, StringWriter, PrintWriter...
 * 
 * InputStreamReadr(InputStram) : Reader의 하위 클래스
 * OutputStreamReadr(OutputStram) : Writer의 하위 클래스
 * 
 * 자바에서 제공하는 표준 스트림
 * 	표준 입력 객체 : InputStream System.in : 키보드 입력 -> 데이터가 키보드에서 입력된 값을 자바어플리케이션으로 데이터 이동
 * 	표준 출력 객체 : PrintStream System.out : 화면 출력 -> 자바프로그램의 데이터를 화면으로 데이터 이동.
 * 	표준 오류 객체 : PrintStream System.err : 화면 출력 -> 자바프로그램의 데이터를 화면으로 데이터 이동.
 * 
 * InputStream : 바이트형 입력 스트림의 최상위 클래스
 * 	바이트형 : 1 바이트 단위로 데이터를 처리
 */
public class InputStreamEx1 {

	public static void main(String[] args) throws IOException {
		InputStream in = System.in; //표준입력 스트림. 키보드 입력
		int data;
		//in.read() : 1바이트 단위로 읽기. 한글이 깨짐
		while((data = in.read()) != -1) { //ctrl z = -1임
			System.out.print((char)data);
		}
	}

}

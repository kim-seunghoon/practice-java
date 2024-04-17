package chapter14;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * FileOutputStrem 예제
 * 
 * 주요메서드
 * void write(int data) : 1byte 출력
 * void write(byte[] buf) : buf의 내용을 출력
 * void write(byte[] buf, int start, int len) : buf의 내용을 start부터 len의 길이만큼 출력
 * 
 * FileOutputStream : 파일에 데이터를 저장하는 스트림
 * 					  FileNotFoundException 예외 발생	
 * 
 * 	out.txt : 파일이 없으면 자동 생성 후 데이터 저장, 있으면 해당 파일에 데이터 저장 
 * 
 * new FileOutputStream("out.txt") : out.txt 파일에 데이터 쓸 준비. 출력스트림이 연결됨. 기존의 내용은 삭제됨. 마지막에 출력한 내용만 남음
 * 
 * new FileOutputStream("out.txt", true) : out.txt 파일에 데이터 쓸 준비. 출력스트림이 연결됨. 기존의 내용은 남김. 기존의 내용에 새로운 내용 추가
 */
public class FileOutputStreamEx1 {

	public static void main(String[] args) throws IOException {
		System.out.println("out.txt 파일에 내용 저장하기");
		FileOutputStream fos = new FileOutputStream("out.txt");
		fos.write('1');fos.write('2');fos.write('3');
		fos.write('a');fos.write('b');fos.write('c');
		fos.write('가');fos.write('나');fos.write('다');
		fos.flush();
		fos.close();
		
		fos = new FileOutputStream("out.txt", true);//close 되어 있기 때문에 다시 여는 역할을 수행함
		//getBytes() : 문자열을 byte[]로 변경
		byte[] buf = "\nFileOutputStream 예제입니다.\n".getBytes();
		fos.write(buf);
		fos.flush();
		fos.close();
		
		fos = new FileOutputStream("out.txt", true);
		//getBytes() : 문자열을 byte[]로 변경
		fos.write(buf,5, 6);
		fos.flush();
		fos.close();
	}

}

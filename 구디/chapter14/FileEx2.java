package chapter14;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/*
 * File 클래스의 주요 메서드
 * String getAbsolutePath() : 절대 경로
 * boolean mkdir() : 한 개의 폴더 생성. 성공 : true
 * boolean mkdirs() : 여러 단계의 폴더 생성. 성공 : true
 * boolean creatNewfile() : 파일 생성. 성공 : true 
 * String getName() : 파일의 이름
 * long length() : 파일의 크기
 * boolean exist() : 파일 존재여부. 존재 : true
 * boolean renameTo(File f) : 현재 파일 객체를 f 객체로 변경. 파일이름 변경
 * long lastModified() : 1970년부터 파일이 수정된 시간까지를 밀리초로 리턴
 * boolean delete() : 현재 파일을 제거. 성공 : true
 * boolean isDirectory() : 현재 파일이 폴더? 폴더 : true
 * boolean isFile() : 현재 파일이 파일? 파일 : true
 */
public class FileEx2 {

	public static void main(String[] args) throws IOException {
		//폴더를 생성함
		File f1 = new File("c:/temp1");
		System.out.printf("%s 폴더 생성 : %b\n", f1.getAbsolutePath(), f1.mkdir());
		//f2 객체를 이용해 폴더 안에 파일 생성
		File f2 = new File("c:/temp1/test.txt");
		System.out.printf("%s 파일 생성 : %b\n", f2.getAbsolutePath(), f2.createNewFile());
		System.out.printf("파일 이름 : %s, 파일크기 : %d\n", f2.getName(), f2.length());
		//test2파일 존재 여부
		File f3 = new File("c:/temp1/test2.txt");
		if (f3.exists()) {
			System.out.println(f3.getName() + "파일은 존재함");
		}else {
			System.out.println(f3.getName() + "파일은 없음");
		}
		//이름 변경
		System.out.printf("%s->%s 이름변경 : %b\n", f2.getName(),f3.getName(),f2.renameTo(f3));
		//수정시간 조회
		System.out.printf("%s 파일 최종 수정시간 : %s\n", f3.getName(), new Date(f3.lastModified()));
		//파일 삭제
		System.out.printf("%s 파일삭제 : %b\n", f3.getName(), f3.delete());
	}

}

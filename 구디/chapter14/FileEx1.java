package chapter14;

import java.io.File;

/*
 * File 클래수 : 파일이나 폴더의 정보를 관리하는 클래스 -> 없는 파일도 관리
 * 
 * 폴더구분자
 * 	윈도우 : \\, / 가능
 * 	리눅스 : /
 */
public class FileEx1 {

	public static void main(String[] args) {
		String filePath = "c:/";
		//f1 : c드라이브의 root 폴더 관리
		File f1 = new File(filePath);
		String[] files = f1.list(); //f1하위 폴더, 파일의 이름 목록을 배열로
		for (String f : files) {
			//f2 : c드라이브의 하위 파일(폴더) 한 개를 관리
			File f2 = new File(filePath, f);//상위 파일, 파일 이름
			if (f2.isDirectory()) {	//f2파일이 폴더?
				System.out.printf("%s : 디렉토리\n", f);
			} else { //폴더가 아니면
				//f2.length() : 파일의 크기
				System.out.printf("%s : 파일(%,dbyte)\n", f, f2.length());
			}
		}
	}

}

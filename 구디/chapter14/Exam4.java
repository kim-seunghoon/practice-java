package chapter14;

import java.io.File;

/*
 * c:/windows 폴더의 하위폴더 개수. 파일의 개수, 파일의 총 크기 출력
 */
public class Exam4 {

	public static void main(String[] args) {
		String filePath = "c:/Program files";
		File f1 = new File(filePath);
		String[] files = f1.list();
		int ficnt=0, focnt=0;
		long sum=0;
		for (String f : files) {
			File f2 = new File(f1, f);
			if (f2.isDirectory()) {
				focnt++;
				System.out.printf("%s : 디렉토리\n", f);
			} else {
				ficnt++;
				System.out.printf("%s : 파일(%,dbyte)", f, f2.length());
				sum += f2.length();
			}
		}
		System.out.println("하위 폴더 개수 : " + focnt + "개");
		System.out.println("하위 파일 개수 : " + ficnt + "개");
		System.out.printf("파일의 총 크기 : %,dbyte", sum);
	}

}

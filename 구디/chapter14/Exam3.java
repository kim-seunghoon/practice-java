package chapter14;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/*
 * 화면에서 파일명 입력받아 출력을 시작하는 라인번호와 출력 라인을 입력받기
 * 파일에서 시작 번호부터 라인 수만큼만 화면에 출력하고. subfile.txt 파일에 저장하기
 */
public class Exam3 {

	public static void main(String[] args) throws IOException {
		//화면입력을 위한 스트림
		BufferedReader stdin = 
				 new BufferedReader(new InputStreamReader(System.in));
		System.out.println("파일명을 입력하세요");
		String fname = stdin.readLine();
		System.out.println("시작라인을 입력하세요");
		String sl = stdin.readLine();
		int start = Integer.parseInt(sl);
		System.out.println("라인수를 입력하세요");
		String slen = stdin.readLine();
		int len = Integer.parseInt(slen);
		//파일을 읽기 위한 스트림
		BufferedReader br = new BufferedReader(new FileReader(fname));
		//파일을 쓰기 위한 스트림
		PrintStream ps = new PrintStream(new FileOutputStream("subfile.txt"));
		String data = null;
		int line=0,cnt=0;
		while((data=br.readLine()) != null) {
			++line;
			if(line < start) continue;
			if(cnt >= len) break;
			++cnt;
			System.out.println(line+":"+data);
			ps.println(line+":"+data);
		}
		stdin.close();
		br.close();
		ps.close();
	}

}

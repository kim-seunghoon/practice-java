package chapter14;
/*
 * 다른 프로세스에서 전달해 준 메세지 출력하기
 */
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class ProcessEx1 {
	public static void main(String[] args) throws IOException {
		Process p = Runtime.getRuntime().exec("ping 172.16.2.1");
		Reader r = new InputStreamReader(p.getInputStream(), "EUC-KR");
		int data = 0;
		while ((data = r.read()) != -1) {
			System.out.print((char)data);
		}
	}
}

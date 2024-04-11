package chapter12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//타자 연습 프로그램 작성하기
public class ThreadEx10 {
	String[] data = {"태연","유리","윤아","효연","수영","서현","써니","제시카","티파니"};
	List<String> words = new ArrayList<>();
	int interval = 2*1000;
	class DataAddThread extends Thread {
		public void run() {
			while(true) {
				words.add(data[(int)(Math.random() * data.length)]);
				try {
					sleep(interval);
				}catch(InterruptedException e) {}
			}
		}
	}
	public static void main(String[] args) {
		ThreadEx10 c = new ThreadEx10();
		Scanner scan = new Scanner(System.in);
		c.words.add(c.data[0]);
		DataAddThread dt = c.new DataAddThread(); 
		dt.setDaemon(true);
		dt.start();
		while (true) {
			System.out.println(c.words);
			System.out.println(">>");
			String n = scan.next().trim();
			c.words.remove(n);
			if (c.words.size() == 0) {
				break;
			}
			
		}
		System.out.println("타자연습 종료");
		scan.close();
	}

}

package chapter3;

import java.util.Scanner;

public class OpEx5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int score = scan.nextInt();
		//System.out.println(score + "점 : " + ((score >= 60)? "합격" : "불합격"));
		//System.out.println(score + "점 : " + ((score >= 70)? "통과" : (score >= 60)? "재시험" : "불합격"));
		
		if (score >= 70) {
			System.out.println("통과");
		} else if (score >= 60) {
			System.out.println("재시험");
		} else {
			System.out.println("탈락");
		}
	}

}

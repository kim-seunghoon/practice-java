package chapter13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * 화면에서 홀수개의 숫자를 입력 받아 숫자의 평균값과 중간 값을 출력하기
 */

public class Exam1 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("홀수 개수의 숫자를 입력하세요 (종료 : 999)");
		int sum = 0;
		
		while (true) {
			int num = scan.nextInt();
			if (num == 999) {
				System.out.println("프로그램 종료");
				break;
			}
			list.add(num);
		}
		if (list.size()%2==0) {
			list.remove(list.size()-1);
		}
		
		for (Integer i : list) {
			sum += i;
		}
		
		Collections.sort(list);
		System.out.println(list);
		System.out.println("List 값의 합 : " + sum);
		System.out.println("List 값의 평균 : " + (double)(sum/list.size()));
		System.out.println("중간 값 : " + list.get(list.size()/2));
	} 
}



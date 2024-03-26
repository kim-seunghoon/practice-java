package chapter5;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("5개의 정수를 입력하세요");
		
		int sum = 0, maxindex = 0, minindex = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
			if(arr[maxindex] < arr[i]) maxindex = i;
			if(arr[minindex] > arr[i]) minindex = i;
		}
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + (double)sum/arr.length);
		System.out.println("최대값 :" + arr[maxindex]);
		System.out.println("최소값 :" + arr[minindex]);
		System.out.println("최대값 인덱스 :" + maxindex);
		System.out.println("최소값 인덱스 :" + minindex);
	}

}

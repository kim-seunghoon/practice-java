package chapter11;

import java.util.Arrays;
import java.util.Comparator;

/*
 * Arrays 클래스 : 배열의 복사, 비교, 정렬 기능을 포함하고 있는 클래스
 */
public class ArraysEx1 {

	public static void main(String[] args) {
		String[] arr1 = {"홍길동", "이몽룡", "성춘향", "향단이"};
		for (String s : arr1) {
			System.out.print(s + ",");
		}
		System.out.println();
		//arr1 배열의 모든 요소 값을 김길동으로 채우기
		Arrays.fill(arr1, "김길동");
		for (String s : arr1) {
			System.out.print(s +", ");
		}
		System.out.println();
		System.out.println(Arrays.toString(arr1));
		//arr1배열 1, 2 인덱스만 홍길동전으로 변경
		Arrays.fill(arr1, 1, 3, "홍길동전");
		System.out.println(Arrays.toString(arr1));
		//arr1 배열의 값을 정렬하기
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
		//arr1 내림차순 정렬
		Arrays.sort(arr1, Comparator.reverseOrder());
		System.out.println(Arrays.toString(arr1));
		//arr1 배열 복사
		String[] arr2 = Arrays.copyOf(arr1, arr1.length);
		arr2[2] = "이몽룡";
		System.out.println(Arrays.toString(arr2));
		System.out.println("----------------");
		int[] numarr = new int[10];
		//배열의 모든 요서 값을 10으로 저장
		Arrays.fill(numarr, 10);
		System.out.println(Arrays.toString(numarr));
		
	}

}

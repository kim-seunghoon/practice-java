package test0322;

import java.util.Arrays;

/*
  1부터 100까지 임의의 수 10개를  배열에 저장하고, 정렬하여 출력하기
    1. 배열 선언, 생성.
    2. 임의의 수를 10개 배열에 저장
    3. 정렬
    4. 출력
 */
public class Test4 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		
		for (int i = 0; i < 10; i++) {
			arr[i] = (int)(Math.random() * 100 + 1);
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					arr[j] =(int)(Math.random() * 100 + 1);
					j--;
				}
			}
		}
		
		for (int j = 0; j < arr.length; j++) {
			Arrays.sort(arr);
			System.out.print(arr[j] + "\t");
		}
		
	}
}
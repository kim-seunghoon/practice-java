package chapter5;

public class Exam5 {

	public static void main(String[] args) {
		int[][] arr = {{1,2},{1,2,3,4,5},{10,20},{100}};
		int rowsum = 0;
		
		//arr[1].length로 쓰지 않고 알고리즘으로 가장 긴 열을 찾는 방법
//		int maxcol = 0;
//		for (int i = 0; i < arr.length; i++) {
//			if (maxcol < arr[i].length) {
//				maxcol = arr[i].length;
//			}
//		}
//		int[] colsum = new int[maxcol];
		
		int[] colsum = new int[arr[1].length];
		for (int i = 0; i < arr.length; i++) {
			rowsum = 0;
			for (int j = 0; j < arr[i].length; j++) {
				rowsum += arr[i][j];
				colsum[j] += arr[i][j];
			}
			System.out.print(i + "행의 합 : " + rowsum + "\t");
		}
		System.out.println("\n---------------------");
		for (int i = 0; i < colsum.length; i++) {
			System.out.print(i + "열의 합 : " + colsum[i]+ "\t");
		}
	}

}

package chapter5;
//가변 배열: 다차원 배열에서만 가능하고 첫번째 배열의 갯수는 반드시 지정. 이후는 지정하지 않아도 됨
public class ArrEx9 {

	public static void main(String[] args) {
		int[][] arr = new int[3][];
		arr[0] = new int[] {10, 20};
		arr[1] = new int[] {10, 20, 30, 40, 50};
		arr[2] = new int[] {10};
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("arr[%d][%d] = %d\t", i, j, arr[i][j]);
			}
			System.out.println();
		}
	}

}

package chapter5;

public class ArrEx1 {

	public static void main(String[] args) {
		int arr[];//배열의 선언. 참조변수 선언
		arr = new int[5];//배열 객체의 생성
		/*
		 * new 예약어 기능
		 * 객체생성 : int값 5개를 저장할 수 있는 변수 할당. length 상수값 설정
		 * 기본값 초기화
		 * 		숫자 : 0
		 * 		boolean : false
		 * 		그외 : null
		 */
		arr[0] = 10;//배열의 초기화. index로 접근, 0부터 시작
		arr[1] = 20;//배열의 초기화
		for (int i = 0; i < arr.length; i++) {//배열 값 조회
			System.out.println("arr[" + i + "] = " + arr[i]);
		}
		System.out.println("---------");
		
		int[] arr2 = new int[3];
		arr2[0] = 100;
		arr2[1] = 200;
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("arr2[" + i + "] = " + arr2[i]);
		}
		System.out.println("----------");
		
		arr2 = arr;
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("arr2[" + i + "] = " + arr2[i]);
		}
		System.out.println("----------");
		
		arr[3] = 500;
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("arr2[" + i + "] = " + arr2[i]);
		}
		System.out.println("----------");
		
		//개선된 for 구문. index 사용 안 됨, 요소의 값만 조회한다 -> index 필요시 기존의 for 문으로 구현해야한다 
		for (int i : arr2) {
			System.out.println(i);
		}
	}

}

package chapter11;
//숫자들의 합을 계산하기
public class Exam4 {

	public static void main(String[] args) {
		String str = "10,20,30,40,50";
		String[] arr = str.split(",");
		System.out.println(arr[4]);
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += Integer.parseInt(arr[i]);
		}
		System.out.println(sum);		
			
		
	}

}

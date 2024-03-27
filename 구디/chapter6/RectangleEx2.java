package chapter6;

public class RectangleEx2 {

	public static void main(String[] args) {
		Rectangle2[] arr = new Rectangle2[5];//배열객체
		int totalArea = 0;//전체 면적합
		int totalLength = 0;//전체 둘레의 합
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Rectangle2();//Rectangle2 객체화
			arr[i].width = (int)(Math.random() * 11) + 20;
			arr[i].height = (int)(Math.random() * 11) + 20;
			arr[i].sno = ++Rectangle2.cnt;//사각형 번호
			System.out.println(arr[i]);//toString() 메서드 호출
			totalArea += arr[i].area();//면적의 합
			totalLength += arr[i].length();//둘레의 합
		}
		System.out.println("전체 사각형의 넓이의 합 : " + totalArea);
		System.out.println("전체 사각형의 둘레의 합 : " + totalLength);
		System.out.println(arr[0]);
	}

}

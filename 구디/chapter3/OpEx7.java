package chapter3;

public class OpEx7 {

	public static void main(String[] args) {
		//printf : format을 지정하여 출력 가능함
		//%d : 10진 정수 형태로 출력
		int num = 100;
		System.out.printf("%d,%d\n", num, 12345);
		//%10d : 10진 정수를 최소 10자리로 출력
		System.out.printf("%10d,%10d\n", num, 12345);
		//%-10d : 10진 정수를 최소 10자리로 왼족 정렬 출력
		System.out.printf("%-10d,%-10d\n", num, 12345);
		//%-,10d : 10진 정수를 최소 10자리로 왼족 정렬 ,도 출력
		System.out.printf("%-,10d,%-,10d\n", num, 12345);
		//%010d : 10진 정수를 최소 10자리로 왼족 정렬 빈자리는 0으로 채워 출력
		System.out.printf("%010d,%010d\n", num, 12345);
		//%f : 실수 형태로 출력
		System.out.printf("%d,%f\n", num, 12345.145);
		//%.2f : 소숫점 이하 2자리 형태로 출력
		System.out.printf("%.2f\n", 12345.145);
		//%,10.2f : 10자리를 확보하고 소숫점 이하 2자리 형태로 세자리마다 , 추가하고 왼쪽 정렬 출력
		System.out.printf("%-,10.2f\n", 12345.145);
	}

}

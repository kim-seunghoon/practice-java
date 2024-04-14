package checkArea;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		 ArrayList<Integer> list = new ArrayList<>();
		  Scanner scan = new Scanner(System.in);
		  System.out.println("자연수를 입력하세요 (종료 : 0)");
		  int sum = 0;
		  while (true) {
			try {  
				int n = scan.nextInt();
				if (n == 0) {
					break;
				}
				if (n%2 == 1 ) {
					list.add(n);
				  }
				if (n > 0) {
					continue;
				}
			} catch(InputMismatchException e) {
				scan.next();
			}
		  }
		  
		  for (Integer i : list) {
			sum += i;
		}
//		  Collections.sort(list);
		  System.out.println(list);
		  System.out.println(list + "의 합 : " + sum);
		  System.out.println("홀수의 최대값 : " + Collections.max(list));
		  System.out.println("홀수의 최소값 : " + Collections.min(list));
		  System.out.println("홀수의 최대값 위치 : " + list.indexOf(Collections.max(list)));
		  System.out.println("홀수의 최소값 위치 : " + list.indexOf(Collections.min(list)));
		  int mid = list.size()/2;
		  if (list.size()%2==1) {
			  System.out.println(list.get(mid));
		} else {
			System.out.println((list.get(mid - 1) + list.get(mid))/2);
		}
	}

}
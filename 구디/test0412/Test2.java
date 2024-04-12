package test0412;

import java.util.NavigableSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.TreeSet;


/*
 * 1 ~ 99까지의 정수를 입력받아서 TreeSet에 저장하고, 0 을 입력하면 입력을 종료한다. 
 * 입력된 값을 정렬하여 출력하기.
   1 ~ 99 까지의 숫자가 아닌 경우 TreeSet에서 저장하지 말것.
 * 
 * set1 오름차순 정렬되도록 출력.
 * set2 내림차순 정렬되도록 출력하기.
 * 
 *[결과]
1부터 99까지의 숫자를 입력하세요 (종료 : 0)
1 2 5 9 1 100 12 3 2 5 64 123 4 5 0
set1:[1, 2, 3, 4, 5, 9, 12, 64]
set2:[64, 12, 9, 5, 4, 3, 2, 1]
 */
class Number {
	int value;
	Number (int value) {
		this.value = value;
	}
	@Override
	public int hashCode() {
		return Objects.hash(value);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Number other = (Number) obj;
		return value == other.value;
	}
	
}
public class Test2 {
  public static void main(String[] args) {
	
	  TreeSet<Integer> num = new TreeSet<>();
	  Scanner scan = new Scanner(System.in);
	  System.out.println("1~99까지 숫자를 입력하세요 (종료 : 0)");
	  int sum = 0;
	  while (true) {
		int n = scan.nextInt();
		if (n == 0) {
			break;
		}
		if (n > 99) {
			continue;
		  }
		num.add(n);
	  }
	  
	  for (Integer i : num) {
		sum += i;
	}
	  System.out.println(num);
	  System.out.println("set1 : " + num);
	  NavigableSet<Integer> decendingSet = num.descendingSet();
	  System.out.print("set2 : [");
	  	for(Integer s : decendingSet){
            System.out.print(s +", ");    
        }
	  	System.out.println("]");

	}
}
package chapter13;
/*
 * TreeSet 예제
 */
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetEx3 {

	public static void main(String[] args) {
//		TreeSet<String> set = new TreeSet<>();
//		Set<String> set = new TreeSet<>(); Set은 subSet함수 사용 불가
		SortedSet<String> set = new TreeSet<>();
		String from = "bat";
		String to = "d";
		set.add("flower");
		set.add("abc");
		set.add("alien");
		set.add("bat");
		set.add("azz");
		set.add("car");
		set.add("Car");
		set.add("disc");
		set.add("dance");
		set.add("dzzzz");
		set.add("dZZZZ");
		set.add("elev");
		set.add("fan");
		System.out.println(set);
		System.out.println("---------------------");
		//subSet(시작요소, 끝요소 앞까지)
		System.out.println("from :" + from + ", to : " + to);
		System.out.println(set.subSet(from, to));
		System.out.println("---------------------");
		System.out.println("from :" + from + ", to : " + to + "zzzz");
		System.out.println(set.subSet(from, to + "zzzz"));
		System.out.println("---------------------");
		//기존의 set을 이용하여 set 객체 생성하기
		TreeSet<String> set2 = new TreeSet<>(set);
		System.out.println(set2);
	}

}

package chapter13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * List 인터페이스
 * 1.순서유지
 * 2.인덱스(첨자) 가능
 * 3.구현 클래스 : ArrayList, Vector, LinkedList 등
 */
public class ListEx1 {

	public static void main(String[] args) {
		//<Integer> : 제네릭. 요소(Element)의 자료형 지정
		List<Integer> list = new ArrayList<>();
		list.add(1);list.add(2);list.add(5);
		list.add(4);list.add(3);list.add(0);
		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i+" : "+list.get(i));
		}
		//개선된 for 가능
		for (Integer i : list) {
			System.out.println(i);
		}
		//정렬하기
		//collections : 클래스. Collection 객체들의 보조 기능 수행
		//collection : 인터페이스. List, Set 상위 인터페이스
		//sore() : 정령하기
		System.out.println("오름차순 정렬");
		Collections.sort(list);
		System.out.println(list);
		System.out.println("내림차순 정렬");
		Collections.sort(list, Comparator.reverseOrder());
		System.out.println(list);
		//Shuffle : 객체를 임의의 순서로 섞기
		System.out.println("객체 섞기");
		Collections.shuffle(list);
		System.out.println(list);
		//subList(시작인덱스, 종료인덱스 +1) : 부분리스트
		//subList(1, 4) : 1번 인덱스부터 3번 인덱스까지를 부분리스트로 리턴
		System.out.println("부분리스트");
		List<Integer> list2 = list.subList(1, 4);
		System.out.println(list2);
		list.set(1, 100);
		System.out.println(list);
		System.out.println(list2);
		List<Integer> list3 = new ArrayList<>(list.subList(1, 4));
		System.out.println(list3);
		list.set(2, 200);
		System.out.println(list);
		System.out.println(list2);
		System.out.println(list3);
	}

}

package chapter13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * Iterator 인터페이스 예제
 * 	Iterator 인터페이스 : 반복자
 * 	Collection 객체를 Iterator 인터페이스의 객체로 변경 가능함 -> iterator()
 * 멤버 메서드
 * 	boolean hasNext() : 조회 가능한 객체 존재?
 * 	Object next() : 객체 조회 리턴
 * 	void remove() : 조회된 객체를 제거. 반드시 next() 실행 후에 호출 해야함
 * 
 * Enumeration 인터페이스 : Iterator 이전에 사용되던 반복자. Vector, Hashtable만 사용 가능함
 * 멤버 메서드
 * 	boolean hasMoreElement() : 조회 가능한 객체 존재?
 * 	Object nextElement() : 객체를 조회하여 리턴
 */
public class IteratorEx1 {

	public static void main(String[] args) {
		Iterator<Integer> it = null;
		List<Integer> list = new ArrayList<>();
		Set<Integer> set = new HashSet<>();
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 1; i < 6; i++) {
			list.add(i + 10);
			set.add(i*10);
			map.put(i, i *100);
		}
		System.out.println(list);
		System.out.println(set);
		it = list.iterator(); //Iterator 객체로 변경
		printnremove(it);
		it = set.iterator();
		printnremove(it);
		it = map.keySet().iterator();
		System.out.println("printnremove 후  list : " + list);
		System.out.println("printnremove 후  set : " + set);
		System.out.println("printnremove 후  map : " + map);
	}

	private static void printnremove(Iterator<Integer> it) {
		while (it.hasNext()) {
			System.out.println(it.next());
			it.remove(); //next() 리턴된 객체 제거
		}
	}
	
}

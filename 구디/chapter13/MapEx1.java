package chapter13;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * Map 예제
 * 
 * Collection 인터페이스 : 객체들의 모임
 * 	List : 추가된 순서를 유지. 인덱스 사용 가능. 가변배열. 구현클래스 : ArrayList, Vector, LinkedList
 * 	Set	: 중복불가. 구현클래스 : HashSet, TreeSet, LinkedHashSet
 * 	Queue : 구현클래스 : LinkedList
 * 
 * Map 인터페이스 : (키, 객체)쌍들의 모임
 * 	구현클래스 : HashMap : 순서모름
 * 			  HashTable : 구번전의 클래스. 구버전의 메서드와 혼합
 * 			  TreeMap : 키를 기준으로 정렬됨
 * 	
 * 주요 메서드
 * 	put(키값, 객체값) : map 객체에 데이터 추가. 수정
 * 	get(키값) : 키값으로 등록된 객체의 값을 리턴
 * 	keySet() : Map에 등록된 객체 중 key 값의 목록 Set으로 리턴
 * 	values() : Map에 등록된 객체 중 value 값의 목록 리턴. Collection으로 리턴
 * 	entrySet() : Map에 등록된 객체를 (키, 객체)의 쌍인 객체로 Set의 형태로 리턴. Map.Entry<키, 객체> : 자료형
 */
public class MapEx1 {

	public static void main(String[] args) {
		/*
		 * <String, Integer>
		 * 키의 자료형 객체의 자료형
		 */
		Map<String, Integer> map = new HashMap<>();
		map.put("홍길동", 1234);
		map.put("김삿갓", 2345);
		map.put("이몽룡", 3456);
		map.put("김삿갓", 4567); //추가가 아닌 수정 개념 적용
		System.out.println(map);
		System.out.println("김삿갓의 전화번호 : " + map.get("김삿갓")); //키 값 입력
		System.out.println("김삿갓의 전화번호 : " + map.get("홍길순")); //값이 없는 경우 null 값 리턴 
		System.out.println("--------------------");
		//keySet() : 키 값들만 조회
		Set<String> keys = map.keySet();
		for (String k : keys) {
			System.out.println(k + " = " + map.get(k));
		}
		System.out.println("--------------------");
		//values() : 객체 값들만 조회. 순서모름. 키값 조회 불가
		Collection<Integer> values = map.values();
		for (Integer v : values) {
			System.out.println(v);
		}
		System.out.println("--------------------");
		//entrySet() : <키, 객체>쌍으로 조회
		Set<Map.Entry<String, Integer>> entrys = map.entrySet();
		for (Map.Entry<String, Integer> e : entrys) {
			System.out.println(e.getKey() + " = " + e.getValue());
		}
		System.out.println("--------------------");
		//홍길동 객체 제거
		Integer value = map.remove("홍길동");
		System.out.println(value);
		System.out.println(map);
		System.out.println("map 요소의 개수 : " + map.size());
	}

}

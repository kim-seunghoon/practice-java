package chapter13;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
 * HashMap 객체에 나라의 수도를 등록하기
 */
public class Exam4 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("대한민국", "서울");
		map.put("캐나다", "오타와");
		map.put("영국", "런던");
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			String c = scan.next();
			String key = map.get(c);
			if (c.equals("종료")) {
				break;
			}
			if (key == null) {
				System.out.println("등록된 나라가 아닙니다");
				System.out.println(c + "의 수도를 입력하세요");
				key = scan.next();
				map.put(c, key);
				continue;
			} else {
				System.out.println(key);
			}
		}
		System.out.println("-----keySet으로 출력------");
		Set<String> keys = map.keySet();
		for (String k : keys) {
			System.out.println(k + "=" + map.get(k));
		}
		
		System.out.println("-----entrySet으로 출력------");
		for (Map.Entry<String, String> e : map.entrySet()) {
			System.out.println(e.getKey() + "=" + e.getValue());
		}
	}

}

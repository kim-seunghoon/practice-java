package chapter13;

import java.util.Vector;

/*
 * Vector 클래스
 * -Collection 프레임워크 이전의 클래스
 * -List 인터페이스의 구현 클래스
 * -구버전의 메서드와 List 인터페이스의 메서드가 공존함
 * 
 * List 인터페이스 객체 특징
 * -추가한 순서 유지
 * -인덱스 사용
 */
public class ListEx2 {
	public static void main(String[] args) {
		Vector<Double> list = new Vector<>();
		list.add(0.3);
		list.add(Math.PI);
		list.addElement(5.0);//구버전 메서드 List.add()와 동일한 기능
		System.out.println(list);
		//요소의 위치 찾기
		double num = 5.0;
		int index = list.indexOf(num);
		if (index < 0) {
			System.out.println(num + "은  list의 요소가 아닙니다");
		} else {
			System.out.println(num + "의 위치 : " + index);
		}
		//contains() : 요소가 존재?
		if(list.contains(num)) {
			System.out.println(num + "은 list의 요소임");
		} else {
			System.out.println(num + "은 list의 요소가 아님");
		}
		//remove 요소제거
		System.out.println(list.get(0));
		list.remove(0);
		System.out.println(list);
		System.out.println(list.get(0));
	}
}

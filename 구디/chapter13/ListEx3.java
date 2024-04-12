package chapter13;
//List 객체 정렬하기
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * Collection.sor(List)
 * ->List 요소의 자료형이 comparable 인터페이스로 형변환이 가능해야함
 *  comparable 인터페이스를 구현한 클래스의 객체만 가능함
 *  
 *  Comparable 인터페이스 : compareTo() 추상메서드를 가짐
 *  -> 객체 기본정렬 방식을 설정하는 기능
 *  Comparator 인터페이스 : compare() 추상 메서드를 가짐
 *  -> 실행 중인 정렬 방식 설정 시 사용되는 기능
 *  ->comparator.reverseOrder() : 기본 정렬방식을 역순으로 설정(Comparator 인터페이스의 static 메서드)
 *  
 * 정렬관련 인터페이스
 * 1. Comparable<T> : 요소의 기본 정렬방식 설정 시 클래스에서 구현함
 * 		int compareTo(T o) 양수 : 현재 객체 뒷쪽 음수 : 현재 객체 앞쪽
 * 2. Comparator<T> : 기본 정렬 방식과 무관하게 실행 중 다른 정렬 방식 설정 시 객체화하여 설정 = 동적 정렬 방식 구현 시 사용됨
 * 		int compare(T o1, T o2) 양수 : o1 객체가 뒷쪽 음수 : o2 객체가 앞쪽
 */
class Data1 implements Comparable<Data1>{
	int value;
	Data1(int value){
		this.value = value;
	}
	public String toString() {
		return "["+value+"]";
	}
	public int compareTo(Data1 o) {
		return value - o.value; //음수 : 현재 객체 앞쪽, 양수 : 현재 객체 뒷쪽
//		return (value - o.value) * -1; // 내림차순으로 할 시
	}
}
class Data2 {
	int value;
	Data2(int value){
		this.value = value;
	}
	public String toString() {
		return "["+value+"]";
	}
}
public class ListEx3 {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.add("a");
		list1.add("b");
		list1.add("c");
		list1.add("d");
		list1.add("e");
		list1.add("f");
		System.out.println(list1);
		Collections.sort(list1);
		System.out.println(list1);
		System.out.println("--------------------");
		//내림차순 정렬
		Collections.sort(list1,Comparator.reverseOrder());
		System.out.println(list1);
		System.out.println("--------------------");
		//사용자 클래스의 객체 정렬하기
		List<Data1> list2 = new ArrayList<>();
		list2.add(new Data1(3));
		list2.add(new Data1(1));
		list2.add(new Data1(2));
		System.out.println(list2);
		Collections.sort(list2);
		System.out.println(list2);
		Collections.sort(list2,Comparator.reverseOrder());
		System.out.println(list2);
		System.out.println("--------------------");
		List<Data2> list3 = new ArrayList<>();
		list3.add(new Data2(3));
		list3.add(new Data2(1));
		list3.add(new Data2(2));
		System.out.println(list3);
		Comparator<Data2> c = new Comparator<>() {
			public int compare(Data2 o1, Data2 o2) {
				return o1.value - o2.value;
			}
		};
		Collections.sort(list3, c); //c 객체가 설정된 방식으로 정렬함
		System.out.println(list3);
		System.out.println("--------------------");
		//comparator 인터페이스 객체 : 람다식으로 객체 생성 가능
		Collections.sort(list3,(o1,o2)->o2.value - o1.value);
		System.out.println(list3);
	}

}

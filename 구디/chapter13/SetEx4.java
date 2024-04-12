package chapter13;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

class PhoneNo {
	String name;
	int number;
	public PhoneNo(String name, int number) {
		super();
		this.name = name;
		this.number = number;
	}
	@Override
	public String toString() {
		return name + " : " + number;
	}
	
}
public class SetEx4 {

	public static void main(String[] args) {
		
		Comparator<PhoneNo> c = new Comparator<>() {
			public int compare(PhoneNo o1, PhoneNo o2) {
//				return o1.name.compareTo(o2.name); //이름 순
				return o1.number-o2.number; //전화번호 순
			}
		};
//		TreeSet<PhoneNo> set = new TreeSet<>(c); //이름 순으로 정렬 설정
//		set.add(new PhoneNo("홍길동", 1234));
//		set.add(new PhoneNo("김삿갓", 2345));
//		set.add(new PhoneNo("이몽룡", 4234));
//		System.out.println(set);
//		
//		TreeSet<PhoneNo> set = new TreeSet<>((o1, o2)->o1.name.compareTo(o2.name));//람다 방식으로 이름 순으로 정렬
//		set.add(new PhoneNo("홍길동", 1234));
//		set.add(new PhoneNo("김삿갓", 2345));
//		set.add(new PhoneNo("이몽룡", 4234));
//		System.out.println(set);
//		TreeSet<PhoneNo> set = new TreeSet<>((o1, o2)->(o1.name.compareTo(o2.name)) * -1);//람다 방식으로 이름 역순으로 정렬
//		set.add(new PhoneNo("홍길동", 1234));
//		set.add(new PhoneNo("김삿갓", 2345));
//		set.add(new PhoneNo("이몽룡", 4234));
//		System.out.println(set);
//		TreeSet<PhoneNo> set = new TreeSet<>((o1, o2)->o1.number - o2.number);//람다 방식으로 전화번호 순으로 정렬
//		set.add(new PhoneNo("홍길동", 1234));
//		set.add(new PhoneNo("김삿갓", 2345));
//		set.add(new PhoneNo("이몽룡", 4234));
//		System.out.println(set);
		TreeSet<PhoneNo> set = new TreeSet<>((o1, o2)->o2.number - o1.number);//람다 방식으로 전화번호 역순으로 정렬
		set.add(new PhoneNo("홍길동", 1234));
		set.add(new PhoneNo("김삿갓", 2345));
		set.add(new PhoneNo("이몽룡", 4234));
		System.out.println(set);
	}

}

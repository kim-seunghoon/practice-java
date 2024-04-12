package chapter13;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/*
 * 객체의 중복 판단
 * 1. equals() : true
 * 2. hashCode() : 동일
 * 1, 2의 조건을 전부 만족해야 함 = 오버라이딩 필요
 */
class Person{
	String name;
	int age;
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return  name + " : " + age;
	}
	@Override
	public int hashCode() {
		return name.hashCode()+10;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			Person p = (Person)obj;
			return name.equals(p.name) && age == p.age;
		} else {
			return false;
		}
	}
	
}
public class SetEx2 {

	public static void main(String[] args) {
		Set<Object> set = new HashSet<>();
		set.add(new String("abc"));
		set.add(new String("abc"));
		set.add(new Person("홍길동", 10));
		set.add(new Person("홍길동", 10));
		System.out.println(set);
		//StringBuffer, StringBuilder
		set.add(new StringBuffer("abcd"));
		set.add(new StringBuffer("abcd"));
		set.add(new StringBuilder("abcde"));
		set.add(new StringBuilder("abcde"));
		System.out.println(set);
	}

}

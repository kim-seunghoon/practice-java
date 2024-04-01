package chapter8;
/*
 * 단일 상속의 보완을 위해 사용되는 인터페이스
 */
abstract class Animal {
	String name;
	Animal(String name) {
		this.name = name;
	}
	abstract void eat();
}
interface Flyable {
	void fly();
}
class Dove extends Animal implements Flyable {
	Dove() {
		super("비둘기");
	}

	@Override
	public void fly() {
		System.out.println(name + "은 하늘을 날 수 있다");
	}

	@Override
	void eat() {
		System.out.println(name + "는 벌레를 잡아먹는다");
	}
}
class Monkey extends Animal {
	Monkey() {
		super("원숭이");
	}

	@Override
	void eat() {
		System.out.println(name + "는 나무에서 열매를 따먹는다");
	}
}
/*
 * Animal 타입의 참조변수로 두 개를 배욜로 설정하여 첫 번째는 Dove객체, 두 번째는 원숭이 객체를 저장
 */
public class InterfaceEx3 {

	public static void main(String[] args) {
		Animal[] a = new Animal[2];
		Dove d = new Dove();
		Monkey m = new Monkey();
		a[0] = d;
		a[1] = m;
		d.eat();
		d.fly();
		m.eat();
		System.out.println("----다른 방법-----");
		Animal[] arr = new Animal[2];
		arr[0] = new Dove();
		arr[1] = new Monkey();
		for (Animal animal : arr) {
			animal.eat();
			if (animal instanceof Flyable) {
				Flyable f = (Flyable)animal;
				f.fly();
			}
		}
	}

}

package chapter8;
/*
 * 매개변수로 사용되는 인터페이스
 */
class Unit {
	int hitPoint;
	final int MAX_HP;
	Unit(int hp) {
		MAX_HP = hp;
	}
}
class GroudUnit extends Unit {
	GroudUnit(int hp) {
		super(hp);
	}
}
class AirUnit extends Unit {
	AirUnit(int hp) {
		super(hp);
	}
}

interface Repairable {}

class Tank extends GroudUnit implements Repairable {
	Tank() {
		super(150);
	}
	public String toString() {
		return "Tank";
	}
}
class DropShip extends AirUnit implements Repairable {
	DropShip() {
		super(125);
	}
	public String toString() {
		return "DropShip";
	}
}
class Marine extends GroudUnit {
	Marine() {
		super(140);
	}
	public String toString() {
		return "Marine";
	}
}
class SCV extends GroudUnit implements Repairable {
	SCV() {
		super(60);
	}
	void repair(Repairable r) {
		Unit u = (Unit)r;
		u.hitPoint = u.MAX_HP;
		System.out.println(r + "의 수리 완료. hitPoint = " + u.hitPoint);
	}
	public String toString() {
		return "SCV";
	}
}
public class InterfaceEx5 {

	public static void main(String[] args) {
		Unit[] uarr = new Unit[4];
		uarr[0] = new Tank();
		uarr[1] = new DropShip();
		uarr[2] = new Marine();
		uarr[3] = new SCV();
		SCV s = new SCV();
		for (Unit u : uarr) {
			if (u instanceof Repairable) {
				s.repair((Repairable)u);
			}
			
		}
	}

}

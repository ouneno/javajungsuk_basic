package ch7;

class RepairableTest {

	public static void main(String[] args) {
		
//		Tank tank = new Tank();
//		Dropship dropship = new Dropship();
//		
//		Marine mariine = new Marine();
//		SCV scv = new SCV();	
		
	}

class Unit {
	
	int hitPoint;
	final int MAX_HP;
	
	Unit(int hp) { 
		MAX_HP = hp;
	}
}

class GroundUnit extends Unit {
	GroundUnit(int hp){
		super(hp);
	}
}

class AirUnit extends Unit {
	AirUnit(int hp){
		super(hp);
	}
}
	
class Tank extends GroundUnit {
	
	Tank() {
		super(150);
		hitPoint = MAX_HP;
	}
	
	public String toString() {
		return "Tank";
	}
}

class Dropship extends AirUnit {
	
	Dropship() {
		super(125);
		hitPoint = MAX_HP;
	}

	public String toString() {
		return "Dropship";
	}
	
}

class Marine extends GroundUnit {
	Marine() {
		super(40);
		hitPoint = MAX_HP;
	}
}

class SCV extends GroundUnit {
	SCV() {
		super(60);
		hitPoint = MAX_HP;
	}

}

}

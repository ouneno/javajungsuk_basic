package ch7;

abstract class Unit2 {
	int x;
	int y;
	abstract void move (int x, int y);
	void stop() {
		System.out.println("멈춤");
	}
}

interface Fightable2 {
	void move(int x, int y);
	void attack(Fightable f);
}

class Fighter2 extends Unit2 implements Fightable2 {
	
	public void move(int x, int y) {
		System.out.println("["+x+","+y+"] 로 이동");
	}
	
	public void attack(Fightable f) {
		System.out.println(f+"를 공격");		
	}
}

public class FightTest {
	public static void main(String[] args) {
		Fighter f = new Fighter();
//		Unit2 u = new Fighter();
		f.move(100, 200);
		Fighter f2 = new Fighter();
		f.attack(f2);
	}

}

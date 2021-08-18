package ch7;

class makeCoffee extends Object{
	int shot;
	int water;
	
	makeCoffee(int shot, int water) {
		this.shot = shot;
		this.water = water;
	}
	
	public String toString() {
		return "shot은 : "+shot+"번\nwater는 : "+water+"ml";
	}
}

public class OverridingTest {
	public static void main(String[] args) {
		
		makeCoffee mc = new makeCoffee(2, 450);
		System.out.println(mc);
	}
}

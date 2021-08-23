package ch7;

class OunenoCafe {
	
	public void method(Americano ame) {
		ame.AmericanoCoffee();
		ame.make();
	}
	
	public void method(Mocha mc) {
		mc.MochaCoffee();
		mc.make();
	}
	
	public void method(Latte l) {
		l.latteCoffee();
		l.make();
	}
}

interface Make {
	public static void make() {
		System.out.println("제조완료");
	}
}

class Americano implements Make{
	
	String name = "Americano";
	int water = 450;
	int shot = 2;

	void AmericanoCoffee() {
		System.out.println("Americano의 제조법은 water "
							+water+"ml와 shot은 "
							+shot+"샷을 드리면 됩니다.");
	}
	
	public void make() {
		System.out.println(name+"제조완료");
	};

}

class Mocha implements Make {
	
	String name = "Mocha";
	int milk = 450;
	int shot = 2;
	int chocoSyrup = 3;
	
	void MochaCoffee() {
		System.out.println("MochaCoffee의 제조법은 milk "
							+milk+"ml와 shot은 "
							+shot+"샷, 그리고 초코시럽은 "
							+chocoSyrup+"을 펌핑하면됩니다.");
	}
	
	public void make() {
		System.out.println(name+"제조완료");
	};

}

class Latte implements Make {
	
	String name = "latte";
	int milk = 450;
	int shot = 2;
	
	void latteCoffee() {
		System.out.println("Latte의 제조법은 milk "
							+milk+"ml와 shot은 "
							+shot+"샷 이면 됩니다.");
	}
	
	public void make() {
		System.out.println(name+"제조완료");
	};

}
public class interfaceTest2 {

	public static void main(String[] args) {
		
		OunenoCafe c = new OunenoCafe();
		c.method(new Americano());
		c.method(new Latte());
		c.method(new Mocha());


	}

}

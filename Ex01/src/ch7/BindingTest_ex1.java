package ch7;

class BindingTest_ex1 {

	public static void main(String[] args) {
		
		Mommy m = new Daughter();
		Daughter d = new Daughter();
		
		System.out.println(m.age);
		m.method();
		
		System.out.println(d.age);
		d.method();
	}
}

class Mommy {
	int age = 57;
	
	void method() {
		System.out.println("Mommy Method()");
	}
}

class Daughter extends Mommy {
	int age = 29;
	
	void method() {
		System.out.println("Daughter Method()");
	}
}

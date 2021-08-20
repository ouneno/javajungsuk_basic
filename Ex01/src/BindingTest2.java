class BindingTest2 {

	public static void main(String[] args) {
		
		Parent2 p = new Child2();
		Child2  c = new Child2();
		
		System.out.println("p.x = "+p.x);
		p.method();
		
		System.out.println("c.x = "+c.x);
		c.method();
	}
}

class Parent2 {
	int x = 100;
	
	void method() {
		System.out.println("Parent Method()");
	}
}

// 아무런 멤버 정의 없이 조상클래스의 멤버들을 상속받음
class Child2 extends Parent2 {
}

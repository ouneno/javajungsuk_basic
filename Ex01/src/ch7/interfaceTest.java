package ch7;

/* 
 * 인터페이스를 사용하는 이유
 * class A에서 다른 클래스의 메서드를 가져오기 위해선 선언, 구현 수정을 반복해야 함
 * 이러한 반복을 줄이고 수정을 편하게 하기위해 디커플링 상태를 유지
*/

class A {
	public void method(I i) {
		i.method();
	}
}

// 선언과 구현의 분리를 위해 인터페이스 생성
interface I {
	public void method();
}

// interface I를 구현
class B implements I {
	public void method() {
		System.out.println("B클래스 입니다.");
	}
}

// interface I를 구현
class C implements I {
	public void method() {
		System.out.println("C클래스 입니다.");
	}
}

public class interfaceTest {

	public static void main(String[] args) {
		A a = new A();
		a.method(new B());
		a.method(new C());
	}

}

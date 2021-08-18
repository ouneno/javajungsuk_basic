package ch7;

// 모든 클래스는 최상위 클래스인 Object를 상속받는다
class Cafe /*extends Object*/ {
	String americano;
}

public class toString {

	public static void main(String[] args) {
		Cafe cafe = new Cafe();
		
		/* 
		 * Object는 모든 클래스가 상속받기때문에,
		 * Object에 존재하는 11개의 메서드 사용이 가능하다.
		 * 대표적으로 toString()
		 * toString()의 경우 문자열을 반환하며,
		 * 클래스이름 + @ + 객체의 주소값을 출력한다.
		*/ 
		System.out.println(cafe.toString());
		System.out.println(cafe); // toString과 같은 결과값
	}

}

package ch7;

// 오버라이딩 : 상속받은 메서드의 내용을 변경하는 것

class calandar extends Object {
	int yy;
	int mm;
	int dd;
	
	// 생성자 추가
	calandar(int yy, int mm, int dd){
		this.yy = yy;
		this.mm = mm;
		this.dd = dd;
	}
	
	// Object클래스의 toString()을 오버라이딩
	public String toString() {
		return "yy: "+yy+", mm: "+mm+", dd: "+dd;
	}
}

public class OverridingToString {

	public static void main(String[] args) {
		
		// c.yy, c.mm, c.dd 보다 더 간편히
		calandar c = new calandar(2021, 8, 18);
		System.out.println(c);
		
		// 오버라이딩 한 toString 메서드를 출력한다.
		// System.out.println(c.toString());
		
//		c.yy = 2021;
//		c.mm = 8;
//		c.dd = 18;
//		System.out.println("c.yy = "+c.yy);
//		System.out.println("c.mm = "+c.mm);
//		System.out.println("c.dd = "+c.dd);

	}

}

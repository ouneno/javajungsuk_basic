package ch1;

class Gummy{
	
	String name;
	int price;
	static int width = 15;
	static int height = 35;
	
}

public class test01_01 {
	
	public static void main(String[] args) {
		
		// Gummy 클래스에서 static변수(클래식변수)로 지정
		System.out.println("Gummy의 가로너비 : "+Gummy.width);
		System.out.println("Gummy의 높이 : "+Gummy.height);
		
		// Gummy 클래스의 새 인스턴스 생성
		Gummy g1 = new Gummy();
		
		// g1인스턴스의 name과 price 새 선언
		g1.name = "grapeGummy";
		g1.price = 1700;
		
		System.out.println("g1의 이름 : "+g1.name);
		System.out.println("g1의 가격 : "+g1.price);
		System.out.println("g1의 너비 : "+g1.width);
		System.out.println("g1의 높이 : "+g1.height);
		
		// Gummy 클래스의 새 인스턴스 생성
		Gummy g2 = new Gummy();
		
		// g2인스턴스의 name과 price 새 선언
		g2.name = "strawberryGummy";
		g2.price = 3400;
		
		// 너비와 높이도 변경 함
		g2.width = 30;
		g2.height = 45;

		System.out.println("g2의 이름 : " + g2.name);
		System.out.println("g2의 가격 : " + g2.price);
		System.out.println("g2의 너비 : " + g2.width);
		System.out.println("g2의 높이 : "+g2.height);
		
		System.out.println("g1의 너비(변경안됨) : "+g1.width);
		System.out.println("g1의 높이(변경안됨) : "+g1.height);

	}

}

package ch2;

// 형변환
public class CastingEx1 {

	public static void main(String[] args) {
		
		// double을 int로 형변환
		double d = 149.392;
		int number = (int)d;
		
		System.out.println("[double을 int로 형변환하기]");
		System.out.println("d = "+d);
		System.out.println("number = "+number);
		
		// int를 double로 형변환하기
		int price = 3000;
		double d2 = (double)price;
		
		System.out.println("\n[int를 double로 형변환하기]");
		System.out.println("price = "+price);
		System.out.println("d2 = "+d2);

	}

}

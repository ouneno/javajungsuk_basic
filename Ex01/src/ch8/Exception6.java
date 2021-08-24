package ch8;

public class Exception6 {

	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);				
			System.out.println(0/0);	// 정수를 0으로 나눌시 Exception 발생
			System.out.println(4);
		} catch (ArithmeticException ae) {
			if (ae instanceof ArithmeticException)
				System.out.println("instance of : <<true>>");
			System.out.println("<<ArithmeticException 발생>>");
		} catch (Exception e) {
			System.out.println("<<Exception 발생>>");
		}
		
		System.out.println(5);

	}

}

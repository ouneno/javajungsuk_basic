package ch4;

public class FlowEx1 {

	public static void main(String[] args) {
		
		// int를 통한 if 조건문
		// [==], [!=] 사용
		int age = 29;
		
		if(age==29) {
			System.out.println("나이는 29살입니다.");
		} else if(age!=29) {
			System.out.println("29살 나이가 아닙니다");
		}
		
		// String을 통한 if 조건문
		// str.equals(""); 대소문자 구분 함
		// str.equalsIgnoreCase(""); 대소문자 구분 안함
		String name = "youla";
		
		if(name.equals("youla")) {
			System.out.println("youla 입니다.");
		}
		
		if(name.equalsIgnoreCase("YOULA")) {
			System.out.println("YOULA 입니다.");
		}

	}

}

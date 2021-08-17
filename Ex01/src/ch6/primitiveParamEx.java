package ch6;

// 기본형 매개변수
//class Data {
//	int x;
//}

class primitiveParamEx {
	public static void main(String[] args) {
		
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = "+d.x);
		
		change(d.x);
		System.out.println("\nchange(d.x) 메서드 실행 후");
		System.out.println("=> main() : x = "+d.x);		

	}

	static void change(int x) {
		
		x = 1000;
		System.out.println("change() : x = "+x);
		
	}

}

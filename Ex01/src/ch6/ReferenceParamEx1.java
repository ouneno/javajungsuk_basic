package ch6;

//class Data {
//	int x;
//}

class ReferenceParamEx1 {

	public static void main(String[] args) {

		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);

		change(d);
		System.out.println("\nchange(d) 메서드 실행 후");
		System.out.println("=> main() : x = " + d.x);

	}

	static void change(Data d) {
		d.x = 1000;
		System.out.println("change() : x = " + d.x);
	}

}

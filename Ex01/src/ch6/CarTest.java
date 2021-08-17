package ch6;

class Car {

		String color;
		String gearType;
		int door;
		
		// 기본 생성자
		Car() {
		}
		
		// 생성자초기화
		Car(String c, String g, int d){
			color = c;
			gearType = g;
			door = d;
		}

}

class CarTest {
	
	public static void main(String[] args) {
		
		// 기본 생성자 호출 후 값 지정
		Car c1 = new Car();
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;
		
		// 생성자초기화 진행 (훨씬 더 간편함)
		Car c2 = new Car("black", "auto", 4);
		
		System.out.println("c1의 color = " +c1.color+ ", gearType = " +c1.gearType+ ", door = " +c1.door);
		System.out.println("c2의 color = " +c2.color+ ", gearType = " +c2.gearType+ ", door = " +c2.door);
	}
	
}

package ch6;

// 예시, 생성자 관련 CarTest 참고하여 직접 기술함
class Card {

		String color;
		String shape;
		int number;
		
		Card() {
		}
		
		Card(String c, String s, int n) {
			color = c;
			shape = s;
			number = n;
		}

}

class CardTest {
	
	public static void main(String[] args) {
		
		Card c1 = new Card();
		c1.color = "yellow";
		c1.shape = "square";
		c1.number = 8;
		
		Card c2 = new Card("black", "heart", 4);
				
		System.out.println("c1의 color = " +c1.color+ ", shape = " +c1.shape+ ", number = " +c1.number);
		System.out.println("c2의 color = " +c2.color+ ", shape = " +c2.shape+ ", number = " +c2.number);
	}
	
}

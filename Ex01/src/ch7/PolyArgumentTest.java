package ch7;

class Product {
	int price;
	int bonusPoint;
	
	Product(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class Television extends Product {
	Television() {
		super(100);
	}
	
	public String toString() {
		return "Television";
	}
}

class Computer extends Product {
	Computer() {
		super(200);
	}
	
	public String toString() {
		return "Computer";
	}
}

class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	
	void buy(Product p) {
		if(money < p.price ) {
			System.out.println("잔액 부족으로 물품을 구매하실 수 없습니다");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "을(를) 구매하였습니다.");
	}
}

class PolyArgumentTest {
	public static void main(String args[]) {
		Buyer b = new Buyer();
		
		b.buy(new Television());
		b.buy(new Computer());
		
		System.out.println("\n현재 남은 돈은 "+b.money+"만원입니다.");
		System.out.println("현재 보너스점수는 "+b.bonusPoint+"점 입니다");
	}
}
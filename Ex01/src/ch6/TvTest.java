package ch6;

	class Tv {
		String color;	// 색상
		boolean power;	// 전원(on & off)
		int channel;	// 채널
		
		void power() {
			power = !power;
		}
		
		void channelUp() {
			++channel;
		}
		
		void channelDown() {
			--channel;
		}
	}

	class TvTest {
		public static void main(String[] args) {
			Tv t; 				// Tv 인스턴스를 참조하기 위한 t 선언
			t = new Tv();		// Tv 인스턴스 생성
			t.channel = 7;		// Tv 인스턴스의 멤버변수를 7로 선언
			t.channelDown();	// Tv인스턴스의 메서드를 호출
			System.out.println("현재 채널은 " +t.channel+ " 입니다.");
		}
	}

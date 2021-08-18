class Tv {
	
	boolean power;
	int channel;
	
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

// Caption : 자막
class CaptionTv extends Tv {
	
	boolean caption; // 자막의 on&off
	
	void displayCaption(String text) {
		if (caption) {
			System.out.println(text);
		}
	}
}

class CaptionTvTest {

	public static void main(String[] args) {
		
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10;
		ctv.channelUp(); // channelUp 메서드 실행으로 1증가
		System.out.println(ctv.channel);

		// boolean Type의 경우 기본이 false로 되어있기에 출력안됨
		// ctv.caption = true; : true로 할 경우 출력 됨
		ctv.displayCaption("Hello, World!");
		ctv.caption = true;
		ctv.displayCaption("Hello, World!");

	}

}

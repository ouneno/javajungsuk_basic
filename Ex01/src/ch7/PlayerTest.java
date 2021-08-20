package ch7;

abstract class Player {	// 추상클래스(미완성 클래스, 미완성 설계도)
	abstract void play(int pos); // 추상메서드(미완성 메서드)
	abstract void stop(); // 추상메서드(선언부만 있고 구현부 없음)
}

// Player 추상클래스를 상속받음
class AudioPlayer extends Player {
	
	// 구현부{} 작성
	void play(int pos) {
		System.out.println(pos+"위치부터 play합니다.");
	}
	// 구현부{} 작성
	void stop() {
		System.out.println("재생을 멈춥니다.");
	}
	
}

public class PlayerTest {

	public static void main(String[] args) {
//		Player p = new player();
		
		// 둘 다 사용가능 -> 다형성에 의거한다.
//		AudioPlayer ap = new AudioPlayer();
		Player ap = new AudioPlayer();
		
		ap.play(200);
		ap.stop();

	}

}

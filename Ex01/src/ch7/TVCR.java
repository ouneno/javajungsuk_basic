package ch7;

class SamsungTV {
	
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

class VCR {
	
	boolean power;
	int counter = 0;
	
	void power() {
		power = !power;
	}
	void play() {
	}
	void stop() {
	}
	void rew() {		
	}
	void ff() {
	}
}

// SamsungTV를 extends로 상속받음
class TVCR extends SamsungTV{
	
	// VCR 객체는 새로운 클래스로 지정하여 메서드를 호출해 사용
	VCR vcr = new VCR();
	
	void play() {
		vcr.play();
	}
	
	void stop() {
		vcr.stop();
	}
	
	void rew() {
		vcr.rew();
	}
	
	void ff() {
		vcr.ff();
	}
}

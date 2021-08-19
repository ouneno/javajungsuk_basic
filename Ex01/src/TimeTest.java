public class TimeTest {

	public static void main(String[] args) {
		Time t = new Time(12, 35, 30);
		System.out.println("t : "+t);
		
		//t.hour = 13;
		t.setHour(t.getHour()+1);
		System.out.println(t);
	}
}

class Time {
	
	// private : 같은 클래스 내에서만 접근 가능
	// 접근제어자를 사용하는 이유
	// 1. 외부로부터의 데이터 보호
	// 2. 메서드를 통한 간접접근 허용 (값을 보호한다)
	private int hour, minute, second;
	
	// (default) 같은 클래스, 같은 패키지 내에서 접근 가능
	Time(int hour, int minute, int second){
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}

	public int getHour() {
		return hour;
	}
	
	// iv를 private 접근 제어자를 통해 막고,
	// 메서드를 통하여 거른다.
	public void setHour(int hour) {
		// hour가 0보다 작거나 23이상일경우 return; 빠져나옴
		if (hour < 0 || hour > 23 ) 
			return;
		this.hour = hour;
	}
	
	public int getMinute() {
		return minute;
	}
	
	public void setMinute(int minute) {
		if (minute < 0 || minute > 59)
			return;
		this.minute = minute;
	}
	
	public int getSecond() {
		return second;
	}
	
	public void setSecond(int second) {
		if (second < 0 || second >59)
			return;
		this.second = second;
	}
	
	public String toString() {
		return hour + ":" + minute + ":" + second;
	}
	
}

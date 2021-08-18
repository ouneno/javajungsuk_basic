package ch7;

// 오버라이딩 : 상속받은 메서드의 내용을 변경하는 것

class time {
	int hour;
	int minute;
	
	String getLocaion() {
		return "hour: "+hour+", minute: "+minute;
	}
}

class day extends time {
	int day;
	
	String getLocaion() {
		return "hour: "+hour+", minute: "+minute+", day: "+day;
	}
}

class Overriding {

	public static void main(String[] args) {
		day d = new day();
		
		d.hour = 3;
		d.minute = 36;
		d.day = 28;
		
		System.out.println("d.hour = "+d.hour);
		System.out.println("d.minute = "+d.minute);
		System.out.println("d.day = "+d.day);

	}

}

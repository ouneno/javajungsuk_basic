package ch8;

public class FinallyTest {

	public static void main(String[] args) {
		
		try {
			startInstall();
			copyFiles();
//			deleteTempFiles();
		} catch (Exception e) {
			e.printStackTrace();
			deleteTempFiles();
		}
	}
	
	static void startInstall() {
		System.out.println("파일 설치를 실행합니다.");
	}
	
	static void copyFiles() {
		System.out.println("파일 복사를 실행합니다.");
	}
	
	static void deleteTempFiles() {
		System.out.println("파일 삭제를 실행합니다.");
	}
	
}

package ch8;

// 사용자정의 exception 만들기
public class NewExceptionTest {

	public static void main(String[] args) {
		
		try {
			startInstall();
			copyFiles();
		
		} catch (SpaceException e){
			System.out.println("에러 메세지 : "+e.getMessage());
			System.out.println();
			e.printStackTrace();
			System.out.println("\n공간을 확보한 후에 다시 설치하시기 바랍니다.");
		
		} catch (MemoryException me) {
			System.out.println("에러 메세지 : "+me.getMessage());
			System.out.println();
			me.printStackTrace();
			System.gc();
			System.out.println("\n재설치를 시도해주세요.");
		
		} finally {
			deleteTempFiles();	// try-catch문 종료시 반드시 실행해야 할 메서드
		}
	}
	
	// startInstall() 메서드 실행
	static void startInstall() throws SpaceException, MemoryException {
		
		// 공간이 부족할 경우
		if(!enoughSpace())
			throw new SpaceException("설치할 공간이 부족합니다.");
		
		// 메모리가 부족할 경우
		if(!enoughMemory())
			throw new MemoryException("메모리가 부족합니다.");
	}
	
	static void copyFiles() {
		System.out.println("copyFiles() 메서드 실행 : 파일을 복사합니다.");
	}
	
	static void deleteTempFiles() {
		System.out.println("deleteTempFiles() 메서드 실행 : 파일을 삭제합니다.");
	}
	
	static boolean enoughSpace() {
		return true;
	}
	
	static boolean enoughMemory() {
		return false;
	}
}

// SpaceException 생성
class SpaceException extends Exception {
	
	SpaceException(String msg){
		super(msg);
	}
}

// MemoryException 생성
class MemoryException extends Exception {
	MemoryException(String msg) {
		super(msg);
	}
	
}
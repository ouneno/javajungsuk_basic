package ch5;

public class ArrayEx1 {

	public static void main(String[] args) {
		
		int[] birth = new int[6];
		
		birth[0] = 9;
		birth[1] = 3;
		birth[2] = 0;
		birth[3] = 5;
		birth[4] = 1;
		birth[5] = 1;
		
//		System.out.println("birth[0] : "+birth[0]);
//		System.out.println("birth[1] : "+birth[1]);
//		System.out.println("birth[2] : "+birth[2]);
//		System.out.println("birth[3] : "+birth[3]);
//		System.out.println("birth[4] : "+birth[4]);
//		System.out.println("birth[5] : "+birth[5]);
		
//		for(int i=0; i<6; i++) {
//			System.out.println("birth["+i+"] : "+birth[i]);
//		}
		
		for(int j=0; j<birth.length; j++) {
			System.out.println("birth["+j+"] : "+birth[j]);
		}
		
		int a = birth[0];
		System.out.println("a : "+a);
	}

}

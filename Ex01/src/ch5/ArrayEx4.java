package ch5;

import java.util.Arrays;

public class ArrayEx4 {

	public static void main(String[] args) {
		
		String[] arr = {"가위", "바위", "보"};
		System.out.println("Arrays.toString 출력시 : "+Arrays.toString(arr));

		for(int i=0; i<arr.length; i++) {
			int tmp = (int)(Math.random()*3);
			System.out.println(arr[tmp]);
		}
		
	}

}

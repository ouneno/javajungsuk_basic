package ch5;

public class ArrayEx3 {

	public static void main(String[] args) {

		int[] score = {51,95,22,38,69,83};
		int max = score[0];
		int min = score[0];
		
		for(int i=1; i<score.length; i++) {
			
			if(score[i] > max) {
				max = score[i];
			} else if(score[i] < min) {
				min = score[i];
			}
		}
		
		System.out.println("max : "+max);
		System.out.println("min : "+min);
	}
}
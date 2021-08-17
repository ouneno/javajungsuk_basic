package ch5;

public class ArrayEx2 {

	public static void main(String[] args) {
		
//		int sum = 0;
//		float average;
//		
//		int[] score = {100,95,97,86,92};
//		
//		for (int i=0; i<score.length; i++) {
//			sum += score[i];
//		}
//		
//		average = sum/(float)score.length;
//		
//		System.out.println("합계 : "+sum);
//		System.out.println("평균 : "+average);
//		
//		int sum = 0;
//		float average = 0;
//		int[] height = {164, 170, 158, 155, 163};
//		
//		for(int i=0; i<height.length; i++) {
//			sum += height[i];
//		}
//		
//		average = sum / (float)height.length;
//		
//		System.out.println("총 키 : "+sum);
//		System.out.println("평균 키 : "+average);
//		
//	}
		
		int sum = 0;
		float average = 0;
		int[] score = {100,94,60,88,64};
		
		for(int i=0; i<score.length; i++) {
			sum += score[i];
		}
		
		average = sum / (float)score.length;
		
		System.out.println("총 점수 : "+sum);
		System.out.println("평균 : "+average);
	}
}

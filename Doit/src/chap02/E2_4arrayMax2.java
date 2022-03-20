package chap02;

import java.util.Random;

public class E2_4arrayMax2 {

	public static void main(String[] args) {
		//배열요소의 최대값구하기 난수버전
		System.out.println("키의 최대값을 구합니다");
		Random ran = new Random();		
		int num = 1+ran.nextInt(10);
		int[] height = new int[num];
		
		for(int i=0; i<num; i++) {
			height[i]=100+ran.nextInt(90);
		}
		
		int max = maxOf(height);
		for(int i=0; i<num; i++) {
			System.out.println(height[i]);
		}
		System.out.println("사람수는"+num);
		System.out.println("max는"+max);
	}

	private static int maxOf(int[] height) {
		int max=height[0];
		for(int i=0; i<height.length; i++) {
			if(height[i]>max)
				max=height[i];
		}
		return max;
	}


}

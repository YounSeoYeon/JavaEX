package chap02;

import java.util.Scanner;

public class E2_4arrayMax {

	public static void main(String[] args) {
		//배열요소의 최대값구하기
		
		Scanner sc = new Scanner(System.in);
		System.out.println("키의 최대값을 구합니다");
		int num = sc.nextInt();
		
		int[] height = new int[num];
		for(int i=0; i<num; i++) {
			height[i]=sc.nextInt();
		}
		
		int max = maxOf(height);
		for(int i=0; i<num; i++) {
			System.out.println(height[i]);
		}
		
		System.out.println("max는"+max);
		sc.close();
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

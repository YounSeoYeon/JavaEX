package chap02;

import java.util.Scanner;

public class E2_4arrayMax {

	public static void main(String[] args) {
		//�迭����� �ִ밪���ϱ�
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ű�� �ִ밪�� ���մϴ�");
		int num = sc.nextInt();
		
		int[] height = new int[num];
		for(int i=0; i<num; i++) {
			height[i]=sc.nextInt();
		}
		
		int max = maxOf(height);
		for(int i=0; i<num; i++) {
			System.out.println(height[i]);
		}
		
		System.out.println("max��"+max);
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

package ����;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int max = -100000;
		int min = 100000;
		
		System.out.println("������ ���� : ");
		int n = sc.nextInt();
		int[] ms = new int[n];
		
		System.out.println("�����Է� : ");
		for(int i=0; i<n; i++) {
			ms[i] = sc.nextInt();
			if(ms[i]<min) {
				min = ms[i];
			}
			if(ms[i]>max) {
				max = ms[i];
			}
		}		
		System.out.printf("�ּҰ� : %d, �ִ밪 : %d\n",min,max);		
		sc.close();
	}
}

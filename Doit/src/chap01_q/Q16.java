package chap01_q;

import java.util.Scanner;

public class Q16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력 : ");
		int n = sc.nextInt();
		
		triWE(n);
		triMIT(n);
		spira(n);
		
		sc.close();
	}

	private static void triWE(int n) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<n-i; j++) {
				System.out.print("*");				
			}
			System.out.println();
		}
	}

	//mid,mid보다 작은거,mid보다 큰거
	private static void spira(int n) {
		for (int i=1; i<=n; i++) { 					// i행 (i = 1, 2, … ,n)
			for (int j=1; j<=n-i+1; j++) 		// n-i+1개의 ' '를 나타냄
				System.out.print(' ');
			for (int j=1; j<=(i-1)*2+1; j++) 	// (i-1)*2+1개의 '*'를 나타냄
				System.out.print('*');
			System.out.println(); 						// 개행(줄변환)
		}
	}


	private static void triMIT(int n) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-i-1; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

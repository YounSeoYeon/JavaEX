package chap01_q;

import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력 : ");
		int x = sc.nextInt();
		trianleRB(x);
		System.out.println();
		trianleRU(x);
		System.out.println();
		triangleLB(x);
		System.out.println();
		trianleLU(x);
		
		sc.close();
		
	}

	private static void trianleRB(int x) {		
		for(int i=0; i<x; i++) {
			for(int j=0; j<=i; j++)
				System.out.print("*");
			System.out.println();
		}
	}

	private static void trianleRU(int x) {
		for(int i=0; i<x; i++) {
			for(int j=x; j>i; j--)
				System.out.print("*");
			System.out.println();
		}
	}


	private static void triangleLB(int x) {
		for (int i=1; i<=x; i++) { 				// i행 (i = 1, 2, … ,n)
			for (int j=1; j<=i-1; j++) 		// i-1개의 ' '를 나타냄
				System.out.print(' ');
			for (int j=1; j<=x-i+1; j++) 	// n-i+1개의 '*'를 나타냄
				System.out.print('*');
			System.out.println();					// 개행(줄변환)
		}
	}
	

	private static void trianleLU(int x) {
		for (int i=1; i<=x; i++) { 				// i행 (i = 1, 2, … ,ln)
			for (int j=1; j<=x-i; j++) 		// n-i개의 ' '를 나타냄
				System.out.print(' ');
			for (int j=1; j<=i; j++) 			// i개의 '*'를 나타냄
				System.out.print('*');
			System.out.println(); 					// 개행(줄변환)
		}
	}

}

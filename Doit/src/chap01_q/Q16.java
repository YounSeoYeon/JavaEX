package chap01_q;

import java.util.Scanner;

public class Q16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�����Է� : ");
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

	//mid,mid���� ������,mid���� ū��
	private static void spira(int n) {
		for (int i=1; i<=n; i++) { 					// i�� (i = 1, 2, �� ,n)
			for (int j=1; j<=n-i+1; j++) 		// n-i+1���� ' '�� ��Ÿ��
				System.out.print(' ');
			for (int j=1; j<=(i-1)*2+1; j++) 	// (i-1)*2+1���� '*'�� ��Ÿ��
				System.out.print('*');
			System.out.println(); 						// ����(�ٺ�ȯ)
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

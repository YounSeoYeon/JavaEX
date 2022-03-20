package chap01_q;

import java.util.Scanner;

public class MyEX1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		one(x);
		two(x);
		three(x);
		
		sc.close();
	}

	private static void three(int x) {
		System.out.println("»ï°¢Çü");
		for(int i=1; i<=x; i++) {
			for(int j=1; j<=x-i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<=(i-1)*2+1; j++) {
				System.out.print(j);
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void two(int x) {
		// TODO Auto-generated method stub
		
	}

	private static void one(int x) {
		// TODO Auto-generated method stub
		
	}

}

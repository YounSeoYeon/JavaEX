package ¼ö¾÷;

import java.util.Scanner;

public class Main10 {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		
		if(isPrime(A))
			System.out.println("True");
		else
			System.out.println("False");
		
		sc.close();		
	}

	public static boolean isPrime(int a) {
		if(a<2) return false;
		for(int i=2; i<a; i++) {
			if(a%i==0)
				return false;
		}
		return true;
	}
}

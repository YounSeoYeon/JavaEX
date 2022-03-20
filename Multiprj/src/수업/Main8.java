package ¼ö¾÷;

import java.util.Scanner;

public class Main8 {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int x,y,z = 0;
		
		x = B/100;
		y = (B/10)%10;
		z = ((B%10)%10);
		
		System.out.println(A*z);
		System.out.println(A*y);
		System.out.println(A*x);
		System.out.println(A*z+(A*y)*10+(A*x)*100);
		sc.close();
	}
}

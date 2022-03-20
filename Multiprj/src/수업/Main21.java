package ¼ö¾÷;

import java.util.Scanner;

public class Main21 {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int total = 0;
		int i=0;
		for(i=1; i<=a; i++) {
			total += i;
			if(total>a)
				break;
		sc.close();
		}
		
		System.out.println(i);
	}

}

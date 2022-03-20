package ¼ö¾÷;

import java.util.Scanner;

public class Main16 {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if(a%400==0 && a%4==0)
			System.out.println("Leap Year");
		else if(a%4==0 && a%100==0 && a%4!=400)
			System.out.println("Not Leap Year");
		else if(a%4==0)
			System.out.println("Leap Year");
		else
			System.out.println("Not Leap Year");
		
		
		sc.close();
	}

}

package ¼ö¾÷;

import java.util.Scanner;

public class Main15 {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for(int i=1; i<a+1; i++) {
			if(i%3==0)
				System.out.print("X ");
			else
			System.out.printf("%d ",i);
		}
		
		sc.close();
	}

}

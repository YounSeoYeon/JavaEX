package ¼ö¾÷;

import java.util.Scanner;

public class Main19 {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i=1; i<7; i++) {
			for(int j=6; j>0; j--) {
				if(i+j==a)
					System.out.printf("%d %d\n",i,j);
			}
		}
		
		sc.close();
	}

}

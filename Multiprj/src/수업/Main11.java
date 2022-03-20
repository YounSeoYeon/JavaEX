package ¼ö¾÷;

import java.util.Scanner;

public class Main11 {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		
		for(int i=1; i<n+1; i++) {
			if(n%i==0)
				count += i;
		}
		
		System.out.println(count);
		sc.close();
	}

}

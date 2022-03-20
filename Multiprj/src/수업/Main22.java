package ¼ö¾÷;

import java.util.Scanner;

public class Main22 {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int kw = sc.nextInt();
		if( kw < 100 ) System.out.printf("%.2f\n", kw * 0.5 / 100);
		else if( kw >= 100 && kw < 200 ) System.out.printf("%.2f\n", kw * 0.7 / 100);
		else if( kw >= 200 && kw < 300 ) System.out.printf("%.2f\n", kw * 0.9 / 100);
		else if( kw >= 300 ) System.out.printf("%.2f\n", kw * 1.0 / 100);

		
	}

}

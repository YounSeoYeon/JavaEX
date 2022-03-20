package ¼ö¾÷;

import java.util.Scanner;

public class Main14 {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		float avg = (float)(a+b+c)/3;
		
		if(avg >= 90)
			System.out.printf("%.2f A\n",avg);
		else if(avg >= 80)
			System.out.printf("%.2f B\n",avg);
		else if(avg >= 70)
			System.out.printf("%.2f C\n",avg);
		else if(avg >= 60)
			System.out.printf("%.2f D\n",avg);
		else
			System.out.printf("%.2f F\n",avg);
		
		sc.close();
	}

}

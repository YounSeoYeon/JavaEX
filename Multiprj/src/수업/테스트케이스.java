package 수업;

import java.util.Scanner;

public class 테스트케이스 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t,a,b;
		t = sc.nextInt();
		
		for(int i=0; i<t; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.printf("%d\n",a+b);
		}
		sc.close();
	}

}
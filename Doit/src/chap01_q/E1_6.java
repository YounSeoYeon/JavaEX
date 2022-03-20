package chap01_q;

import java.util.Scanner;

public class E1_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		
		System.out.println("1부터 x까지의 합을 구합니다");
		do{
			System.out.print("x의 값 : ");
			x = sc.nextInt();
			System.out.println(x);
		}while(x<=0);
		
		int sum=0;
		for(int i=1; i<=x; i++) {
			sum += i;
		}
		System.out.println("1부터 "+x+"까지의 합은 "+sum+"입니다");
		sc.close();
	}

}

package chap01_q;

import java.util.Scanner;

public class E1_6dif {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1부터 x까지의 합을 구합니다");
		System.out.print("x의 값 : ");
		int x = sc.nextInt();
		
		while(x<=0) {
			System.out.println(x);
			System.out.print("x의 값 :");
			x=sc.nextInt();
		}
		
		int sum=0;
		for(int i=1; i<=x; i++) {
			sum += i;
		}
		System.out.println("1부터 "+x+"까지의 합은 "+sum+"입니다");
		sc.close();
	}

}

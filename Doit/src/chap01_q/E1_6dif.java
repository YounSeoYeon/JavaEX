package chap01_q;

import java.util.Scanner;

public class E1_6dif {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1���� x������ ���� ���մϴ�");
		System.out.print("x�� �� : ");
		int x = sc.nextInt();
		
		while(x<=0) {
			System.out.println(x);
			System.out.print("x�� �� :");
			x=sc.nextInt();
		}
		
		int sum=0;
		for(int i=1; i<=x; i++) {
			sum += i;
		}
		System.out.println("1���� "+x+"������ ���� "+sum+"�Դϴ�");
		sc.close();
	}

}

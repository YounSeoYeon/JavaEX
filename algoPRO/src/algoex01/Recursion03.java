package algoex01;

import java.util.Scanner;

public class Recursion03 {
	
	//�Է��� ����ŭ �Ǻ���ġ ���� �����ؼ� ���
	
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ���� �Է� : ");
		int x = sc.nextInt();
		
		for(int i=1; i<=x; i++) {
			System.out.print(pi(i)+" ");
		}
	}
	
	static int pi(int n) {
		
		if(n==1 || n==2) {
			return 1;
		}
		
		else {
			return pi(n-1)+pi(n-2);
		}
	}

}

package algoex01;

import java.util.Scanner;

public class Recursion03 {
	
	//입력한 수만큼 피보나치 수열 생성해서 출력
	
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		System.out.println("항의 갯수 입력 : ");
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

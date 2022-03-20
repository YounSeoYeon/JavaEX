package chap01_q;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하세요 : ");
		int x = sc.nextInt();
		System.out.print("두번째 숫자를 입력하세요 : ");
		int y = sc.nextInt();
		
		System.out.println(x+"부터"+y+"까지의 합 : "+sumof(x,y));
		sc.close();
	}

	private static int sumof(int x, int y) {
		int min=Integer.MIN_VALUE;
		int max=Integer.MAX_VALUE;
		if(x>y) {
			min = y;
			max = x;
			}
		else {
			min = x;
			max = y;
			}
		
		int sum=0;
		for(int i=min; i<=max; i++) {
			sum += i;
		}
		return sum;
				
	}

}

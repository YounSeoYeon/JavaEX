package chap01_q;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ���ڸ� �Է��ϼ��� : ");
		int x = sc.nextInt();
		System.out.print("�ι�° ���ڸ� �Է��ϼ��� : ");
		int y = sc.nextInt();
		
		System.out.println(x+"����"+y+"������ �� : "+sumof(x,y));
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

package chap01_q;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ���ڸ� �Է��ϼ��� : ");
		int x = sc.nextInt();
		
		System.out.println(x+"������ �� : "+sum(x));
		sc.close();
	}

	private static int sum(int x) {
//		int sum = (x+1)*x/2;
		int sum = (x+1)*(x/2)+(x%2==1?(x+1)/2:0);
		return sum;
	}
	
	//(x+1)*(x/2)+(x%2==1?(x+1)/2:0);

}

package ����;

import java.util.Scanner;

public class ������ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		if(n<1 || n>9) {
			System.out.println("�����ʰ�");
			return;
		}
		for(int i=0; i<9; i++) {
			System.out.printf("%d * %d = %d\n",n,i+1,n*(i+1));
		}
	}

}

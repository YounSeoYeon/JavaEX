package ����;

import java.util.Scanner;

public class �ձ��ϱ� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int total = 0;
		
		if(n<1 || n>10000) {
			System.out.println("�ʰ�");
			return;
		}
		
		for(int i=0; i<n; i++) {
			total +=i+1; 
		}
		System.out.printf("%d",total);
	}

}

package ����;

import java.util.Scanner;

public class Main20�ִ밪���ϱ� {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int max = -1;
		int count = 0;
		
		for(int i=1; i<a+1; i++) {
			int num = sc.nextInt();
			if(num>max) {
				max = num;
				count = i;
			}
		}
		System.out.printf("%d %d\n",max,count);
		
		sc.close();
	}

}

package 다차원배열;

import java.util.Scanner;

public class 숫자바꾸기연습 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		int r,m=0;
		while(a!=0) {
			r=a%10;
			a=a/10;
			m=m*10+r;
		}
		System.out.println(m);
		sc.close();
	}

}

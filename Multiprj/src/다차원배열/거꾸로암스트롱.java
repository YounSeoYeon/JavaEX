package 다차원배열;

import java.util.Scanner;

public class 거꾸로암스트롱 {

	static boolean ar(int a) {
		int q = a;
		int r,num=0;
		
		while(q!=0) {
			r=q%10;
			q=q/10;
			num += Math.pow(r, 3);
		}		
		return num==a;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for(int i=a; i<=b; i++) {
			boolean ret = ar(i);
			if(ret) System.out.print(i+" ");
		}
		sc.close();
	}

}

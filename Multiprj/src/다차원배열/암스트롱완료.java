package 다차원배열;

import java.util.Scanner;

public class 암스트롱완료 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for(int i=a; i<=b; i++) {
			if(reboot(i))
				System.out.println(i);
		}
		sc.close();
	}

	private static boolean reboot(int a) {
		int q = a;
		int r,num = 0;
		while(q!=0) {
			r=q%10;
			q=q/10;
			
			num += Math.pow(r, 3);			
		}
		if(num==a) {return true;}
		else {return false;}
	}
}

package 수업;

import java.util.Scanner;

public class 구구단 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		if(n<1 || n>9) {
			System.out.println("숫자초과");
			return;
		}
		for(int i=0; i<9; i++) {
			System.out.printf("%d * %d = %d\n",n,i+1,n*(i+1));
		}
	}

}

package 다차원배열;

import java.util.Scanner;

public class 공백넣기4완료 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String[][] space = new String[n][2*n-1];
		for(int i=0; i<n; i++) {
			for(int j=0; j<2*n-1; j++) {
			space[i][j]="";
			}
		}
		
		int mid = (int)(2*n-1)/2;
		for(int i=0; i<n; i++) {
			for(int j=0; j<mid; j++) {
				space[i][j]=" ";
			}
			for(int j=mid-i; j<(mid-i)+2*(i+1)-1; j++) {
				space[i][j]="*";
			}
		}
		for(int i=0;i<n; i++) {
			System.out.println(String.join("", space[i]));
		}
		sc.close();
						
	}

}

package �������迭;

import java.util.Scanner;

public class ����ֱ�2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		String[][] space = new String[a][a];
		for(int i=0; i<a; i++) {
			for(int j=0; j<a; j++) {
			space[i][j]="";
			}
		}
		
		for(int i=0; i<a; i++) {
			for(int j=a-1-i; 0<=j; j--) {
				space[i][j]="*";
				System.out.print(space[i][j]);
				}
			System.out.println();
		}
		sc.close();
}

}

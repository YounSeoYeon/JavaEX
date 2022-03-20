package 수업;

import java.util.Scanner;

public class 작은수 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] a = new int[n];
		
		if(n<1 || n>10000 || x<1 || x>10000) {
			System.out.println("초과");
			return;
		}
		
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			if(a[i]<x) {
				System.out.printf("%d ",a[i]);
			}
			
		}
	}

}

package chap02;

import java.util.Random;
import java.util.Scanner;

public class Q4_copy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		int num = sc.nextInt();
		int[] a = new int[num];
		
		for(int i=0; i<num; i++) {
			a[i] = 1+ran.nextInt(100);
		}
		
		int[] b = new int[num];
		copy(a,b);
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]);
			System.out.println(b[i]);
		}
		
		rcopy(a,b);
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]);
			System.out.println(b[i]);
		}
		sc.close();
	}

	private static void rcopy(int[] a, int[] b) {
		for(int i=0; i<a.length; i++) {
			b[a.length-i-1]=a[i];
		}
	}

	private static void copy(int[] a, int[] b) {
		for(int i=0; i<a.length; i++) {
			b[i]=a[i];
		}
	}

}

package 다차원배열;

import java.util.ArrayList;
import java.util.Scanner;

public class 한수갯수찾기 {
	
	static boolean ishansu(int n) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		if(n==1000) return false;
		int q = n;
		int r = 0;
		while(q!=0) {
			numbers.add(q%10);
			q/=10;
		}
		
		int d1 = numbers.get(0)-numbers.get(1);
		int d2 = numbers.get(1)-numbers.get(2);
		
		if(d1==d2) return true;
		else return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n<100) {
			System.out.println(n);
			return;
		}
		
		int cun=99;
		for(int i=100; i<=n; i++) {
			if(ishansu(i))cun++;
		}
		System.out.println(cun);
		
	}

}

package 수업;

import java.util.Scanner;

public class Main18sqrt사용 {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int count = 0;
		int[] x = new int[a];
		for(int i=0; i<a; i++) {
			x[i] = sc.nextInt();
			if((Math.sqrt(x[i])-(int)Math.sqrt(x[i])==0))
				count++;
		}
		System.out.println(count);
		sc.close();
	}

}

package 수업;

import java.util.Scanner;

public class 와일문 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println(a+b);			
		}
		System.out.println("끝");
	}

}

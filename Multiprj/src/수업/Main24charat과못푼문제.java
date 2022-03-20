package 수업;

import java.util.Scanner;

public class Main24charat과못푼문제 {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		str = str.toUpperCase();
		
		int [] check = new int[26];
		for(int i=0; i<str.length(); i++) {
			check[str.charAt(i)-65]++;
//			System.out.println(check[str.charAt(i)-65]);
		}
		
		sc.close();
		int max = 0;
		int idx = 0;
		for(int i=0; i<check.length; i++) {
			if(max < check[i]) {
				max = check[i];
				idx = i;
			}
		}
		for(int i=0; i<check.length; i++) {
			if(max == check[i] && idx !=i) {
				System.out.println("?");
				return;
			}
		}
		System.out.printf("%c\n",idx+65);

	}

}

package 수업;

import java.util.Scanner;

public class Loop3 {

	public static void main(String[] args) {
		/*
		 * # 반복문 종료(-100)
		 * 
		 * 1. 무한 반복을 하면서 숫자를 입력받는다.
		 * 2. 입력한 숫자가 -100이면, 프로그램은 종료된다.
		 * 예)
		 * 숫자 입력[EXIT:-100] : 1
		 * 숫자 입력[EXIT:-100] : 3
		 * 숫자 입력[EXIT:-100] : 4
		 * 숫자 입력[EXIT:-100] : -100
		 * 프로그램 종료
		 * 
		 */  
		
		int x = 0;
		while(x != -100) {
			Scanner sc = new Scanner(System.in);
			x = sc.nextInt();
			System.out.printf("숫자입력[EXIT:-100] : %d\n",x);
		}
		System.out.println("프로그램종료");
	}

}

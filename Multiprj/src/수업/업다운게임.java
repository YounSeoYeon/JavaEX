package 수업;

import java.util.Scanner;

public class 업다운게임 {

	public static void main(String[] args) {
		
		/*
		 * # Up & Down 게임[1단계]
		 * 
		 * 1. com은 8이다.
		 * 2. me는 com의 숫자를 맞추는 게임이다.
		 * 3. 다음과 같은 메세지를 출력한다.
		 * 1) me < com    : Up!
		 * 2) me == com : Bingo!
		 * 3) me > com  : Down!
		 */
		
		
		Scanner sc = new Scanner(System.in);
		int com = 8;
		
		System.out.println("정답입력 : ");
		int me = sc.nextInt();
		
		if(me<com) {
			System.out.println("UP!");
		}
		else if(me > com) {
			System.out.println("down!");
		}
		else {
			System.out.println("Bingo!");
		}
	}

}

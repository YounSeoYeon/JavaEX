package ����;

import java.util.Scanner;

public class ���ٿ���� {

	public static void main(String[] args) {
		
		/*
		 * # Up & Down ����[1�ܰ�]
		 * 
		 * 1. com�� 8�̴�.
		 * 2. me�� com�� ���ڸ� ���ߴ� �����̴�.
		 * 3. ������ ���� �޼����� ����Ѵ�.
		 * 1) me < com    : Up!
		 * 2) me == com : Bingo!
		 * 3) me > com  : Down!
		 */
		
		
		Scanner sc = new Scanner(System.in);
		int com = 8;
		
		System.out.println("�����Է� : ");
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

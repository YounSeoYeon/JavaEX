package ����;

import java.util.Scanner;

public class array07 {

	public static void main(String[] args) {
		/*
		 * # �����̵�[1�ܰ�]
		 * 
		 * 1. ����2�� ĳ�����̴�. 2. ����1�� �Է��ϸ�, ĳ���Ͱ� �������� ����2�� �Է��ϸ�, ĳ���Ͱ� ���������� �̵��Ѵ�. 3. ��, �¿�
		 * ���� �������� ��, ����ó���� �ؾ��Ѵ�.
		 * 
		 */
		Scanner scan = new Scanner(System.in);

		int[] game = { 0, 0, 2, 0, 0, 0, 0 };

		while (true) {
			for (int i = 0; i < game.length; i++) {
				if (game[i] == 2) {
					System.out.print("��");
				} else {
					System.out.print("_");
				}
			}
			System.out.println();
			System.out.println("����[1], ������[2] : ");
			int mov = scan.nextInt();
			int temp = 0;

			if (mov == 1) {
				for (int i = 0; i < game.length; i++) {
					if(i==0) {
						continue;
					}
					if(game[i] == 2) {
					temp = game[i-1];
					game[i-1] = game[i];
					game[i] = temp;
					break;
					}
				}
			}

			else if (mov == 2) {
				for (int i = 0; i < game.length; i++) {
					if(i==6) {
						continue;
					}
					if(game[i] == 2) {
					temp = game[i+1];
					game[i+1] = game[i];
					game[i] = temp;					
					break;
					}
				}
			}
		}
	}

}

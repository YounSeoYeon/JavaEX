package ����;

import java.util.Scanner;

public class Loop2 {

	public static void main(String[] args) {
		/*
		 * ������ ����[3�ܰ�]
		 * 
		 * 1. ������ ������ 5ȸ �ݺ��Ѵ�. 2. ������ ���߸� 20���̴�. 3. ���� ���� ��, ������ ����Ѵ�.
		 * 
		 */

		Scanner sc = new Scanner(System.in);

		int x, y, an, myans = 0;
		int grade = 0;
		int count = 1;

		System.out.println("�����ܰ���");
		while (count < 6) {
			System.out.printf("%d��°\n", count);
			System.out.println("ù��°�����Է� : ");
			x = sc.nextInt();
			System.out.println("�ι�°�����Է� : ");
			y = sc.nextInt();
			an = x * y;
			System.out.println("�����Է�");
			System.out.printf("%d * %d = ? ", x, y);
			myans = sc.nextInt();

			if (an == myans) {
				System.out.printf("%d\n", myans);
				System.out.println("�����Դϴ�");
				grade += 20;
			} else {
				System.out.printf("%d\n", myans);
				System.out.println("Ʋ�Ƚ��ϴ�!!");
			}
			count++;
		}
		System.out.printf("����� ������ : %d �Դϴ�", grade);
	}

}

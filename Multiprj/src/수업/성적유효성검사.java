package ����;

import java.util.Scanner;

public class ������ȿ���˻� {

	public static void main(String[] args) {
		/*
		 * # ���� ��ȿ�� �˻�
		 * 
		 * 1. ������ �Է¹޴´�.
		 * 2. ������ 60�� �̻��̸� �հ�, 60�� �̸��̸� ���հ��̴�.
		 * 3. ��, �Է¹��� ������
		 *    �����̰ų� 100���� �ʰ��ϸ�, ���� �޼����� ����Ѵ�.
		 *    ��) ������ �߸� �Է��߽��ϴ�.
		 */
		
		Scanner sc = new Scanner(System.in);
		int grade = sc.nextInt();
		
		if(grade>100 || grade<0) {
			System.out.println("�߸��Է��߽��ϴ�");
		}
		
		else if(grade>=60) {
			System.out.println("�հ�");
		}
		else {
			System.out.println("���հ�");
		}
	}

}

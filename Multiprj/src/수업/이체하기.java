package ����;

import java.util.Scanner;

public class ��ü�ϱ� {

	public static void main(String[] args) {
		/*
		 * # ATM[1�ܰ�] : ��ü�ϱ�
		 * 
		 * 1. ��ü�� ���¹�ȣ�� �Է¹޴´�.
		 * 2. ���¹�ȣ�� ��ġ�ϸ�,
		 * 3. ��ü�� �ݾ��� �Է¹޴´�.
		 * 4. ��ü�� �ݾ� <= myMoney    : ��ü����
		 *             myMoney   - ��ü�� �ݾ�
		 *             yourMoney + ��ü�� �ݾ�
		 *    ��ü�� �ݾ�  > myMoney     : ��ü�Ұ�
		 */
		
		Scanner sc = new Scanner(System.in);
		int account = 1234;
		int myMoney = 5678;
		int yourmoney = 1111;
		int tomoney = 0;
		
		System.out.println("��ü�� ���¸� ���ּ���");
		int toaccount = sc.nextInt();
		if(account == toaccount) {
			System.out.println("���¹�ȣ��ġ");
			System.out.println("��ü�ұݾ� : ");
			tomoney = sc.nextInt();
			
			if(tomoney > myMoney) {
				System.out.println("��ü�Ұ�!!");
			}
			else if(tomoney<myMoney) {
				myMoney -= tomoney;
				yourmoney += tomoney;
				System.out.println("��ü����");
				System.out.println("��ü�Ϸ�");
				System.out.printf("�������ܾ� : %d, �������ܾ� : %d\n",myMoney,yourmoney);
			}
		}
		else {
			System.out.println("���¹�ȣ�� Ʋ���ϴ�!");
		}
		sc.close();
	}

}

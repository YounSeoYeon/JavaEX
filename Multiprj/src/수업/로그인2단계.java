package ����;

import java.util.Scanner;

public class �α���2�ܰ� {

	public static void main(String[] args) {
		
		/*
		 * # �α���[2�ܰ�]
		 * 
		 * 1. Id�� Pw�� �Է¹޾� ȸ�������� �����Ѵ�.
		 * 2. ���� �α����� ���� �ٽ� Id�� Pw�� �Է¹޴´�.
		 * 3. ���� �� ����� �����Ϳ� �α��� �� �Է¹��� �����͸� ���Ѵ�.
		 * ��) �α��� ���� or �α��� ����
		 */
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ȸ�������ϼ���");
		System.out.println("���̵� : ");
		int ID = sc.nextInt();
		
		System.out.println("��� : ");
		int pass = sc.nextInt();
		
		System.out.println("ȸ�����ԿϷ�");
		System.out.println("====�α����ϼ���====");
		
		System.out.println("���̵�� ? : ");		
		int a = sc.nextInt();
		
		System.out.println("��й�ȣ�� ? :");
		int b = sc.nextInt();
				
		if((ID == a)&&(pass==b)) {
			System.out.println("�α��μ���");
		}
		else {
			System.out.println("�α��ν���");
		}
		

	}

}

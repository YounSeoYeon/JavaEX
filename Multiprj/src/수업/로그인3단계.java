package ����;

import java.util.Scanner;

public class �α���3�ܰ� {

	public static void main(String[] args) {
		
		/*
		 * # �α���[3�ܰ�]
		 * 
		 * 1. Id�� �Է¹޾� dbId�� ��ġ�� ��쿡�� Pw�� �Է��� �� �ִ�.
		 * 2. Id�� Ʋ�� ���, "Id�� Ȯ�����ּ���"��� �޼����� ����Ѵ�.
		 * 3. Pw�� Ʋ�� ���, "Pw�� Ȯ�����ּ���"��� �޼����� ����Ѵ�.
		 * 4. Id�� Pw�� ��� ��ġ�ϴ� ���, "�α��� ����"��� �޼����� ����Ѵ�.
		 */
		
		Scanner sc = new Scanner(System.in);
		int dbid = 12345;
		int dbpw = 56789;
		
		System.out.println("���̵��Է� : ");
		int id = sc.nextInt();
		
		if(dbid == id) {
			System.out.println("���̵�Ȯ�οϷ�");
			System.out.println("�е�����Է� : ");
			int pw = sc.nextInt();
			if(dbpw == pw) {
				System.out.println("�α��μ���");				
			}
			else {
				System.out.println("�н�����Ȯ���ϼ���");
			}
		}
		else {
			System.out.println("���̵�Ȯ���ϼ���");
		}
	}

}

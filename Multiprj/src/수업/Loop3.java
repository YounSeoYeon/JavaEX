package ����;

import java.util.Scanner;

public class Loop3 {

	public static void main(String[] args) {
		/*
		 * # �ݺ��� ����(-100)
		 * 
		 * 1. ���� �ݺ��� �ϸ鼭 ���ڸ� �Է¹޴´�.
		 * 2. �Է��� ���ڰ� -100�̸�, ���α׷��� ����ȴ�.
		 * ��)
		 * ���� �Է�[EXIT:-100] : 1
		 * ���� �Է�[EXIT:-100] : 3
		 * ���� �Է�[EXIT:-100] : 4
		 * ���� �Է�[EXIT:-100] : -100
		 * ���α׷� ����
		 * 
		 */  
		
		int x = 0;
		while(x != -100) {
			Scanner sc = new Scanner(System.in);
			x = sc.nextInt();
			System.out.printf("�����Է�[EXIT:-100] : %d\n",x);
		}
		System.out.println("���α׷�����");
	}

}

package ����;

import java.util.Scanner;

public class array09 {

	public static void main(String[] args) {
		/*
		 * # �迭 ��Ʈ�ѷ�[1�ܰ�] : �߰�
		 * 
		 * ���α׷��ֿ��� �������� �߰��� ���� �� (������)�� �ϴ� ���� �Ϲ����� ��å�̴�.
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int[] arr = new int[5];
		
		while(true) {
		System.out.println("�߰��� �� �Է� : ");
		if(count < arr.length) {
		int val = sc.nextInt();
		arr[count] = val;
		count++;
		}
		else {
			System.out.println("���̻� �Է� ����");
			break;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.printf("%d",arr[i]);
			}
		System.out.println();
		}
		
	}

}

package ����;

import java.util.Random;
import java.util.Scanner;

public class array01 {

	public static void main(String[] args) {
		// ����1) for���� �̿��Ͽ� 10���� 50���� arr �迭�� ����
        // ����1) 10 20 30 40 50

        // ����2) 1������ ������ arr���� 4�� ����� ���
        // ����2) 20 40

        // ����3) 1������ ������ arr���� 4�� ����� �� ���
        // ����3) 60

        // ����4) 1������ ������ arr���� 4�� ����� ������ ���
        // ����4) 2

        // ����5) 1������ ������ arr���� ¦���� ������ ���
        // ����5) 5
		
		int[] ar = new int[5];
		for(int i=0; i<5; i++) {
			ar[i] = (i+1)*10; 
			System.out.println(ar[i]);
		}
		System.out.println(ar.length);
		System.out.println("=========");
		
		 // ����1) arr�迭�� 1~100�� ������ ���� ������ 5�� ����
        // ��   1) 87, 11, 92, 14, 47

        // ����2) �������� ������ ��� ���
        // ��   2) ����(251) ���(50.2)

        // ����3) ������ 60�� �̻��̸� �հ�. �հݻ� �� ���
        // ��   3) 2��
		
		Random rd = new Random();
		int[] arr = new int[5];
		for(int i=0; i<arr.length; i++) {
			arr[i] = rd.nextInt(100)+1;
			System.out.println(arr[i]);
		}
		
		int sum = 0;
		double avg = 0.0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
			avg = sum/5.0;
		}
		System.out.println(sum);
		System.out.println(avg);
		
		int count = 0;
		for(int i=0; i<arr.length; i++)
			if(arr[i]>=60) {
				count++;
			}
		System.out.printf("�հݻ��� : %d\n",count);
		System.out.println("=============");
		
		 // �ε���    0   1   2   3   4
		int[] ard = {87, 11, 45, 98, 23};
		
		// ����1) �ε����� �Է¹޾� ���� ���
		// ����1) �ε��� �Է� : 1	���� : 11��
		Scanner sc = new Scanner(System.in);
		System.out.println("�ε��� �Է� : ");
		System.out.println("���� : " + ard[sc.nextInt()]);
		
		// ����2) ������ �Է¹޾� �ε��� ���
		// ����2) ���� �Է� : 11		�ε��� : 1
		int gr = 0;
		System.out.println("�����Է� : ");
		gr = sc.nextInt();
		for(int i=0; i<ard.length; i++) 
			if(gr == ard[i]) {
				System.out.println("�ε��� : "+i);
			}
			
		
		
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		
		// ����3) �й��� �Է¹޾� ���� ���
		// ����3) �й� �Է� : 1003	���� : 45��
		
		System.out.println("�й��Է� : ");
		int hak = sc.nextInt();
		for(int i=0; i<hakbuns.length; i++) {
			if(hak == hakbuns[i])
				System.out.printf("���� : %d",scores[i]);
		}
	}

}

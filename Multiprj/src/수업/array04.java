package ����;

import java.util.Scanner;

public class array04 {

	public static void main(String[] args) {
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
	    int[] scores  = {  87,   11,   45,   98,   23};
	      
	      // ����) �й��� �Է¹޾� ���� ���
	      // 		��, �����й� �Է� �� ����ó��
	      // ��)
	      // �й� �Է� : 1002		���� : 11��
	      // �й� �Է� : 1000		�ش��й��� �������� �ʽ��ϴ�.  
	    int hak = 0;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("�й��Է� : ");
	    hak = sc.nextInt();
	    int i =0;
	    for( i=0; i<hakbuns.length; i++) {
	    	if(hak == hakbuns[i]) {
	    		System.out.printf("���� : %d\n",scores[i]);
	    		break;
	    	}
	    }
	    if(i>=hakbuns.length) {
	    	System.out.println("�ش��й��� �������� �ʽ��ϴ�");
	    }
	    
	}

}

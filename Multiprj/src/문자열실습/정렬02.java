package ���ڿ��ǽ�;

import java.util.Arrays;
import java.util.Scanner;

public class ����02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է� : ");
		String text = sc.next();
		char[] ch = text.toCharArray();
		Arrays.sort(ch);
		
		int cun = 0;
		for(int i=0; i<ch.length; i++) {
			if(ch[i]>=0x30 && ch[i]<=0x39) // ���ڸ����ڷ�ǥ���ϸ�
				cun++;
		}
		System.out.println(cun);
		
		if(cun == ch.length) {
			System.out.println("���ڸ�����");
		}
		else if(cun == 0) {
			System.out.println("���ڸ� ����");
		}
		else System.out.println("�Ѵ� ��������");
	}

}

package chap01_q;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		//�������� �Է� -> �ڸ��� ���
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�Է��� ������ �ڸ����� ����Ͻÿ�");
		System.out.print("�����Է� > ");
		int x = sc.nextInt();
		int num=0;
		do {
			x /= 10;
			num++;
			System.out.println(x+" "+num);
		}while(x>0);
		
		System.out.println(x+"�� �ڸ����� "+num+"�Դϴ�");
		sc.close();
	}

}

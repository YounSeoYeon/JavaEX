package chap01;

import java.util.Scanner;

public class Max3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �ִ밪�� ���մϴ�");
		System.out.println("�����Է� > ");
		int a = sc.nextInt();
		System.out.println("�����Է� > ");
		int b = sc.nextInt();
		System.out.println("�����Է� > ");
		int c = sc.nextInt();
		
		int max = a;
		if(b>max) max = b;
		if(c>max) max = c;
		
		System.out.println("�ִ밪�� : "+max);
		sc.close();
		
	}

}

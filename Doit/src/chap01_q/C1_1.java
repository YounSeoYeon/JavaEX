package chap01_q;

import java.util.Scanner;

public class C1_1 {

	// �߰������ϱ� - ���߿� �����ķε� ����
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ���� �߾Ӱ��� ���Ͻÿ�");
		System.out.print("a�� �� : ");
		int a = sc.nextInt();
		System.out.print("b�� �� : ");
		int b = sc.nextInt();
		System.out.print("c�� �� : ");
		int c = sc.nextInt();
		
		System.out.println("�߾Ӱ��� : "+mid(a,b,c)+"�Դϴ�");
		sc.close();
	}

	private static int mid(int a, int b, int c) {
		if(a>=b && b>=c)
			return b;
		else if(a>=b && c>=b && a>=c)
			return c;
		else if(a>=b && c>=b && c>=a)
			return a;
		else if(b>=a && b>=c && a>=c)
			return a;
		else if(b>=a && b>=c && c>=a)
			return c;
		else return b;
	}

//	private static int mid(int a, int b, int c) {
//		if(a>=b) {
//			if(b>=c)
//				return b;		
//			if(c>=a)
//				return a;
//			else return c;
//		}
//		else if(a>c)
//			return a;
//		else if(c>b)
//			return b;
//		else return c;
//	}
	
	
	
	

}

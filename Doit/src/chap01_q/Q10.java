package chap01_q;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		// a,b �����Է�-> b-a�� ���Ͻÿ� / a>b�̸� b���� �ٽ��Է�
		
		Scanner sc = new Scanner(System.in);
		System.out.println("b-a�� ���Ͻÿ�");
		System.out.print("a�� �� : ");
		int a = sc.nextInt();
		int b;
//		do {
//			System.out.print("b�� �� : ");
//			b = sc.nextInt();
//			System.out.println("a���� ū ���� �Է��ϼ���!");		
//		}while(b<a);
		
		System.out.println("b�� �� : ");
		b = sc.nextInt();
		while(b<a) {
			System.out.println("a���� ū ���� �Է��ϼ���!");	
			System.out.print("b�� �� : ");
			b = sc.nextInt();
		}
		
		int result = 0;
		
		if(a>0) {
			result = b-a;			
		}
		else {
			result = b+a;
		}
		System.out.println("b-a�� ��� : "+result);
		sc.close();
	}

}

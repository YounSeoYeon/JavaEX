package chap01_q;

import java.util.Scanner;

public class C1_1 {

	// 중간값구하기 - 나중에 퀵정렬로도 가능
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("세 수의 중앙값을 구하시오");
		System.out.print("a의 값 : ");
		int a = sc.nextInt();
		System.out.print("b의 값 : ");
		int b = sc.nextInt();
		System.out.print("c의 값 : ");
		int c = sc.nextInt();
		
		System.out.println("중앙값은 : "+mid(a,b,c)+"입니다");
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

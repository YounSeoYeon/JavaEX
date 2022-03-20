package chap01_q;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		// a,b 정수입력-> b-a를 구하시오 / a>b이면 b변수 다시입력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("b-a를 구하시오");
		System.out.print("a의 값 : ");
		int a = sc.nextInt();
		int b;
//		do {
//			System.out.print("b의 값 : ");
//			b = sc.nextInt();
//			System.out.println("a보다 큰 값을 입력하세요!");		
//		}while(b<a);
		
		System.out.println("b의 값 : ");
		b = sc.nextInt();
		while(b<a) {
			System.out.println("a보다 큰 값을 입력하세요!");	
			System.out.print("b의 값 : ");
			b = sc.nextInt();
		}
		
		int result = 0;
		
		if(a>0) {
			result = b-a;			
		}
		else {
			result = b+a;
		}
		System.out.println("b-a의 결과 : "+result);
		sc.close();
	}

}

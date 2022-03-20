package chap01_q;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		//양의정수 입력 -> 자릿수 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("입력한 숫자의 자리수를 출력하시오");
		System.out.print("숫자입력 > ");
		int x = sc.nextInt();
		int num=0;
		do {
			x /= 10;
			num++;
			System.out.println(x+" "+num);
		}while(x>0);
		
		System.out.println(x+"의 자리수는 "+num+"입니다");
		sc.close();
	}

}

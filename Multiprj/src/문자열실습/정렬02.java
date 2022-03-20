package 문자열실습;

import java.util.Arrays;
import java.util.Scanner;

public class 정렬02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String text = sc.next();
		char[] ch = text.toCharArray();
		Arrays.sort(ch);
		
		int cun = 0;
		for(int i=0; i<ch.length; i++) {
			if(ch[i]>=0x30 && ch[i]<=0x39) // 숫자를문자로표현하면
				cun++;
		}
		System.out.println(cun);
		
		if(cun == ch.length) {
			System.out.println("숫자만있음");
		}
		else if(cun == 0) {
			System.out.println("문자만 있음");
		}
		else System.out.println("둘다 섞여있음");
	}

}

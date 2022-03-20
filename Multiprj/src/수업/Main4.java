package 수업;

import java.util.Arrays;
import java.util.Scanner;

public class Main4 {

	public static void main(String[] args){	
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자 입력 : ");
		int A = sc.nextInt();
		System.out.println("두번째 숫자 입력 : ");
		int B = sc.nextInt();
		System.out.println("세번째 숫자 입력 : ");
		int C = sc.nextInt();
		
		int total = A*B*C;
		System.out.println(total);
		
		String st = Integer.toString(total);
		char[] ch = st.toCharArray();
		System.out.println(Arrays.toString(ch));
		
		int[] count = new int[10];
		for(int i=0; i<ch.length; i++) {
			for(int j=0; j<10; j++) {
				if(ch[i] == (0x30+j)) {
					count[j]++;
				}
			}
		}		
		for(int i=0; i<10; i++) {
			System.out.println(count[i]);			
		}
		sc.close();
	}
}

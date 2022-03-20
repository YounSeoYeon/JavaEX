package ¼ö¾÷;

import java.util.Arrays;

public class Main5 {

	public static void main(String[] args){	
		int A = (int) (Math.random()*900+100);
		int B = (int) (Math.random()*900+100);
		int C = (int) (Math.random()*900+100);
		
		System.out.println(A);
		System.out.println(B);
		System.out.println(C);
		
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
	}
}

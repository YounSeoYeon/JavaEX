package ����;

import java.util.Scanner;

public class Main23 {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.nextLine());		
		//���ڿ� a�� �Է¹���
		
		for(int i=0; i<a; i++) {
			String[] b = sc.nextLine().split(" ");
			int repeat = Integer.parseInt(b[0]);
			String st = b[1];
			
			for(char ch:st.toCharArray()) {
				for(int j=0; j<repeat; j++) {
					System.out.printf("%c",ch);
				}
			}
			System.out.println();
		}
	
	}

}

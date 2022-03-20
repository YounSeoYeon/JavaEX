package 수업;

import java.util.Scanner;

public class Main23 {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.nextLine());		
		//문자열 a개 입력받음
		
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

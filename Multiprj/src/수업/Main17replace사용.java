package 수업;

import java.util.Scanner;

public class Main17replace사용 {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.printf(str.replace(" ", ""));
		
		sc.close();
	}

}

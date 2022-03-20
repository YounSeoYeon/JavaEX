package 수업;

import java.util.Scanner;

public class Main12형변환 {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		
		System.out.println(st);
		
		String[] n = st.split(" ");		
		for(int i=0; i<n.length; i++)
		System.out.println(n[i]);
		
		int x = Integer.parseInt(n[0]);
		int y = Integer.parseInt(n[2]);
		
		switch(n[1]) {
		case "+" :
			System.out.println(x+y);
			break;
		case "-" :
			System.out.println(x-y);
			break;	
		case "*" :
			System.out.println(x*y);
			break;
		case "/" :
			System.out.printf("%.2f\n",(float)x/y);
			break;
		}
		sc.close();
	}

}

package ����;

import java.util.Scanner;

public class ���ϱ����Ŭ {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
	        
	        int n = sc.nextInt();
	        int num = n;
	        int c = 0;

	        while (true) {
	            if (c != 0 && n == num) {
	                break;
	            }

	            //1���� �϶�
	            if (num < 10) {
	                num = num * 11;
	                c++;
	                continue;
	            }

	            int sum = num / 10 + num % 10;
	            num = num % 10 * 10 + sum % 10;
	            c++;
	        }

	        System.out.println(c);

	}

}

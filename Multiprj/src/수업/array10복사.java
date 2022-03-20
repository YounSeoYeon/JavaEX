package 수업;

import java.util.Scanner;

public class array10복사 {
	//값삭제

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int[] arr = {10, 20, 30, 40, 0};
		int val = 0;
		int del = 0;
		
		while(true) {
			System.out.println("삭제할 값 입력 : ");
			val = sc.nextInt();
			for(int i=0; i<arr.length; i++){
				if(val == arr[i]) {
					del = i;
					System.out.println(i);
					
				}
			}
			for(int i=del; i<arr.length-1; i++) {
				arr[i] = arr[i+1];
			}
			for(int i=0; i<arr.length; i++) {
				System.out.print(arr[i]+",");
			}
		}
		
		
	}
}

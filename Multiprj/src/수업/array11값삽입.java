package 수업;

import java.util.Scanner;

public class array11값삽입 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {10, 20, 30, 40, 0};
		int cnt = 2;
		while(true) {
		System.out.println("입력할값 : ");
		int val = sc.nextInt();
		
		System.out.println("위치값 : ");
		int idx = sc.nextInt();
		
		for(int i=arr.length-1; i>idx; i--) {
			arr[i] = arr[i-1];
		}
		arr[idx]=val;
		
		
		
		for(int i=0; i<arr.length; i++) {
			System.out.printf("%d ",arr[i]);
		}
		System.out.println();
		}		
	}

}

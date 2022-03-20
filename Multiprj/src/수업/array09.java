package 수업;

import java.util.Scanner;

public class array09 {

	public static void main(String[] args) {
		/*
		 * # 배열 컨트롤러[1단계] : 추가
		 * 
		 * 프로그래밍에서 데이터의 추가는 가장 끝 (마지막)에 하는 것이 일반적인 정책이다.
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int[] arr = new int[5];
		
		while(true) {
		System.out.println("추가할 값 입력 : ");
		if(count < arr.length) {
		int val = sc.nextInt();
		arr[count] = val;
		count++;
		}
		else {
			System.out.println("더이상 입력 못함");
			break;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.printf("%d",arr[i]);
			}
		System.out.println();
		}
		
	}

}

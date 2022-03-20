package chap02;

import java.util.Random;

public class E2_6 {

	public static void main(String[] args) {
		//배열요소값 역순으로 정렬
		Random ran = new Random();
		System.out.println("요소수 : ");
		int num = 1+ran.nextInt(10);
		int[] x = new int[num];
		
		for(int i=0; i<num; i++) {
			x[i] = 1+ran.nextInt(100);
		}
		System.out.println("역순정리전");
		
		for(int i=0; i<num; i++) {
			System.out.println(x[i]);
		}
		
		System.out.println("----------------");
		
		reverse(x);
		System.out.println("역순정리완료");
		for(int i=0; i<num; i++) {
			System.out.println(x[i]);
		}
	}

	private static void reverse(int[] x) {
		for(int i=0; i<x.length/2; i++) {
			int temp;
			temp=x[i];
			x[i]=x[x.length-1-i];
			x[x.length-1-i]=temp;
		}
	}

}

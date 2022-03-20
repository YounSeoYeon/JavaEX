package chap02;

import java.util.Random;

public class Q2_reverse {

	public static void main(String[] args) {
		Random ran = new Random();		
		int a = 3+ran.nextInt(7);
		System.out.println(a);
		int[] x = new int[a];
		
		for(int i=0; i<a; i++) {
			x[i]=ran.nextInt(100);
			System.out.print(x[i]+" ");
		}
		
		System.out.println("\n--------------");
		
		for(int i=0; i<a/2; i++) {
			System.out.print("a["+i+"]�� a["+(a-i-1)+"]�� ��ȯ�մϴ�\n");
			int temp;
			temp=x[i];
			x[i]=x[a-i-1];
			x[a-i-1]=temp;
			for(int j=0; j<a; j++) {
				System.out.print(x[j]+" ");
			}
			System.out.println();
		}
		System.out.println("���������� ���ƽ��ϴ�");
		
		int sum = sumof(x);
		System.out.println("�հ�� : "+sum);
		
	}

	private static int sumof(int[] x) {
		int sum = 0;
		for(int i=0; i<x.length; i++) {
			sum += x[i];
		}
		return sum;
	}

}

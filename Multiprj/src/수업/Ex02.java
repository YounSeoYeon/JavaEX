package ����;

import java.util.Arrays;

public class Ex02 {

	public void test1(int x, int y) {
		System.out.println("�հ豸�ϱ�");
		int sum = 0;
		for(int i=x; i<y+1; i++) {
			sum += i;
		}
		System.out.printf("x:%d,y:%d,sum:%d",x,y,sum);
	}

	public void test2(int[] arr) {
		System.out.println("�ִ밪���ϱ�");
		int max = 0;
		for(int i=0;i<arr.length; i++) {
			if(arr[i]>max)
				max=arr[i];
		}
		System.out.printf("�ִ밪 : %d",max);
	}

	public void test3(int[] arr, int idx1, int idx2) {
		int temp = 0;
		temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
		System.out.println(Arrays.toString(arr));
	}

}

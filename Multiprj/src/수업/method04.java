package ����;

import java.util.Arrays;

public class method04 {

	public static void main(String[] args) {
		/*
		class Ex04{

		    int test1(int[] arr) { return 0; }
		    int[] test2(int[] arr) { return null; }
		}
		*/
		
		/*
        Ex04 e = new Ex04();

        int[] arr = {87, 12, 21, 56, 100};

        // ���� 1) 4�� ����� ������ �������ִ� �޼���
        int cnt = e.test1(arr);
        System.out.println("cnt = " + cnt);

        // ���� 2) 4�� ����� ������ŭ�� ���ο� �迭�� �����, 4�� ����� ������ �迭�� �������ִ� �޼���
        int[] temp = e.test2(arr);
        System.out.println(Arrays.toString(temp));
    */
		
		Ex04 e = new Ex04();
		int[] arr = {87, 12, 21, 56, 100};
		
		int cnt = e.test1(arr);
        System.out.println("cnt = " + cnt);
        
        int[] temp = e.test2(cnt, arr);
        System.out.println(Arrays.toString(temp));
		
	}

}

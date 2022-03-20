package 수업;

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

        // 문제 1) 4의 배수의 개수를 리턴해주는 메서드
        int cnt = e.test1(arr);
        System.out.println("cnt = " + cnt);

        // 문제 2) 4의 배수의 개수만큼의 새로운 배열을 만들고, 4의 배수를 저장후 배열을 리턴해주는 메서드
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

package 수업;

import java.util.Scanner;

public class array10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {10, 20, 30, 40, 0};
		int cnt = 2;
		
		while(true) {
		System.out.println("삭제할 값 입력 : ");
		int val = sc.nextInt();
		int delidx = -1;
		for(int i=0; i<arr.length; i++) {
			if(val == arr[i]) {
				delidx = i;
				System.out.println(delidx);
			}
		}
		for(int i=delidx; i<arr.length-1; i++) {			
			arr[i] = arr[i+1];
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.printf("%d ",arr[i]);
		}
		System.out.println();
	}
}

}

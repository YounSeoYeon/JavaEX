package 수업;

import java.util.Arrays;
import java.util.Random;

public class Ex01 {
	
	public Ex01() {		
	}

	public void test1() {
		int sum =0;
		for(int i=0; i<6; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

	public void test2() {
		System.out.println("최대값뽑기");
		Random rd = new Random();
		int[] ar = new int[3];
		for(int i=0; i<ar.length; i++) {
			ar[i] = rd.nextInt(100)+1;
		}
		System.out.println(Arrays.toString(ar));
		int max = 0;
		
		for(int val:ar) {
			if (val > max) max = val;
		}
		System.out.println(max);
	
	}

}

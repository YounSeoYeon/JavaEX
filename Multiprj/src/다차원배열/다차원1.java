package 다차원배열;

import java.util.Arrays;

public class 다차원1 {

	public static void main(String[] args) {
		int[][] arr2d = new int [5][5];
		int[][] arrinit = {
				{10,20,30},
				{40,50,60},
		};
		System.out.println(Arrays.toString(arrinit[0]));
		System.out.println(arrinit[0][1]);
		
		for(int i=0; i<arrinit.length; i++) {
			System.out.println(Arrays.toString(arrinit[i]));
			for(int j=0; j<arrinit[i].length; j++) {
				System.out.println(arrinit[i][j]);
			}
		}
	}

}

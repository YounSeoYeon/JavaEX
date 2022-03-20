package chap01_02;

public class Max2m {

	public static int m(int i, int j, int k) {
		int max;
		max = i;
		
		if(j>max) max=j;
		else if (k>max) max=k;
		
		return max;
	}

}

package chap01;

public class Max3m {
	static int Max3(int a, int b, int c) {
		int max = a;
		if(b>max) max = b;
		if(c>max) max = c;
		
		return max;
	}

}

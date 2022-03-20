package chap01_q;

public class Q1 {

	public static void main(String[] args) {
		System.out.println("max4(3,5,9,7)의 최대값은 : "+max4(3,5,9,7));
		System.out.println("max4(2,-5,6,30)의 최대값은 : "+max4(2,-5,6,30));
	}

	private static int max4(int i, int j, int k, int l) {
		int max=i;
		if(max<j) max=j;
		if(max<k) max=k;
		if(max<l) max=l;
		
		return max;
	}

}

package ¼ö¾÷;

public class Main9 {
	public long sum(int[] a) {
		int total = 0;
		int n = (int) (Math.random()*3000000);
		for(int i=0; i<n; i++) {
			a[i] = (int) (Math.random()*1000001);
			total += a[i];
		}
		return total;
	}
}

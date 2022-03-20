package ¼ö¾÷;

public class Main3 {

	public static void main(String[] args){
		int[] x = new int[9];
		int max = -1;
		int count = 0;
		
		for(int i=0; i<x.length; i++) {
			x[i] = (int)(Math.random()*99+1);
			for(int j=0; j<i; j++) {
				if(x[i]==x[j]) {
					i--;
				}
			}
			System.out.println(x[i]);
		}
		
		for(int i=0; i<x.length; i++) {
			if(x[i]>max) {
				max = x[i];
			}
			count = i+1;
		}
		
		System.out.println(max);
		System.out.println(count);
		
	}
}

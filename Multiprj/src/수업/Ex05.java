package ¼ö¾÷;

public class Ex05 {

	public int test1(int[] arr) {
		int total = 0;
		for(int val : arr) {
			total += val;
		}
		return total;
	}

	public int test2(int[] arr) {
		int newar = 0;
		for(int val:arr) {
			if(val%4==0) {
				newar += val;
			}
		}
		return newar;
	}

	public int test3(int[] arr) {
		int ct = 0;
		for(int val:arr) {
			if(val%4==0) {
				ct++;
			}
		}
		return ct;
	}

	public int test4(int[] arr) {
		int ct = 0;
		for(int val:arr) {
			if(val%2==0) {
				ct++;
			}
		}
		return ct;
	}
}

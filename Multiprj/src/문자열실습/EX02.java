package 문자열실습;

import java.util.Arrays;

public class EX02 {
	
	//join이용

	public static void main(String[] args) {
		String str = "11/100/89";
		int[] arr = new int[3];
		
		String[] ab = str.split("/");
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(ab[i]);
			System.out.println(arr[i]);
		}
		int total = 0;
		for(int val:arr) {
			total += val;
		}
		System.out.println(total);
		
		int[] scores = {11, 100, 89};
		String text = "";
		
		//문자열타입으로 변환
		String[] strscore = new String[scores.length];
		for(int i=0; i<strscore.length; i++) {
			strscore[i] = Integer.toString(scores[i]);
		}
		//join이용
		
		System.out.println(String.join("/", strscore));
		
		String strs = "김철수/87,이만수/42,이영희/95";
		String[] name = new String[3];
		int[] sco = new int[3];
		
		String[] max = strs.split(",");
		for(int i=0; i<max.length; i++) {
			System.out.println(max[i]);
		}
		for(int i=0; i<name.length; i++) {
			String[] temp = max[i].split("/");
			name[i] = temp[0];
			sco[i] = Integer.parseInt(temp[1]);
		}
		
		System.out.println(Arrays.toString(name));
		System.out.println(Arrays.toString(sco));
	}

}

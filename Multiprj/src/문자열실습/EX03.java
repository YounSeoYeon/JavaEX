package 문자열실습;

public class EX03 {
	
	// format이용

	public static void main(String[] args) {
		String[] name = {"김철수", "이만수", "이영희"};
		int[] score = {87, 42, 95};
		String str = "";
		for(int i=0; i<name.length; i++) {
			String sc = String.format("%s/%s",name[i],score[i]);
			if(i != name.length-1) str += sc+","; 
			else str+= sc;
		}
		System.out.println(str);
	}
}

package 문자열실습;

import java.util.Arrays;

public class 정렬 {

	public static void main(String[] args) {
		//사전순으로 정렬
		
		String[] name = {"홍길동","김유신","마동석","자바킹","서동요"};
		
		String str = "DCBA";
		char[] ch = str.toCharArray();
		Arrays.sort(ch);
		System.out.println(ch);
		
		Arrays.sort(name);
		System.out.println(Arrays.toString(name));
		
		
	}

}

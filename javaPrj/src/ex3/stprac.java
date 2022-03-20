package ex3;

public class stprac {

	public static void main(String[] args) {
		
		
		// 1.문자열 비교
		String str1 = new String("all love me");
		String str2 = new String("all love me");
		String sub = str1.substring(0, 5);
		
		System.out.println(sub);
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		
		
		// 2.문자열 합치기
		String str3 = str1 + str2;
		String str4 = str1 + 1;
		String str5 = str1.concat(str2);
		
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		
		// 3.문자열 자르기
		// 4.문자열에 포함된 문자또는 문자열 찾기
		int idx = str1.indexOf("zero");
		
		System.out.println(idx);
		System.out.println(idx>0?"있다":"없다");
		
	}

}

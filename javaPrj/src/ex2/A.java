package ex2;

public class A {

	public static void main(String[] args) {
		
		// 1.문자열비교
		String str1 = new String("hello");
		String str2 = new String("hello");
		
		System.out.println(str1==str2); // 같은객체냐
		System.out.println(str1.equals(str2)); // 안에 문자열내용이 같은거냐

		// 2.문자열 합치기
		String str3 = str1+str2;
		String str4 = str3+1; // → 번역기가 묵시적으로 형식변환해줌 "1" → new String("1")
		String str5 = str1.concat(str4);
		
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		
		// 3.문자열 나누기
		String sub = str1.substring(0,3);
		System.out.println(sub);
		
		// 4.문자열에 포함된 문자, 문자열 찾기
		int idx = str1.indexOf("zero");
		int idx1 = str1.indexOf("1");
		int idx3 = str1.indexOf('1');
		int idx4 = str1.indexOf(1);
		

		System.out.println(idx4);
		System.out.println(idx3);
		System.out.println(idx1);
		System.out.println(idx>0?"있다":"없다");
		
		String str6 = "hello hey hi";
		int idx2 = str6.indexOf("h", 7);
		System.out.println(idx2);
		System.out.println(idx2>0?"있다":"없다");
	}

}

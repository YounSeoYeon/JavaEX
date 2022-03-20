package ex3;

public class stprac2 {

	public static void main(String[] args) {
		
		String str1 = new String("loveall");
		String str2 = new String("loveall");
		String str3 = str1 + str2;
		
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		System.out.println(str1.concat(str2));
		
		String str4 = str1.substring(0, 5);
		int str5 = str1.indexOf("a");
		String str6 = "hey luckygirl";
		int str7 = str6.indexOf("u",6);
		
				
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		System.out.println(str5>0?"있다":"없다");
		System.out.println(str7);
		
		
	}

}

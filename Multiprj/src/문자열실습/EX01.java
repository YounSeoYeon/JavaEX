package 문자열실습;

public class EX01 {

	public static void main(String[] args) {
		String amy = "990913-2012932";
		
		String amyage = amy.substring(0,2);
		System.out.println(amyage);
		
		int birth = Integer.parseInt(amyage);
		birth +=1900;
		System.out.println(birth);
		
		//현재나이
		int age = 2021-birth+1;
		System.out.printf("나이 : %d\n",age);
		//문자열순회
		for(int i=0; i<amy.length(); i++) {
			System.out.println(amy.charAt(i));
		}
		
		char key = amy.charAt(7);
		if(key == '1'|| key == '3') {
			System.out.println("남자");
		}
		else if(key == '2'|| key == '4') {
			System.out.println("여자");
		}
	}

}

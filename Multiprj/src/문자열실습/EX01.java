package ���ڿ��ǽ�;

public class EX01 {

	public static void main(String[] args) {
		String amy = "990913-2012932";
		
		String amyage = amy.substring(0,2);
		System.out.println(amyage);
		
		int birth = Integer.parseInt(amyage);
		birth +=1900;
		System.out.println(birth);
		
		//���糪��
		int age = 2021-birth+1;
		System.out.printf("���� : %d\n",age);
		//���ڿ���ȸ
		for(int i=0; i<amy.length(); i++) {
			System.out.println(amy.charAt(i));
		}
		
		char key = amy.charAt(7);
		if(key == '1'|| key == '3') {
			System.out.println("����");
		}
		else if(key == '2'|| key == '4') {
			System.out.println("����");
		}
	}

}

package ex3;

public class stprac {

	public static void main(String[] args) {
		
		
		// 1.���ڿ� ��
		String str1 = new String("all love me");
		String str2 = new String("all love me");
		String sub = str1.substring(0, 5);
		
		System.out.println(sub);
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		
		
		// 2.���ڿ� ��ġ��
		String str3 = str1 + str2;
		String str4 = str1 + 1;
		String str5 = str1.concat(str2);
		
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		
		// 3.���ڿ� �ڸ���
		// 4.���ڿ��� ���Ե� ���ڶǴ� ���ڿ� ã��
		int idx = str1.indexOf("zero");
		
		System.out.println(idx);
		System.out.println(idx>0?"�ִ�":"����");
		
	}

}

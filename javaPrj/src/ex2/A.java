package ex2;

public class A {

	public static void main(String[] args) {
		
		// 1.���ڿ���
		String str1 = new String("hello");
		String str2 = new String("hello");
		
		System.out.println(str1==str2); // ������ü��
		System.out.println(str1.equals(str2)); // �ȿ� ���ڿ������� �����ų�

		// 2.���ڿ� ��ġ��
		String str3 = str1+str2;
		String str4 = str3+1; // �� �����Ⱑ ���������� ���ĺ�ȯ���� "1" �� new String("1")
		String str5 = str1.concat(str4);
		
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		
		// 3.���ڿ� ������
		String sub = str1.substring(0,3);
		System.out.println(sub);
		
		// 4.���ڿ��� ���Ե� ����, ���ڿ� ã��
		int idx = str1.indexOf("zero");
		int idx1 = str1.indexOf("1");
		int idx3 = str1.indexOf('1');
		int idx4 = str1.indexOf(1);
		

		System.out.println(idx4);
		System.out.println(idx3);
		System.out.println(idx1);
		System.out.println(idx>0?"�ִ�":"����");
		
		String str6 = "hello hey hi";
		int idx2 = str6.indexOf("h", 7);
		System.out.println(idx2);
		System.out.println(idx2>0?"�ִ�":"����");
	}

}

package ���ڿ��ǽ�;

import java.util.Arrays;

public class ���� {

	public static void main(String[] args) {
		//���������� ����
		
		String[] name = {"ȫ�浿","������","������","�ڹ�ŷ","������"};
		
		String str = "DCBA";
		char[] ch = str.toCharArray();
		Arrays.sort(ch);
		System.out.println(ch);
		
		Arrays.sort(name);
		System.out.println(Arrays.toString(name));
		
		
	}

}

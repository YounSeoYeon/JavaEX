package arraylist;

import java.util.ArrayList;

public class ARtype {

	public static void main(String[] args) {
		//�ڹٿ��� ���� �������̽��� ����
		//List �������̽��� ������ Ŭ����
		ArrayList<String> arr = new ArrayList<String>();
		
		//�迭�� �����߰�
		arr.add("10");
		arr.add("20");
		arr.add("�Ϳ�");
		
		//�迭���� ����Ȯ��
		System.out.println(arr.get(0));
		//�迭ũ��Ȯ��
		System.out.println(arr.size());
		//�迭�� ���� ���� // �ε���,��������
		arr.add(1,"15");
		//�迭���� ������Ȯ��
		for(int i=0; i<arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		
		//�迭���Ұ˻�
		System.out.println(arr.contains("15"));
		
		//�迭���һ���
		arr.remove("10");
		for(int i=0; i<arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		
		//�迭���� ���� �������� ��� arraylist�� Ÿ���� ������Ʈ�� �ν�
		//�׻� Ÿ�Ժ�ȯ�� �����صξ����
		
		String str = (String)arr.get(2);
		System.out.println(str);
		
		//���׸���(generics)-Ÿ���� �������
		ArrayList<String> ab = new ArrayList<String>();
		ab.add("�����޽�");
		ab.add("�׽���");
		System.out.println(ab);
		
		
	}

}

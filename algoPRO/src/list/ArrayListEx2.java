package list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx2 {

	public static void main(String[] args) {
		//���׸� String Ÿ��
		
		List<String> list = new ArrayList<String>();
		list.add("java");
		list.add("jdbc");
		list.add("jsp");
		list.add("���ѹα� ����");
		
		System.out.println("��ü�������");
		for(String item : list) {
			System.out.println(item.length() +" "+item);
		}
		
		System.out.println("java���Կ��� : "+list.contains("java"));
		
		System.out.println("��ü�������");
		for(int i=0; i<list.size(); i++) {
			System.out.println(i+" : "+list.get(i));
		}
		
		System.out.println("\n�� ��° ��� : " + list.get(2));
		System.out.println("�� ��° ��� ����: " + list.get(2).length()); // ���� ��
		
		System.out.println("�Ѱ�ü�� : "+list.size());
		
	}

}

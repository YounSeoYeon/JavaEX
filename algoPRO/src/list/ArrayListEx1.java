package list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {

	public static void main(String[] args) {
		List list = new ArrayList(5);
		list.add(100);
		list.add(2.55);
		list.add(300);
		list.add(9.9);
		list.add("�ڹ� ���α׷���");
		list.add(1,"�����ͺ��̽�"); // index 1�� ��ġ�� ����
		
		System.out.println("����Ʈ�������");
		for(int i=0; i<list.size(); i++) {
			System.out.println(i+ ":"+list.get(i));
		}
		
		System.out.println("���Կ���Ȯ��");
		System.out.println(list.contains(9.9));
		System.out.println(list.contains("�ڹ�"));
		
		System.out.println("�����ͻ���");
		System.out.println(list.remove(0));
		
		System.out.println("����Ʈ�������");
		for(int i=0; i<list.size(); i++) {
			System.out.println(i+ ":"+list.get(i));
		}
		
	}

}

package set; // ����!

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("java");
		set.add("jdbc");
		set.add("servlet");
		set.add("java"); // �ߺ��Ǵ� ���� ����ȵ�
		set.add("jsp");
		
		System.out.println("�� ��ü�� : "+set.size());
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) { // ����ִ� ��ü ����ŭ �ݺ�
			System.out.println(iterator.next());
		}
		
		set.remove("jdbc");
		set.remove("jsp");
		
		for(String element : set) {
			System.out.println(element);
		}
		
		set.clear();
		if(set.isEmpty()) {
			System.out.println("�������");
		}
		
	}

}

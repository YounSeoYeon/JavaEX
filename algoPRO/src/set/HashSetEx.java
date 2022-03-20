package set; // 집합!

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("java");
		set.add("jdbc");
		set.add("servlet");
		set.add("java"); // 중복되는 값은 저장안됨
		set.add("jsp");
		
		System.out.println("총 객체수 : "+set.size());
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) { // 들어있는 객체 수만큼 반복
			System.out.println(iterator.next());
		}
		
		set.remove("jdbc");
		set.remove("jsp");
		
		for(String element : set) {
			System.out.println(element);
		}
		
		set.clear();
		if(set.isEmpty()) {
			System.out.println("비어있음");
		}
		
	}

}

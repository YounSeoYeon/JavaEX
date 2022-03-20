package set;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

//중복 값은 저장하지 않는 속성이용 로또번호 생성

public class HashSetLotto {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i=0; set.size()<6; i++) {
			int num = (int)(Math.random()*45)+1;
			set.add(num);
			System.out.println("count: " +i);
		}
		
		System.out.println(set);
		
		//LinkedList 생성되면서 생성자로 set전달
		List<Integer> list = new LinkedList<Integer>(set);
		System.out.println("list : "+list);
		
		Collections.sort(list); // 오름차순 정렬
		System.out.println(list);
		
		Collections.reverse(list); // 내림차순 정렬
		System.out.println(list);
	}

}

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
		list.add("자바 프로그래밍");
		list.add(1,"데이터베이스"); // index 1의 위치에 삽입
		
		System.out.println("리스트내용출력");
		for(int i=0; i<list.size(); i++) {
			System.out.println(i+ ":"+list.get(i));
		}
		
		System.out.println("포함여부확인");
		System.out.println(list.contains(9.9));
		System.out.println(list.contains("자바"));
		
		System.out.println("데이터삭제");
		System.out.println(list.remove(0));
		
		System.out.println("리스트내용출력");
		for(int i=0; i<list.size(); i++) {
			System.out.println(i+ ":"+list.get(i));
		}
		
	}

}

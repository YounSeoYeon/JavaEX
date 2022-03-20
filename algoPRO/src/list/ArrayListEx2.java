package list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx2 {

	public static void main(String[] args) {
		//제네릭 String 타입
		
		List<String> list = new ArrayList<String>();
		list.add("java");
		list.add("jdbc");
		list.add("jsp");
		list.add("대한민국 만세");
		
		System.out.println("전체내용출력");
		for(String item : list) {
			System.out.println(item.length() +" "+item);
		}
		
		System.out.println("java포함여부 : "+list.contains("java"));
		
		System.out.println("전체내용출력");
		for(int i=0; i<list.size(); i++) {
			System.out.println(i+" : "+list.get(i));
		}
		
		System.out.println("\n세 번째 요소 : " + list.get(2));
		System.out.println("세 번째 요소 길이: " + list.get(2).length()); // 글자 수
		
		System.out.println("총개체수 : "+list.size());
		
	}

}

package arraylist;

import java.util.HashMap;
import java.util.Map;

public class hashmap {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		//배열에서 인덱스대신 사용자가 지정한 키로 인덱싱함
		map.put("first", "켈리");
		map.put("second","오드리");
		
		//원소확인방법
		System.out.println(map.get("first"));
		
		//전체원소확인
		System.out.println(map.entrySet());
		for(Map.Entry<String, String>item : map.entrySet()) {
			System.out.printf("key: %s, value: %s\n",item.getKey(),item.getValue());
		}
		
		//키만확인
		System.out.println(map.keySet());
		for(String key:map.keySet()) {
			System.out.println(map.get(key));
		}
		//원소삭제하는경우
		System.out.println(map.remove("first"));
		//크기확인
		System.out.println(map.size());
	}

}

package map;

import java.util.HashMap;
import java.util.Map;

public class Mapex3multi {

	public static void main(String[] args) {
		Map<String, String[]> phone = new HashMap<String, String[]>();
		phone.put("친구1", new String[] { "010-1111-1111", "02-1111-1111", "fr1@multi.com" });
		phone.put("친구2", new String[] { "010-2222-2222", "031-2222-2222", "fr2@multi.com" });
		phone.put("부장님", new String[] { "010-3333-3333", "032-3333-3333", "boss@multi.com" });
		phone.put("회사동기", new String[] { "010-7777-7777", "02-7777-7777", "com@multi.com" });
		phone.put("동창", new String[] { "010-9999-9999", "02-9999-9999", "shcool@multi.com" });
		
		System.out.println("총그룹수 : "+phone.size());
		System.out.println(phone.keySet());
		System.out.println(phone.values());
		System.out.println(phone.get("친구1"));
		System.out.println("내 연락처 모든정보");
		
		for(String k:phone.keySet()) {
			System.out.print(k+" : ");
//			String[] v = phone.get(k);
			for(String ar : phone.get(k)) {
				System.out.print(ar+" | ");
			}
			System.out.println();
			
//			배열 -> String[] a = {}; -> a[0],a[1]....
		}
		
//		회사동기검색
		System.out.println("회사동기검색");
		if(phone.containsKey("회사동기")) {
			for(String k:phone.get("회사동기"))
				System.out.println(k);
		}
		
	

	}

}

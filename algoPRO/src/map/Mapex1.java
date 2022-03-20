package map;

import java.util.HashMap;
import java.util.Map;

public class Mapex1 {
	
	//put,get("키")-벨류값가져옴,keyset-키정보가져옴,value-벨류정보가져옴,remove,clear

	public static void main(String[] args) {
		Map<String,Integer> m = new HashMap<String,Integer>();
		m.put("리나", 95);
		m.put("체리", 93);
		m.put("세라", 95);
		m.put("네티", 98);
		m.put("피치", 96);
		
		System.out.println(m);
		System.out.println(m.size());
		System.out.println(m.get("리나"));
		System.out.println(m.keySet());
		System.out.println(m.values());
		
		for(String key:m.keySet()) {
			System.out.println(key+" : "+m.get(key));
		}
		
		m.remove("리나");
		System.out.println(m);
		m.clear();
		System.out.println(m.size());
	}

}

package map;

import java.util.HashMap;
import java.util.Map;

public class Mapex1 {
	
	//put,get("Ű")-������������,keyset-Ű����������,value-��������������,remove,clear

	public static void main(String[] args) {
		Map<String,Integer> m = new HashMap<String,Integer>();
		m.put("����", 95);
		m.put("ü��", 93);
		m.put("����", 95);
		m.put("��Ƽ", 98);
		m.put("��ġ", 96);
		
		System.out.println(m);
		System.out.println(m.size());
		System.out.println(m.get("����"));
		System.out.println(m.keySet());
		System.out.println(m.values());
		
		for(String key:m.keySet()) {
			System.out.println(key+" : "+m.get(key));
		}
		
		m.remove("����");
		System.out.println(m);
		m.clear();
		System.out.println(m.size());
	}

}

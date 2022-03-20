package map;

import java.util.HashMap;
import java.util.Map;

public class Mapex3multi {

	public static void main(String[] args) {
		Map<String, String[]> phone = new HashMap<String, String[]>();
		phone.put("ģ��1", new String[] { "010-1111-1111", "02-1111-1111", "fr1@multi.com" });
		phone.put("ģ��2", new String[] { "010-2222-2222", "031-2222-2222", "fr2@multi.com" });
		phone.put("�����", new String[] { "010-3333-3333", "032-3333-3333", "boss@multi.com" });
		phone.put("ȸ�絿��", new String[] { "010-7777-7777", "02-7777-7777", "com@multi.com" });
		phone.put("��â", new String[] { "010-9999-9999", "02-9999-9999", "shcool@multi.com" });
		
		System.out.println("�ѱ׷�� : "+phone.size());
		System.out.println(phone.keySet());
		System.out.println(phone.values());
		System.out.println(phone.get("ģ��1"));
		System.out.println("�� ����ó �������");
		
		for(String k:phone.keySet()) {
			System.out.print(k+" : ");
//			String[] v = phone.get(k);
			for(String ar : phone.get(k)) {
				System.out.print(ar+" | ");
			}
			System.out.println();
			
//			�迭 -> String[] a = {}; -> a[0],a[1]....
		}
		
//		ȸ�絿��˻�
		System.out.println("ȸ�絿��˻�");
		if(phone.containsKey("ȸ�絿��")) {
			for(String k:phone.get("ȸ�絿��"))
				System.out.println(k);
		}
		
	

	}

}

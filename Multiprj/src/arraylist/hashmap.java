package arraylist;

import java.util.HashMap;
import java.util.Map;

public class hashmap {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		//�迭���� �ε������ ����ڰ� ������ Ű�� �ε�����
		map.put("first", "�̸�");
		map.put("second","���帮");
		
		//����Ȯ�ι��
		System.out.println(map.get("first"));
		
		//��ü����Ȯ��
		System.out.println(map.entrySet());
		for(Map.Entry<String, String>item : map.entrySet()) {
			System.out.printf("key: %s, value: %s\n",item.getKey(),item.getValue());
		}
		
		//Ű��Ȯ��
		System.out.println(map.keySet());
		for(String key:map.keySet()) {
			System.out.println(map.get(key));
		}
		//���һ����ϴ°��
		System.out.println(map.remove("first"));
		//ũ��Ȯ��
		System.out.println(map.size());
	}

}

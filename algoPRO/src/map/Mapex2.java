package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Mapex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String,String> m = new HashMap<String,String>();
		m.put("apple","���");
		m.put("summer","����");
		m.put("candy","����");
		m.put("school","�б�");
		m.put("bus","����");
		m.put("water","��");
		
		while(true) {
			System.out.println("ã����� �ܾ��? : ");
			String in = sc.nextLine();
			
			if(in.equals("exit")) {
				System.out.println("�����մϴ�");
				System.exit(0);
				sc.close();
			}
			else {
				if(m.keySet().contains(in)) {
					System.out.println(m.get(in)+" // Ű����>"+in);
				}
				else {
					System.out.println(in+"�� ���� �ܾ��Դϴ�");
				}
			}
			
		}
		
	}

}

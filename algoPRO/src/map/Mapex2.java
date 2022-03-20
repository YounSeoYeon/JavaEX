package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Mapex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String,String> m = new HashMap<String,String>();
		m.put("apple","사과");
		m.put("summer","여름");
		m.put("candy","사탕");
		m.put("school","학교");
		m.put("bus","버스");
		m.put("water","물");
		
		while(true) {
			System.out.println("찾고싶은 단어는? : ");
			String in = sc.nextLine();
			
			if(in.equals("exit")) {
				System.out.println("종료합니다");
				System.exit(0);
				sc.close();
			}
			else {
				if(m.keySet().contains(in)) {
					System.out.println(m.get(in)+" // 키값은>"+in);
				}
				else {
					System.out.println(in+"은 없는 단어입니다");
				}
			}
			
		}
		
	}

}

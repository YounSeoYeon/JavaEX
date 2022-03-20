package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListEx3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<String>();

		System.out.println("단어를 입력하세요");
		
		for(int i = 0; i< 4; i++) {
			System.out.print("단어 입력 : ");
			list.add(sc.nextLine());
		}


		System.out.println("------------------");


		System.out.println();
		String str = list.get(0);
		int max = list.get(0).length();

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).length() > max)
				max = list.get(i).length();
			str = list.get(i);
		}

		System.out.println("단어리스트 : "+list);
		System.out.println("가장 긴 단어 " + str);
		System.out.print("가장 긴 단어 길이: " + max);

		sc.close();
	}

}

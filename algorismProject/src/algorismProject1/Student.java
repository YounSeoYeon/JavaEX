package algorismProject1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�л����Է� : ");
		int num = sc.nextInt();
		
		List<Integer> list = new ArrayList<Integer>();
		for(int i=1; i<num+1; i++) {
			System.out.print("�л� "+i+" ���� �Է� : ");
			list.add(sc.nextInt());
		}
		System.out.println(list.size());
//		System.out.println(list.get(1));
		
		System.out.println("���� ������ ����");
		selectionsort(list);
		
		for(int i=1; i<num+1; i++) {
			System.out.println(i+"�� : "+list.get(i-1));
		}
		
		sc.close();
	}

	public static void selectionsort(List<Integer> list) {
		int temp;
		for(int i=0; i<list.size()-1; i++) {
			for(int j=i+1; j<list.size(); j++) {
				if(list.get(i)<list.get(j)) {
					temp=list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
				
			}
		}
	}

}

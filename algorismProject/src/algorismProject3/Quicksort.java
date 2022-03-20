package algorismProject3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quicksort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("학생수입력 : ");
		int num = sc.nextInt();
		
		List<Integer> list = new ArrayList<Integer>();
		for(int i=1; i<num+1; i++) {
			System.out.print("학생 "+i+" 점수 입력 : ");
			list.add(sc.nextInt());
		}
		System.out.println(list.size());
//		System.out.println(list.get(1));
		
		System.out.println("성적 순으로 정렬");
		quicksort(list,0,list.size()-1);
		
		for(int i=1; i<num+1; i++) {
			System.out.println(i+"등 : "+list.get(num-i));
		}
		
		sc.close();
	}

	private static void quicksort(List<Integer> list, int low, int high) {
		if(low>high) {
			return;
		}
		
		int pivot=low;
		int i=low+1;
		int j=high;
		int temp;
		
		while(i<=j) {
			while(i<=high&&list.get(i)<list.get(pivot)) {
				i++;				
			}
			while(j>low && list.get(j)>=list.get(pivot)) {
				j--;
			}
			if(i>j) {
				temp=list.get(j);
				list.set(j, list.get(pivot));
				list.set(pivot, temp);
			}else {
				temp=list.get(i);
				list.set(i, list.get(j));
				list.set(j, temp);
			}
		}
		
		quicksort(list, low, j-1);
		quicksort(list, j+1, high);
	}

}
	
	
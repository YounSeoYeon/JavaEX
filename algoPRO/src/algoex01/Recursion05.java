package algoex01;

import java.util.Scanner;

public class Recursion05 {

	public static void main(String[] args) {
		
		//알고리즘 욕심쟁이기법 - 거스름돈
		
		Scanner sc = new Scanner(System.in);
		int[] unit = {5000,1000,500,100,50,10};
		
		System.out.print("금액입력 : ");
		int x = sc.nextInt();
		
		for(int i=0; i<unit.length; i++) {
			// 나누기 한 몫
			System.out.println(unit[i]+"원 : "+ x/unit[i]); 
			
			// 큰금액으로 나누기하고 나머지가 x값이 됨-그거를 다시 작은수로 나눔
			x %= unit[i];
		}
		
		System.out.println("나머지 : "+x);
		sc.close();
	}

}

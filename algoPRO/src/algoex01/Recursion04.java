package algoex01;

import java.util.Scanner;

public class Recursion04 {

	public static void main(String[] args) {
		
		//하노이 탑

		Scanner sc = new Scanner(System.in);
        System.out.print("원반 개수 입력 : ");
        int n = sc.nextInt();
        
        hanoi(1, 2, 3, n); //1번 기둥의 n개를 3번 기둥으로 옮김
	}
	
	
	static void hanoi(int from, int m, int to, int n) { // from -> to로 원판 n이동
		System.out.printf("f:%d m:%d t:%d n:%d\n",from,m,to,n);
		
		if(n == 0)
			return;
		
		hanoi(from, to, m, n-1); // 원판 n-1을 from -> m으로 이동
		System.out.printf("원반 [%d]을 %d에서 %d로 이동\n", n, from, to);//원판 n이 from -> to로 이동
		hanoi(m, from, to, n-1); // 원판 n-1을 m -> to로 이동
	}
}

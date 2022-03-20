package algoex01;

public class algo01 {

	public static void main(String[] args) {		

		//연습문제
		//양음의 덧셈
		//1부터 100까지의 정수
		//1-2+3-4+5…. +97-98+99-100
		//총합을 구하여 출력
		int sum = 0;
		
		for(int i=1; i<101; i++) {
			if(i%2==0) {
				sum -= i;
			}
			else
				sum += i;
		}
		System.out.println(sum);

	}

}

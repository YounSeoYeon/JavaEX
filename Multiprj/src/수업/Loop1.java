package 수업;

public class Loop1 {

	public static void main(String[] args) {
		 // 문제1) 1~5까지의 합 출력
		// 정답 1) 15
		
		// 문제2) 1~10까지 반복해 3미만 7이상만 출력
		// 정답2) 1, 2, 7, 8, 9, 10
		
		// 문제3) 문제2의 조건에 맞는 수들의 합 출력
		// 정답3) 37
		
		// 문제4) 문제2의 조건에 맞는 수들의 개수 출력
		// 정답4) 6
		
		int a = 0;
		for(int i=0; i<5; i++) {
			a += (i+1);
		}
		System.out.println(a);
		
		System.out.println("===============");
		
		int b = 0;
		int total = 0;
		int count=0;
		while(b<10) {
			b++;
			if(b<3 || b>=7) {
				System.out.print(b+" ");
				total += b;
				count ++;
			}
		}
		System.out.println();
		System.out.println(total);
		System.out.println(count);
	}

}

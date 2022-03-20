package 수업;

public class method05 {

	public static void main(String[] args) {
		Ex05 e = new Ex05();
        int[] arr = {87, 100, 11, 72, 92};
        
        // 문제 1) 전체 합 리턴
        // 정답 1) 362
        int tot = e.test1(arr);
        System.out.println("tot = " + tot);



        // 문제 2) 4의 배수의 합 리턴
        // 정답 2) 264
        tot = e.test2(arr);
        System.out.println("tot = " + tot);



        // 문제 3) 4의 배수의 개수 리턴
        // 정답 3) 3
        int cnt = e.test3(arr);
        System.out.println("cnt = " + cnt);



        // 문제 4) 짝수의 개수 리턴
        // 정답 4) 3
        cnt = e.test4(arr);
        System.out.println("cnt = " + cnt);
	}

}

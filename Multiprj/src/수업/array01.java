package 수업;

import java.util.Random;
import java.util.Scanner;

public class array01 {

	public static void main(String[] args) {
		// 문제1) for문을 이용하여 10부터 50까지 arr 배열에 저장
        // 정답1) 10 20 30 40 50

        // 문제2) 1번에서 생성한 arr에서 4의 배수만 출력
        // 정답2) 20 40

        // 문제3) 1번에서 생성한 arr에서 4의 배수의 합 출력
        // 정답3) 60

        // 문제4) 1번에서 생성한 arr에서 4의 배수의 개수를 출력
        // 정답4) 2

        // 문제5) 1번에서 생성한 arr에서 짝수의 개수를 출력
        // 정답5) 5
		
		int[] ar = new int[5];
		for(int i=0; i<5; i++) {
			ar[i] = (i+1)*10; 
			System.out.println(ar[i]);
		}
		System.out.println(ar.length);
		System.out.println("=========");
		
		 // 문제1) arr배열에 1~100점 사이의 랜덤 정수를 5개 저장
        // 예   1) 87, 11, 92, 14, 47

        // 문제2) 전교생의 총점과 평균 출력
        // 예   2) 총점(251) 평균(50.2)

        // 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
        // 예   3) 2명
		
		Random rd = new Random();
		int[] arr = new int[5];
		for(int i=0; i<arr.length; i++) {
			arr[i] = rd.nextInt(100)+1;
			System.out.println(arr[i]);
		}
		
		int sum = 0;
		double avg = 0.0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
			avg = sum/5.0;
		}
		System.out.println(sum);
		System.out.println(avg);
		
		int count = 0;
		for(int i=0; i<arr.length; i++)
			if(arr[i]>=60) {
				count++;
			}
		System.out.printf("합격생수 : %d\n",count);
		System.out.println("=============");
		
		 // 인덱스    0   1   2   3   4
		int[] ard = {87, 11, 45, 98, 23};
		
		// 문제1) 인덱스를 입력받아 성적 출력
		// 정답1) 인덱스 입력 : 1	성적 : 11점
		Scanner sc = new Scanner(System.in);
		System.out.println("인덱스 입력 : ");
		System.out.println("성적 : " + ard[sc.nextInt()]);
		
		// 문제2) 성적을 입력받아 인덱스 출력
		// 정답2) 성적 입력 : 11		인덱스 : 1
		int gr = 0;
		System.out.println("성적입력 : ");
		gr = sc.nextInt();
		for(int i=0; i<ard.length; i++) 
			if(gr == ard[i]) {
				System.out.println("인덱스 : "+i);
			}
			
		
		
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		
		// 문제3) 학번을 입력받아 성적 출력
		// 정답3) 학번 입력 : 1003	성적 : 45점
		
		System.out.println("학번입력 : ");
		int hak = sc.nextInt();
		for(int i=0; i<hakbuns.length; i++) {
			if(hak == hakbuns[i])
				System.out.printf("성적 : %d",scores[i]);
		}
	}

}

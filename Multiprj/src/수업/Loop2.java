package 수업;

import java.util.Scanner;

public class Loop2 {

	public static void main(String[] args) {
		/*
		 * 구구단 게임[3단계]
		 * 
		 * 1. 구구단 게임을 5회 반복한다. 2. 정답을 맞추면 20점이다. 3. 게임 종료 후, 성적을 출력한다.
		 * 
		 */

		Scanner sc = new Scanner(System.in);

		int x, y, an, myans = 0;
		int grade = 0;
		int count = 1;

		System.out.println("구구단게임");
		while (count < 6) {
			System.out.printf("%d번째\n", count);
			System.out.println("첫번째숫자입력 : ");
			x = sc.nextInt();
			System.out.println("두번째숫자입력 : ");
			y = sc.nextInt();
			an = x * y;
			System.out.println("정답입력");
			System.out.printf("%d * %d = ? ", x, y);
			myans = sc.nextInt();

			if (an == myans) {
				System.out.printf("%d\n", myans);
				System.out.println("정답입니다");
				grade += 20;
			} else {
				System.out.printf("%d\n", myans);
				System.out.println("틀렸습니다!!");
			}
			count++;
		}
		System.out.printf("당신의 점수는 : %d 입니다", grade);
	}

}

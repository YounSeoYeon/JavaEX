package 수업;

import java.util.Random;
import java.util.Scanner;

public class Ex03 {
	Random ran = new Random();
	Scanner scan = new Scanner(System.in);
	
	//문제 1)
	void setRandomValuesinArray(int [] scores) {
		for(int i=0; i<scores.length; i++) {
			scores[i] = ran.nextInt(100)+1;
		}
	}
	
	//문제 2)
	void printSumAndAverage (int [] scores) {
		int sum = 0;
		double avg;
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		avg = sum/5.0;
		System.out.printf("총점 : %d, 평균 : %f\n",sum,avg);
	}
	
	//문제 3)
	void printWinner (int [] scores) {
		int count = 0;
		for(int i=0; i<scores.length; i++) {
			if(scores[i]>=60) {
				count++;
			}
		}
		System.out.printf("합격자수 : %d\n",count);
	}
	
	//문제 4)
	void printScore1 (int [] scores) {
		Scanner sc = new Scanner(System.in);
		System.out.println("인덱스 입력: ");
		int idx = sc.nextInt(); 
		for(int i=0; i<scores.length; i++) {
			if(idx == i) {
				System.out.printf("인덱스 : %d, 성적 : %d\n",i,scores[i]);
			}
		}
	}
	
	//문제 5)
	void printScore2 (int [] scores) {
		Scanner sc = new Scanner(System.in);
		System.out.println("성적 입력: ");
		int grade = sc.nextInt();
		for(int i=0; i<scores.length; i++) {
			if(grade == scores[i]) {
				System.out.printf("성적 : %d, 인덱스 : %d\n",scores[i],i);
			}
		}
	}
	
	//문제 6)
	void printScore3(int [] hakbuns, int [] scores) {
		Scanner sc = new Scanner(System.in);
		System.out.println("학번 입력: ");
		int ps = sc.nextInt();
		int i=0;
		for( i=0; i<hakbuns.length; i++) {
			if(ps == hakbuns[i]) {
				System.out.printf("학번 : %d, 성적 : %d\n",ps,scores[i]);
				break;
			}
		}
		if(i>=hakbuns.length) {
			System.out.println("해당학번은 존재하지 않습니다");
		}
	}
	
	//문제 7)
	void printNumberOne (int [] hakbuns, int [] scores) {
		System.out.println("1등찾기");
		int max = -1;
		int st = -1;
		for(int i=0; i<hakbuns.length; i++) {
			if(scores[i]>max) {
				max = scores[i];
				st = hakbuns[i];
			}
		}
		System.out.printf("학번 : %d, 성적 : %d\n",st,max);
	}
}

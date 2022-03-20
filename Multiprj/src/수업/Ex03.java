package ����;

import java.util.Random;
import java.util.Scanner;

public class Ex03 {
	Random ran = new Random();
	Scanner scan = new Scanner(System.in);
	
	//���� 1)
	void setRandomValuesinArray(int [] scores) {
		for(int i=0; i<scores.length; i++) {
			scores[i] = ran.nextInt(100)+1;
		}
	}
	
	//���� 2)
	void printSumAndAverage (int [] scores) {
		int sum = 0;
		double avg;
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		avg = sum/5.0;
		System.out.printf("���� : %d, ��� : %f\n",sum,avg);
	}
	
	//���� 3)
	void printWinner (int [] scores) {
		int count = 0;
		for(int i=0; i<scores.length; i++) {
			if(scores[i]>=60) {
				count++;
			}
		}
		System.out.printf("�հ��ڼ� : %d\n",count);
	}
	
	//���� 4)
	void printScore1 (int [] scores) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ε��� �Է�: ");
		int idx = sc.nextInt(); 
		for(int i=0; i<scores.length; i++) {
			if(idx == i) {
				System.out.printf("�ε��� : %d, ���� : %d\n",i,scores[i]);
			}
		}
	}
	
	//���� 5)
	void printScore2 (int [] scores) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է�: ");
		int grade = sc.nextInt();
		for(int i=0; i<scores.length; i++) {
			if(grade == scores[i]) {
				System.out.printf("���� : %d, �ε��� : %d\n",scores[i],i);
			}
		}
	}
	
	//���� 6)
	void printScore3(int [] hakbuns, int [] scores) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�й� �Է�: ");
		int ps = sc.nextInt();
		int i=0;
		for( i=0; i<hakbuns.length; i++) {
			if(ps == hakbuns[i]) {
				System.out.printf("�й� : %d, ���� : %d\n",ps,scores[i]);
				break;
			}
		}
		if(i>=hakbuns.length) {
			System.out.println("�ش��й��� �������� �ʽ��ϴ�");
		}
	}
	
	//���� 7)
	void printNumberOne (int [] hakbuns, int [] scores) {
		System.out.println("1��ã��");
		int max = -1;
		int st = -1;
		for(int i=0; i<hakbuns.length; i++) {
			if(scores[i]>max) {
				max = scores[i];
				st = hakbuns[i];
			}
		}
		System.out.printf("�й� : %d, ���� : %d\n",st,max);
	}
}

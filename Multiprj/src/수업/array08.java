package ����;

import java.util.Scanner;

public class array08 {

	public static void main(String[] args) {
		/* 
		 * # ƽ����
		 * 
		 * 1. ���ۿ� �˻��غ��� ������ ������ �����غ� �� ����
		 * 2. �̴� ����ó�� 1p Ȥ�� 2p�� ���� ���η� 3�� , ���η� 3��, �밢�� 3���� ������ �÷��̾ �¸��ϴ� ����
		 * 3. 1p�� �Է��� �κ��� ȭ�鿡 Oǥ�� , 2p�� �Է��� �κ��� ȭ�鿡 Xǥ��
		 * 
		 * === ƽ���� ===
		 * [X][X][O]
		 * [ ][O][ ]
		 * [ ][ ][ ]
		 * [p1]�ε��� �Է� : 6
		 * === ƽ���� ===
		 * [X][X][O]
		 * [ ][O][ ]
		 * [O][ ][ ]
		 * [p1]�¸�
		 * 
		 */		
		 Scanner sc = new Scanner(System.in);
		 int[] game = new int[9];
		 
		 int win = 0;
		 int turn = 0;
		 while(true) {
			 System.out.println("ƽ����");
			 for(int i=0; i<9; i++) {
				 if(game[i]==0) {
					 System.out.print("[ ]");
				 }
				 else if(game[i]==1) {
					 System.out.print("[0]");
				 }
				 else {
					 System.out.print("[X]");
				 }
				 
				 if(i%3==2) {
					 System.out.println();
				 }
			 }
			 
			 if(turn %2 ==0) {
				 System.out.print("p1�ε����Է� : ");
				 int idx = sc.nextInt();
				 if(game[idx]==0) {
					 game[idx]=1;
					 turn++;
				 }
			 }
			 else if(turn %2 ==1) {
				 System.out.print("p2�ε����Է� : ");
				 int idx = sc.nextInt();
				 if(game[idx]==0) {
					 game[idx]=2;
					 turn++;
				 }				 
			 }
		 for(int i=0; i<9; i+=3) {
			 if(game[i]==2 && game[i+1]==2 && game[i+2]==2) {
				 win = 1;
			 }
			 else if(game[i]==1 && game[i+1]==1 && game[i+2]==1) {
				 win = 2;
			 }
		 }
		 for(int i=0; i<3; i++) {
			 if(game[i]==2 && game[i+3]==2 && game[i+6]==2) {
				 win = 1;
			 }
			 else if(game[i]==1 && game[i+3]==1 && game[i+6]==1) {
				 win = 2;
			 }
		 }		 
		 if(win==1) {
			 System.out.println("p1�¸�");
			 break;
		 }
		 else if(win==2) {
			 System.out.println("p2�¸�");
			 break;
		 }
		 }
		 
		 sc.close();
	}

}

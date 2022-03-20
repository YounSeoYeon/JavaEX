package 수업;

import java.util.Scanner;

public class array08 {

	public static void main(String[] args) {
		/* 
		 * # 틱택토
		 * 
		 * 1. 구글에 검색해보면 실제로 게임을 진행해볼 수 있음
		 * 2. 미니 오목처럼 1p 혹은 2p가 먼저 가로로 3줄 , 세로로 3줄, 대각선 3줄을 선택한 플레이어가 승리하는 게임
		 * 3. 1p가 입력한 부분은 화면에 O표시 , 2p가 입력한 부분은 화면에 X표시
		 * 
		 * === 틱택토 ===
		 * [X][X][O]
		 * [ ][O][ ]
		 * [ ][ ][ ]
		 * [p1]인덱스 입력 : 6
		 * === 틱택토 ===
		 * [X][X][O]
		 * [ ][O][ ]
		 * [O][ ][ ]
		 * [p1]승리
		 * 
		 */		
		 Scanner sc = new Scanner(System.in);
		 int[] game = new int[9];
		 
		 int win = 0;
		 int turn = 0;
		 while(true) {
			 System.out.println("틱택토");
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
				 System.out.print("p1인덱스입력 : ");
				 int idx = sc.nextInt();
				 if(game[idx]==0) {
					 game[idx]=1;
					 turn++;
				 }
			 }
			 else if(turn %2 ==1) {
				 System.out.print("p2인덱스입력 : ");
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
			 System.out.println("p1승리");
			 break;
		 }
		 else if(win==2) {
			 System.out.println("p2승리");
			 break;
		 }
		 }
		 
		 sc.close();
	}

}

package ex10.for_exercise;

import java.util.Scanner;

public class miltiarray01 {

	public static void main(String[] args) {
		
		
             System.out.println("--<5번 문제 풀이>----------------------");
             
             int nums = 12;
             char[][] board = new char[nums][nums];
            
             	for(int y=0; y<nums-2; y++) {
	            	for(int x=0; x<nums-2; x++) 
	            		board[y+1][x+1]='┼';}	            	
	            
	            for(int i=0; i<nums-1; i++) {
	            	board[0][i+1]='┬';
	            	board[nums-1][i+1]='┴';
	            	board[i+1][0]='├';
	            	board[i+1][nums-1]='┤';            
	            }
	            
	            board[nums-nums][nums-nums]='┌';
	            board[nums-nums][nums-1]='┐';
	            board[nums-1][nums-nums]='└';
	            board[nums-1][nums-1]='┘';
	            
	            
	            //-------------------------------------------
	            //순서 짝수일때 흑돌,홀수일때 백돌
	            //흑돌차례,백돌차례 나오게 할것 // 라인 넘어가면 라인을 넘었습니다 다시 입력하십시오
	            //
	            
	            int count = 1;
	            int z = 0;
	            String[][] dol = new String[nums][nums];
	            int ox,oy,oxx,oyy = -1;
	            boolean dols = true;
	            
	            //go: while(count<=nums*nums) 이건 왜 안될까?
	            
	            go: while(true) {
	            	
	            if(dols) {
	            Scanner scan = new Scanner(System.in);
	            System.out.println("백돌 차례");
	            String coor = "";
	            System.out.println("좌표 입력 : ");
	            coor = scan.nextLine();
	            
	            String[] cols = coor.split(" ");
	            
	            
	            // 위에꺼 안에 들어가있으면 에러남!! 주의
	            
	            ox = Integer.parseInt(cols[0]);
	            oy = Integer.parseInt(cols[1]);
	            
	            scan.close();

	            if(ox>=nums || oy>=nums) {
	            	System.out.println("잘못된 좌표. 다시입력하시오");
	            	continue go;
	            }
	            
	            else if(dol[oy][ox]=="○" || dol[oy][ox]=="●")
	            {
	            	System.out.println("이미있는 좌표. 다시입력하시오");
	            	continue go;
	            }
	            	
	            else 
	            	dol[oy][ox]="○";
	            	
	            count++;
	            z++;
	            dols=!dols;
	            }
	            
	            //---------------------------------
	          
	            else {
	        	/*Scanner scan = new Scanner(System.in);
		        System.out.println("흑돌 차례: x space y > ");
		        String line = scan.nextLine();
		        String[] cols = line.split(" ");*/
	            	
				Scanner scan = new Scanner(System.in);
				System.out.println("흑돌 차례");
				String coor = "";
				System.out.println("좌표 입력 : ");
				coor = scan.nextLine();

				String[] cols = coor.split(" ");
				oxx = Integer.parseInt(cols[0]);
				oyy = Integer.parseInt(cols[1]);

				scan.close();
				
				if (oxx >= nums || oyy >= nums) {
					System.out.println("잘못된 좌표. 다시입력하시오");
					continue go;
				}

				else if (dol[oyy][oxx] == "○" || dol[oyy][oxx] == "●") 
				{
					System.out.println("이미있는 좌표. 다시입력하시오");
					continue go;
				}

				else
					dol[oyy][oxx] = "●";

				count++;
				dols=!dols;
	         }
	            
	                 
	           //-----------------------
	            
	            
	            
	            for(int y=0; y<nums; y++) {
	            	for(int x=0; x<nums; x++) {
	            		if(dol[y][x] == null)
	            			System.out.printf("%c",board[y][x]);
	            		else
	            			System.out.printf("%s",dol[y][x]);
	            	}
	            	System.out.println();
	            }
	       }


}
}

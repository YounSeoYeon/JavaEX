package ex10.for_exercise;

import java.util.Scanner;

public class miltiarray02 {

	public static void main(String[] args) {
        
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
           
           //--------------------------
           
           String[][] dol = new String[nums][nums];
           int ox,oy = -1;
           int count = 1;
           int z = 0;
           
           go: while(count<=nums*nums) {
           	
           if(count==2*z+1) {
           System.out.println("백돌 차례");
           Scanner scan = new Scanner(System.in);
           String line = "";
           System.out.println("좌표 입력 : ");
           line = scan.nextLine();
           
           

           String[] cols = line.split(" ");
           
           ox = Integer.parseInt(cols[0]);
           oy = Integer.parseInt(cols[1]);

           if(ox>=nums || oy>=nums) {
           	System.out.println("잘못된 좌표. 다시입력하시오");
           	continue go;
           }
           
           else if(dol[oy][ox]=="○" || dol[oy][ox]=="●")
           {
           	System.out.println("이미있는 좌표. 다시입력하시오");
           	continue go;
           }
           
           else if (dol[oy][ox] == "")
			{	System.out.println("좌표를 다시 입력하세요");
				continue go;
			}
           	
           else {
           	dol[oy][ox]="○";
            count++; 
            z++;
           }
           
           System.out.println();
           }
           
           //---------------------------------
         
           else {
        	/*Scanner scan = new Scanner(System.in);
	        System.out.println("흑돌 차례: x space y > ");
	        String line = scan.nextLine();
	        String[] cols = line.split(" ");*/
           	
			System.out.println("흑돌 차례");
			Scanner scan = new Scanner(System.in);
			String line = "";
			System.out.println("좌표 입력 : ");
			line = scan.nextLine();

			String[] cols = line.split(" ");
			ox = Integer.parseInt(cols[0]);
			oy = Integer.parseInt(cols[1]);

			
			if (ox >= nums || oy >= nums) {
				System.out.println("잘못된 좌표. 다시입력하시오");
				continue go;
			}

			else if (dol[oy][ox] == "○" || dol[oy][ox] == "●") 
			{
				System.out.println("이미있는 좌표. 다시입력하시오");
				continue go;
			}
			else if (dol[oy][ox] == "")
			{	System.out.println("좌표를 다시 입력하세요");
				continue go;
			}

			else {
				dol[oy][ox] = "●";
				count++;
			}
			System.out.println();
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
           
           //---------------------------
           //백돌이 이기는경우
           
           for(int y=0; y<nums; y++) {
             	for(int x=0; x<nums; x++) {
             		if(x+1<=nums && x+2<=nums && x+3<=nums && x+4<=nums && dol[y][x]=="○" && dol[y][x+1]=="○" && dol[y][x+2]=="○" && dol[y][x+3]=="○" && dol[y][x+4]=="○")
             			{System.out.println("☆☆☆백돌 승리☆☆☆");
             			break go;}
             		else if(y+1<=nums && y+2<=nums && y+3<=nums && y+4<=nums && dol[y][x]=="○" && dol[y+1][x]=="○" && dol[y+2][x]=="○" && dol[y+3][x]=="○" && dol[y+4][x]=="○")
             			{System.out.println("☆☆☆백돌 승리☆☆☆");
             			break go;}
             		else if(x+1<=nums && x+2<=nums && x+3<=nums && x+4<=nums && y+1<=nums && y+2<=nums && y+3<=nums && y+4<=nums && dol[y][x]=="○" && dol[y+1][x+1]=="○" && dol[y+2][x+2]=="○" && dol[y+3][x+3]=="○" && dol[y+4][x+4]=="○")
             			{System.out.println("☆☆☆백돌 승리☆☆☆");
             			break go;}
             		else if (y-4>=0 && y-3>=0 && y-2>=0 && y-1>=0 && x+1<=nums && x+2<=nums && x+3<=nums && x+4<=nums && dol[y][x]=="○" && dol[y-1][x+1]=="○" && dol[y-2][x+2]=="○" && dol[y-3][x+3]=="○" && dol[y-4][x+4]=="○")
             			{System.out.println("☆☆☆백돌 승리☆☆☆");
             			break go;}
             		}
             	}
           
           
           for(int y=0; y<nums; y++) {
              	for(int x=0; x<nums; x++) {
              		if(x+1<=nums && x+2<=nums && x+3<=nums && x+4<=nums && dol[y][x]=="●" && dol[y][x+1]=="●" && dol[y][x+2]=="●" && dol[y][x+3]=="●" && dol[y][x+4]=="●")
              			{System.out.println("★★★흑돌 승리★★★");
              			break go;}
              		else if(y+1<=nums && y+2<=nums && y+3<=nums && y+4<=nums && dol[y][x]=="●" && dol[y+1][x]=="●" && dol[y+2][x]=="●" && dol[y+3][x]=="●" && dol[y+4][x]=="●")
              			{System.out.println("★★★흑돌 승리★★★");
              			break go;}
              		else if(x+1<=nums && x+2<=nums && x+3<=nums && x+4<=nums && y+1<=nums && y+2<=nums && y+3<=nums && y+4<=nums && dol[y][x]=="●" && dol[y+1][x+1]=="●" && dol[y+2][x+2]=="●" && dol[y+3][x+3]=="●" && dol[y+4][x+4]=="●")
              			{System.out.println("★★★흑돌 승리★★★");
              			break go;}
              		else if (y-4>=0 && y-3>=0 && y-2>=0 && y-1>=0 && x+1<=nums && x+2<=nums && x+3<=nums && x+4<=nums && dol[y][x]=="●" && dol[y-1][x+1]=="●" && dol[y-2][x+2]=="●" && dol[y-3][x+3]=="●" && dol[y-4][x+4]=="●")
              			{System.out.println("★★★흑돌 승리★★★");
              			break go;}
              		}
              	}
            
           
           
           
     } // while 끝

}
}


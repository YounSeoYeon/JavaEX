package ex10.for_exercise;

import java.util.Scanner;

public class miltiarray01 {

	public static void main(String[] args) {
		
		
             System.out.println("--<5�� ���� Ǯ��>----------------------");
             
             int nums = 12;
             char[][] board = new char[nums][nums];
            
             	for(int y=0; y<nums-2; y++) {
	            	for(int x=0; x<nums-2; x++) 
	            		board[y+1][x+1]='��';}	            	
	            
	            for(int i=0; i<nums-1; i++) {
	            	board[0][i+1]='��';
	            	board[nums-1][i+1]='��';
	            	board[i+1][0]='��';
	            	board[i+1][nums-1]='��';            
	            }
	            
	            board[nums-nums][nums-nums]='��';
	            board[nums-nums][nums-1]='��';
	            board[nums-1][nums-nums]='��';
	            board[nums-1][nums-1]='��';
	            
	            
	            //-------------------------------------------
	            //���� ¦���϶� �浹,Ȧ���϶� �鵹
	            //�浹����,�鵹���� ������ �Ұ� // ���� �Ѿ�� ������ �Ѿ����ϴ� �ٽ� �Է��Ͻʽÿ�
	            //
	            
	            int count = 1;
	            int z = 0;
	            String[][] dol = new String[nums][nums];
	            int ox,oy,oxx,oyy = -1;
	            boolean dols = true;
	            
	            //go: while(count<=nums*nums) �̰� �� �ȵɱ�?
	            
	            go: while(true) {
	            	
	            if(dols) {
	            Scanner scan = new Scanner(System.in);
	            System.out.println("�鵹 ����");
	            String coor = "";
	            System.out.println("��ǥ �Է� : ");
	            coor = scan.nextLine();
	            
	            String[] cols = coor.split(" ");
	            
	            
	            // ������ �ȿ� �������� ������!! ����
	            
	            ox = Integer.parseInt(cols[0]);
	            oy = Integer.parseInt(cols[1]);
	            
	            scan.close();

	            if(ox>=nums || oy>=nums) {
	            	System.out.println("�߸��� ��ǥ. �ٽ��Է��Ͻÿ�");
	            	continue go;
	            }
	            
	            else if(dol[oy][ox]=="��" || dol[oy][ox]=="��")
	            {
	            	System.out.println("�̹��ִ� ��ǥ. �ٽ��Է��Ͻÿ�");
	            	continue go;
	            }
	            	
	            else 
	            	dol[oy][ox]="��";
	            	
	            count++;
	            z++;
	            dols=!dols;
	            }
	            
	            //---------------------------------
	          
	            else {
	        	/*Scanner scan = new Scanner(System.in);
		        System.out.println("�浹 ����: x space y > ");
		        String line = scan.nextLine();
		        String[] cols = line.split(" ");*/
	            	
				Scanner scan = new Scanner(System.in);
				System.out.println("�浹 ����");
				String coor = "";
				System.out.println("��ǥ �Է� : ");
				coor = scan.nextLine();

				String[] cols = coor.split(" ");
				oxx = Integer.parseInt(cols[0]);
				oyy = Integer.parseInt(cols[1]);

				scan.close();
				
				if (oxx >= nums || oyy >= nums) {
					System.out.println("�߸��� ��ǥ. �ٽ��Է��Ͻÿ�");
					continue go;
				}

				else if (dol[oyy][oxx] == "��" || dol[oyy][oxx] == "��") 
				{
					System.out.println("�̹��ִ� ��ǥ. �ٽ��Է��Ͻÿ�");
					continue go;
				}

				else
					dol[oyy][oxx] = "��";

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

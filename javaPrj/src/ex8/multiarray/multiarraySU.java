package ex8.multiarray;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class multiarraySU {

	public static void main(String[] args) throws IOException {
	      {
	          int[] lottos = new int[3*6];
	          {
	             File srcFile = new File("C:\\education\\workspace\\javaPrj\\src\\res\\ex8\\lotto.data");
	             FileInputStream srcFis = new FileInputStream(srcFile);
	             Scanner fscan = new Scanner(srcFis, "UTF-8");
	             
	             for (int j=0;j<3 && fscan.hasNext();j++)
		             for (int i=0;i<6 && fscan.hasNext();i++) {
		                String temp = fscan.next();
		                int num = Integer.parseInt(temp);
		                lottos[j*6+i] = num;            
		             }
	    
	             fscan.close();
	             srcFis.close();
	          }
	       }
	 //----------------------------------------------------------
	       
	          int[][] lottos = new int[3][6];
	          {
	             File srcFile = new File("C:\\education\\workspace\\javaPrj\\src\\res\\ex8\\lotto.data");
	             FileInputStream srcFis = new FileInputStream(srcFile);
	             Scanner fscan = new Scanner(srcFis, "UTF-8");
	             
	             
	             for (int j=0;j<3 && fscan.hasNext();j++)
		             for (int i=0;i<6 && fscan.hasNext();i++) {
		                String temp = fscan.next();
		                int num = Integer.parseInt(temp);
	                lottos[j][i] = num;            
	             }
	    
	             fscan.close();
	             srcFis.close();
	          }
	        
	          /*int[] lotto = {3,4,5,6,7,8};
	          lottos[2] = lotto;
	          */
	          
	          for(int j=0; j<3; j++)
	          {  System.out.printf("%d¹ø : ",j+1);  
	        	  {for(int i=0; i<6; i++) 
	        		System.out.printf("%3d ",lottos[j][i]);
	        	 System.out.println();}
	       }
	       
	       //-----------------------
	       
	       System.out.println("--------¹Ù²ïÈÄ------");
	       
	       //-----------------------
	       
		       int[] temp;
		       temp=lottos[0];
		       lottos[0]=lottos[2];
		       lottos[2]=temp;
		       
		     for(int j=0; j<3; j++)
		       { System.out.printf("%d¹ø : ",j+1);  
		        	  {for(int i=0; i<6; i++) 
		        		System.out.printf("%3d ",lottos[j][i]);
		        	 System.out.println();}
		       }}
		       
	       

	}



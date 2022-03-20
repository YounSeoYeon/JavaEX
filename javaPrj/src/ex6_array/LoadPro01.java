package ex6_array;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class LoadPro01 {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		// 1. �������� ���� �˾ƺ���, �� ���� count ������ �غ��ؼ� ������.
		
		{File srcFile = new File("C:\\education\\workspace\\javaPrj\\src\\res\\figuredata.txt");
		FileInputStream srcFis = new FileInputStream(srcFile);
		Scanner fscan = new Scanner(srcFis);
		
	  int count = 0;  
	     while(fscan.hasNext())
	      {
	        fscan.next();
	         count++;	         
     	    }
	      
	     fscan.close();
	     srcFis.close();      

	     File copyFile = new File("C:\\education\\workspace\\javaPrj\\src\\res\\data-count.txt");
	     FileOutputStream copyFos = new FileOutputStream(copyFile);
	     PrintStream fout = new PrintStream(copyFos);

	     fout.printf("count is %d\n", count);
	      
	     fout.close();
	     copyFos.close();
	      
	      System.out.println("�۾��Ϸ�");}
	      
		
		// --------------------------------------
		
		
	      
		int count = 0;  
	      
	    	{
	    	File srcFile = new File("C:\\education\\workspace\\javaPrj\\src\\res\\figuredata.txt");
	    	FileInputStream srcFis = new FileInputStream(srcFile);
			Scanner fscan = new Scanner(srcFis);
			
		     while(fscan.hasNext()) {
		      
		        fscan.next();
		        count++;	 
		     }        
	     	    
		     fscan.close();
		     srcFis.close();
	    	}

		     // 2. count�� �� ũ���� �迭 ��ü �����ϱ�. �������� nums
		     
	    	int[] nums = new int[count];

	    	{
	    	 File A = new File("C:\\education\\workspace\\javaPrj\\src\\res\\figuredata.txt");
	    	 FileInputStream B = new FileInputStream(A);
			 Scanner C = new Scanner(B);
		     
		     
		     System.out.printf("%d\n",count);
		     
		     
		     // 3. nums �迭�� figuredata�� �����͸� �о �ε��Ѵ�.
		     
		     
		     for(int i=0; i<count; i++) 
		     {
	    	  
		    	 String temp = C.next();
		    	 nums[i] = Integer.parseInt(temp);
	    	  }
		      
		     C.close();
		     B.close();
	    	}
		    
		    // 4. nums �迭�� ���� �ݺ��� �̿� ���.
		    
		    for(int i=0; i<count; i++)
		    	System.out.printf("%d ",nums[i]);
		      
	      System.out.println("---------");
		    
	      
	      File d = new File("C:\\education\\workspace\\javaPrj\\src\\res\\figuredata.txt");
	      FileInputStream f = new FileInputStream(d);
	      Scanner gg = new Scanner(f);
			 
			// 6.���� ���� : ���� �ڵ带 74�� �ƴ� ����ڰ� �Է��� ���� �˻��ϴ� ���α׷����� ����
	      	// 1. (�ܼ�)����ڿ��� �˻��ϰ� ���� ���ڸ� �Է� �޴´�. �������� num
	      	
	      int index = -1;
	      
	      {
	    	  /*int num = 0;
	    	  {
	    		 Scanner scan = new Scanner(System.in);
	    		 System.out.print("�˻��� ���� �Է� : ");
	    		 num = scan.nextInt(); 		
	    	  }*/
	      
	      // 5. �迭���� Ư�� ������ ã�� 
	      	
		       
		    	//�ݺ������� ���鼭 ã�ƺ���. // 74ã��
		    	for(int i=0; i<count; i++)
		    		if(nums[i] == 74) {
		    			index = i;
		    			break;
		    			
		    		}
		    		    		
		    }
	      gg.close();
	      f.close();
		    
		    System.out.printf("index : %d\n", index);
		    System.out.println("\n------------");
		    //7. �迭���� ��ġ�� �ٲٰų� ���� �����ϴ� �ɷ�
		    
		    //���� ������ ���
		    for(int i=0; i<count; i++)
		    	// nums�� �ε��� ��ġ�� ���� ���
		    	System.out.printf("%d ", nums[i]);
		    
		    System.out.println("\n------------");
		    // nums �迭���� ù ������ �ι�° ������ ���� ��ȯ
		    
		    /*int temp;
		    temp = nums[0];
		    nums[0]=nums[1];
		    nums[1]=temp;
		    */
		    
		    // 7-1. �� ������ 0��1��ġ�� ���� �ٲٴ°�. i�� i+1��ġ�� ���� �ٲٱ�
		    // ����� ��� ����� 0��° ���� ���� �ڷ� �з��� ���¿�����
		    
		    int h=0;
		    for(int k=0; k<count-1; k++)
		    	   for(int i=0; i<count-1-k; i++)
			    	{		
			    	// ��ȯ�Ǵ� �� ���� �տ� �ִ� ���� Ŭ���� �ٲٱ� // �ڵ�ȭ
			    	if(nums[0+i]>nums[1+i]) {
			    		int temp;
						temp = nums[0+i];
						nums[0+i] = nums[1+i];
						nums[1+i] = temp;
						}
			    	
			    	Thread.sleep(100);
			    	
			    	//�ܼ� ȭ�� ���� ���� �о��
			    	for(int j=0; j<1; j++)
			    		System.out.println();
			    	
			    	//�߰� ������ ������ ���
			    	for(int j=0; j<count; j++) 
						if(j==i+0 || j==i+1)
							System.out.printf("[%d] ",nums[j]);
						else
							System.out.printf("%d ",nums[j]);
			    	System.out.println("\n------------");
			    	
			    	h++;
			    	System.out.printf("%d ",h);
			    	System.out.println("\n------------");
			    	}
			    	
			    	
			    
			    // ���� ������ ���
			    for(int i=0; i<count; i++)
			    	// nums�� �ε��� ��ġ�� ���� ���
			    	System.out.printf("%d ", nums[i]);
			    System.out.println("\n------------");	
		  
			    

	}

}


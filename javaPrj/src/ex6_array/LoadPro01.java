package ex6_array;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class LoadPro01 {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		// 1. 데이터의 개수 알아보기, 그 값은 count 변수를 준비해서 담을것.
		
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
	      
	      System.out.println("작업완료");}
	      
		
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

		     // 2. count의 값 크기의 배열 객체 생성하기. 참조명은 nums
		     
	    	int[] nums = new int[count];

	    	{
	    	 File A = new File("C:\\education\\workspace\\javaPrj\\src\\res\\figuredata.txt");
	    	 FileInputStream B = new FileInputStream(A);
			 Scanner C = new Scanner(B);
		     
		     
		     System.out.printf("%d\n",count);
		     
		     
		     // 3. nums 배열에 figuredata의 데이터를 읽어서 로드한다.
		     
		     
		     for(int i=0; i<count; i++) 
		     {
	    	  
		    	 String temp = C.next();
		    	 nums[i] = Integer.parseInt(temp);
	    	  }
		      
		     C.close();
		     B.close();
	    	}
		    
		    // 4. nums 배열의 값을 반복문 이용 출력.
		    
		    for(int i=0; i<count; i++)
		    	System.out.printf("%d ",nums[i]);
		      
	      System.out.println("---------");
		    
	      
	      File d = new File("C:\\education\\workspace\\javaPrj\\src\\res\\figuredata.txt");
	      FileInputStream f = new FileInputStream(d);
	      Scanner gg = new Scanner(f);
			 
			// 6.다음 버전 : 다음 코드를 74가 아닌 사용자가 입력한 값을 검색하는 프로그램으로 변경
	      	// 1. (콘솔)사용자에서 검색하고 싶은 숫자를 입력 받는다. 변수명은 num
	      	
	      int index = -1;
	      
	      {
	    	  /*int num = 0;
	    	  {
	    		 Scanner scan = new Scanner(System.in);
	    		 System.out.print("검색할 숫자 입력 : ");
	    		 num = scan.nextInt(); 		
	    	  }*/
	      
	      // 5. 배열에서 특정 데이터 찾기 
	      	
		       
		    	//반복적으로 돌면서 찾아보자. // 74찾기
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
		    //7. 배열에서 위치를 바꾸거나 값을 변경하는 능력
		    
		    //이전 상태의 출력
		    for(int i=0; i<count; i++)
		    	// nums의 인덱스 위치의 값을 출력
		    	System.out.printf("%d ", nums[i]);
		    
		    System.out.println("\n------------");
		    // nums 배열에서 첫 변수와 두번째 변수의 값을 교환
		    
		    /*int temp;
		    temp = nums[0];
		    nums[0]=nums[1];
		    nums[1]=temp;
		    */
		    
		    // 7-1. 위 연산은 0과1위치의 값을 바꾸는것. i와 i+1위치의 값을 바꾸기
		    // 실행된 출력 결과는 0번째 값이 제일 뒤로 밀려난 상태여야함
		    
		    int h=0;
		    for(int k=0; k<count-1; k++)
		    	   for(int i=0; i<count-1-k; i++)
			    	{		
			    	// 교환되는 두 값중 앞에 있는 값이 클때만 바꾸기 // 코드화
			    	if(nums[0+i]>nums[1+i]) {
			    		int temp;
						temp = nums[0+i];
						nums[0+i] = nums[1+i];
						nums[1+i] = temp;
						}
			    	
			    	Thread.sleep(100);
			    	
			    	//콘솔 화면 이전 내용 밀어내기
			    	for(int j=0; j<1; j++)
			    		System.out.println();
			    	
			    	//중간 과정의 데이터 출력
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
			    	
			    	
			    
			    // 이후 상태의 출력
			    for(int i=0; i<count; i++)
			    	// nums의 인덱스 위치의 값을 출력
			    	System.out.printf("%d ", nums[i]);
			    System.out.println("\n------------");	
		  
			    

	}

}


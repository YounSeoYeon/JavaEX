package ex10.for_exercise;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		
		
		// 1. System.out.printf("%c", '┼');을 100번 반복해서 다음과 같은 모양으로 출력하시오.
	      //    (폰트를 굴림으로 하면 조금 더 이쁜 격자형 화면을 볼 수 있다. 설정방법 : Window>Preferences>General>Appearance>Colors and Fonts>Basic>Text Font : Edit)

	      //      ┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼
	      
	      {
	    	  
	         System.out.println("--<1번 문제 풀이>----------------------");
	         // 여기에 코드를 작성하시오.
	         for(int i=0; i<100; i++)
	        	 System.out.printf("%c", '┼');
	         System.out.println();
	         
	      }
	      
	         
	      
	      // 2. 1번 문제에서 풀이한 코드를 복사해서 '┼'문자가 결과가 다음처럼 10x10개의 격자모양으로 출력되도록 수정하시오.
	      
//	      ┼┼┼┼┼┼┼┼┼┼
//	      ┼┼┼┼┼┼┼┼┼┼
//	      ┼┼┼┼┼┼┼┼┼┼
//	      ┼┼┼┼┼┼┼┼┼┼
//	      ┼┼┼┼┼┼┼┼┼┼
//	      ┼┼┼┼┼┼┼┼┼┼
//	      ┼┼┼┼┼┼┼┼┼┼
//	      ┼┼┼┼┼┼┼┼┼┼
//	      ┼┼┼┼┼┼┼┼┼┼
	      
	      System.out.println("--<2번 문제 풀이>----------------------");
	      
	      // 여기에 코드를 작성하시오.
	      
	      for(int j=0; j<10; j++)
	         {for(int i=0; i<10; i++)
	        	 System.out.printf("%c", '┼');
	         System.out.println();}
	      
	      System.out.println();
	      
	      //  3. 2번 문제에서 풀이한 코드를 복사해서 결과가 다음처럼 boar의 테두리를 보강하는 코드로 수정하시오.
	      
//	      --<3번 문제 풀이>----------------------
//	      ┌┬┬┬┬┬┬┬┬┬┬┐
//	      ├┼┼┼┼┼┼┼┼┼┼┤
//	      ├┼┼┼┼┼┼┼┼┼┼┤
//	      ├┼┼┼┼┼┼┼┼┼┼┤
//	      ├┼┼┼┼┼┼┼┼┼┼┤
//	      ├┼┼┼┼┼┼┼┼┼┼┤
//	      ├┼┼┼┼┼┼┼┼┼┼┤
//	      ├┼┼┼┼┼┼┼┼┼┼┤
//	      ├┼┼┼┼┼┼┼┼┼┼┤
//	      ├┼┼┼┼┼┼┼┼┼┼┤
//	      ├┼┼┼┼┼┼┼┼┼┼┤
//	      └┴┴┴┴┴┴┴┴┴┴┘
	      
	      {
	         System.out.println("--<3번 문제 풀이>----------------------");
	         
	         // 여기에 코드를 작성하시오.
	         
	         for(int y=0; y<12; y++)
	         {for(int x=0; x<12; x++)	        	 
	        	if(x==0 && y==0)
	        		System.out.printf("%c", '┌');
	        	else if(y==0 && x!=11)
	        		System.out.printf("%c", '┬');
	        	else if(y==11 && x!=0 && x!=y)
	        		System.out.printf("%c", '┴');	
	        	else if(x==11 && y==0)
	        		System.out.printf("%c", '┐');
	        	else if(x==11 && x!=0 && x!=y)
	        		System.out.printf("%c", '┤');
	        	else if(x==0 && x!=11)
	        		System.out.printf("%c", '├');	
	        	else if(x==11 && y==11)
		        		System.out.printf("%c", '┘');	
	        	else if(x==0 && y==11)
	        		System.out.printf("%c", '└');	
	        	else
	        	 System.out.printf("%c", '┼');
	         System.out.println();}
	      
	         System.out.println();
	      }
	      
	      //  4. 3번 문제에서 풀이한 코드를 복사해서 다음처럼 바둑알 흰돌이 출력되도록  수정하시오.
	      
//	      --<4번 문제 풀이>----------------------
//	      ┌┬┬┬┬┬┬┬┬┬┬┐
//	      ├○┼┼┼┼┼┼┼┼┼┤
//	      ├┼○┼┼┼┼┼┼┼┼┤
//	      ├┼┼○┼┼┼┼┼┼┼┤
//	      ├┼┼┼○┼┼┼┼┼┼┤
//	      ├┼┼┼┼○┼┼┼┼┼┤
//	      ├┼┼┼┼┼○┼┼┼┼┤
//	      ├┼┼┼┼┼┼○┼┼┼┤
//	      ├┼┼┼┼┼┼┼○┼┼┤
//	      ├┼┼┼┼┼┼┼┼○┼┤
//	      ├┼┼┼┼┼┼┼┼┼○┤
//	      └┴┴┴┴┴┴┴┴┴┴┘
	      {
	         System.out.println("--<4번 문제 풀이>----------------------");
	         
	         // 여기에 코드를 작성하시오.
	         
	         for(int y=0; y<12; y++)
	         {for(int x=0; x<12; x++)	        	 
	        	if(x==0 && y==0)
	        		System.out.printf("%c", '┌');
	        	else if(y==0 && x!=11)
	        		System.out.printf("%c", '┬');
	        	else if(y==11 && x!=0 && x!=y)
	        		System.out.printf("%c", '┴');	
	        	else if(x==11 && y==0)
	        		System.out.printf("%c", '┐');
	        	else if(x==11 && x!=0 && x!=y)
	        		System.out.printf("%c", '┤');
	        	else if(x==0 && x!=11)
	        		System.out.printf("%c", '├');	
	        	else if(x==11 && y==11)
		        		System.out.printf("%c", '┘');	
	        	else if(x==0 && y==11)
	        		System.out.printf("%c", '└');	
	        	else if(x==y)
	        		System.out.printf("%c", '○');	
	        	else
	        	 System.out.printf("%c", '┼');
	         System.out.println();}
	      
	         System.out.println();
	      }
	         
	      
	      
	   //  5. 4번 문제에서 풀이한 코드를 복사해서 다음처럼 바둑알 흰돌이 입력 받아서 출력되도록  수정하시오.
	      
//	      --<5번 문제 풀이>----------------------
//	      ┌┬┬┬┬┬┬┬┬┬┬┐
//	      ├┼┼┼┼┼┼┼┼┼┼┤
//	      ├┼┼┼┼┼┼┼┼┼┼┤
//	      ├┼┼┼┼┼┼┼┼┼┼┤
//	      ├┼┼┼┼┼┼┼┼┼┼┤
//	      ├┼┼┼┼┼┼┼┼┼┼┤
//	      ├┼┼┼┼┼┼┼┼┼┼┤
//	      ├┼┼┼┼┼┼┼┼┼┼┤
//	      ├┼┼┼┼┼┼┼┼┼┼┤
//	      ├┼┼┼┼┼┼┼┼┼┼┤
//	      ├┼┼┼┼┼┼┼┼┼┼┤
//	      └┴┴┴┴┴┴┴┴┴┴┘
	//
//	      위의 오목판에 오목을 두기 위한 위치를 입력하세요. 입력 방법: x sp y > 3 4
//	      ┌┬┬┬┬┬┬┬┬┬┬┐
//	      ├┼┼┼┼┼┼┼┼┼┼┤
//	      ├┼┼┼┼┼┼┼┼┼┼┤
//	      ├┼┼┼┼┼┼┼┼┼┼┤
//	      ├┼┼○┼┼┼┼┼┼┼┤
//	      ├┼┼┼┼┼┼┼┼┼┼┤
//	      ├┼┼┼┼┼┼┼┼┼┼┤
//	      ├┼┼┼┼┼┼┼┼┼┼┤
//	      ├┼┼┼┼┼┼┼┼┼┼┤
//	      ├┼┼┼┼┼┼┼┼┼┼┤
//	      ├┼┼┼┼┼┼┼┼┼┼┤
//	      └┴┴┴┴┴┴┴┴┴┴┘
	      
	      
	      {
	         System.out.println("--<5번 문제 풀이>----------------------");      
	                           
	         
	         
	         // 여기에 코드를 작성하시오.
	         
	         int px=-1;
	         int py=-1;
	         
	         Scanner scan = new Scanner(System.in);
	         System.out.printf("위치 입력 : x space y > ");
	         String PX = scan.next();
	         String PY = scan.next();
	         px=Integer.parseInt(PX);
	         py=Integer.parseInt(PY);
	         {      
		         for(int y=0; y<12; y++)
		         {for(int x=0; x<12; x++)	        	 
		        	if(x==0 && y==0)
		        		System.out.printf("%c", '┌');
		        	else if(y==0 && x!=11)
		        		System.out.printf("%c", '┬');
		        	else if(y==11 && x!=0 && x!=y)
		        		System.out.printf("%c", '┴');	
		        	else if(x==11 && y==0)
		        		System.out.printf("%c", '┐');
		        	else if(x==11 && x!=0 && x!=y)
		        		System.out.printf("%c", '┤');
		        	else if(x==0 && x!=11)
		        		System.out.printf("%c", '├');	
		        	else if(x==11 && y==11)
			        		System.out.printf("%c", '┘');	
		        	else if(x==0 && y==11)
		        		System.out.printf("%c", '└');	
		        	else if(x==px && y==py)
		        		System.out.printf("%c", '○');	
		        	else
		        	 System.out.printf("%c", '┼');
		         System.out.println();}
		      
		         scan.close();
	         System.out.println();
	      }}
	      
	   //  6. 5번 문제를 응용해서 오목을 반복적으로 입력 받는 코드를 작성하려고 했다. 하지만 그것이 불가능하거나 비효율적이었다.
//	      왜 그런지 본인이 코드를 작성해보면서 느낀 점을 기술하시오. ( 단. 배열을 사용하지 말 것)
	      
	      // 여기에 답안을 기술하시오.

	}

}

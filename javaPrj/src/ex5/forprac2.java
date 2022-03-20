package ex5;

public class forprac2 {

	public static void main(String[] args) {
		
		System.out.println("for 연습 2");
		
		
		for(int y=0; y<11; y++) 
		{
			for(int x=0; x<11; x++)
				if(y==x || y==-x+10)
				System.out.print("★");
				else
				System.out.print(" ");
			System.out.println();
			
			}
		
		// 숙제1
		
		for(int s=0; s<10; s++)
			for(int x=0; x<=s; x++)
			{if(x==s)
				{System.out.print("*");
				System.out.println();}
			else
				System.out.print("　");
			}		
		System.out.println();
		
		// 숙제1-1
		
		for(int d=0; d<10; d++)
			{for(int y=0; y<d; y++)
				System.out.print(" ");
			System.out.print("*");
			System.out.println();}
		
		// 숙제2
		
		for(int i=0; i<10; i++)
			{for(int p=0; p<i; p++)
				System.out.print("*");
			System.out.println();}
			
		
		//[]특정숫자에 괄호		- 수열이용!!
		
		for(int i=0,n=1; i<10; i++)
			if(i+1==1+(n-1)*3)
			{System.out.printf("[%d]", i+1);	
			n++;}
			else
			System.out.printf("%d", i+1);
		System.out.println();
		
		//내가 한거
		for(int i=0; i<10; i++)
			if((i%3)==0)
			System.out.printf("[%d]", i+1);	
			else
			System.out.printf("%d", i+1);
		
		System.out.println();
		//혼자연습
		for(int i=0; i<10; i++)
			System.out.printf("%d", (i+10)%10);
		
		System.out.println();
		
		//10~1로 출력
		for(int i=0; i<10; i++)
			System.out.printf("%d", 10-i);
	
		System.out.println();
		
		//1~10으로 출력
		for(int i=0; i<10; i++)
			System.out.printf("%d", i+1);
			
		System.out.println();
		
		//별찍기
		System.out.println("for 연습 1");
		for(int i=0; i<10; i++)
			System.out.print("*");

	}

}

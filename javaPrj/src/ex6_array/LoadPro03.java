package ex6_array;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class LoadPro03 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// 배열
		// 1. 데이터의 개수 알아보기, 그 값은 count 변수를 준비해서 담을것.
		// 2. count의 값 크기의 배열 객체 생성하기. 참조명은 nums
		// 3. nums 배열에 figuredata의 데이터를 읽어서 로드한다.
		// 4. nums 배열의 값을 반복문 이용 출력. // 17일
		
		// 5. 배열에서 특정 데이터 찾기. 90
		// 6. 다음 버전 : 다음 코드를 90이 아닌 사용자가 입력한 값을 검색하는 프로그램으로 변경
      	// 6-1. (콘솔)사용자에서 검색하고 싶은 숫자를 입력 받는다. 변수명은 num
		// 7. 배열에서 위치를 바꾸거나 값을 변경하는 능력
		// 7-1. 위 연산은 0과1위치의 값을 바꾸는것. i와 i+1위치의 값을 바꾸기
	    // 실행된 출력 결과는 0번째 값이 제일 뒤로 밀려난 상태여야함 // 18일
		
		
		//1.
		int count=0;

		{File srcFile = new File("C:\\education\\workspace\\javaPrj\\src\\res\\figuredata.txt");
		FileInputStream srcFis = new FileInputStream(srcFile);
		Scanner fscan = new Scanner(srcFis);
		
		while(fscan.hasNext())
			{
			fscan.next();
			count++;
			}
				
		fscan.close();
		srcFis.close();
		
		System.out.printf("%d\n",count);
		System.out.println("--1 완료-------------------------------");
		}
		
		
		//2.

		int[] nums = new int[count];
		
		{File srcFile = new File("C:\\education\\workspace\\javaPrj\\src\\res\\figuredata.txt");
		FileInputStream srcFis = new FileInputStream(srcFile);
		Scanner fscan = new Scanner(srcFis);
		
		
		//3.
		for(int i=0; i<count; i++) {
			String x=fscan.next();
			nums[i]=Integer.parseInt(x);
		}
			
		
		fscan.close();
		srcFis.close();
		}
		
		//4.
		for(int i=0; i<count; i++)
			System.out.printf("%d ",nums[i]);
		System.out.println("\n--4 완료--------------------");
		
		//5.배열에서 특정 데이터 찾기. 90
		
		int index = -1;
			{for(int i=0; i<count; i++)
				if(nums[i]==90)
					index = i;		
			}
			System.out.printf("%d ",index);	
		System.out.println("\n--5 완료--------------------");	
		
		//6.다음 버전 : 다음 코드를 90이 아닌 사용자가 입력한 값을 검색하는 프로그램으로 변경
		//6-1. (콘솔)사용자에서 검색하고 싶은 숫자를 입력 받는다. 변수명은 num
		
		int idx2 = -1;
		int num = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("검색할 값 입력: ");
		num = scan.nextInt();
		
		for(int i=0; i<count; i++)
			if(nums[i]==num) {
				idx2=i;
				break;
				}
			System.out.printf("%d ", idx2);
			
			scan.close();
		System.out.println("\n--6 완료--------------------");		
		
		
		// 7. 배열에서 위치를 바꾸거나 값을 변경하는 능력
		// 7-1. 위 연산은 0과1위치의 값을 바꾸는것. i와 i+1위치의 값을 바꾸기
		// 실행된 출력 결과는 0번째 값이 제일 뒤로 밀려난 상태여야함 //
		
		for(int i=0; i<count; i++)
			if(i==0)
				System.out.printf("[%d] ",nums[i]);
			else
				System.out.printf("%d ",nums[i]);
		
		
		System.out.println("\n------------------");	
		
		for (int i = 0; i < count - 1; i++) {
			int temp;
			temp = nums[0 + i];
			nums[0 + i] = nums[1 + i];
			nums[1 + i] = temp;

			Thread.sleep(100);

			for (int j = 0; j < 2; j++)
				System.out.println();

			for (int j = 0; j < count; j++)
				if (j == i + 1)
					System.out.printf("[%d] ", nums[j]);
				else
					System.out.printf("%d ", nums[j]);
		}

		System.out.println("\n------------------");	
		
		for(int i=0; i<count; i++)
			System.out.printf("%d ", nums[i]);
		
		System.out.println("\n------------------");	
		System.out.println("\n------------------");
		System.out.println("\n------------------");
		
		// 8. 교환되는 두 값중 앞에 있는 값이 클때만 바꾸기(제일 큰놈 순으로 정렬)
		
		int m=0;
		for(int k=0; k<count-1; k++) {
			for(int i=0; i<count-1-k; i++) {
				if(nums[0+i]>nums[1+i]) {
					int temp=0;
					temp=nums[0+i];
					nums[0+i]=nums[1+i];
					nums[1+i]=temp;
				}
				
				Thread.sleep(200);
				
			for(int j=0; j<1; j++)
				System.out.println();
			for(int n=0; n<count; n++)
				if(n==i+0 || n==1+i)
					System.out.printf("[%d] ",nums[n]);
				else
					System.out.printf("%d ",nums[n]);
			m++;
			System.out.printf(" %d ",m);
			}
			
		} 
		
		// 위에 정렬한거 토대로 중간값,평균등등 구하기
			
	}

}

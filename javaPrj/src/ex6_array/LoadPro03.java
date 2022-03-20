package ex6_array;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class LoadPro03 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// �迭
		// 1. �������� ���� �˾ƺ���, �� ���� count ������ �غ��ؼ� ������.
		// 2. count�� �� ũ���� �迭 ��ü �����ϱ�. �������� nums
		// 3. nums �迭�� figuredata�� �����͸� �о �ε��Ѵ�.
		// 4. nums �迭�� ���� �ݺ��� �̿� ���. // 17��
		
		// 5. �迭���� Ư�� ������ ã��. 90
		// 6. ���� ���� : ���� �ڵ带 90�� �ƴ� ����ڰ� �Է��� ���� �˻��ϴ� ���α׷����� ����
      	// 6-1. (�ܼ�)����ڿ��� �˻��ϰ� ���� ���ڸ� �Է� �޴´�. �������� num
		// 7. �迭���� ��ġ�� �ٲٰų� ���� �����ϴ� �ɷ�
		// 7-1. �� ������ 0��1��ġ�� ���� �ٲٴ°�. i�� i+1��ġ�� ���� �ٲٱ�
	    // ����� ��� ����� 0��° ���� ���� �ڷ� �з��� ���¿����� // 18��
		
		
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
		System.out.println("--1 �Ϸ�-------------------------------");
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
		System.out.println("\n--4 �Ϸ�--------------------");
		
		//5.�迭���� Ư�� ������ ã��. 90
		
		int index = -1;
			{for(int i=0; i<count; i++)
				if(nums[i]==90)
					index = i;		
			}
			System.out.printf("%d ",index);	
		System.out.println("\n--5 �Ϸ�--------------------");	
		
		//6.���� ���� : ���� �ڵ带 90�� �ƴ� ����ڰ� �Է��� ���� �˻��ϴ� ���α׷����� ����
		//6-1. (�ܼ�)����ڿ��� �˻��ϰ� ���� ���ڸ� �Է� �޴´�. �������� num
		
		int idx2 = -1;
		int num = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("�˻��� �� �Է�: ");
		num = scan.nextInt();
		
		for(int i=0; i<count; i++)
			if(nums[i]==num) {
				idx2=i;
				break;
				}
			System.out.printf("%d ", idx2);
			
			scan.close();
		System.out.println("\n--6 �Ϸ�--------------------");		
		
		
		// 7. �迭���� ��ġ�� �ٲٰų� ���� �����ϴ� �ɷ�
		// 7-1. �� ������ 0��1��ġ�� ���� �ٲٴ°�. i�� i+1��ġ�� ���� �ٲٱ�
		// ����� ��� ����� 0��° ���� ���� �ڷ� �з��� ���¿����� //
		
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
		
		// 8. ��ȯ�Ǵ� �� ���� �տ� �ִ� ���� Ŭ���� �ٲٱ�(���� ū�� ������ ����)
		
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
		
		// ���� �����Ѱ� ���� �߰���,��յ�� ���ϱ�
			
	}

}

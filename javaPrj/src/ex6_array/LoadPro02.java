package ex6_array;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class LoadPro02 {

	public static void main(String[] args) throws IOException {
		
		// 1. �������� ���� �˾ƺ���, �� ���� count ������ �غ��ؼ� ������.
		// 2. count�� �� ũ���� �迭 ��ü �����ϱ�. �������� nums
		// 3. nums �迭�� figuredata�� �����͸� �о �ε��Ѵ�.
		// 4. nums �迭�� ���� �ݺ��� �̿� ���.
		
		File srcFile = new File("C:\\education\\workspace\\javaPrj\\src\\res\\figuredata.txt");
		FileInputStream srcFis = new FileInputStream(srcFile);
		Scanner fscan = new Scanner(srcFis); 
		
		int count=0;
		while(fscan.hasNext()) 
		{
			fscan.next();
			count++;
		}		
		
		fscan.close();
		srcFis.close();
		
		System.out.printf("%d\n", count);
				
		
		File srcFile2 = new File("C:\\education\\workspace\\javaPrj\\src\\res\\figuredata.txt");
		FileInputStream srcFis2 = new FileInputStream(srcFile2);
		Scanner fscan2 = new Scanner(srcFis2); 
		
		int[] nums = new int[count];
		
		for(int i=0; i<count; i++) {
			String x = fscan2.next();
			nums[i] = Integer.parseInt(x);
		}

		fscan2.close();
		srcFis2.close();		
		
		for(int i=0; i<count; i++)
			System.out.printf("%d ",nums[i]);
		
		
		
	}

}

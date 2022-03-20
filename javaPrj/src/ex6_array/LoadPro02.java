package ex6_array;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class LoadPro02 {

	public static void main(String[] args) throws IOException {
		
		// 1. 데이터의 개수 알아보기, 그 값은 count 변수를 준비해서 담을것.
		// 2. count의 값 크기의 배열 객체 생성하기. 참조명은 nums
		// 3. nums 배열에 figuredata의 데이터를 읽어서 로드한다.
		// 4. nums 배열의 값을 반복문 이용 출력.
		
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

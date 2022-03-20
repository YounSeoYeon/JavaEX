package ex6_array;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class LoaeCOVID19ProSuex01 {

	public static void main(String[] args) throws IOException {
		
		
		
		//-----------------------------
		// 1. 데이터 갯수를 얻기 위한 코드
		int count=0;
		
		{File srcFile = new File("C:\\education\\workspace\\javaPrj\\src\\res\\COVID19.TXT");
		FileInputStream srcFis = new FileInputStream(srcFile);
		Scanner scan = new Scanner(srcFis,"UTF-8");
		
			scan.nextLine();
			while(scan.hasNextLine()) {
				scan.nextLine();
				count++;
				}
		
		scan.close();
		srcFis.close();}
		
		System.out.printf("%d ", count);
		
		//----------------------------------------
		
		// 2. 데이터 로드 
		// 3. 데이터 출력
		String[] cities = new String[count];
		String[] dates = new String[count];
		int[] confirmeds = new int[count];
		
		{File srcFile = new File("C:\\education\\workspace\\javaPrj\\src\\res\\COVID19.TXT");
		FileInputStream srcFis = new FileInputStream(srcFile);
		Scanner scan = new Scanner(srcFis,"UTF-8");
		
			scan.nextLine();
			System.out.println("시군명,확진시기,확진자수");
			for(int i=0; i<count; i++) {
				String line = scan.nextLine();
				String[] cols = line.split(",");
				
				cities[i] = cols[0];
				dates[i] = cols[1];
				confirmeds[i] = Integer.parseInt(cols[2]);
			
				System.out.printf("%s,%s,%d \n",cities[i],dates[i],confirmeds[i]);
			}
			
			scan.close();
			srcFis.close();
		}
		
		//-----------------------------
		
		// 4. 춘천지역만으로 한정된 목록 출력하기
		
	/*	{for(int i=0; i<count; i++)
			if(cities[i].equals("춘천"))
				System.out.printf("%s,%s,%d \n", cities[i],dates[i],confirmeds[i]);
		}	
		*/
		//-----------------------------
		
		// 5. 강원도의 어느지역 코로나 상황을 알고싶은가요? 입력하면 값나오도록 // 필터링
		
		/*
		{Scanner idx = new Scanner(System.in);
		System.out.println("어느지역 상황을 알고싶은가요? ");
		String city = idx.nextLine();
		
		for(int i=0; i<count; i++)
			if(cities[i].equals(city))
				System.out.printf("%s,%s,%d \n", cities[i],dates[i],confirmeds[i]);
	
		
		idx.close();
		}
		*/
		
		//----------------------------------------
		
		// 6. "강릉"의 어느 날짜를 알고싶은가요?
		// 1. 전체기간
		// 2. 7월
		// 3. 8월
		
		{Scanner scan = new Scanner(System.in);
		System.out.println("강릉의 어느 날짜를 알고싶은가요? 20년02월~21년07월중 선택 ");
		String month = scan.nextLine();
		
		for(int i=0; i<count; i++) {
			String current = dates[i].split("-")[1];
			if(current.equals(month) && cities[i].equals("강릉"))
				System.out.printf("%s,%s,%d \n", cities[i],dates[i],confirmeds[i]);
			}	

		scan.close();
		}
}
	
}

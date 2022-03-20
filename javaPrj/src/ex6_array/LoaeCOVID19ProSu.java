package ex6_array;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class LoaeCOVID19ProSu {

	public static void main(String[] args) throws IOException {//alt+enter
		int count=0; // 전체크기 미리 정하려고(배열은 방의 크기가 정해져있는 큰방)정적인 크기
		
		{	// 데이터 갯수를 얻기 위한 코드
			File srcFile = new File("C:\\education\\workspace\\javaPrj\\src\\res\\COVID19.txt");
			FileInputStream srcFis = new FileInputStream(srcFile);
			Scanner fscan = new Scanner(srcFis, "UTF-8");
			
			fscan.nextLine(); // 제목있는거 먼저 하나 버리고 시작(이게 제일 많이씀)
			while(fscan.hasNextLine()) {
				fscan.nextLine();
				count++;
			}
			
			fscan.close();
			srcFis.close();
			// count--; // 첨에 시군명 제목 빼야되서 필드명-1 (이렇게 해도됨)
		}
		System.out.println(count);
		
		
		
		
		// 데이터 로드
		
		String[] cities = new String[count];
		String[] dates = new String[count];
		int[] confirmeds = new int[count];
		{
			File srcFile = new File("C:\\education\\workspace\\javaPrj\\src\\res\\COVID19.txt");
			FileInputStream srcFis = new FileInputStream(srcFile);
			Scanner fscan = new Scanner(srcFis, "UTF-8");
			
			fscan.nextLine(); // 버리고 시작
			
			for(int i=0; i<count; i++) {
				String line = fscan.nextLine();
				String[] cols = line.split(",");
				// 여기까지...
				
				cities[i] = cols[0];
				dates[i] = cols[1];
				confirmeds[i] = Integer.parseInt(cols[2]);
			}

			fscan.close();
			srcFis.close();
			
		} 	// 데이터를 출력해보자
			// 데이터 필터링, 집계, 정렬, 대표값(평균,총합,중간값,빈도...) 뽑아낼수 있느냐
		
		
		// 로드된 데이터 출력하기
		/*
		{System.out.println("시군명,확진시기,확진자수");
		for(int i=0; i<count; i++) {
			System.out.printf("%s,",cities[i]);
			System.out.printf("%s,",dates[i]);
			System.out.printf("%d\n",confirmeds[i]);
		}}
		*/
		
		// 춘천지역만으로 한정된 목록 출력하기
		
		/*
		{System.out.println("시군명,확진시기,확진자수");
		for(int i=0; i<count; i++) {
			if(cities[i].equals("춘천"))
				System.out.printf("%s,%s,%d\n", cities[i],dates[i],confirmeds[i]);
		}}
		*/
		
		
		// 강원도의 어느지역 코로나 상황을 알고싶은가요? 입력하면 값나오도록 // 필터링
		/*{
			Scanner scan = new Scanner(System.in);
			System.out.println("어느지역 알고싶나요? ");
			String city = scan.nextLine();
		
			System.out.println("시군명,확진시기,확진자수");
			for(int i=0; i<count; i++) 
				if(cities[i].equals(city))
					System.out.printf("%s,%s,%d\n", cities[i],dates[i],confirmeds[i]);
				
			scan.close();
		}*/
		
		// 숙제 !!!
		// "강릉"의 어느 날짜를 알고싶은가요? // 강릉 먼저 하나 추출
		// 1. 전체기간
		// 2. 7월
		// 3. 8월
		// 강릉먼저 추출한걸 하나 만듬 - 날짜 나눔
		
		/* String[] cities = new String[count];
		String[] dates = new String[count];
		int[] confirmeds = new int[count];*/
		
		
		
		{System.out.println("시군명,확진시기,확진자수");
		
		/*for(int i=0; i<count; i++) {
			if(cities[i].equals("강릉"))
				System.out.printf("%s,%s,%d\n", cities[i],dates[i],confirmeds[i]);
		}*/
		
			System.out.println("강릉 어느날짜? 20년02~21년07중 선택 ");
			Scanner scan = new Scanner(System.in);
			String month = scan.nextLine();
				for(int i=0; i<count; i++) {
					String currentMonth = dates[i].split("-")[1];
					if(cities[i].equals("강릉") && month.equals(currentMonth))
			               System.out.printf("%s %s %d\n", cities[i], dates[i], confirmeds[i]);
				}
				
			
			scan.close();
		}
		
	    /* {
	         System.out.println("몇 월 데이터?\n(02/03/04/05/06/07월 중 입력)");
	         Scanner scan = new Scanner(System.in);
	         String month = scan.nextLine();
	         
	         System.out.println("시군명 확진시기 확진자수");
	         
	         for(int i=0; i<count; i++) {
	            String currentMonth = dates[i].split("-")[1];
	            if(month.equals(currentMonth))
	               System.out.printf("%s %s %d\n", cities[i], dates[i], confirmeds[i]);
	         }

	         scan.close();
	      }*/

		
		
		
	}
}

	
		
	



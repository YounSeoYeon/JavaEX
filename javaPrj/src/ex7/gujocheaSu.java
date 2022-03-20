package ex7;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class gujocheaSu {

	public static void main(String[] args) throws IOException {
		
		// 이렇게 쓰면 안됨. 객체 만들어야함 GangwonCovid19StatusSU status=null;
		
		GangwonCovid19StatusSU status = new GangwonCovid19StatusSU();
		status.city = "춘천";
		status.date = "2022-08-12";
		status.confirmed=2;
		
		System.out.println(status.city);
		
		// 데이터 개수를 얻기
		int count = 0;
		{
		
		}
		// 얻는코드 들어가면 지우기 count = 9468;
		
		// 데이터 로드하기
		/* 데이터 로드 
		 * String[] cities = new String[count]; 
		 * String[] dates = new String[count]; 
		 * int[] confirmeds = new int[count];
		 */
		GangwonCovid19StatusSU[] statuses = new GangwonCovid19StatusSU[count];
	 // ★★이름표만 9468개 만들어진거임. 객체는 아직 하나도 안만들어진거임.
		{
			File srcFile = new File("C:\\education\\workspace\\javaPrj\\src\\res\\COVID19.txt");
			FileInputStream srcFis = new FileInputStream(srcFile);
			Scanner fscan = new Scanner(srcFis, "UTF-8");
			
			fscan.nextLine();
			
			for(int i=0; i<count; i++) {
				String line = fscan.nextLine();
				String[] cols = line.split(",");
				// 여기까지...
				
				statuses[i] = new GangwonCovid19StatusSU(); // 객체생성먼저!
				statuses[i].city = cols[0];
				statuses[i].date = cols[1];
				statuses[i].confirmed = Integer.parseInt(cols[2]);
			}

			fscan.close();
			srcFis.close();
		}
		
		// 춘천 데이터 목록만 출력하기
		
		for(int i=0; i<count; i++)
			if(statuses[i].city.equals("춘천"))
				System.out.printf("%s \n",statuses[i]);
				
	}

}

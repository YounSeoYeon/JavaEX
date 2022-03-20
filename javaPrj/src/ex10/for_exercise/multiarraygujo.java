package ex10.for_exercise;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class multiarraygujo {

	public static void main(String[] args) throws IOException {
		
		ganwon state = new ganwon();
		
		state.city="����";
		state.date="2020-11-10";
		state.su=2;
		
		System.out.println(state.city);
		
		int count=0;
		{
			File file = new File("C:\\education\\workspace\\javaPrj\\src\\res\\COVID19.TXT");
			FileInputStream srcFile = new FileInputStream(file);
			Scanner scan = new Scanner(srcFile);
		
			while(scan.hasNextLine()) {
				scan.nextLine();
				count++;}
			
			scan.close();
			srcFile.close();
		}
		
		System.out.println(count);
		
		
		ganwon[] states = new ganwon[count];
		
		{
			File file = new File("C:\\education\\workspace\\javaPrj\\src\\res\\COVID19.TXT");
			FileInputStream srcFile = new FileInputStream(file);
			Scanner scan = new Scanner(srcFile, "UTF-8");
			
			scan.nextLine();
			
			for(int i=0; i<count; i++) {
				String line = scan.nextLine();
				String[] cols = line.split(",");
				
				states[i] = new ganwon();
				states[i].city = cols[0];
				states[i].date = cols[1];
				states[i].su = Integer.parseInt(cols[2]);
			}
			scan.close();
			srcFile.close();
		}		
		
		for(int i=0; i<count; i++) {
			if(states[i].city.equals("����"))
				System.out.printf("%s",states[i]);
		}
	}
	
}



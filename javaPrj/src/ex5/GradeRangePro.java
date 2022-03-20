package ex5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class GradeRangePro {

	public static void main(String[] args) throws IOException {
		
		File srcFile = new File("C:\\education\\workspace\\javaPrj\\src\\ex5\\data-grade-1");
		FileInputStream copyFos = new FileInputStream(srcFile);
		Scanner fscan = new Scanner(copyFos);
		
		File copypath= new File("src/ex5");
		if(!copypath.exists())
			copypath.mkdir();
		
		FileOutputStream copyr = new FileOutputStream("src/ex5/data-grade-1range");
		PrintStream fout = new PrintStream(copyr);
		
	
		while(fscan.hasNext())
			{
			String grade="";
			String x = fscan.next(); // 내가 한건 grade안쓰고 if-바로 출력하는거로 함
			
			/*
			
			if (x.equals("A+"))
				grade = "95~100";
			else if(x.equals("A"))
				grade = "90~94";
			else if(x.equals("B+"))
				grade = "85~89";
			else if(x.equals("B"))
				grade = "80~84";
			else if(x.equals("C+"))
				grade = "75~79";
			else if(x.equals("C"))
				grade = "70~74";
			else if(x.equals("D+"))
				grade = "65~69";
			else if(x.equals("D"))
				grade = "60~64";
			else
				grade = "0~59";
				
				*/
			
			switch(x)
			{				
			case "A+" :
				grade = "95~100";
				break;
			case "A" :
				grade = "90~94";
				break;
			case "B+" :
				grade = "85~89";
				break;
			case "B"  :
				grade = "80~84";
				break;
			case "C+" :
				grade = "75~79";
				break;
			case "C" : 
				grade = "70~74";
				break;
			case "D+" :
				grade = "65~69";
				break;
			case "D" :
				grade = "60~64";
				break;
			case "F" :	
				grade = "0~59";
				break;
			}
			
			fout.print(grade);
			//마지막이 아니라면 , 마지막이라면.
			if(fscan.hasNext())
				fout.print(",");
			else
				fout.print(".");
			
			
			}
		
		fscan.close();
		fout.close();
		copyFos.close();
		copyr.close();
		
		
		System.out.println("완료");

		
	}

	}


package ex5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class gradeprogram01 {

	public static void main(String[] args) throws IOException {
		
		/* 학점을 매기는 프로그램

입력파일 : res/figuredata.txt
출력파일 : res/ex4/data-grade.txt

95~100 -> A+
90~94 -> A
85~89 -> B+
80~84 -> B
75~79 -> C+
70~74 -> C
65~69 -> D+
60~64 -> D
0 ~59 -> F
		 */
		
		File srcFile = new File("C:\\education\\workspace\\javaPrj\\src\\res\\figuredata.txt");
		FileInputStream copyFos = new FileInputStream(srcFile);
		Scanner fscan = new Scanner(copyFos);
		
		File copypath= new File("src/ex5");
		if(!copypath.exists())
			copypath.mkdir();
		
		FileOutputStream copyr = new FileOutputStream("src/ex5/data-grade-1");
		PrintStream fout = new PrintStream(copyr);
		

		 
		while(fscan.hasNext())
			{
			String x_ = fscan.next();
			int x = Integer.parseInt(x_);						
				
			if (x>100 || x<0)
				{fout.print("잘못입력");
				break;}
			
			else if(x>=95)
				fout.print("A+ ");
			else if(x>=90)
				fout.print("A ");
			else if(x>=85)
				fout.print("B+ ");
			else if(x>=80)
				fout.print("B ");
			else if(x>=75)
				fout.print("C+");
			else if(x>=70)
				fout.print("C ");
			else if(x>=65)
				fout.print("D+ ");
			else if(x>=60)
				fout.print("D ");
			else fout.print("F ");
			
			}
		
		fscan.close();
		copyFos.close();
		fout.close();
		copyr.close();
		
		
		System.out.println("완료");

		
	}

}

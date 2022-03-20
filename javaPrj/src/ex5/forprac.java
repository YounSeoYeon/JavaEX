package ex5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class forprac {

	public static void main(String[] args) throws IOException {
		
		File srcFile = new File("C:\\education\\workspace\\javaPrj\\src\\res\\figuredata.txt");
		FileInputStream srcFis = new FileInputStream(srcFile);
		File copyFile = new File("C:\\education\\workspace\\javaPrj\\src\\res\\data-result2.txt");
		FileOutputStream copyFos = new FileOutputStream(copyFile);
		Scanner fscan = new Scanner(srcFis);
		PrintStream fout = new PrintStream(copyFos);
		
		int i=0;
		int total = 0;		
		while(i<5 && fscan.hasNext())
			
			// = for(i=0; i<5 && fscan.hasNext(); i++)
			
		{
			String x_ = fscan.next(); 
			//fout.print(x_);
			
			int x = Integer.parseInt(x_);
			total += x;
			
			i++;
			}
		
		fout.printf("total is %d\n", total);
			
		fscan.close();
		fout.close();
		srcFis.close();		
		copyFos.close();
		
		System.out.println("작업완료");

	}

}

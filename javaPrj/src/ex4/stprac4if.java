package ex4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class stprac4if {

	public static void main(String[] args) throws IOException {

		File srcFile = new File("C:\\education\\workspace\\javaPrj\\src\\res\\figuredata.txt");
		FileInputStream srcFis = new FileInputStream(srcFile);
		File copyFile = new File("C:\\education\\workspace\\javaPrj\\src\\res\\data-result.txt");
		FileOutputStream copyFos = new FileOutputStream(copyFile);
		Scanner fscan = new Scanner(srcFis);
		PrintStream fout = new PrintStream(copyFos);
		
		int sum = 0;		
		while(fscan.hasNext())
		{
			String x_ = fscan.next(); 
			//fout.print(x_);
			
			int x = Integer.parseInt(x_);
			sum += x;
			}
		
		fout.printf("sum is %d\n", sum);
			
		fscan.close();
		fout.close();
		srcFis.close();		
		copyFos.close();
		
		System.out.println("작업완료");

	}

}

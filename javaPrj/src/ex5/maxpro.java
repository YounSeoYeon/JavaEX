package ex5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class maxpro {

	public static void main(String[] args) throws IOException {
		
	File srcFile = new File("C:\\education\\workspace\\javaPrj\\src\\res\\figuredata.txt");
	FileInputStream srcFis= new FileInputStream(srcFile);
	Scanner fscan = new Scanner(srcFis);
	
	
	int max=Integer.MIN_VALUE;
	while(fscan.hasNext())
	{	
		String x_= fscan.next();
		int x=Integer.parseInt(x_);
		if(max<x)
			max = x;	
	}
	
	fscan.close();
	srcFis.close();
	
	File copyFile = new File("C:\\education\\workspace\\javaPrj\\src\\res\\data-max.txt");
	FileOutputStream copyFos = new FileOutputStream(copyFile);
	PrintStream fout = new PrintStream(copyFile);

	fout.printf("max is %d\n",max);
	
	fout.close();
	copyFos.close();
	
	System.out.print("작업완료");
	
	}

}

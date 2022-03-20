package ex5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class countpro {

	public static void main(String[] args) throws IOException {

		File srcFile = new File("C:\\education\\workspace\\javaPrj\\src\\res\\figuredata.txt");
		FileInputStream srcFis = new FileInputStream(srcFile);
		Scanner fscan = new Scanner(srcFis);
		
	  int count = 0;  
	     while(fscan.hasNext())
	      {
	        fscan.next();
	         count++;	         
     	    }
	      
	     fscan.close();
	     srcFis.close();      

	     File copyFile = new File("C:\\education\\workspace\\javaPrj\\src\\res\\data-count.txt");
	     FileOutputStream copyFos = new FileOutputStream(copyFile);
	     PrintStream fout = new PrintStream(copyFos);

	     fout.printf("count is %d\n", count);
	      
	     fout.close();
	     copyFos.close();
	      
	      System.out.println("작업완료");


	}

}


//데이터의 수 출력
//결과는 다음과 같습니다.
//count에 count is 14가 출력되어야함
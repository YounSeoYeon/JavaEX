package part3.ex3.allex001;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Examo {
	
	private int kor;
	private int eng;
	private int math;
	
	public Examo() {
		kor=0;
		eng=0;
		math=0;
	}
	
	public Examo(int kor,int eng,int math) {
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
	
	public void loado() throws IOException {
		
		 File file = new File("C:\\education\\workspace\\javaPrj\\src\\res\\figuredata.txt");      
		 FileInputStream fis = new FileInputStream(file);
		 Scanner scan = new Scanner(fis);
		 
		 String[] tem = scan.nextLine().split(",");
		 
		 scan.close();
	     fis.close();
		 
		 kor=Integer.parseInt(tem[0]);
		 eng=Integer.parseInt(tem[1]);
		 math=Integer.parseInt(tem[2]);
		 
	}

	public void saveo() throws IOException {
		
		File file = new File("C:\\education\\workspace\\javaPrj\\src\\res\\figuredata.txt");
		FileOutputStream fos = new FileOutputStream(file);
		PrintStream ps = new PrintStream(fos);
		
		ps.printf("%d,%d,%d\n",kor,eng,math);
		
		ps.close();
		fos.close();
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
	
	public int totalle() {
		int total = kor+eng+math;
		return total;
	}
	
	public double avggo() {
		double avg = totalle()/3.0;
		return avg;
	}
	
	
	
}

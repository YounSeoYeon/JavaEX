package part3.ex3.has2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Exams {
	
	private int kor;
	private int eng;
	private int math;
	
	
	public Exams() {
		kor=1;
		eng=1;
		math=1;
	}
	
	public Exams(int kor,int eng,int math) {
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}

	public void loads() throws IOException {
		
		File file = new File("C:\\education\\workspace\\javaPrj\\src\\res\\figuredata.txt");
		FileInputStream fis = new FileInputStream(file);
		Scanner scan = new Scanner(fis);
		
		String [] cols = scan.nextLine().split(",");
		
		scan.close();
		fis.close();
		
		this.kor = Integer.parseInt(cols[0]);
		this.eng = Integer.parseInt(cols[1]);
		this.math = Integer.parseInt(cols[2]);		
		
	}

	public void saves() throws IOException {
		
		File file = new File("C:\\education\\workspace\\javaPrj\\src\\res\\figuredata.txt");
		FileOutputStream fos = new FileOutputStream(file);
		PrintStream ps = new PrintStream(fos);
		
		ps.printf("%d,%d,%d\n",kor,eng,math);
		
		ps.close();
		fos.close();
		
	}
	
	public int total() {
		return kor+eng+math;
	}
	
	public double avg() {
		return total()/3.0;
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
	

}

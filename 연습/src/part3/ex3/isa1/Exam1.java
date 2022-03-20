package part3.ex3.isa1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Exam1 {
	
	private int kor;
	private int eng;
	private int math;
	
	public Exam1() {
		this(1,1,1);
	}
	
	public Exam1(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;	
	}

	public void loadd() throws IOException {
		File file = new File("C:\\education\\workspace\\javaPrj\\src\\figuredataa.txt");
		FileInputStream fis = new FileInputStream(file);
		Scanner scan = new Scanner(fis);
		
		String[] temm = scan.nextLine().split(",");
		
		this.kor = Integer.parseInt(temm[0]);
		eng = Integer.parseInt(temm[1]);
		kor = Integer.parseInt(temm[2]);
		
		scan.close();
		fis.close();
	}

	public void savee() throws IOException {
		File file = new File("C:\\education\\workspace\\javaPrj\\src\\figuredataa.txt");
		FileOutputStream fos = new FileOutputStream(file);
		PrintStream ps = new PrintStream(fos);
		
		ps.printf("%d,%d,%d", kor,eng,math);
		
		ps.close();
		fos.close();
	}
	
	public int getEng() {
		return eng;
	}
	
	public int getKor() {
		return kor;
	}
	
	public int getMath() {
		return math;
	}
	
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	public void setKor(int kor) {
		this.kor = kor;
	}
	
	public void setMath(int math) {
		this.math = math;
	}
	
	public int totall() {
		int total = kor+eng+math;
		return total;
	}
	
	public double avgg() {
		double avg = totall()/3.0;
		return avg;
	}
	

}

package part3.ex3.allex002;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Exam2 {

	private int kor;
	private int eng;
	private int math;
	
	public Exam2() {
		kor=1;
		eng=1;
		math=1;
	}
	
	public Exam2(int kor, int eng, int math) {
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
	
	public int total2() {
		int total = kor+eng+math;
		return total;
	}
	
	public double avg2() {
		double avg = total2()/3.0;
		return avg;
	}

	public void load2() throws IOException {
		File file2 = new File("C:\\education\\workspace\\javaPrj\\src\\res\\figuredata.txt");
		FileInputStream fis2 = new FileInputStream(file2);
		Scanner scan2 = new Scanner(fis2);
		
		String[] x = scan2.nextLine().split(",");

		scan2.close();
		fis2.close();
		
		this.kor = Integer.parseInt(x[0]);
		eng = Integer.parseInt(x[1]);
		math = Integer.parseInt(x[2]);		
	}

	public void save2() throws IOException {
		File file2 = new File("C:\\education\\workspace\\javaPrj\\src\\res\\figuredata.txt");
		FileOutputStream fos2 = new FileOutputStream(file2);
		PrintStream ps2 = new PrintStream(fos2);
		
		ps2.printf("%d,%d,%d",kor,eng,math);
		
		ps2.close();
		fos2.close();		
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

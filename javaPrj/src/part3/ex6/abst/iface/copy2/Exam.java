package part3.ex6.abst.iface.copy2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public abstract class Exam {
	
	private int kor;
	private int eng;
	private int math;
	
	public Exam() {
		this(1,1,1);
	}
	
	public Exam(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}


	
	public void load() throws IOException {
	      
	      File file = new File("C:\\education\\workspace\\javaPrj\\src\\res\\figuredata.txt");      
	      FileInputStream fis = new FileInputStream(file);
	      Scanner scan = new Scanner(fis);

	      String[] tmps = scan.nextLine().split(",");

	      scan.close();
	      fis.close();

	      this.kor = Integer.parseInt(tmps[0]);
	      eng = Integer.parseInt(tmps[1]);
	      math = Integer.parseInt(tmps[2]);

	   }
	
	 
	public void save() throws IOException {      

	      File file = new File("C:\\education\\workspace\\javaPrj\\src\\res\\figuredata.txt");
	      FileOutputStream fos = new FileOutputStream(file);
	      PrintStream ps = new PrintStream(fos);

	      ps.printf("%d,%d,%d\n", kor, eng, math);

	      ps.close();
	      fos.close();
	   }

	public int total() {
		return kor+eng+math;
	}

	public abstract double avg();

	public int getKor() {
		return this.kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return this.eng;
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

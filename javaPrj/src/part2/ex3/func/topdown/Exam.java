package part2.ex3.func.topdown;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Exam {
	
	private int kor;
	private int eng;
	private int math;
	
	
	public static void input(Exam exam) {
	      
	      Scanner scan = new Scanner(System.in);
	      
	      System.out.println("┌───────────────────────────────────┐");
	      System.out.println("│              성적 출력              │");
	      System.out.println("└───────────────────────────────────┘");
	      
	      System.out.println("국어 >");
	      exam.kor = scan.nextInt();
	      System.out.println("영어 >");
	      exam.eng = scan.nextInt();
	      System.out.println("수학 >");
	      exam.math = scan.nextInt();
	      
	   }
	  
	  
	
	public static void print(Exam exam) {
	      
	      Scanner scan = new Scanner(System.in);
	      
	      if (exam == null) {
	         System.out.println("성적이 입력되지 않았습니다. (Exam 객체가 존재하지 않음)");
	         return;
	      }

	      System.out.println("┌───────────────────────────────────┐");
	      System.out.println("│              성적 출력              │");
	      System.out.println("└───────────────────────────────────┘");
	      System.out.println("국어 : " + exam.kor);
	      System.out.println("영어 : " + exam.eng);
	      System.out.println("수학 : " + exam.math);

	      int total = exam.kor + exam.eng + exam.math;
	      System.out.println("총점 :" + total);
	      System.out.printf("평균 : %.2f\n", (total / 3.0));
	   }
	
	
	public static Exam load(Exam exam) throws IOException {
	      
	      File file = new File("C:\\education\\workspace\\javaPrj\\src\\res\\figuredata.txt");      
	      FileInputStream fis = new FileInputStream(file);
	      Scanner scan = new Scanner(fis);

	      String[] tmps = scan.nextLine().split(",");

	      scan.close();
	      fis.close();

	      exam.kor = Integer.parseInt(tmps[0]);
	      exam.eng = Integer.parseInt(tmps[1]);
	      exam.math = Integer.parseInt(tmps[2]);

	      return exam;
	   }
	
	 
	public static void save(Exam exam) throws IOException {      

	      File file = new File("C:\\education\\workspace\\javaPrj\\src\\res\\figuredata.txt");
	      FileOutputStream fos = new FileOutputStream(file);
	      PrintStream ps = new PrintStream(fos);

	      ps.printf("%d,%d,%d\n", exam.kor, exam.eng, exam.math);

	      ps.close();
	      fos.close();
	   }
}

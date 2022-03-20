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
	      
	      System.out.println("��������������������������������������������������������������������������");
	      System.out.println("��              ���� ���              ��");
	      System.out.println("��������������������������������������������������������������������������");
	      
	      System.out.println("���� >");
	      exam.kor = scan.nextInt();
	      System.out.println("���� >");
	      exam.eng = scan.nextInt();
	      System.out.println("���� >");
	      exam.math = scan.nextInt();
	      
	   }
	  
	  
	
	public static void print(Exam exam) {
	      
	      Scanner scan = new Scanner(System.in);
	      
	      if (exam == null) {
	         System.out.println("������ �Էµ��� �ʾҽ��ϴ�. (Exam ��ü�� �������� ����)");
	         return;
	      }

	      System.out.println("��������������������������������������������������������������������������");
	      System.out.println("��              ���� ���              ��");
	      System.out.println("��������������������������������������������������������������������������");
	      System.out.println("���� : " + exam.kor);
	      System.out.println("���� : " + exam.eng);
	      System.out.println("���� : " + exam.math);

	      int total = exam.kor + exam.eng + exam.math;
	      System.out.println("���� :" + total);
	      System.out.printf("��� : %.2f\n", (total / 3.0));
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

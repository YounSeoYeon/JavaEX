package part3.ex2.oop.capsule;

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
	// ��ü�� ���鶧�� �ѹ� ��Դ°���
	
//	public Exam() {
//		kor=1; // ������ ����ϴ°� �ƴ�!!! ��ü ���޹޾Ƽ� ����ϴ°���
//		eng=1;
//		math=1;
//	} // ��������! �ʱⰪ�����ϴ°��,�ѹ��� ���� �������
//	
	
	public Exam() {
		this(1,1,1);
		//kor=2;// �������ʱⰪ������ ���Ŀ� �����ϴ°� ����
	}
	
	public Exam(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}



	public void input() {
		
		// this�� ��������, ���������� �Ἥ �浹����쿡�� �� ���ٰ�
	      
	      Scanner scan = new Scanner(System.in);
	      
	      System.out.println("��������������������������������������������������������������������������");
	      System.out.println("��              ���� �Է�              ��");
	      System.out.println("��������������������������������������������������������������������������");
	      
	      System.out.println("���� >");
	      this.kor = scan.nextInt();
	      System.out.println("���� >");
	      this.eng = scan.nextInt();
	      System.out.println("���� >");
	      this.math = scan.nextInt();
	      
	   }
	  
	  
	
	public void print() {
	      
	      Scanner scan = new Scanner(System.in);
	      
	      if (this == null) {
	         System.out.println("������ �Էµ��� �ʾҽ��ϴ�. (Exam ��ü�� �������� ����)");
	         return;
	      }

	      System.out.println("��������������������������������������������������������������������������");
	      System.out.println("��              ���� ���              ��");
	      System.out.println("��������������������������������������������������������������������������");
	      System.out.println("���� : " + this.kor);
	      System.out.println("���� : " + this.eng);
	      System.out.println("���� : " + this.math);

	      int total = this.kor + this.eng + this.math;
	      System.out.println("���� :" + total);
	      System.out.printf("��� : %.2f\n", (total / 3.0));
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
}

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
	// 객체를 만들때만 한번 써먹는거임
	
//	public Exam() {
//		kor=1; // 위에꺼 사용하는거 아님!!! 객체 전달받아서 사용하는거임
//		eng=1;
//		math=1;
//	} // 생성자임! 초기값세팅하는경우,한번도 쓴적 없어야함
//	
	
	public Exam() {
		this(1,1,1);
		//kor=2;// 생성자초기값세팅한 이후에 수정하는건 가능
	}
	
	public Exam(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}



	public void input() {
		
		// this는 생략가능, 지역변수를 써서 충돌날경우에만 꼭 써줄것
	      
	      Scanner scan = new Scanner(System.in);
	      
	      System.out.println("┌───────────────────────────────────┐");
	      System.out.println("│              성적 입력              │");
	      System.out.println("└───────────────────────────────────┘");
	      
	      System.out.println("국어 >");
	      this.kor = scan.nextInt();
	      System.out.println("영어 >");
	      this.eng = scan.nextInt();
	      System.out.println("수학 >");
	      this.math = scan.nextInt();
	      
	   }
	  
	  
	
	public void print() {
	      
	      Scanner scan = new Scanner(System.in);
	      
	      if (this == null) {
	         System.out.println("성적이 입력되지 않았습니다. (Exam 객체가 존재하지 않음)");
	         return;
	      }

	      System.out.println("┌───────────────────────────────────┐");
	      System.out.println("│              성적 출력              │");
	      System.out.println("└───────────────────────────────────┘");
	      System.out.println("국어 : " + this.kor);
	      System.out.println("영어 : " + this.eng);
	      System.out.println("수학 : " + this.math);

	      int total = this.kor + this.eng + this.math;
	      System.out.println("총점 :" + total);
	      System.out.printf("평균 : %.2f\n", (total / 3.0));
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

package part3.ex6.abst.iface;

import java.io.IOException;
import java.util.Scanner;

public class ProgramBIGGUJO {

	   public static void main(String[] args) throws IOException {

		   newlecExam exam = new newlecExam();      
		   Examconsole console = new Examconsole();
		   console.setExam(exam);
		                  
		      // 익명 클래스 anonymous Class
//		      class AA  implements ConsoleListener{
//		         
//		         @Override
//		         public void onPrint(Exam exam1) {
//		            
//		            // 중첩된 클래스의 메소드에는 두 개의 this 객체가 전달된다.
//		            // 1. 아웃터 객체의    NewlecExam.this
//		            // 2. 내부(자신) 객체의 this
//		            
//		            //NewlecExam nexam = (NewlecExam) exam;      
//		            System.out.println("컴퓨터 : " + exam.getCom());
//		         }
//		         
//		         @Override
//		         public void onInput(Exam exam1) {
//		            //NewlecExam nexam = (NewlecExam) exam;
//		            Scanner scan = new Scanner(System.in);
//		            System.out.print("컴퓨터 >");
//		            int com = scan.nextInt();
//		            exam.setCom(com);
//		         }
//		      }
		      
//		      ConsoleListener aa = new ConsoleListener() {
		//
//		         @Override
//		         public void onPrint(Exam exam) {
//		            // TODO Auto-generated method stub
//		            
//		         }
		//
//		         @Override
//		         public void onInput(Exam exam) {
//		            // TODO Auto-generated method stub
//		            
//		         }
//		         
//		      };
		      
		      console.setlistener(new Consolelistener() {
		         
		         @Override
		         public void onprint(Exam exam1) {
		            
		            // 중첩된 클래스의 메소드에는 두 개의 this 객체가 전달된다.
		            // 1. 아웃터 객체의    NewlecExam.this
		            // 2. 내부(자신) 객체의 this
		            
		            //NewlecExam nexam = (NewlecExam) exam;      
		            System.out.println("컴퓨터 : " + exam.getCom());
		         }
		         
		         @Override
		         public void oninput(Exam exam1) {
		            //NewlecExam nexam = (NewlecExam) exam;
		            Scanner scan = new Scanner(System.in);
		            System.out.print("컴퓨터 >");
		            int com = scan.nextInt();
		            exam.setCom(com);
		         }
		      });
		      console.input();
//		      console.print(new BannerPrinter() {
//
//				@Override
//				public void print() {
//					 System.out.println("──────────────────────────────────");
//				     System.out.println("     Newlec Academy 성적 출력        ");
//				     System.out.println("──────────────────────────────────");
//				}
//				});
		      
		      // 람다 익스프레스방식 - 익명으로
		      console.print(()->{
						 System.out.println("──────────────────────────────────");
					     System.out.println("     Newlec Academy 성적 출력        ");
					     System.out.println("──────────────────────────────────");
					});
		      
		      
		   }
	   
		   
		   
		   
		   
		   
		   
		   
//		  newlecExam exam = new newlecExam();
//		  Examconsole console = new Examconsole();
//		  console.setExam(exam);
//		  
//			/* 4.한번만 쓰고 말경우 메인함수 내에서 클래스 정의해도됨. 
//			  그럼 다른 클래스에서 지속적으로 안봐도 되니깐.
//			  익명클래스라고 부름.
//			 
//			 public class AA implements Consolelistener{
//			 
//			 public void oninput(Exam exam1) {
//			 Scanner scan = new Scanner(System.in);
//			 System.out.println("컴퓨터 >"); 
//			 int com = scan.nextInt();
//			 exam.setCom(com);}
//			 
//			 public void onprint(Exam exam1) {
//			 System.out.println("컴퓨터 : " + exam.getCom()); } //
//			 인터페이스가 원래 있던 클래스내에 만들어져서 그냥 그 안에있던거 쓰면됨.
//			 }
//			 console.setlistener(new AA());
//			 console.input();
//		     console.print();
//			 */
//		  
//		  
//		  newlecExam.AA aa = exam.new AA();
//		  console.setlistener(aa);
//		  
//		  //인터페이스 1,2방법 쓸때 ↓
//		  //console.setlistener(exam);
//		  console.input();
//		  console.print();
//	  }

}

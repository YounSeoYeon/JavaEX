package part3.ex6.abst.iface;

import java.io.IOException;
import java.util.Scanner;

public class ProgramBIGGUJO {

	   public static void main(String[] args) throws IOException {

		   newlecExam exam = new newlecExam();      
		   Examconsole console = new Examconsole();
		   console.setExam(exam);
		                  
		      // �͸� Ŭ���� anonymous Class
//		      class AA  implements ConsoleListener{
//		         
//		         @Override
//		         public void onPrint(Exam exam1) {
//		            
//		            // ��ø�� Ŭ������ �޼ҵ忡�� �� ���� this ��ü�� ���޵ȴ�.
//		            // 1. �ƿ��� ��ü��    NewlecExam.this
//		            // 2. ����(�ڽ�) ��ü�� this
//		            
//		            //NewlecExam nexam = (NewlecExam) exam;      
//		            System.out.println("��ǻ�� : " + exam.getCom());
//		         }
//		         
//		         @Override
//		         public void onInput(Exam exam1) {
//		            //NewlecExam nexam = (NewlecExam) exam;
//		            Scanner scan = new Scanner(System.in);
//		            System.out.print("��ǻ�� >");
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
		            
		            // ��ø�� Ŭ������ �޼ҵ忡�� �� ���� this ��ü�� ���޵ȴ�.
		            // 1. �ƿ��� ��ü��    NewlecExam.this
		            // 2. ����(�ڽ�) ��ü�� this
		            
		            //NewlecExam nexam = (NewlecExam) exam;      
		            System.out.println("��ǻ�� : " + exam.getCom());
		         }
		         
		         @Override
		         public void oninput(Exam exam1) {
		            //NewlecExam nexam = (NewlecExam) exam;
		            Scanner scan = new Scanner(System.in);
		            System.out.print("��ǻ�� >");
		            int com = scan.nextInt();
		            exam.setCom(com);
		         }
		      });
		      console.input();
//		      console.print(new BannerPrinter() {
//
//				@Override
//				public void print() {
//					 System.out.println("��������������������������������������������������������������������");
//				     System.out.println("     Newlec Academy ���� ���        ");
//				     System.out.println("��������������������������������������������������������������������");
//				}
//				});
		      
		      // ���� �ͽ���������� - �͸�����
		      console.print(()->{
						 System.out.println("��������������������������������������������������������������������");
					     System.out.println("     Newlec Academy ���� ���        ");
					     System.out.println("��������������������������������������������������������������������");
					});
		      
		      
		   }
	   
		   
		   
		   
		   
		   
		   
		   
//		  newlecExam exam = new newlecExam();
//		  Examconsole console = new Examconsole();
//		  console.setExam(exam);
//		  
//			/* 4.�ѹ��� ���� ����� �����Լ� ������ Ŭ���� �����ص���. 
//			  �׷� �ٸ� Ŭ�������� ���������� �Ⱥ��� �Ǵϱ�.
//			  �͸�Ŭ������� �θ�.
//			 
//			 public class AA implements Consolelistener{
//			 
//			 public void oninput(Exam exam1) {
//			 Scanner scan = new Scanner(System.in);
//			 System.out.println("��ǻ�� >"); 
//			 int com = scan.nextInt();
//			 exam.setCom(com);}
//			 
//			 public void onprint(Exam exam1) {
//			 System.out.println("��ǻ�� : " + exam.getCom()); } //
//			 �������̽��� ���� �ִ� Ŭ�������� ��������� �׳� �� �ȿ��ִ��� �����.
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
//		  //�������̽� 1,2��� ���� ��
//		  //console.setlistener(exam);
//		  console.input();
//		  console.print();
//	  }

}

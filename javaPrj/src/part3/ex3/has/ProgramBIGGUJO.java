package part3.ex3.has;

import java.io.IOException;
import java.util.Scanner;

public class ProgramBIGGUJO {

	   public static void main(String[] args) throws IOException {

		   Exam exam = new Exam();
		   Examconsole console = new Examconsole();
		   console.setExam(exam);
		   
		   while (true) {

		         int menu = inputMenu();


		         switch (menu) {
		         case 1:
		        	console.input();
		            break;
		         case 2:
		        	console.print();
		            break;
		         case 3:
		        	exam.load();
		            break;
		         case 4:
		        	exam.save();
		            break;
		         case 5:
		            exitProgram();
		            break;
		         }
		      }

		   }

		   // Program�� Bottom ����
		   private static void exitProgram() {
		      System.out.println("Bye~~");
		      System.exit(0);
		   }

		   private static int inputMenu() {
		      
		      Scanner scan = new Scanner(System.in);

		      int menu = 0;

		      System.out.println("��������������������������������������������������������������������");
		      System.out.println("��      �������� Main Menu          ��");
		      System.out.println("��������������������������������������������������������������������");
		      System.out.println("1. �Է�");
		      System.out.println("2. ���");
		      System.out.println("3. �б�");
		      System.out.println("4. ����");
		      System.out.println("5. ����");
		      System.out.print(">");
		      menu = scan.nextInt();

		      return menu;
		   }

}

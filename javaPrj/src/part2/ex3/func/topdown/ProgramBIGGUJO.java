package part2.ex3.func.topdown;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class ProgramBIGGUJO {

	   public static void main(String[] args) throws IOException {

		      while (true) {

		         int menu = inputMenu();
		         Exam exam = new Exam();

		         switch (menu) {
		         case 1:
		            Exam.input(exam);
		            break;
		         case 2:
		        	Exam.print(exam);
		            break;
		         case 3:
		        	Exam.load(exam);
		            break;
		         case 4:
		            Exam.save(exam);
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

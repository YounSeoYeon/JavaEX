package part2.ex1.func;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program2 {
	
	// �����ε� �Լ�(�Ű����� �����)
	static void printcount(int a) { // ()���� �ȿ� count�� ���� �� - �װ��� ���⼭�� a�ΰ�(�Լ� ��ȭ��Ŵ!)
		System.out.println("����������������������������");
        System.out.println("��                Count              ��");
        System.out.println("����������������������������");
        System.out.printf("Count is %d\n", a);
	}
	
	
	static void printcount() { // �⺻���� ������ �װ� ����ϴ� �Լ�(�Ű�������)
		printcount(1);
	}
	
	
	static int count() throws IOException {
		int result = 0;

		File srcFile = new File("C:\\education\\workspace\\javaPrj\\src\\res\\figuredata.txt");
		FileInputStream srcFis = new FileInputStream(srcFile);
		Scanner fscan = new Scanner(srcFis);

		while (fscan.hasNext()) {
			fscan.next();
			result++;
		}

		fscan.close();
		srcFis.close();

		return result;
	}
	
	
	static int total() throws IOException {
		int result = 0;

		File srcFile = new File("C:\\education\\workspace\\javaPrj\\src\\res\\figuredata.txt");
		FileInputStream srcFis = new FileInputStream(srcFile);
		Scanner fscan1 = new Scanner(srcFis);

		while (fscan1.hasNext()) {
			String x_ = fscan1.next();
			// fout.print(x_);

			int x = Integer.parseInt(x_);
			result += x;
		}

		fscan1.close();
		srcFis.close();

		return result;
	}

	
	
	
	public static void main(String[] args) throws IOException {
		
	      // --- << main menu �Է� >> -------------------
	      Scanner scan = new Scanner(System.in);

	      ������: while (true) {
	         int menu;

	         do {
	            System.out.println("����������������������������");
	            System.out.println("��             Main Menu          ��");
	            System.out.println("����������������������������");
	            System.out.println("1. count");
	            System.out.println("2. total");
	            System.out.println("3. avg");
	            System.out.println("4. exit");
	            System.out.print(">");

	            menu = scan.nextInt();

	            if (menu > 4)
	               System.out.println("�޴��� �߸� �Է��ϼ̽��ϴ�.");

	         } while (menu > 4);

	         switch (menu) {
	         case 1: {
	            // --- <<count ����ϱ� >> -----------------------------------------------
	            int countt = count(); 
	            printcount(countt); // countt�� ���� ���� - ���� printcount �Լ����� �Լ� �����Ҷ� ���� �̸����� �ᵵ��
	            //printcount(); // �⺻�Լ� �����
	         }
	            break;

	         case 2: {
	            // --- <<total ����ϱ� >> -----------------------------------------------
	            int total = total();

	            System.out.println("��������������������������");
	            System.out.println("��               Total             ��");
	            System.out.println("��������������������������");
	            System.out.printf("Total is %d\n", total);
	         }
	            break;

	         case 3: {
	            // --- <<avg ����ϱ� >> -----------------------------------------------
	            int count = count();
	            // --------------------------------------
	            int total = total();
	            // -----------------------------------------------
	            double avg = total / (double) count;

	            System.out.println("����������������������������");
	            System.out.println("��              Average             ��");
	            System.out.println("����������������������������");
	            System.out.printf("Average is %.2f\n", avg);
	         }
	            break;

	         case 4:
	            System.out.println("Bye~~");
	            break ������; // while ���� ��� �� �ֳ�? �̰� ����?

//	               default:
//	                  System.out.println("�޴��� �߸� �Է��ϼ̽��ϴ�.");
	         }

	      }

	      System.out.println("�۾��Ϸ�");

	}

}

package part2.ex2.func.reuse;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;


public class Program2allFunc {
	
	public static void main(String[] args) throws IOException {
		
		// --- << main menu �Է� >> -------------------
		
		������: while (true) {
			//int menu = inputMenu();
			
			switch (inputMenu()) {
			case 1: {
				// --- <<count ����ϱ� >> -----------------------------------------------
				int countt = KorExam.count(); 
				printcount(countt); // countt�� ���� ���� - ���� printcount �Լ����� �Լ� �����Ҷ� ���� �̸����� �ᵵ��
				//printcount(); // �⺻�Լ� �����
			}
			break;
			
			case 2: {
				// --- <<total ����ϱ� >> -----------------------------------------------
				int totall = KorExam.total();
				printtotal(totall);
			}
			break;
			
			case 3: {
				// --- <<avg ����ϱ� >> -----------------------------------------------
				int count = KorExam.count();
				// --------------------------------------
				int total = KorExam.total();
				// -----------------------------------------------
				double avgg = total / (double) count;
				avg(avgg);
				
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
	
	
	
	static void avg(double c) {
		System.out.println("����������������������������");
        System.out.println("��              Average             ��");
        System.out.println("����������������������������");
        System.out.printf("Average is %.2f\n", c);
	}
	
	static void printtotal(int b) {
		System.out.println("��������������������������");
	    System.out.println("��               Total             ��");
	    System.out.println("��������������������������");
	    System.out.printf("Total is %d\n", b);
	}
	
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
	
	
	static int inputMenu() {    
		
		Scanner scan = new Scanner(System.in);

		int menue;
		
		do {
        System.out.println("����������������������������");
        System.out.println("��             Main Menu          ��");
        System.out.println("����������������������������");
        System.out.println("1. count");
        System.out.println("2. total");
        System.out.println("3. avg");
        System.out.println("4. exit");
        System.out.print(">");

        menue = scan.nextInt();

        if (menue > 4)
           System.out.println("�޴��� �߸� �Է��ϼ̽��ϴ�.");

     } while (menue > 4);
		return menue;
	}

}

package ex6_array;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class LoaeCOVID19ProSu {

	public static void main(String[] args) throws IOException {//alt+enter
		int count=0; // ��üũ�� �̸� ���Ϸ���(�迭�� ���� ũ�Ⱑ �������ִ� ū��)������ ũ��
		
		{	// ������ ������ ��� ���� �ڵ�
			File srcFile = new File("C:\\education\\workspace\\javaPrj\\src\\res\\COVID19.txt");
			FileInputStream srcFis = new FileInputStream(srcFile);
			Scanner fscan = new Scanner(srcFis, "UTF-8");
			
			fscan.nextLine(); // �����ִ°� ���� �ϳ� ������ ����(�̰� ���� ���̾�)
			while(fscan.hasNextLine()) {
				fscan.nextLine();
				count++;
			}
			
			fscan.close();
			srcFis.close();
			// count--; // ÷�� �ñ��� ���� ���ߵǼ� �ʵ��-1 (�̷��� �ص���)
		}
		System.out.println(count);
		
		
		
		
		// ������ �ε�
		
		String[] cities = new String[count];
		String[] dates = new String[count];
		int[] confirmeds = new int[count];
		{
			File srcFile = new File("C:\\education\\workspace\\javaPrj\\src\\res\\COVID19.txt");
			FileInputStream srcFis = new FileInputStream(srcFile);
			Scanner fscan = new Scanner(srcFis, "UTF-8");
			
			fscan.nextLine(); // ������ ����
			
			for(int i=0; i<count; i++) {
				String line = fscan.nextLine();
				String[] cols = line.split(",");
				// �������...
				
				cities[i] = cols[0];
				dates[i] = cols[1];
				confirmeds[i] = Integer.parseInt(cols[2]);
			}

			fscan.close();
			srcFis.close();
			
		} 	// �����͸� ����غ���
			// ������ ���͸�, ����, ����, ��ǥ��(���,����,�߰���,��...) �̾Ƴ��� �ִ���
		
		
		// �ε�� ������ ����ϱ�
		/*
		{System.out.println("�ñ���,Ȯ���ñ�,Ȯ���ڼ�");
		for(int i=0; i<count; i++) {
			System.out.printf("%s,",cities[i]);
			System.out.printf("%s,",dates[i]);
			System.out.printf("%d\n",confirmeds[i]);
		}}
		*/
		
		// ��õ���������� ������ ��� ����ϱ�
		
		/*
		{System.out.println("�ñ���,Ȯ���ñ�,Ȯ���ڼ�");
		for(int i=0; i<count; i++) {
			if(cities[i].equals("��õ"))
				System.out.printf("%s,%s,%d\n", cities[i],dates[i],confirmeds[i]);
		}}
		*/
		
		
		// �������� ������� �ڷγ� ��Ȳ�� �˰��������? �Է��ϸ� ���������� // ���͸�
		/*{
			Scanner scan = new Scanner(System.in);
			System.out.println("������� �˰�ͳ���? ");
			String city = scan.nextLine();
		
			System.out.println("�ñ���,Ȯ���ñ�,Ȯ���ڼ�");
			for(int i=0; i<count; i++) 
				if(cities[i].equals(city))
					System.out.printf("%s,%s,%d\n", cities[i],dates[i],confirmeds[i]);
				
			scan.close();
		}*/
		
		// ���� !!!
		// "����"�� ��� ��¥�� �˰��������? // ���� ���� �ϳ� ����
		// 1. ��ü�Ⱓ
		// 2. 7��
		// 3. 8��
		// �������� �����Ѱ� �ϳ� ���� - ��¥ ����
		
		/* String[] cities = new String[count];
		String[] dates = new String[count];
		int[] confirmeds = new int[count];*/
		
		
		
		{System.out.println("�ñ���,Ȯ���ñ�,Ȯ���ڼ�");
		
		/*for(int i=0; i<count; i++) {
			if(cities[i].equals("����"))
				System.out.printf("%s,%s,%d\n", cities[i],dates[i],confirmeds[i]);
		}*/
		
			System.out.println("���� �����¥? 20��02~21��07�� ���� ");
			Scanner scan = new Scanner(System.in);
			String month = scan.nextLine();
				for(int i=0; i<count; i++) {
					String currentMonth = dates[i].split("-")[1];
					if(cities[i].equals("����") && month.equals(currentMonth))
			               System.out.printf("%s %s %d\n", cities[i], dates[i], confirmeds[i]);
				}
				
			
			scan.close();
		}
		
	    /* {
	         System.out.println("�� �� ������?\n(02/03/04/05/06/07�� �� �Է�)");
	         Scanner scan = new Scanner(System.in);
	         String month = scan.nextLine();
	         
	         System.out.println("�ñ��� Ȯ���ñ� Ȯ���ڼ�");
	         
	         for(int i=0; i<count; i++) {
	            String currentMonth = dates[i].split("-")[1];
	            if(month.equals(currentMonth))
	               System.out.printf("%s %s %d\n", cities[i], dates[i], confirmeds[i]);
	         }

	         scan.close();
	      }*/

		
		
		
	}
}

	
		
	



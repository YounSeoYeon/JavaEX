package ex7;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class gujocheaSu {

	public static void main(String[] args) throws IOException {
		
		// �̷��� ���� �ȵ�. ��ü �������� GangwonCovid19StatusSU status=null;
		
		GangwonCovid19StatusSU status = new GangwonCovid19StatusSU();
		status.city = "��õ";
		status.date = "2022-08-12";
		status.confirmed=2;
		
		System.out.println(status.city);
		
		// ������ ������ ���
		int count = 0;
		{
		
		}
		// ����ڵ� ���� ����� count = 9468;
		
		// ������ �ε��ϱ�
		/* ������ �ε� 
		 * String[] cities = new String[count]; 
		 * String[] dates = new String[count]; 
		 * int[] confirmeds = new int[count];
		 */
		GangwonCovid19StatusSU[] statuses = new GangwonCovid19StatusSU[count];
	 // �ڡ��̸�ǥ�� 9468�� �����������. ��ü�� ���� �ϳ��� �ȸ����������.
		{
			File srcFile = new File("C:\\education\\workspace\\javaPrj\\src\\res\\COVID19.txt");
			FileInputStream srcFis = new FileInputStream(srcFile);
			Scanner fscan = new Scanner(srcFis, "UTF-8");
			
			fscan.nextLine();
			
			for(int i=0; i<count; i++) {
				String line = fscan.nextLine();
				String[] cols = line.split(",");
				// �������...
				
				statuses[i] = new GangwonCovid19StatusSU(); // ��ü��������!
				statuses[i].city = cols[0];
				statuses[i].date = cols[1];
				statuses[i].confirmed = Integer.parseInt(cols[2]);
			}

			fscan.close();
			srcFis.close();
		}
		
		// ��õ ������ ��ϸ� ����ϱ�
		
		for(int i=0; i<count; i++)
			if(statuses[i].city.equals("��õ"))
				System.out.printf("%s \n",statuses[i]);
				
	}

}

package algoex01;

import java.util.Scanner;

public class Recursion05 {

	public static void main(String[] args) {
		
		//�˰��� ������̱�� - �Ž�����
		
		Scanner sc = new Scanner(System.in);
		int[] unit = {5000,1000,500,100,50,10};
		
		System.out.print("�ݾ��Է� : ");
		int x = sc.nextInt();
		
		for(int i=0; i<unit.length; i++) {
			// ������ �� ��
			System.out.println(unit[i]+"�� : "+ x/unit[i]); 
			
			// ū�ݾ����� �������ϰ� �������� x���� ��-�װŸ� �ٽ� �������� ����
			x %= unit[i];
		}
		
		System.out.println("������ : "+x);
		sc.close();
	}

}

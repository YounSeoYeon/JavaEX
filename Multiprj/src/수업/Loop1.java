package ����;

public class Loop1 {

	public static void main(String[] args) {
		 // ����1) 1~5������ �� ���
		// ���� 1) 15
		
		// ����2) 1~10���� �ݺ��� 3�̸� 7�̻� ���
		// ����2) 1, 2, 7, 8, 9, 10
		
		// ����3) ����2�� ���ǿ� �´� ������ �� ���
		// ����3) 37
		
		// ����4) ����2�� ���ǿ� �´� ������ ���� ���
		// ����4) 6
		
		int a = 0;
		for(int i=0; i<5; i++) {
			a += (i+1);
		}
		System.out.println(a);
		
		System.out.println("===============");
		
		int b = 0;
		int total = 0;
		int count=0;
		while(b<10) {
			b++;
			if(b<3 || b>=7) {
				System.out.print(b+" ");
				total += b;
				count ++;
			}
		}
		System.out.println();
		System.out.println(total);
		System.out.println(count);
	}

}

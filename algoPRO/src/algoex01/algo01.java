package algoex01;

public class algo01 {

	public static void main(String[] args) {		

		//��������
		//������ ����
		//1���� 100������ ����
		//1-2+3-4+5��. +97-98+99-100
		//������ ���Ͽ� ���
		int sum = 0;
		
		for(int i=1; i<101; i++) {
			if(i%2==0) {
				sum -= i;
			}
			else
				sum += i;
		}
		System.out.println(sum);

	}

}

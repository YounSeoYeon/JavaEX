package ����;

import java.util.Arrays;

public class method03 {

	public static void main(String[] args) {
		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores  = new int[5];
		
		Ex03 e = new Ex03();
		
		// ����1) scores�迭�� 1~100�� ������ ���� ������ 5�� �����ϴ� �޼���
		// �� 1) 87, 11, 92, 14, 47
		e.setRandomValuesinArray(scores);
		System.out.println(Arrays.toString(scores));

		// ����2) �������� ������ ��� ����ϴ� �޼���
		// �� 2) ����(251) ���(50.2)
		e.printSumAndAverage(scores);

		// ����3) ������ 60�� �̻��̸� �հ��̸� �հݻ� ���� ����ϴ� �޼���
		// �� 3) 2��
		e.printWinner(scores);

		// ����4) �ε����� �Է¹޾� ���� ����ϴ� �޼���
		// ����4) �ε��� �Է� : 1 ���� : 11��
		e.printScore1(scores);

		// ����5) ������ �Է¹޾� �ε��� ����ϴ� �޼���
		// ����5) ���� �Է� : 11 �ε��� : 1
		e.printScore2(scores);		

		// ����6) �й��� �Է¹޾� ���� ����ϴ� �޼��� // ��, �����й� �Է� �� ����ó��
	    // ��, �����й� �Է� �� ����ó��
		// ����6) �й� �Է� : 1003 ���� : 45��
		e.printScore3(hakbuns,scores);

		// ����7) 1���л��� �й��� ���� ����ϴ� �޼���
		// ����7) 1004��(98��)
		e.printNumberOne(hakbuns, scores);
	}

}

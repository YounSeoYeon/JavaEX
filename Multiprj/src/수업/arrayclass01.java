package ����;

import java.util.Arrays;
import java.util.Random;

public class arrayclass01 {

	public static void main(String[] args) {
		// ��ü �迭(�⺻�� Ÿ�Ը� �迭�� �� �� �ִ°��� �ƴմϴ�)
		// �л� ��ü 5���� ���� �� �ִ� �迭
		Student [] studentArray = new Student[5];
		
		// �迭�� ���� ��ü�� ������� �ʽ��ϴ�.
		// ��ü�� ���� �� �ִ� �޸� ������ Ȯ��
		System.out.println(Arrays.toString(studentArray));
		
		// 5���� �л� ������ ���� �� �ֵ��� ��ü�� �迭�� ����� ���ô�. 
		for( int i = 0; i < studentArray.length; i++ ) {
			studentArray[i] = new Student();
		}
		System.out.println(Arrays.toString(studentArray));
		
		// ������� �޼��带 ���ؼ� �й��� ������ ä�� ������ �մϴ�.
		// �й��� 1001 ~ 1005(���������� ����)
		// ������ �����ϰ� �����ؼ� ����
		Random rand = new Random();
		int hakbun = 1001;
		for ( Student student: studentArray ) {
			int score = rand.nextInt(100) + 1;
			student.setData(hakbun, score);
		}
		
		// ����� �غ����� �޼��尡 �ʿ��մϴ�. 
		for ( Student student: studentArray ) {
			student.printData();
		}		
	}

}

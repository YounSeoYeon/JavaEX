package �迭�ǽ�03;

import java.util.Arrays;
import java.util.Random;

public class arrayclass03 {

	public static void main(String[] args) {
		// �л��� �й��� ����
		// �й� �迭�� ���� �迭�� ���� ���� ����
		// �迭�� �ε����� �̿��ؼ� �й��� ������ ����
		// Ŭ������ �̿��ؼ� ǥ��

		// ��ü �迭(�⺻�� Ÿ�Ը� �迭�� �� �� �ִ°��� �ƴմϴ�)
		// �л� ��ü 5���� ���� �� �ִ� �迭
		// �迭�� ���� ��ü�� ������� �ʽ��ϴ�.
		// ��ü�� ���� �� �ִ� �޸� ������ Ȯ��
		// ù��° �л� == �迭�� 0�� �ε���
		// ù��° �л��� �迭�� 0�� �ε����� ���ؼ� ����
		// 5���� �л� ������ ���� �� �ֵ��� ��ü�� �迭�� ����� ���ô�.
		// �й��� �Է�(1001 ~ 1005)
		// �л����� ������ �����ϰ� �����ؼ� �Է�
		// # �л� �߰� ���� ��Ʈ�ѷ�
		// => ��Ʈ�ѷ��� �ϼ��� �Ʒ� 3���� ������ �߰��Ͻÿ�.
		// ��ö�� : ����3�� ���� 50 ����50 ���� 60
		// �̸��� : ����2�� ���� 20 ���� 30
		// �̿��� : ����1�� ���� 100

		Student[] person = new Student[5];
		System.out.println(Arrays.toString(person));
		
		person[0] = new Student("������");
		person[1] = new Student("������");
		person[2] = new Student("�Ѱ���");
		
		Student ent = null;
		for(int i=0; i<person.length; i++) {
			if(person[i].name == "������") {
				ent = person[i];
				break;
				}
		}
		
		for(int i=0; i<ent.sub.length; i++) {
			ent.sub[i] = new Subject();
		}
		
		System.out.printf("���� ���� ��ü: %s\n", Arrays.toString(ent.sub));
		ent.sub[0].subname = "����";
		ent.sub[0].score = 100;
		ent.sub[1].subname = "����";
		ent.sub[1].score = 90;
		ent.sub[2].subname = "����";
		ent.sub[2].score = 95;		
		
		for(int i=0; i<ent.sub.length; i++) {
			System.out.printf("���� : %s, ���� : %d\n",ent.sub[i].subname,ent.sub[i].score);
		}
		
	}
}

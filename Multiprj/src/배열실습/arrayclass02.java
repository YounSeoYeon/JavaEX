package �迭�ǽ�;

import java.util.Scanner;

public class arrayclass02 {

	public static void main(String[] args) {
		//�л��̸��� �Է¹����� // �̸�����
		//����,����,���� �Է¹����� �ְ� ���� // �Է��� �ش��л��� ���������� ����
		//�л��̸�,��������,����,��� ���
		Scanner sc = new Scanner(System.in);
		Students st = new Students();
		Subject[] subj = new Subject[3];		
		
		int total = 0;
		int count = 0;
		double avg = 0;
		
		System.out.println("�л� �̸��� �Է��ϼ��� : ");		
		st = new Students(sc.nextLine());	
		
		for(int i=0; i<subj.length; i++) {
			System.out.println("���� �̸��� �Է��ϼ��� : ");
			subj[i] = new Subject(sc.nextLine());			
			System.out.println("������ �Է��ϼ��� : ");
			subj[i].score = Integer.parseInt(sc.nextLine());
			count++;
			total += subj[i].score;
			}
		
		avg =  (double)total/count;
		
		System.out.println("�л��̸�");
		System.out.println(st.name);
		
		for(int i=0; i<subj.length; i++) {
			System.out.print("�����̸� ");
			System.out.println(subj[i].name);
			System.out.print("�������� ");
			System.out.println(subj[i].score);
		}
		System.out.printf("���� : %d, ��� : %f\n",total,avg);				
		
	}

}

package part3.ex3.has2;

import java.util.Scanner;

public class ExamConsoles {
	
	private Exams examx; // ��� �̰Ÿ� �ϸ� ������Ʈ
	
	public ExamConsoles() {
		this.examx = new Exams(); // ��ü�����
	}

	public void inputs() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("��������������������������������������������������������������������������");
		System.out.println("��              ���� �Է�              ��");
		System.out.println("��������������������������������������������������������������������������");
		
		System.out.println("���� > ");
		int kor = scan.nextInt();
		System.out.println("���� > ");
		int eng = scan.nextInt();
		System.out.println("���� > ");
		int math = scan.nextInt();
		
		examx.setKor(kor);
		examx.setEng(eng);
		examx.setMath(math);
	}

	public void prints() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("��������������������������������������������������������������������������");
		System.out.println("��              ���� ���              ��");
		System.out.println("��������������������������������������������������������������������������");	
		
		System.out.println("���� : "+this.examx.getKor());
		System.out.println("���� : "+this.examx.getEng());
		System.out.println("���� : "+this.examx.getMath());
		
		int total = this.examx.total();
		double avg = examx.avg();
		System.out.println("���� : " + total);
		System.out.println("��� : " + avg);
	}
	
	
	
	

}

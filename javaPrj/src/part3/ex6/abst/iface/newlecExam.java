package part3.ex6.abst.iface;

import java.util.Scanner;

public class newlecExam extends Exam {
	private int com;

	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}

	public newlecExam(){
//		super(0,0,0);
//		this.com=0; // �ؿ� �����ε�� ������ �־ �̰Ÿ� ���
		this(0,0,0,0);
	}

	public newlecExam(int kor, int eng, int math, int com) {
		super(kor, eng, math);
		this.com = com;
	}
	
	// �������̵�!! - �θ�޼ҵ� �ҷ��� �ڽĸ޼ҵ尡 �ö�Ÿ�� �ڽĲ��� ����!
	
	public int total() { // ��Ʈ��+�����̽� = �θ� �������ִ� �޼��� �ٳ���
		return super.total()+com;
		// return super.total()+com; // �̰ŵ���. this���� ���ѷ�����.
	}

	public double avg() {
		return total()/4.0;
	}

	//
	
	public void onprint(Exam exam) {
	}
	
	// ����ó�� ���ġ ���ϰ� �����̸��� �޼��尡 �������� �־ 
	// Ŭ���� ���� Ŭ���� ���� �������̽� ������ (�̳ʸ޼���)
	// �̳ʸ޼��忡�� this�� �ΰ���. �ڱⲨ�� �ƿ��Ͳ� �ΰ�.
	public class AA implements Consolelistener{
		
		@Override
		public void oninput(Exam exam) {
			//newlecExam neexam = (newlecExam)exam;
			Scanner scan = new Scanner(System.in);
			System.out.println("��ǻ�� >");
		    com = scan.nextInt();	    
		    //neexam.setCom(com);	    
		}
	
		@Override
		public void onprint(Exam exam) {
			// newlecExam neexam = (newlecExam)exam;
			System.out.println("��ǻ�� : " + newlecExam.this.com);
		} // �������̽��� ���� �ִ� Ŭ�������� ��������� �׳� �� �ȿ��ִ��� �����
	
	// �������̽� �����κ� ( ���Ǻκ� �ٲٸ� �����κе� �ٲ����)
		
	}
}

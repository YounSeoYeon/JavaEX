package part3.ex5.abst.entity;

public class newlecExam extends Exam{
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
	
}

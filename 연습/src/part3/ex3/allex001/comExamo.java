package part3.ex3.allex001;

public class comExamo extends Examo {
	
	// ��ǻ�͸� �߰��� ���� ����
	
	private int com;
	
	public int getCom() {
		return com;
	}
	
	public void setCom(int com) {
		this.com = com;
	}
	
	public comExamo() {
		super(0,0,0);
		com=0;		
	}
	
	public comExamo(int kor, int eng, int math, int com) {
		super(kor,eng,math);
		this.com=com;		
	}
	
	public int totalle() {
		int total = super.totalle()+com;
		return total;
	}
	
	public double avggo() {
		double avg = totalle()/4.0;
		return avg;
	}

}

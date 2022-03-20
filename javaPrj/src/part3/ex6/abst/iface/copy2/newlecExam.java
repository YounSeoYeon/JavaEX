package part3.ex6.abst.iface.copy2;

public class newlecExam extends Exam {
	private int com;

	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}

	public newlecExam(){
		this(0,0,0,0);
	}

	public newlecExam(int kor, int eng, int math, int com) {
		super(kor, eng, math);
		this.com = com;
	}
		
	public int total() { 
		return super.total()+com;
	}

	public double avg() {
		return total()/4.0;
	}
	
	
}

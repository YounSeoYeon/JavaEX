package part3.ex3.isa1;

public class NewlecExam extends Exam1 {

	private int com;
	
	/* public NewlecExam() {
		super(0,0,0);
		this.com = 0;
	} */
	
	public NewlecExam() {
		this(0,0,0,0);
	}

	public NewlecExam(int kor, int eng, int math,int com) {
		super(kor, eng, math);
		this.com=com;
	}
	
	public int getCom() {
		return com;
	}
	
	public void setCom(int com) {
		this.com = com;
	}
	
	public int totall() {
		return super.totall()+com;
	}
}

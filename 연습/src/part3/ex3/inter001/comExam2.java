package part3.ex3.inter001;

public class comExam2 extends Exam2 {
	
	private int com;
	public int getCom() {
		return com;
	}
	public void setCom(int com) {
		this.com = com;
	}
	
	public comExam2() {
		super(0,0,0);
		com = 0;
	}
	
	public comExam2(int kor,int eng, int math, int com) {
		super(kor,eng,math);
		this.com = com;
	}
	
	public int total2() {
		return super.total2()+com;
	}
	
	public double avg2() {
		return total2()/4.0;
	}

	

}

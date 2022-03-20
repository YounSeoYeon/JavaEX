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
//		this.com=0; // 밑에 오버로드된 생성자 있어서 이거를 사용
		this(0,0,0,0);
	}

	public newlecExam(int kor, int eng, int math, int com) {
		super(kor, eng, math);
		this.com = com;
	}
	
	// 오버라이드!! - 부모메소드 불러도 자식메소드가 올라타서 자식꺼가 나옴!
	
	public int total() { // 컨트롤+스페이스 = 부모가 가지고있는 메서드 다나옴
		return super.total()+com;
		// return super.total()+com; // 이거도됨. this쓰면 무한루프돔.
	}

	public double avg() {
		return total()/4.0;
	}
	
}

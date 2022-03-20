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

	//
	
	public void onprint(Exam exam) {
	}
	
	// 위에처럼 얘기치 못하게 동일이름의 메서드가 있을수도 있어서 
	// 클래스 내에 클래스 만들어서 인터페이스 만들어도됨 (이너메서드)
	// 이너메서드에는 this가 두개임. 자기꺼랑 아우터꺼 두개.
	public class AA implements Consolelistener{
		
		@Override
		public void oninput(Exam exam) {
			//newlecExam neexam = (newlecExam)exam;
			Scanner scan = new Scanner(System.in);
			System.out.println("컴퓨터 >");
		    com = scan.nextInt();	    
		    //neexam.setCom(com);	    
		}
	
		@Override
		public void onprint(Exam exam) {
			// newlecExam neexam = (newlecExam)exam;
			System.out.println("컴퓨터 : " + newlecExam.this.com);
		} // 인터페이스가 원래 있던 클래스내에 만들어져서 그냥 그 안에있던거 쓰면됨
	
	// 인터페이스 구현부분 ( 정의부분 바꾸면 구현부분도 바꿔야함)
		
	}
}

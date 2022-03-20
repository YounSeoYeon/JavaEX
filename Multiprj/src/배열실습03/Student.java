package 배열실습03;

public class Student {
	// 학번과 성적을 입력받는 메서드를 하나 정의
	// 속성을 출력할 수 있는 메서드를 작성
	
	Subject[] sub;
	String name;
	
	public Student() {			
	}
	
	public Student(String name) {
		this.name = name;
		this.sub = new Subject[3];
	}

	public void print() {
	}
	
	
	
}

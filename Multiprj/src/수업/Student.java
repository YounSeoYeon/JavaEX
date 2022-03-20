package 수업;

public class Student {
	private int hakbun;
	private int score;

	public void setData(int hakbun, int score) {
		this.hakbun = hakbun;
		this.score = score;
	}

	public void printData() {
		System.out.printf("학번: %d, 성적: %d\n", this.hakbun, this.score);
	}

}

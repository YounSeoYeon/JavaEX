package ����;

public class Student {
	private int hakbun;
	private int score;

	public void setData(int hakbun, int score) {
		this.hakbun = hakbun;
		this.score = score;
	}

	public void printData() {
		System.out.printf("�й�: %d, ����: %d\n", this.hakbun, this.score);
	}

}

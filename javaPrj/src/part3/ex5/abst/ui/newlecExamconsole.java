package part3.ex5.abst.ui;

import java.util.Scanner;

import part3.ex5.abst.entity.newlecExam;

public class newlecExamconsole extends Examconsole {

	// getExam있어야함!!
	public void input() {
		super.input();
		Scanner scan = new Scanner(System.in);
		System.out.println("컴퓨터 >");
	    int com = scan.nextInt();
	    
	    newlecExam exam = (newlecExam)getExam();
	    exam.setCom(com);
	}

	@Override
	protected void onprint() {
		newlecExam exam = (newlecExam)getExam();
		System.out.println("수학 : " + exam.getMath());
	}


}

package part3.ex5.abst;

import java.io.IOException;

import part3.ex5.abst.entity.newlecExam;
import part3.ex5.abst.ui.newlecExamconsole;

public class ProgramBIGGUJO {

	   public static void main(String[] args) throws IOException {
		   
		  newlecExam exam = new newlecExam();
		  newlecExamconsole console = new newlecExamconsole();
		  console.setExam(exam);
		  
		  console.input();
		  console.print();
	  }

}

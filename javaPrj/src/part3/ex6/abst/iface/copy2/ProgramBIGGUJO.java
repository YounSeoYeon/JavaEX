package part3.ex6.abst.iface.copy2;

import java.io.IOException;
import java.util.Scanner;

public class ProgramBIGGUJO {

	   public static void main(String[] args) throws IOException {

		   newlecExam exam = new newlecExam();      
		   Examconsole console = new Examconsole();
		   console.setExam(exam);
		   
		   console.setlistener(new Consolelistener() {
				@Override
				public void oninput(Exam exams) {	
					Scanner scan = new Scanner(System.in);
					System.out.println("컴퓨터 >");
					int com = scan.nextInt(); 
					exam.setCom(com);
					scan.close();
				}

				@Override
				public void onprint(Exam exams) {	
					System.out.println("컴퓨터 : " + exam.getCom());
				}
				
		   });
		   
		   console.input();
		   console.print(()->{
				System.out.println("뉴렉!!");
				});
		   }
	   
}

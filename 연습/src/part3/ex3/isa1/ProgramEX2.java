package part3.ex3.isa1;

import java.io.IOException;
import java.util.Scanner;

public class ProgramEX2 {

	public static void main(String[] args) throws IOException {
		
		NewlecExam newlec = new NewlecExam(1,2,3,4);
		int total = newlec.totall();
		
		System.out.println(total);
		
	}

}

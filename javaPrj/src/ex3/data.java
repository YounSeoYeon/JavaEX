package ex3;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class data {

	public static void main(String[] args) throws IOException {
		
		File grade = new File("C:\\education\\workspace\\javaPrj\\src\\figuredataa.txt");
		FileOutputStream source = new FileOutputStream(grade);
		PrintStream fos = new PrintStream(source);
		fos.println("99");
		fos.close();
		source.close();
		
		System.out.println("¿Ï·á");

	}

}

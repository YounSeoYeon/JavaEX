package ex1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class A {

	public static void main(String[] args) throws IOException {
		
		int kor1,kor2,kor3;
		int total;
		float avg;

		//국어성적 3개를 초기화
		kor1=65;
		kor2=85;
		kor3=76;

		//총점구하기
		total = kor1+kor2+kor3;

		//평균구하기
		avg=total/3.0f;
		
		File file = new File("C:\\education\\workspace\\javaPrj\\data.txt");
		
		FileOutputStream fos = new FileOutputStream(file);
		PrintStream fout = new PrintStream(fos);
		
		System.out.println("┌───────────────────────┐");
		System.out.println(" ────────성적출력───────── ");
		System.out.println("└───────────────────────┘");
		System.out.printf("kor1:%d\n",kor1);
		System.out.printf("kor2:%d\n",kor2);
		System.out.printf("kor3:%d\n",kor3);
		System.out.printf("total:%d\n",total);
		System.out.printf("avg:%f\n",avg);
		
		fout.close();
		fos.close();
		
		System.out.println("완료");

	}

}

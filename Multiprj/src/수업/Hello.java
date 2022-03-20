package 수업;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class Hello {

	public static void main(String[] args) throws IOException {
		System.out.println("hello world");
		int a = 10;
		System.out.println(a);
		
		char b = 'ㅁ';
		System.out.println(b);
		
		String str = "자바정복";
		System.out.println(str);
		
		int c = 10;
		int d = 20;
		
		int temp = 0;
		temp = c;
		c = d;
		d = temp;
		
		System.out.println(c);
		System.out.println(d);
		
		float e = 12.64f;
		c = (int) e;
		System.out.println(c);
		//반올림
		System.out.println(Math.round(e));
		//올림
		System.out.println((int)Math.ceil(e));
		
		int sum = a+d;
		System.out.println("sum of " +a+ " + " +d+ " = "+sum );
		
		int ch = 65;
		System.out.printf("%c\n",ch);
		System.out.printf("%d\n",ch);
		System.out.printf("0x%x\n",ch);
		System.out.printf("%.2f\n",(float)ch);
		
//		InputStream in = System.in;
//		int f = 0;
//		f = in.read();
//		System.out.println(f);
		
//		InputStream inf = System.in;
//		char g = 0;
//		g = (char) inf.read();
//		System.out.println(g);

//		문자열입력
//		InputStream in = System.in;
//		InputStreamReader reader = new InputStreamReader(in);
//		char[] g = new char[1024];
//		reader.read(g);
//		System.out.println(g);

// 		입력한거 전부 다 처리(입력개수 많을때 빠른처리 위해서. 스캐너보다 빠름. 코딩테스트에서 많이씀)
		InputStream in = System.in;
		InputStreamReader reader = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(reader);
//		String strs = br.readLine();
//		System.out.println(strs);
		
//		출력할 내용 많을때 BufferedWriter를 이용
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write("출력");
		bw.flush(); // 메모리비우기
		
		FileOutputStream out = new FileOutputStream("C:\\education\\workspace\\Multiprj\\ola.txt");
		out.write("출력중".getBytes());
		out.close();
		
		FileWriter wr = new FileWriter("C:\\education\\workspace\\Multiprj\\olal.txt",true);
		wr.write("써진다\n");
		wr.write("줄바꿔서 써진다");
		wr.close();
		
		PrintWriter pr = new PrintWriter(wr);
		pr.write("추가");
		pr.write("추가추가");
		pr.close();
		
				
		
	}

}

package ¼ö¾÷;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bufferedreader {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i=0; i<t; i++) {
			String[] read = br.readLine().split(" ");		
			int a = Integer.parseInt(read[0]);
			int b = Integer.parseInt(read[1]);
			bw.write(Integer.toString(a+b)+"\n");
			}
			bw.flush();
			bw.close();
	
	}

}

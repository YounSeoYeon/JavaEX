package 수업;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 찍기 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));		
		
		int a = Integer.parseInt(br.readLine());
		
		if(a<0 || a>100000) {
			System.out.println("초과");
			return;
		}
		
		for(int i=0; i<a; i++) {
			bw.write(Integer.toString(a-i)+"\n");	
		}
		bw.flush();
		bw.close();
	}

}

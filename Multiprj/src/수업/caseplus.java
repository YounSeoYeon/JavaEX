package 수업;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class caseplus {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i=0; i<t; i++) {
			String[] read = br.readLine().split(" ");
			int a = Integer.parseInt(read[0]);
			int b = Integer.parseInt(read[1]);
			
			if(a<=0 || 10<=b) {
			 System.out.println("초과");
			 return;
			}
			
			String outputStr = String.format("Case #%d: %d + %d = %d\n",i+1,a,b,a+b);			
			bw.write(outputStr);
		}		
		
		bw.flush();
		bw.close();
	}

}

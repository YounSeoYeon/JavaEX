package ����;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] read = br.readLine().split(" ");		
		
		int h,m,min;
		h = Integer.parseInt(read[0]);
		m = Integer.parseInt(read[1]);	
		
		if(h<0 || h>24 || m<0 || m>59) {
			System.out.println("�ʰ��Դϴ�");
			return;
		}
		
		if(m<45) {
			if(h==0) {
				h=24;
			}
		}
		if(h==0 && m<45) {
			h=24;
		}
		
		min = h*60+m;
		min -= 45;
		
		h = (int) (min/60);
		m = min%60;
		
		System.out.printf("%d,%d\n", h,m);
		

	}

}

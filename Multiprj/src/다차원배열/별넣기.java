package 다차원배열;

import java.io.IOException;
import java.util.Scanner;

public class 별넣기 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		char[][] star = new char[a][a];

		for(int i=0; i<a; i++) {
			for(int j=0; j<a; j++) {
				if(j<=i) {
					star[i][j] = '*';
					System.out.print(star[i][j]);}
			}
			System.out.println();
		}
	sc.close();
	}

}

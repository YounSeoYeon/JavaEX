package 다차원배열;

import java.util.Scanner;

public class 상수거꾸로루틴기억하기 {

	static int reverse(int n) {
		int q = n;
		int r = 0;
		int m = 0;

		while (q != 0) {
			r = q % 10;
			System.out.println(r);
			q = q / 10;
			System.out.println(q);
			m = m * 10 + r;
		}
		System.out.println(m);
		return m;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int reva = reverse(a);
		int revb = reverse(b);

		if (reva > revb)
			System.out.println(reva);
		else
			System.out.println(revb);
		sc.close();
	}

}

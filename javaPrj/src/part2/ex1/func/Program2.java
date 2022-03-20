package part2.ex1.func;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program2 {
	
	// 오버로드 함수(매개값이 적재됨)
	static void printcount(int a) { // ()여기 안에 count의 값이 들어감 - 그값이 여기서는 a인것(함수 고립화시킴!)
		System.out.println("┌────────────┐");
        System.out.println("│                Count              │");
        System.out.println("└────────────┘");
        System.out.printf("Count is %d\n", a);
	}
	
	
	static void printcount() { // 기본값을 가지고 그걸 출력하는 함수(매개값없음)
		printcount(1);
	}
	
	
	static int count() throws IOException {
		int result = 0;

		File srcFile = new File("C:\\education\\workspace\\javaPrj\\src\\res\\figuredata.txt");
		FileInputStream srcFis = new FileInputStream(srcFile);
		Scanner fscan = new Scanner(srcFis);

		while (fscan.hasNext()) {
			fscan.next();
			result++;
		}

		fscan.close();
		srcFis.close();

		return result;
	}
	
	
	static int total() throws IOException {
		int result = 0;

		File srcFile = new File("C:\\education\\workspace\\javaPrj\\src\\res\\figuredata.txt");
		FileInputStream srcFis = new FileInputStream(srcFile);
		Scanner fscan1 = new Scanner(srcFis);

		while (fscan1.hasNext()) {
			String x_ = fscan1.next();
			// fout.print(x_);

			int x = Integer.parseInt(x_);
			result += x;
		}

		fscan1.close();
		srcFis.close();

		return result;
	}

	
	
	
	public static void main(String[] args) throws IOException {
		
	      // --- << main menu 입력 >> -------------------
	      Scanner scan = new Scanner(System.in);

	      김지원: while (true) {
	         int menu;

	         do {
	            System.out.println("┌────────────┐");
	            System.out.println("│             Main Menu          │");
	            System.out.println("└────────────┘");
	            System.out.println("1. count");
	            System.out.println("2. total");
	            System.out.println("3. avg");
	            System.out.println("4. exit");
	            System.out.print(">");

	            menu = scan.nextInt();

	            if (menu > 4)
	               System.out.println("메뉴를 잘못 입력하셨습니다.");

	         } while (menu > 4);

	         switch (menu) {
	         case 1: {
	            // --- <<count 계산하기 >> -----------------------------------------------
	            int countt = count(); 
	            printcount(countt); // countt의 값을 받음 - 위에 printcount 함수에서 함수 정의할때 따른 이름으로 써도됨
	            //printcount(); // 기본함수 출력임
	         }
	            break;

	         case 2: {
	            // --- <<total 계산하기 >> -----------------------------------------------
	            int total = total();

	            System.out.println("┌───────────┐");
	            System.out.println("│               Total             │");
	            System.out.println("└───────────┘");
	            System.out.printf("Total is %d\n", total);
	         }
	            break;

	         case 3: {
	            // --- <<avg 계산하기 >> -----------------------------------------------
	            int count = count();
	            // --------------------------------------
	            int total = total();
	            // -----------------------------------------------
	            double avg = total / (double) count;

	            System.out.println("┌────────────┐");
	            System.out.println("│              Average             │");
	            System.out.println("└────────────┘");
	            System.out.printf("Average is %.2f\n", avg);
	         }
	            break;

	         case 4:
	            System.out.println("Bye~~");
	            break 김지원; // while 문을 벗어날 수 있나? 이거 뭐지?

//	               default:
//	                  System.out.println("메뉴를 잘못 입력하셨습니다.");
	         }

	      }

	      System.out.println("작업완료");

	}

}

package part2.ex2.func.reuse;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;


public class Program2allFunc {
	
	public static void main(String[] args) throws IOException {
		
		// --- << main menu 입력 >> -------------------
		
		김지원: while (true) {
			//int menu = inputMenu();
			
			switch (inputMenu()) {
			case 1: {
				// --- <<count 계산하기 >> -----------------------------------------------
				int countt = KorExam.count(); 
				printcount(countt); // countt의 값을 받음 - 위에 printcount 함수에서 함수 정의할때 따른 이름으로 써도됨
				//printcount(); // 기본함수 출력임
			}
			break;
			
			case 2: {
				// --- <<total 계산하기 >> -----------------------------------------------
				int totall = KorExam.total();
				printtotal(totall);
			}
			break;
			
			case 3: {
				// --- <<avg 계산하기 >> -----------------------------------------------
				int count = KorExam.count();
				// --------------------------------------
				int total = KorExam.total();
				// -----------------------------------------------
				double avgg = total / (double) count;
				avg(avgg);
				
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
	
	
	
	static void avg(double c) {
		System.out.println("┌────────────┐");
        System.out.println("│              Average             │");
        System.out.println("└────────────┘");
        System.out.printf("Average is %.2f\n", c);
	}
	
	static void printtotal(int b) {
		System.out.println("┌───────────┐");
	    System.out.println("│               Total             │");
	    System.out.println("└───────────┘");
	    System.out.printf("Total is %d\n", b);
	}
	
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
	
	
	static int inputMenu() {    
		
		Scanner scan = new Scanner(System.in);

		int menue;
		
		do {
        System.out.println("┌────────────┐");
        System.out.println("│             Main Menu          │");
        System.out.println("└────────────┘");
        System.out.println("1. count");
        System.out.println("2. total");
        System.out.println("3. avg");
        System.out.println("4. exit");
        System.out.print(">");

        menue = scan.nextInt();

        if (menue > 4)
           System.out.println("메뉴를 잘못 입력하셨습니다.");

     } while (menue > 4);
		return menue;
	}

}

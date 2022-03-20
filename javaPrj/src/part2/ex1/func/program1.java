package part2.ex1.func;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class program1 {
	
	// 자바로 함수 정의하고 사용하는 방법
	// static (-고정이라고생각) int(함수의 결과의 자료형 꼭 쓸것) power(int x - 함수안에 들어가는!! 자료형에 따라서 값이 오는거에 맞쳐서 쓸것)
	// { - 수학에서 =이랑 같음 // return(반환할때 쓸것) 함수}
	
	
	static int count() throws IOException{
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
	
	
	// 기본(값을 가지는) 함수
	static void printCount() {
		printCount(0);
		// 0 안쓰면 재귀함수됨. 무한루프빠짐(자기자신 계속호출)
	}
	
	// 재귀함수
//	static void printCount() {
//			printCount();
//	}		
	
	
	
	// 오버로드(적재된 것이 더 많은) 함수 // 위에꺼랑 코드 중복으로 쓰면 안됨 주의사항 // 오버로드함수 하나만구현.그걸 재호출하는방식으로 사용하기
	static void printCount(int count) {
	    System.out.println("┌────────────┐");
	    System.out.println("│                Count              │");
	    System.out.println("└────────────┘");
	    System.out.printf("Count is %d\n", count);
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
	            int count = count();
	            System.out.println("┌────────────┐");
	            System.out.println("│                Count              │");
	            System.out.println("└────────────┘");
	            System.out.printf("Count is %d\n", count);

	         }
	            break;

	         case 2: {
	            // --- <<total 계산하기 >> -----------------------------------------------
	            int total = 0;
	            {
	               File srcFile = new File("C:\\education\\workspace\\javaPrj\\src\\res\\figuredata.txt");
	               FileInputStream srcFis = new FileInputStream(srcFile);
	               Scanner fscan1 = new Scanner(srcFis);

	               while (fscan1.hasNext()) {
	                  String x_ = fscan1.next();
	                  // fout.print(x_);

	                  int x = Integer.parseInt(x_);
	                  total += x;
	               }

	               fscan1.close();
	               srcFis.close();

	            }

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
	      scan.close();
	      System.out.println("작업완료");
	}

}

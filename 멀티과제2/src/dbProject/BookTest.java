package dbProject;

import java.util.Scanner;

public class BookTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		BookDAO dao = new BookDAO();

		System.out.println("-------도서정보-------");
		System.out.println("1번 : 도서정보입력");
		System.out.println("2번 : 도서정보조회");
		System.out.println("3번 : 종료");
		System.out.print("메뉴번호입력 : ");
		String menu = sc.nextLine();
		
		
		switch(menu) {
		case "1" : 
			
			System.out.print("책번호입력 : ");
			String bookNo = sc.nextLine();
			
			System.out.print("책제목입력 : ");
			String bookTitle = sc.nextLine();
			
			System.out.print("저자입력 : ");
			String bookAuthor = sc.nextLine();
			
			System.out.print("출판일입력 : ");
			String bookYear = sc.nextLine();
			int bookYear1 = Integer.parseInt(bookYear);
			
			System.out.print("가격입력 : ");
			String bookPrice = sc.nextLine();
			int bookPrice1 = Integer.parseInt(bookPrice);
			
			System.out.print("출판사입력 : ");
			String bookPublisher = sc.nextLine();
			
			BookDTO dto = new BookDTO(bookNo, bookTitle, bookAuthor, bookYear1, bookPrice1, bookPublisher);
			dao.insertBook(dto);
			
			break;
			
		case "2" :
			dao.selectproduct();
			break;
			
		case "3" :
			System.out.println("종료");
			System.exit(0);
			break;
		}
		
		sc.close();
	}

}

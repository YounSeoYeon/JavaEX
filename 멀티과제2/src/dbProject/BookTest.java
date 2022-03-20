package dbProject;

import java.util.Scanner;

public class BookTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		BookDAO dao = new BookDAO();

		System.out.println("-------��������-------");
		System.out.println("1�� : ���������Է�");
		System.out.println("2�� : ����������ȸ");
		System.out.println("3�� : ����");
		System.out.print("�޴���ȣ�Է� : ");
		String menu = sc.nextLine();
		
		
		switch(menu) {
		case "1" : 
			
			System.out.print("å��ȣ�Է� : ");
			String bookNo = sc.nextLine();
			
			System.out.print("å�����Է� : ");
			String bookTitle = sc.nextLine();
			
			System.out.print("�����Է� : ");
			String bookAuthor = sc.nextLine();
			
			System.out.print("�������Է� : ");
			String bookYear = sc.nextLine();
			int bookYear1 = Integer.parseInt(bookYear);
			
			System.out.print("�����Է� : ");
			String bookPrice = sc.nextLine();
			int bookPrice1 = Integer.parseInt(bookPrice);
			
			System.out.print("���ǻ��Է� : ");
			String bookPublisher = sc.nextLine();
			
			BookDTO dto = new BookDTO(bookNo, bookTitle, bookAuthor, bookYear1, bookPrice1, bookPublisher);
			dao.insertBook(dto);
			
			break;
			
		case "2" :
			dao.selectproduct();
			break;
			
		case "3" :
			System.out.println("����");
			System.exit(0);
			break;
		}
		
		sc.close();
	}

}

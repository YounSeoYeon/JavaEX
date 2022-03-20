package algorismProject2.copy;

import java.util.Scanner;

public class BinTreeTester {
	
	static Scanner sc = new Scanner(System.in);
	
	static class Data{
		public static final int No=1;
		public static final int Name=2;
		
		private Integer no;
		private String name;
		
		Integer keycode() {
			return no;
		}
		
		public String toString() {
			return name;
		}
		
		void scanData(String guide, int sw) {
			System.out.println(guide+"할 데이터를 입력하세요.");
			
			if((sw&No)==No) {
				System.out.print("번호 : ");
				no=sc.nextInt();
			}
			
			if((sw&Name)==Name) {
				System.out.println("상품명 : ");
				name=sc.nextLine();
			}
		}
	}
	
	public enum Menu {
		add("삽입"),
		remove("삭제"),
		search("검색"),
		print("종합출력"),
		exit("종료");
		
		private final String message;
		
		static Menu Menua(int idx) {
			for(Menu m : Menu.values())
				if(m.ordinal()==idx)
					return m;
			return null;
		}
		
		Menu(String str){
			message = str;
		}
		
		String getMessage() {
			return message;
		}
	}
	
	static Menu SelectMenu() {
		int key;
		do {
			for (Menu m:Menu.values())
				System.out.printf("(%d) %s ",m.ordinal(),m.getMessage());
			System.out.print(" : ");
			key=sc.nextInt();
		} while(key<Menu.add.ordinal() || key>Menu.exit.ordinal());
		return Menu.Menua(key);
	}


	public static void main(String[] args) {		
		Menu menu;
		Data data;
		Data ptr;
		Data temp = new Data();
		Bintree<Integer,Data> tree = new Bintree<Integer,Data>();
		
		do {
			switch (menu = SelectMenu()) {
			case add:
				data = new Data();
				data.scanData("삽입", Data.No|Data.Name);
				tree.add(data.keycode(),data);
				break;
			case remove:
				temp.scanData("삭제", Data.No);
				tree.remove(temp.keycode());
				break;
			case search:
				temp.scanData("검색", Data.No);
				ptr=tree.search(temp.keycode());
				if(ptr!=null)
					System.out.println("해당 번호의 상품명 : "+ptr);
				else
					System.out.println("해당데이터가 없습니다");
			case print:
				tree.print();
				break;
			}
		} while(menu!=Menu.exit);
		
	}
}

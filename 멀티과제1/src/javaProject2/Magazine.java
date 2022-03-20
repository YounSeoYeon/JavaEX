package javaProject2;

public class Magazine extends Book{

	private String month;
	
	public Magazine() {
		super();
	}
	
	public Magazine(String bookNo, String bookTitle, String bookAuthor, String bookPrice, String bookYear, String bookPublisher, String month) {
		super(bookNo, bookTitle, bookAuthor, bookPrice, bookYear, bookPublisher);
		this.month = month;
	}

	@Override
	public String toString() {
		String src = (getBookNo()+" "+getBookTitle()+" "+getBookAuthor()+" "+getBookYear()+" "+getBookPrice()+" "+getBookPublisher()+" "+month);
		System.out.println(src);
		return null;
	}
}

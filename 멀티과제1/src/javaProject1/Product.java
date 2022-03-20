package javaProject1;

public class Product {
	private String prdNo;
	private String prdName;
	private String prdPrice;
	private String prdYear;
	private String prdMaker;

	public Product() {
	}
	
	//객체생성시 값을 전달 받아서 멤버 변수 값 초기화
	public Product(String prdNo, String prdName, String prdPrice, String prdYear, String prdMaker) {
		this.prdNo = prdNo;
		this.prdName = prdName;
		this.prdPrice = prdPrice;
		this.prdYear = prdYear;
		this.prdMaker = prdMaker;		
	}
	
	@Override
	public String toString() {
		String src = (prdNo+" "+prdName+" "+prdPrice+" "+prdYear+" "+prdMaker);
		System.out.println(src);
		return null;
	}
}

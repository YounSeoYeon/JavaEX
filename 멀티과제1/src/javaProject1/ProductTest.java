package javaProject1;

public class ProductTest {

	public static void main(String[] args) {
		Product product0 = new Product("상품번호","상품명","가격","연도","제조사");
		Product product1 = new Product("001","노트북","1200000","2021","삼성");
		Product product2 = new Product("002","모니터","300000","2021","LG");
		Product product3 = new Product("003","마우스","30000","2020","로지텍");
		
		product0.toString();
		System.out.println("-------------------------------------");
		product1.toString();
		product2.toString();
		product3.toString();
	}

}

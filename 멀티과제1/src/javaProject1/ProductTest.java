package javaProject1;

public class ProductTest {

	public static void main(String[] args) {
		Product product0 = new Product("��ǰ��ȣ","��ǰ��","����","����","������");
		Product product1 = new Product("001","��Ʈ��","1200000","2021","�Ｚ");
		Product product2 = new Product("002","�����","300000","2021","LG");
		Product product3 = new Product("003","���콺","30000","2020","������");
		
		product0.toString();
		System.out.println("-------------------------------------");
		product1.toString();
		product2.toString();
		product3.toString();
	}

}

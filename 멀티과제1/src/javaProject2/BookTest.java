package javaProject2;

public class BookTest {

	public static void main(String[] args) {
		Book book0 = new Book("������ȣ","������","����","����","������","���ǻ�");
		Book book1 = new Book("B001","�ڹ� ���α׷���","ȫ�浿","25000","2021","��Ƽ���ǻ�");
		Book book2 = new Book("B002","�ڹٽ�ũ��Ʈ","�̸���","30000","2020","�������ǻ�");
		Book book3 = new Book("B003","HTML/CSS","������","18000","2021","�������ǻ�");
	
		Magazine magazine0 = new Magazine("������ȣ","������","������","����","���࿬��","���ǻ�","�����");
		Magazine magazine1 = new Magazine("M001","�ڹ� ����","ȫ�浿","25000","2021","��Ƽ���ǻ�","5");
		Magazine magazine2 = new Magazine("M002","�� ����","�̸���","30000","2020","�������ǻ�","7");
		Magazine magazine3 = new Magazine("M003","���� ����","������","18000","2021","�������ǻ�","9");
		
		book0.toString();
		System.out.println("-------------------------------------");
		book1.toString();
		book2.toString();
		book3.toString();
		
		System.out.println();
		
		magazine0.toString();
		System.out.println("-------------------------------------");
		magazine1.toString();
		magazine2.toString();
		magazine3.toString();
	}

}

package AlonexerInter;

import java.util.Scanner;

public class exone {

	public static void main(String[] args) {

		newPizza pizza = new newPizza();
		Pizzaconsole console = new Pizzaconsole();
		console.setPizza(pizza);

//		class AA implements consolelistener {
//			@Override
//			public void oninput(Pizza pizza1) {
//				Scanner scan = new Scanner(System.in);
//				System.out.print("�׹�°�Է� > ");
//				int four = scan.nextInt();
//
//				// newPizza pizzas = (newPizza) pizza;
//				pizza.setH(four);
//			}
//
//			@Override
//			public void onprint(Pizza pizza1) {
//				// newPizza pizzas = (newPizza) pizza;
//				System.out.printf("%s : %d\n", pizza.getG(), pizza.getH());
//			}
//		}

//		// �������̽��� �����ϴ°�ó�� �������� �����δ� �������̽��� �͸����� �����ϴ°�  
//		consolelistener aa = new consolelistener() {
//			
//			@Override
//			public void onprint(Pizza pizza) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void oninput(Pizza pizza) {
//				// TODO Auto-generated method stub
//				
//			}
//		};
//		
//		
//		console.setListener(aa);

		// ��
		console.setListener(new consolelistener() {

			@Override
			public void onprint(Pizza pizza1) {
				Scanner scan = new Scanner(System.in);
				System.out.print("�׹�°�Է� > ");
				int four = scan.nextInt();

				// newPizza pizzas = (newPizza) pizza;
				pizza.setH(four);
			}

			@Override
			public void oninput(Pizza pizza1) {
				System.out.printf("%s : %d\n", pizza.getG(), pizza.getH());
			}
		});
		
		console.input();
		console.print();
	}

}

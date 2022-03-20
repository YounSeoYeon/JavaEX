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
//				System.out.print("네번째입력 > ");
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

//		// 인터페이스를 생성하는거처럼 보이지만 실제로는 인터페이스를 익명으로 구현하는거  
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

		// ↓
		console.setListener(new consolelistener() {

			@Override
			public void onprint(Pizza pizza1) {
				Scanner scan = new Scanner(System.in);
				System.out.print("네번째입력 > ");
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

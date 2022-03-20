package Alonexerinter01;

import java.util.Scanner;

public class exone {

	public static void main(String[] args) {
		
		newPizza pizza = new newPizza();
		Pizzaconsole console = new Pizzaconsole();
		console.setPizza(pizza);		
		console.setListener(new consolelistener() {
			
			@Override
			public void oninput(Pizza pizza1) {
				Scanner scan = new Scanner(System.in);
				System.out.print("네번째 > ");
				int four = scan.nextInt();

				pizza.setH(four);

			}

			@Override
			public void onprint(Pizza pizza1) {
				System.out.printf("%s : %d\n", pizza.getG(), pizza.getH());
			}
		});
		console.input();		
		console.print(()->{
				System.out.println("A 피자집 종류 : 수량");				
			});
	}

}


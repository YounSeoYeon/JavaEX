package Alonexer;

import java.util.Scanner;

public class newPizzaconsole extends Pizzaconsole {
	
	public newPizzaconsole() {
	}
	
	@Override
	protected void onprint() {
		newPizza pizza = (newPizza) getPizza();
		System.out.printf("%s : %d\n",pizza.getG(),pizza.getH());
	}
	
	@Override
	public void input() {
		super.input();
		Scanner scan = new Scanner(System.in);
		System.out.print("³×¹øÂ° > ");
		int four = scan.nextInt();
	
		newPizza pizza = (newPizza) getPizza();
		pizza.setH(four);
	}

}

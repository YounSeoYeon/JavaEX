package Alonexer;

import java.util.Scanner;

public abstract class Pizzaconsole {
	
	private Pizza pizza;
	public Pizzaconsole() {
		//this.pizza = new Pizza();
	}
	
	public void setPizza(Pizza pizza) {
		this.pizza = pizza;
	}
	
	public Pizza getPizza() {
		return pizza;
	}

	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("수량입력");
		System.out.print("첫번째 > ");
		int one = scan.nextInt();
		System.out.print("두번째 > ");
		int two = scan.nextInt();
		System.out.print("세번째 > ");
		int three = scan.nextInt();
		
		pizza.setD(one);
		pizza.setE(two);
		pizza.setF(three);	    
	}

	public void print() {
		System.out.println("피자 종류:수량");
		System.out.printf("%s : %d\n",pizza.getA(),pizza.getD());
		System.out.printf("%s : %d\n",pizza.getB(),pizza.getE());
		System.out.printf("%s : %d\n",pizza.getC(),pizza.getF());
		
		onprint();
		
		int total = this.pizza.total();
		System.out.printf("총수량 : %d\n",pizza.total());
	}

	protected abstract void onprint();

}

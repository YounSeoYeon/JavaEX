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
		System.out.println("�����Է�");
		System.out.print("ù��° > ");
		int one = scan.nextInt();
		System.out.print("�ι�° > ");
		int two = scan.nextInt();
		System.out.print("����° > ");
		int three = scan.nextInt();
		
		pizza.setD(one);
		pizza.setE(two);
		pizza.setF(three);	    
	}

	public void print() {
		System.out.println("���� ����:����");
		System.out.printf("%s : %d\n",pizza.getA(),pizza.getD());
		System.out.printf("%s : %d\n",pizza.getB(),pizza.getE());
		System.out.printf("%s : %d\n",pizza.getC(),pizza.getF());
		
		onprint();
		
		int total = this.pizza.total();
		System.out.printf("�Ѽ��� : %d\n",pizza.total());
	}

	protected abstract void onprint();

}

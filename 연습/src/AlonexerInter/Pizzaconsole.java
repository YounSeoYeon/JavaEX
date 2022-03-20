package AlonexerInter;

import java.util.Scanner;

public class Pizzaconsole {
	
	private consolelistener listener;
	private Pizza pizza;
	public Pizzaconsole() {
		//this.pizza = new Pizza();
	}
	
	public void setListener(consolelistener listener) {
		this.listener = listener;
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
		
		if(listener != null)
			listener.oninput(pizza);
		
		pizza.setD(one);
		pizza.setE(two);
		pizza.setF(three);	    
	}

	public void print() {
		System.out.println("���� ����:����");
		System.out.printf("%s : %d\n",pizza.getA(),pizza.getD());
		System.out.printf("%s : %d\n",pizza.getB(),pizza.getE());
		System.out.printf("%s : %d\n",pizza.getC(),pizza.getF());
		
		if(listener != null)
			listener.onprint(pizza);
		
		int total = this.pizza.total();
		System.out.printf("�Ѽ��� : %d\n",pizza.total());
		
		double avg = this.pizza.avg();
		System.out.printf("��� : %f\n",pizza.avg());
	}

}

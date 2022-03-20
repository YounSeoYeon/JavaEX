package Alonexerinter01;

import java.util.Scanner;

public class newPizza extends Pizza {

	private String g;
	private int h;

	public newPizza() {
		super();
		this.g = "bulgogi";
		this.h = 0;
	}

	public newPizza(String g, int h) {
		this.g = g;
		this.h = h;
	}

	@Override
	public int total() {
		return super.total() + this.h;
	}

	public double avg() {
		return total() / 4.0;
	}

	public String getG() {
		return g;
	}

	public void setG(String g) {
		this.g = g;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}


}

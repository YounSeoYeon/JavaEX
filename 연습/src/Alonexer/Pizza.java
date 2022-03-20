package Alonexer;

public class Pizza {
	
	private String a;
	private String b;
	private String c;
	private int d;
	private int e;
	private int f;
			
	
	public Pizza() {
		a = "combi";
		b = "peppa";
		c = "cheese";
		d = 0;
		e = 0;
		f = 0;
	}
	
	public Pizza(int x,int y, int z) {
		d=x;
		e=y;
		f=z;
	}

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public String getB() {
		return b;
	}

	public void setB(String b) {
		this.b = b;
	}

	public String getC() {
		return c;
	}

	public void setC(String c) {
		this.c = c;
	}

	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}

	public int getE() {
		return e;
	}

	public void setE(int e) {
		this.e = e;
	}

	public int getF() {
		return f;
	}

	public void setF(int f) {
		this.f = f;
	}
	
	public int total() {
		int total = getD()+getE()+getF();
		return total;
	}
	
}

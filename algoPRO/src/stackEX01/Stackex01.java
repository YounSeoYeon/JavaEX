package stackEX01;

public class Stackex01 {
	private int stacksize;
	private int top;
	private char[] stackarr;
	
	public Stackex01(int stacksize) {
		this.stacksize = stacksize;
		top = -1;
		stackarr = new char[this.stacksize];
	}
	
	public boolean isempty() {
		return top == -1;
	}
	
	public boolean isfull() {
		return top == stacksize-1;		
	}


	public void push(char item) {
		if(isfull())
			System.out.println("stack full, Overflow");
		else
		stackarr[++top] = item;
	}
	
	public char pop() {	
		if(isempty()) {
			System.out.println("Stack Empty!!");
			return 'E';
	}
		else 
			return stackarr[top--];
	}
	
	public char peek() {
		if(isempty()) {
			System.out.println("Stack Empty");
			return 'E'; 
		} else {
			return stackarr[top];
		}
	}
	
	public void clear() {
		top = -1;
	}
	
	public void showStack() {
		if(isempty()) {
			System.out.println("Stack empty");			
		} else {
			System.out.print("Stack items : ");
			for(int i=0; i<=top; i++) {
				System.out.print(i + ":" + stackarr[i] + " ");
			}
			System.out.println("\ntop : " + top);
		}
	}

}

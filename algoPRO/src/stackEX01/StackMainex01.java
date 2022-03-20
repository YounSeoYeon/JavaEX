package stackEX01;

public class StackMainex01 {

	public static void main(String[] args) {
		
		int stacksize = 5;
		Stackex01 sta = new Stackex01(stacksize);
		
		System.out.println("스택초기상태");
		sta.showStack();
		
		System.out.println("pop 수행");
		sta.pop();
		
		System.out.println("a,b,c push수행");
		sta.push('a');
		sta.push('b');
		sta.push('c');
		
		sta.showStack();
		
		System.out.println("최상위값 : "+sta.peek());
		
		System.out.println("d,e push 수행");
		sta.push('d');
		sta.push('e');
		sta.showStack();
		
		System.out.println("f push수행");
		sta.push('f');
		sta.showStack();
		
		System.out.println("pop2번수행");
		System.out.println("pop한값 : "+sta.pop());
		System.out.println("pop한값 : "+sta.pop());
		sta.showStack();
		
		System.out.println("clear수행");
		sta.clear();
		sta.showStack();
		
		System.out.println("\nh push 수행");
		sta.push('h');
		sta.showStack();
		
		
		
	}

}

package stackEX01;

public class StackMainex01 {

	public static void main(String[] args) {
		
		int stacksize = 5;
		Stackex01 sta = new Stackex01(stacksize);
		
		System.out.println("�����ʱ����");
		sta.showStack();
		
		System.out.println("pop ����");
		sta.pop();
		
		System.out.println("a,b,c push����");
		sta.push('a');
		sta.push('b');
		sta.push('c');
		
		sta.showStack();
		
		System.out.println("�ֻ����� : "+sta.peek());
		
		System.out.println("d,e push ����");
		sta.push('d');
		sta.push('e');
		sta.showStack();
		
		System.out.println("f push����");
		sta.push('f');
		sta.showStack();
		
		System.out.println("pop2������");
		System.out.println("pop�Ѱ� : "+sta.pop());
		System.out.println("pop�Ѱ� : "+sta.pop());
		sta.showStack();
		
		System.out.println("clear����");
		sta.clear();
		sta.showStack();
		
		System.out.println("\nh push ����");
		sta.push('h');
		sta.showStack();
		
		
		
	}

}

package stack;

public class StackMain {

	public static void main(String[] args) {
		
		// 스택 크기 설정
				int stackSize = 5;
				Stack stk = new Stack(stackSize);
				
				System.out.print("스택 초기 상태 : ");
				stk.showStack(); // 스택 초기 상태 : Stack Empty
				
				System.out.println("\npop 수행");
				stk.pop(); // Stack Empty
				
				System.out.println("\na, b, c push 수행");
				stk.push('a');
				stk.push('b');
				stk.push('c');
				stk.showStack(); 
				// Stack items : 0:a 1:b 2:c 
				// top : 2
				
				System.out.println("\n최상위 값 : " + stk.peek());
				// 최상위 값 : c
				
				System.out.println("\nd, e push 수행");
				stk.push('d');
				stk.push('e');
				stk.showStack(); 
				// Stack items : 0:a 1:b 2:c 3:d 4:e 
				// top : 4
				
				System.out.println("\nf push 수행");
				stk.push('f'); // Stack Full. Overflow
				
				System.out.println("\npop 2번 수행 ");
				System.out.println("pop 한 값 : " + stk.pop());
				System.out.println("pop 한 값 : " + stk.pop());
				stk.showStack(); 
				// pop 한 값 : e
				// pop 한 값 : d
				// Stack items : 0:a 1:b 2:c 
				// top : 2
				
				System.out.println("\nclear 수행");
				stk.clear();
				stk.showStack(); // Stack Empty
				
				System.out.println("\npop 수행");
				stk.pop(); // Stack Empty
				
				System.out.println("\nh push 수행");
				stk.push('h');
				stk.showStack();
				// Stack items : 0:h 
				// top : 0
	}

}

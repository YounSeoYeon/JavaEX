package stack;

public class StackMain {

	public static void main(String[] args) {
		
		// ���� ũ�� ����
				int stackSize = 5;
				Stack stk = new Stack(stackSize);
				
				System.out.print("���� �ʱ� ���� : ");
				stk.showStack(); // ���� �ʱ� ���� : Stack Empty
				
				System.out.println("\npop ����");
				stk.pop(); // Stack Empty
				
				System.out.println("\na, b, c push ����");
				stk.push('a');
				stk.push('b');
				stk.push('c');
				stk.showStack(); 
				// Stack items : 0:a 1:b 2:c 
				// top : 2
				
				System.out.println("\n�ֻ��� �� : " + stk.peek());
				// �ֻ��� �� : c
				
				System.out.println("\nd, e push ����");
				stk.push('d');
				stk.push('e');
				stk.showStack(); 
				// Stack items : 0:a 1:b 2:c 3:d 4:e 
				// top : 4
				
				System.out.println("\nf push ����");
				stk.push('f'); // Stack Full. Overflow
				
				System.out.println("\npop 2�� ���� ");
				System.out.println("pop �� �� : " + stk.pop());
				System.out.println("pop �� �� : " + stk.pop());
				stk.showStack(); 
				// pop �� �� : e
				// pop �� �� : d
				// Stack items : 0:a 1:b 2:c 
				// top : 2
				
				System.out.println("\nclear ����");
				stk.clear();
				stk.showStack(); // Stack Empty
				
				System.out.println("\npop ����");
				stk.pop(); // Stack Empty
				
				System.out.println("\nh push ����");
				stk.push('h');
				stk.showStack();
				// Stack items : 0:h 
				// top : 0
	}

}

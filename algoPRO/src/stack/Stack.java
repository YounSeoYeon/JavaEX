package stack;

public class Stack {

	//��� ����
		private int stackSize;     	// ���� ũ��
		private int top;       		// ���� ������
		private char[] stackArr; 	// ���� (�迭) : �迭 ������ ����. ���� �Ҵ���� �ʾ���
		
		
		// ������ : ���� �ʱ�ȭ
		// �迭 index�� 0���� �����ϹǷ�
		// top �ʱ�ȭ�� -1�� ����
		public Stack(int stackSize) {
			top = -1;
			this.stackSize = stackSize;				// ���� ũ�� ����
			stackArr = new char[this.stackSize];	// ���� �迭 ����
		}	
		
		// �޼���
		
		// ������ ������� Ȯ���ϴ� isEmpty()
		// ��� ��ȯ : true / false
		public boolean isEmpty() {
			return top == -1;// top�� -1�̸� true �ƴϸ� false ��ȯ
		}	
		
		// ������ ���� ���ִ��� Ȯ���ϴ� isFull()
		// ��� ��ȯ : true / false
		// ������ ���� �������� true ��ȯ 
		// ���� �� ���� : top�� 4�ΰ�� (��, stackSize - 1 �� ���)
		// stackSize : 5
		// ���� index : 0 1 2 3 4 
		public boolean isFull() {
			return top == stackSize - 1; 
			// top�� ���� ũ�� 5�� ������ (������ �ε����̸�) true ��ȯ
		}
		
		// ���ÿ� ������ �����ϴ� push()
		// (1) �����ϱ� ���� Overflow �߻��ϴ��� Ȯ�� : isFull() ȣ���ؼ� ��� �޾Ƽ� Ȯ��
		// (2) Full�� �ƴϸ� top�� �ϳ� ������ ��ġ�� ������ ���� : ++top
		// �����ϱ� ���� �����͸� �Ű����� ����
		// ���� ���ÿ� �����ϰ� ���� -> ��ȯ �� ����
		public void push(char item) {
			if(isFull()) {
				System.out.println("Stack Full. Overflow");
			} else {
				// �ʱⰪ�� -1�̹Ƿ� push �� �� ���� 1���� 
				stackArr[++top] = item;
			}
		}	
		
		// ���ÿ��� �����͸� �����ϴ� pop()
		// (1) ������ �����ϱ� ���� ������ ������� (Underflow �߻��ϴ���) Ȯ�� 
		//		: isEmpty() ȣ���ؼ� �Ȱ� ����
		// Empty�� �ƴϸ� top ��ġ�� ������ ����
		// ���� �� top�� 1 ���� ���� : top--
		// ������ ���ڸ� ��ȯ
		public char pop() {
			if(isEmpty()) {
				System.out.println("Stack Empty");
				return 'E'; // ���������� ��ȯ
			} else {
				// top ��ġ�� �ִ� ������ ��ȯ�ϰ� top�� 1����
				return stackArr[top--];
			}
		}	
		
		// ������ �ֻ��� �����͸� ����ϴ� peek()
		// (1) ���� ������ ������� Ȯ��
		// (2) �ֻ��� ������ (top ��ġ�� �ִ� ������) ��ȯ
		// �ֻ��� ������(����) ��ȯ�ϹǷ� ��ȯ�� ����
		public char peek() {
			if(isEmpty()) {
				System.out.println("Stack Empty");
				return 'E'; // ���������� ��ȯ
			} else {
				// ���� �ֻ��� ��ġ (top�� ��ġ)�� �� ��ȯ
				return stackArr[top];
			}
		}		
		
		// ���� ������ ���� clear()
		// ���� �ʱ�ȭ : top = -1�� ����
		public void clear() {
			// top�� -1�� �ʱ�ȭ
			top = -1;
		}
		
		// ������ ��ü �����͸� ����ϴ� showStack()
		// ��¸� �ϰ� ��ȯ�� ����
		// ���� ����ϱ� ���� ������ ������� Ȯ��
		// ���ÿ� �ִ� ��� ����� �� ��� (�迭�� ��� ����� �� ���)
		public void showStack() {
			if(isEmpty()) {
				System.out.println("Stack Empty");			
			} else {
				System.out.print("Stack items : ");
				for(int i=0; i<=top; i++) {
					System.out.print(i + ":" + stackArr[i] + " ");
				}
				System.out.println("\ntop : " + top);
			}
			System.out.println("\ntop : "+top);
		}
}

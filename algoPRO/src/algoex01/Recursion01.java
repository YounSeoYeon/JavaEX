package algoex01;

public class Recursion01 {

	public static void main(String[] args) {
		
		
		//10���� 1���� ���ϱ�
		
		System.out.println(sum(10));
	}
	
	static int sum(int n) {		
		if(n==0) {			
			System.out.print("= ");
			return 0;
		}
		else {
			System.out.print(n+" ");
			return n+sum(n-1);
		}
	}

}

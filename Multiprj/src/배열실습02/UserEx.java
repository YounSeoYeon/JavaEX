package �迭�ǽ�02;

public class UserEx extends User {
	
	int creditlevel = 0;
	int depositcnt = 0;
	public UserEx() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	void withdraw(int amount) {
		if(this.bal<amount && this.creditlevel>10)
			this.bal -= amount;
		else if(this.bal<amount && this.creditlevel<=10)
			System.out.println("�ܾ��� �����մϴ�");
		else bal -= amount;
	}
	
	@Override
	void deposit(int amount) {
		super.deposit(amount);
		this.depositcnt++;
		if(this.depositcnt %10 ==0) creditlevel++;		
	}
	
	@Override
	void print() {
		super.print();
		System.out.printf("�ſ��� : %d, �Ա�Ƚ�� : %d\n",this.creditlevel,this.depositcnt);;
	}
}

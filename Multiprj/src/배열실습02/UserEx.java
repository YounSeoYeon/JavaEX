package 배열실습02;

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
			System.out.println("잔액이 부족합니다");
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
		System.out.printf("신용등급 : %d, 입금횟수 : %d\n",this.creditlevel,this.depositcnt);;
	}
}

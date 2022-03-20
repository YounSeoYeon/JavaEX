package 배열실습02;

import java.util.Random;

public class User {
	String id;
	String infor;
	int bal;
	void deposit(int amount) {
		this.bal += amount;
	}
	
	void withdraw(int amount) {
		if(this.bal<amount) {
			System.out.println("잔액부족");
		}
		else {
			this.bal -= amount;
		}
	}
	
	//고객의 정보를 출력
	//현재 고객의 계좌번호와 잔액출력하는 메서드
	
	public User() {
		this.infor = createaccount();
		this.bal = 0;
	}
	
	public User(int i) {
		this.infor = createaccount();
		bal = i;
	}
	
	private String createaccount() {
		Random rd = new Random();
		String account = String.format(
				"%04d-%04d-%04d-%04d",
				rd.nextInt(9999)+1,
				rd.nextInt(9999)+1,
				rd.nextInt(9999)+1,
				rd.nextInt(9999)+1);		
		return account;
	}

	void print() {
		System.out.printf("계좌번호 : %s, 잔액 : %d원\n", this.infor, this.bal);
	}
}

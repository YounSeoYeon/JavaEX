package �迭�ǽ�02;

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
			System.out.println("�ܾ׺���");
		}
		else {
			this.bal -= amount;
		}
	}
	
	//���� ������ ���
	//���� ���� ���¹�ȣ�� �ܾ�����ϴ� �޼���
	
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
		System.out.printf("���¹�ȣ : %s, �ܾ� : %d��\n", this.infor, this.bal);
	}
}

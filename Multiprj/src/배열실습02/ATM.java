package �迭�ǽ�02;

import java.util.Random;

public class ATM {
	//������ �𵨷� Ŭ���׼���
	//���� - ��
	//���� ���¹�ȣ�� �����ܾ�,�������°�����������
	//���� ����,�Ա� ����Ҽ� ����
	//����Ŭ����(��)(����ھ��̵�,��������(��ü))
	//����Ŭ����(���¹�ȣ,�ܾ�)
	public static void main(String[] args) {
		//����
		Random ran = new Random();
		User[] userlist = new User[5];
		
		for(int i=1; i<userlist.length; i++) {
			userlist[i] = new User(ran.nextInt(999999)+1);
			userlist[i].print();
		}
		
		userlist[1].deposit(10000);
		userlist[1].print();
		userlist[2].withdraw(10000);
		userlist[2].print();
		
		UserEx user01 = new UserEx();
		user01.print();
		
		for(int i=0; i<11; i++) {
			int money = ran.nextInt(10000)+1;
			user01.deposit(money);
			user01.print();
		}
		user01.withdraw(1000);
		user01.print();
	}

}

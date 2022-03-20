package 배열실습02;

import java.util.Random;

public class ATM {
	//은행을 모델로 클래그설계
	//은행 - 고객
	//고객은 계좌번호와 통장잔액,여러계좌가질수도있음
	//고객은 인출,입금 등등할수 있음
	//유저클래스(고객)(사용자아이디,계좌정보(객체))
	//계좌클래스(계좌번호,잔액)
	public static void main(String[] args) {
		//가입
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

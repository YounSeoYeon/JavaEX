package 수업;

import java.util.Scanner;

public class 이체하기 {

	public static void main(String[] args) {
		/*
		 * # ATM[1단계] : 이체하기
		 * 
		 * 1. 이체할 계좌번호를 입력받는다.
		 * 2. 계좌번호가 일치하면,
		 * 3. 이체할 금액을 입력받는다.
		 * 4. 이체할 금액 <= myMoney    : 이체가능
		 *             myMoney   - 이체할 금액
		 *             yourMoney + 이체할 금액
		 *    이체할 금액  > myMoney     : 이체불가
		 */
		
		Scanner sc = new Scanner(System.in);
		int account = 1234;
		int myMoney = 5678;
		int yourmoney = 1111;
		int tomoney = 0;
		
		System.out.println("이체할 계좌를 써주세요");
		int toaccount = sc.nextInt();
		if(account == toaccount) {
			System.out.println("계좌번호일치");
			System.out.println("이체할금액 : ");
			tomoney = sc.nextInt();
			
			if(tomoney > myMoney) {
				System.out.println("이체불가!!");
			}
			else if(tomoney<myMoney) {
				myMoney -= tomoney;
				yourmoney += tomoney;
				System.out.println("이체가능");
				System.out.println("이체완료");
				System.out.printf("내계좌잔액 : %d, 상대계좌잔액 : %d\n",myMoney,yourmoney);
			}
		}
		else {
			System.out.println("계좌번호가 틀립니다!");
		}
		sc.close();
	}

}

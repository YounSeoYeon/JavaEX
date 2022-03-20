package 배열실습;

import java.util.Scanner;

public class arrayclass02 {

	public static void main(String[] args) {
		//학생이름을 입력받으면 // 이름저장
		//국어,영어,수학 입력받을수 있게 나옴 // 입력후 해당학생의 과목점수로 저장
		//학생이름,과목점수,총점,평균 출력
		Scanner sc = new Scanner(System.in);
		Students st = new Students();
		Subject[] subj = new Subject[3];		
		
		int total = 0;
		int count = 0;
		double avg = 0;
		
		System.out.println("학생 이름을 입력하세요 : ");		
		st = new Students(sc.nextLine());	
		
		for(int i=0; i<subj.length; i++) {
			System.out.println("과목 이름을 입력하세요 : ");
			subj[i] = new Subject(sc.nextLine());			
			System.out.println("점수를 입력하세요 : ");
			subj[i].score = Integer.parseInt(sc.nextLine());
			count++;
			total += subj[i].score;
			}
		
		avg =  (double)total/count;
		
		System.out.println("학생이름");
		System.out.println(st.name);
		
		for(int i=0; i<subj.length; i++) {
			System.out.print("과목이름 ");
			System.out.println(subj[i].name);
			System.out.print("과목점수 ");
			System.out.println(subj[i].score);
		}
		System.out.printf("총점 : %d, 평균 : %f\n",total,avg);				
		
	}

}

package 배열실습03;

import java.util.Arrays;
import java.util.Random;

public class arrayclass03 {

	public static void main(String[] args) {
		// 학생의 학번과 성적
		// 학번 배열과 성적 배열을 따로 만들어서 관리
		// 배열의 인덱스를 이용해서 학번과 성적을 연결
		// 클래스를 이용해서 표현

		// 객체 배열(기본형 타입만 배열이 될 수 있는것은 아닙니다)
		// 학생 객체 5개를 담을 수 있는 배열
		// 배열에 아직 객체는 들어있지 않습니다.
		// 객체를 담을 수 있는 메모리 공간만 확보
		// 첫번째 학생 == 배열의 0번 인덱스
		// 첫번째 학생은 배열의 0번 인덱스를 통해서 접근
		// 5명의 학생 정보를 담을 수 있도록 객체를 배열에 만들어 봅시다.
		// 학번을 입력(1001 ~ 1005)
		// 학생마다 성적을 랜덤하게 생성해서 입력
		// # 학생 추가 삭제 컨트롤러
		// => 컨트롤러를 완성해 아래 3개의 정보를 추가하시오.
		// 김철수 : 과목3개 수학 50 국어50 영어 60
		// 이만수 : 과목2개 수학 20 국어 30
		// 이영희 : 과목1개 수학 100

		Student[] person = new Student[5];
		System.out.println(Arrays.toString(person));
		
		person[0] = new Student("전지현");
		person[1] = new Student("김태희");
		person[2] = new Student("한가인");
		
		Student ent = null;
		for(int i=0; i<person.length; i++) {
			if(person[i].name == "전지현") {
				ent = person[i];
				break;
				}
		}
		
		for(int i=0; i<ent.sub.length; i++) {
			ent.sub[i] = new Subject();
		}
		
		System.out.printf("과목별 점수 객체: %s\n", Arrays.toString(ent.sub));
		ent.sub[0].subname = "수학";
		ent.sub[0].score = 100;
		ent.sub[1].subname = "영어";
		ent.sub[1].score = 90;
		ent.sub[2].subname = "국어";
		ent.sub[2].score = 95;		
		
		for(int i=0; i<ent.sub.length; i++) {
			System.out.printf("과목 : %s, 점수 : %d\n",ent.sub[i].subname,ent.sub[i].score);
		}
		
	}
}

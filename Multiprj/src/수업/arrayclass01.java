package 수업;

import java.util.Arrays;
import java.util.Random;

public class arrayclass01 {

	public static void main(String[] args) {
		// 객체 배열(기본형 타입만 배열이 될 수 있는것은 아닙니다)
		// 학생 객체 5개를 담을 수 있는 배열
		Student [] studentArray = new Student[5];
		
		// 배열에 아직 객체는 들어있지 않습니다.
		// 객체를 담을 수 있는 메모리 공간만 확보
		System.out.println(Arrays.toString(studentArray));
		
		// 5명의 학생 정보를 담을 수 있도록 객체를 배열에 만들어 봅시다. 
		for( int i = 0; i < studentArray.length; i++ ) {
			studentArray[i] = new Student();
		}
		System.out.println(Arrays.toString(studentArray));
		
		// 만들어진 메서드를 통해서 학번과 점수를 채워 보도록 합니다.
		// 학번은 1001 ~ 1005(순차적으로 증가)
		// 점수는 랜덤하게 생성해서 전달
		Random rand = new Random();
		int hakbun = 1001;
		for ( Student student: studentArray ) {
			int score = rand.nextInt(100) + 1;
			student.setData(hakbun, score);
		}
		
		// 출력을 해보려면 메서드가 필요합니다. 
		for ( Student student: studentArray ) {
			student.printData();
		}		
	}

}

package 수업;

public class array05 {

	public static void main(String[] args) {
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		
		// 문제) 1등학생의 학번과 성적 출력
		// 정답) 1004번(98점)
		// 메모리값 항상 최대로 유지하는방법
		
		int maxscore = 0;
		int masidx = 0;
		
		for(int i=0; i<scores.length; i++) {
			if(maxscore<scores[i])
				maxscore = scores[i];
				masidx = i;
		}
		System.out.println(maxscore);
		System.out.println(masidx);
		System.out.printf("%d번(%d점)",hakbuns[masidx],maxscore);
	}

}

class Program{
	public static void main(String[] args){
		//변수 선언
		int kor1, kor2, kor3;
		int total;
		float avg;

		//국어성적 3개를 초기화
		kor1 = 65;
		kor2 = 85;
		kor3 = 76;

		//총점구하기
		total = kor1 + kor2 + kor3;

		//평균구하기
		avg = total / 3;
		
		System.out.printf("total is %d\n", total);
		System.out.printf("avg is %f\n" , avg);
	}
}
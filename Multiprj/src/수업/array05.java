package ����;

public class array05 {

	public static void main(String[] args) {
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		
		// ����) 1���л��� �й��� ���� ���
		// ����) 1004��(98��)
		// �޸𸮰� �׻� �ִ�� �����ϴ¹��
		
		int maxscore = 0;
		int masidx = 0;
		
		for(int i=0; i<scores.length; i++) {
			if(maxscore<scores[i])
				maxscore = scores[i];
				masidx = i;
		}
		System.out.println(maxscore);
		System.out.println(masidx);
		System.out.printf("%d��(%d��)",hakbuns[masidx],maxscore);
	}

}

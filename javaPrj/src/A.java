class Program{
	public static void main(String[] args){
		//���� ����
		int kor1, kor2, kor3;
		int total;
		float avg;

		//����� 3���� �ʱ�ȭ
		kor1 = 65;
		kor2 = 85;
		kor3 = 76;

		//�������ϱ�
		total = kor1 + kor2 + kor3;

		//��ձ��ϱ�
		avg = total / 3;
		
		System.out.printf("total is %d\n", total);
		System.out.printf("avg is %f\n" , avg);
	}
}
package sort;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr= {5,2,8,3,1};
		insertionsort(arr);
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
	}
	
	static void insertionsort(int[]arr) {
		//ù��°�� ������ ���ִٰ�. �׷��� 1����
		for(int i=1; i<arr.length; i++) {
			//������ ��(k�� �ش�)
			int temp=arr[i]; // �ӽ�����
			//���� ������ ���� ���� ������ �ε��� ����
			int index = i-1;
			
			//���� ���� ���� ���Һ��� ������ �������Ҹ� ��ĭ�� �ڷ� �̵�
			while(index>=0 && temp<arr[index]) {
				arr[index+1] = arr[index];
				index--;
			}
			//while�� ���� : ���� ���Ұ� ���� ������ ������ �ݺ��� ����
			//���� ���� index��° ���� �ڷο;���
			//���� index=1 ��ġ�� ���簪(k) ����
			
			arr[index+1] = temp;
		}
	}

}

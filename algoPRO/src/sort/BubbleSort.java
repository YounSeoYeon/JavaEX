package sort;

public class BubbleSort {

	public static void main(String[] args) {
	}
	
	static void bubblesort(int[]arr) {
		//������ 2����Ҹ� ��ȯ 
		//2������ȯ�� ������ ���� �����ϴ� ���� ���� ���� ������
		//�������� �����ϱ����ؼ� �ӽ�����ʿ� (temp)
		
		int temp;
		
		//�� ���� : �迭ũ��-1�� ����
		for(int i=0; i<arr.length-1; i++) {
			//�� ���庰 ��Ƚ��: �迭ũ��-���� Ƚ��
			for(int j=0; j<arr.length-1-i; i++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				
			}

		}
	}

}

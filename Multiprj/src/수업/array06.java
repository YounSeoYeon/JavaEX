package ����;

public class array06 {

	public static void main(String[] args) {
		/*
		 * # 4�� ����� ����
		 * 
		 *   arr �迭���� 4�� ����� ������ ����Ͽ� 4�� ����� ������ŭ  temp �迭�� �����ѵڿ� 
		 *   arr�迭�� 4�� �������  temp�� �Űܴ�ƺ��ÿ�.
		 * 
		 */
		
		int[] arr = { 44, 11, 29, 24, 76 };
		int[] temp = null;
		int count = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%4==0)
				count++;
		}
		temp = new int[count];
		System.out.println(count);
		System.out.println();
		
		int j=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%4==0) {
				temp[j] = arr[i];
				j++;
			}
		}
		
		for(int i=0; i<temp.length; i++) {
			System.out.printf("%d ", temp[i]);
		}
	
	}

}

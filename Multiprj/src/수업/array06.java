package 수업;

public class array06 {

	public static void main(String[] args) {
		/*
		 * # 4의 배수만 저장
		 * 
		 *   arr 배열에서 4의 배수의 개수를 계산하여 4의 배수의 개수만큼  temp 배열을 생성한뒤에 
		 *   arr배열의 4의 배수들을  temp로 옮겨닮아보시오.
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

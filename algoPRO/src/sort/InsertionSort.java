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
		//첫번째는 정렬이 되있다고봄. 그래서 1부터
		for(int i=1; i<arr.length; i++) {
			//선택한 값(k에 해당)
			int temp=arr[i]; // 임시저장
			//현재 선택한 값의 이전 원소의 인덱스 저장
			int index = i-1;
			
			//현재 값이 이전 원소보다 작으면 이전원소를 한칸씩 뒤로 이동
			while(index>=0 && temp<arr[index]) {
				arr[index+1] = arr[index];
				index--;
			}
			//while문 종료 : 앞의 원소가 연재 값보다 작으면 반복문 종료
			//현재 값은 index번째 원소 뒤로와야함
			//따라서 index=1 위치에 현재값(k) 저장
			
			arr[index+1] = temp;
		}
	}

}

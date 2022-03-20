package sort;

public class BubbleSort {

	public static void main(String[] args) {
	}
	
	static void bubblesort(int[]arr) {
		//인접한 2개요소를 교환 
		//2개값교환시 변수에 값을 저장하는 순간 이전 값은 없어짐
		//이전값을 보존하기위해서 임시장소필요 (temp)
		
		int temp;
		
		//총 라운드 : 배열크기-1번 진행
		for(int i=0; i<arr.length-1; i++) {
			//각 라운드별 비교횟수: 배열크기-라운드 횟수
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

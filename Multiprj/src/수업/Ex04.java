package 수업;

public class Ex04 {
	int test1(int[] arr) {
		int ct = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 4 == 0)
				ct++;
		}
		return ct;
	}

	int[] test2(int cnt, int[] arr) {

		// 4의 배수를 저장할 새로운 배열을 생성
		// 배열의 위치를 참조하는 참조 변수가 지역변수
		int[] newArr = new int[cnt];

		// arr를 순회하면서, newArr의 위치를 잘 잡아줘야 합니다.
		int i = 0;
		for (int val : arr) {
			if (val % 4 == 0) {
				newArr[i] = val;
				i++;
			}
		}

		return newArr;
	}
}

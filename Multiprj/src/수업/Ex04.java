package ����;

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

		// 4�� ����� ������ ���ο� �迭�� ����
		// �迭�� ��ġ�� �����ϴ� ���� ������ ��������
		int[] newArr = new int[cnt];

		// arr�� ��ȸ�ϸ鼭, newArr�� ��ġ�� �� ������ �մϴ�.
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

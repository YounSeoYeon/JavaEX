package ����;

public class method05 {

	public static void main(String[] args) {
		Ex05 e = new Ex05();
        int[] arr = {87, 100, 11, 72, 92};
        
        // ���� 1) ��ü �� ����
        // ���� 1) 362
        int tot = e.test1(arr);
        System.out.println("tot = " + tot);



        // ���� 2) 4�� ����� �� ����
        // ���� 2) 264
        tot = e.test2(arr);
        System.out.println("tot = " + tot);



        // ���� 3) 4�� ����� ���� ����
        // ���� 3) 3
        int cnt = e.test3(arr);
        System.out.println("cnt = " + cnt);



        // ���� 4) ¦���� ���� ����
        // ���� 4) 3
        cnt = e.test4(arr);
        System.out.println("cnt = " + cnt);
	}

}

package ����;

public class Main6 {

	public static void main(String[] args){	
		//42�� ���� �������� �ٸ����� ���� ����� ���ϱ�
		//�ٸ����϶� �迭�� �ֱ�
		
		int[] a = new int[10];
		int[] x = new int[10];
		int count = 10;
		
		for(int i=0; i<a.length; i++) {
			a[i] = (int) (Math.random()*1000+1);
			for(int j=0; j<i; j++) {
				if(a[i] == a[j])
					i--;
			}
			
		}
		for(int i=0; i<a.length; i++)
			System.out.println(a[i]);
				
		for(int i=0; i<a.length; i++) {
			x[i] = a[i]%42;
			for(int j=0; j<i; j++) {
				if(x[i] == x[j])
					count--;
			}
		}
		for(int i=0; i<a.length; i++) {
			System.out.print(x[i]+" ");
		}
		System.out.println(count);
	}
}

package chap02;

public class E2_9 {

	public static void main(String[] args) {
		for(int i=0; i<500; i++) {
			int j;
			for(j=0; j<i; j++) {
				int x = (i+2)%(j+2);
				if(x==0) {break;}
			}
			if(i+2==j+2)
			System.out.print(i+2+" ");
		}
		
		System.out.println("\n--------------------");
		int j=0; // 소수의 갯수
		int[] pr = new int[250];
		pr[j++]=2; // 소수값으로 나눠지면 소수아님
		
		for(int i=0; i<500; i+=2) {
			int x;
			for(x=0; x<j; x++) {
				if((i+3)%pr[x]==0)
					break;
			}
			if(j==x) 
				pr[j++]=i+3;
		}
		
		for(int i=0; i<j; i++) {
			System.out.print(pr[i]+" ");
		}
	}

}

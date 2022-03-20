package 수업;

public class Main7 {

	public static void main(String[] args){
		int N = (int) (Math.random()*1000+1);
		int[] y = new int[N];
		double[] z = new double[N];
		int max = -1;
		double total = 0.00;
		double avg = 0.00;
		
		for(int i=0; i<y.length; i++) {
			y[i] = (int) (Math.random()*101);
			if(y[i]>max)
				max = y[i];			
		}
		
		System.out.println(max);
		System.out.println(N);
		
		for(int i=0; i<y.length; i++) {
			z[i] = (y[i]*1.00/max)*100;
			System.out.print(z[i]+" ");
			total += z[i];
		}
		avg = total/N;
		System.out.println();
		System.out.printf("합계: %f, 평균: %f",total,avg);
		
	}
}

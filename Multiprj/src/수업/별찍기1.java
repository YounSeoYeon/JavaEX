package 수업;

public class 별찍기1 {

	public static void main(String[] args) {
		for(int i=0; i<9; i++) {
			System.out.printf("%d단\n",i+1);
			for(int j=0; j<9; j++) {
				System.out.printf("%d*%d = %d ",j+1,i+1,(i+1)*(j+1));
			}
			System.out.println();
		}
	}
}

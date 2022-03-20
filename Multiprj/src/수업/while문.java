package 수업;

public class while문 {

	public static void main(String[] args) {
		
		int cun = 0;
		while(true) {
			System.out.printf("%d\n",cun);
			System.out.println("아직");
			if(cun>10) {
				break;
			}
			cun++;
		}
		System.out.println("끝");
	
	String[] arr = {"java","px","c++"};
	for(String value : arr) {
		System.out.println(value);
	}
	
	}

}

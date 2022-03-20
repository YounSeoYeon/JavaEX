package sync;

import java.util.ArrayList;
import java.util.List;

public class EX1 {
	
	//여기서 임계영역은 list

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<100; i++)
			list.add(i+1);
		
		Thread th1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				synchronized (list) {
				int size = list.size();
				System.out.printf("sub-size : %d\n",size);
				for(int i=0; i<size; i++)
					System.out.printf("sub-%d:%d\n", i+1, list.get(i));
			}
		}
		}); 
		th1.start();
		{ synchronized (list) {
			list.remove(9);
		{
			int size = list.size();
			System.out.printf("main-size : %d\n",size);
			for(int i=0; i<size; i++)
				System.out.printf("main-%d:%d\n", i+1, list.get(i));
		}
			
	}
}
		

		
		
	}

}

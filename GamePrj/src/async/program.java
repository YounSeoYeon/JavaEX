package async;

public class program {

	//스레드비동기식(동시에 진행해주는것)
	
	public static void main(String[] args) {
		
		// Runnable 은 인터페이스
		Runnable subMain = new Runnable() {
			@Override
			public void run() {
				print();				
			}
		};
		
		Thread th1 = new Thread(subMain);
		th1.start();
		
		long id = th1.getId();
		String name = th1.getName();
		int priority = th1.getPriority();
		Thread.State state = th1.getState();
		
		System.out.println("==========");
		System.out.printf("id:%d\n",id);
		System.out.printf("name:%s\n",name);
		System.out.printf("priority:%d\n",priority);
		System.out.printf("state:%s\n",state);
		System.out.println("==========");
		
		//우선순위높이기 // 밑에꺼해도 main이 늦게 끝나면 컴터성능이좋은거
		Thread mainThread = Thread.currentThread();
		mainThread.setPriority(Thread.MAX_PRIORITY);
		
		//print(); // 스레드에서 하나 쓸거임
		print();
		//print();
		
		th1.interrupt(); // 이제그만하고 집에 가세요
		
		try {
			th1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("==EXIT==");

	}

	private static void print() {
		
//		String threadName = Thread.currentThread().getName();
//		for(int i=0; i<100; i++)
//			System.out.printf("%s : %d \n", threadName, i+1);
//		// 이렇게하면 위에 프린트 차곡차곡 하나씩 실행됨.
		Thread thread = Thread.currentThread();
		String name = thread.getName();
		
		for(int i=0; i<100; i++) {
			//나 집에 가라고안하나??? 귀 쫑긋
			if(thread.isInterrupted()) {
				System.out.println("=== Sub Thread Exit===");
				return;
			}
			
			System.out.printf("%s : %d\n",name,i+1);
			
		}
		
	}

}

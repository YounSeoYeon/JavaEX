package async;

public class program {

	//������񵿱��(���ÿ� �������ִ°�)
	
	public static void main(String[] args) {
		
		// Runnable �� �������̽�
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
		
		//�켱�������̱� // �ؿ����ص� main�� �ʰ� ������ ���ͼ�����������
		Thread mainThread = Thread.currentThread();
		mainThread.setPriority(Thread.MAX_PRIORITY);
		
		//print(); // �����忡�� �ϳ� ������
		print();
		//print();
		
		th1.interrupt(); // �����׸��ϰ� ���� ������
		
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
//		// �̷����ϸ� ���� ����Ʈ �������� �ϳ��� �����.
		Thread thread = Thread.currentThread();
		String name = thread.getName();
		
		for(int i=0; i<100; i++) {
			//�� ���� �������ϳ�??? �� �б�
			if(thread.isInterrupted()) {
				System.out.println("=== Sub Thread Exit===");
				return;
			}
			
			System.out.printf("%s : %d\n",name,i+1);
			
		}
		
	}

}

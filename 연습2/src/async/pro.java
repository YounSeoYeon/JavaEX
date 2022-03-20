package async;

public class pro {

	public static void main(String[] args) {

		Runnable sub1 = new Runnable() {
			@Override
			public void run() {
				print();
			}
		};

		Thread th1 = new Thread(sub1);
		th1.start();

		long id = th1.getId();
		String name = th1.getName();
		int priority = th1.getPriority();
		Thread.State state = th1.getState();

		System.out.println("==");
		System.out.printf("state : %s\n", state);

		System.out.println("==");
		System.out.printf("id : %d\n", id);
		System.out.printf("name : %s\n", name);
		System.out.printf("priority : %d\n", priority);
		System.out.printf("state : %s\n", state);
		System.out.println("==");

		Thread mainThread = Thread.currentThread();
		mainThread.setPriority(Thread.MAX_PRIORITY);
		int main = mainThread.getPriority();
		System.out.printf("메인우선순위 : %d\n", main);

		print();
		th1.interrupt();
		try {
			th1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("== 끝 ==");

	}

	private static void print() {
		// String name = Thread.currentThread().getName();
		Thread thread = Thread.currentThread();
		String name = thread.getName();
		for (int i = 0; i < 100; i++) {

			if (thread.isInterrupted()) {
				System.out.println("서브스레드 끝");
				return;
			}
			System.out.printf("%s : %d\n", name, i + 1);
		}
	}

}

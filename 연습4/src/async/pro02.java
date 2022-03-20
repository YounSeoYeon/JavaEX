package async;

import java.lang.Thread.State;

public class pro02 {

	public static void main(String[] args) {

		Runnable sub = new Runnable() {
			@Override
			public void run() {
				print();
			}
		};

		Thread th1 = new Thread(sub);
		th1.start();

		long ID = th1.getId();
		String name = th1.getName();
		th1.setPriority(Thread.MIN_PRIORITY);
		int x = th1.getPriority();
		State now = th1.getState();

		System.out.printf("ID : %d\n", ID);
		System.out.printf("name : %s\n", name);
		System.out.printf("������� : %d\n", x);
		System.out.printf("���� : %s\n", now);

		print();
		th1.interrupt();
		try {
			th1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Thread mainThread = Thread.currentThread();
		mainThread.setPriority(Thread.MAX_PRIORITY);
		int main = mainThread.getPriority();
		System.out.printf("���ο켱���� : %d\n", main);
	}

	private static void print() {
		// String name = Thread.currentThread().getName();
		Thread thread = Thread.currentThread();
		String na = thread.getName();

		for (int i = 0; i < 100; i++) {
			if (thread.isInterrupted()) {
				System.out.println("���꽺���� ��");
				return;
			}
		System.out.printf("%s : %d\n", na, i + 1);
		}
	}

}

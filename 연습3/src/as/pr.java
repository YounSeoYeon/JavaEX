package as;

public class pr {

	public static void main(String[] args) {

		Runnable sub1 = new Runnable() {
			@Override
			public void run() {
				print();
			}
		};

		Thread th1 = new Thread(sub1);
		th1.start();

		// print();
		print();
		print();
	}

	private static void print() {

		String name = Thread.currentThread().getName();
		for (int i = 0; i < 100; i++) {
			System.out.printf("%s : %d\n", name, i + 1);
		}
	}

}

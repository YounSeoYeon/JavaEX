package sync;

public class EX2 {
	
	//���⼭ �Ӱ迵���� list

	public static void main(String[] args) {
		Storage storage = new Storage();		
		Thread th1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				storage.print();				
		}
		}); 
		th1.setName("sub");
		th1.start();
		
		{
		storage.delete(9);
		storage.print();
		}
		
	}

}

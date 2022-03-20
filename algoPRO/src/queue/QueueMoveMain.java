package queue;

public class QueueMoveMain {

	public static void main(String[] args) {
		int queueSize = 5;
		Queuemove q = new Queuemove(queueSize);
		
		q.showQueue(); //Queue Empty
		System.out.println("데이터 : " + q.numOfData()); // 데이터 : 0
		
		
		System.out.println("\na, b, c enqueue 수행");
		q.enqueue('a');
		q.enqueue('b');
		q.enqueue('c');
		q.showQueue();    // Queue items : 0:a 1:b 2:c 
		System.out.println("\n데이터 : " + q.numOfData()); // 데이터 : 3
		
		System.out.println("\npeek 수행 (첫 번째 값) : " + q.peek());
		// peek 수행 (첫 번째 값) : a
		
		System.out.println("\ndequeu 수행");
		System.out.println("삭제된 값 : " + q.dequeue()); // 삭제된 값 : a
		q.showQueue();  // Queue items : 1:b 2:c 
		System.out.println("\n데이터 : " + q.numOfData());  //데이터 : 2
		
		System.out.println("\npeek 수행 (첫 번째 값) : " + q.peek());
		// peek 수행 (첫 번째 값) : b
		
		System.out.println("\nd, e enqueue 수행");
		q.enqueue('d');
		q.enqueue('e');
		q.showQueue();    // Queue items : 1:b 2:c 3:d 4:e 
		System.out.println("\n데이터 : " + q.numOfData()); // 데이터 : 4
		
		// 현재 큐 상태 : 0은 비었고, 1~4까지 4개 데이터가 들어 있음
		// 큐 이동 없는 경우
//		System.out.println("\nf enqueue 수행");
//		q.enqueue('f');   // Queue Full!
//		q.showQueue();    // Queue items : 1:b 2:c 3:d 4:e 
//		System.out.println("\n데이터 : " + q.numOfData()); // 데이터 : 4
		
		// 앞 공간이 비었더라도 rear가 stackSize(인덱스 4, 5개)와 동일하면 오버플로우 발생
		// --> 해결1 : 이동 큐, 해결2 : 원형 규	
		
		// 이동 큐 
		System.out.println("\nf enqueue 수행");
		q.enqueue('f');   // 큐 이동 발생
		q.showQueue();    // Queue items : 0:b 1:c 2:d 3:e 4:f 
		System.out.println("\n데이터 : " + q.numOfData()); // 데이터 : 5
		
		System.out.println("\ng enqueue 수행");
		q.enqueue('g'); // Queue Full!
		q.showQueue();  // Queue items : 0:b 1:c 2:d 3:e 4:f 
		
		System.out.println("\ndequeu 수행");
		System.out.println("삭제된 값 : " + q.dequeue()); // 삭제된 값 :b
		q.showQueue();  // Queue items : 1:c 2:d 3:e 4:f
		
		System.out.println("\nclear 수행 ");
		q.clear();
		q.showQueue(); // Queue Empty
		
		System.out.println("\nh enqueue 수행");
		q.enqueue('h'); // Queue Full!
		q.showQueue(); // Queue items : 0:h 
		

	}

}

package queue;

/*
 큐 (queue) 예제1
 앞이 비었는데도 오버플로우 발생 : 이동 없음
*/
public class Myqueue {
	// 멤버 변수
	private int queueSize; 		// 큐의 용량
	private int front; 			// 전위 포인터. 첫 번째 요소 앞
	private int rear;			// 후위 포인터. 마지막 요소 값과 동일
	private int num;			//현재 데이터 수
	private char[] queue;       // 큐 본체 (변수 선언만. 아직 할당 못 받았음)
	
	// 생성자에서 초기화
	public Myqueue(int queueSize) {
		// 배열 사용하므로 초기값 -1로 설정
		front = rear = -1;				// 큐가 비어 있는 상태 
		num = 0; 						// 데이터 수
		this.queueSize = queueSize;		// 큐 크기 설정
		queue = new char[queueSize];	// 큐 생성
	}
	
	// 큐가 비어있는 상태 확인하는 isEmpty()
	// true/false
	public boolean isEmpty() {
		// front와 rear 포인터가 같으면 큐가 비어있는 상태
		// 데이터가 없으므로 포인터를 모두 -1로 초기화
		// 배열 사용하므로 첫 번째가 0, 첫 번째 이전이 -1
		if(front == rear) {
			front = rear = -1;
		}
		// front와 rear 포인터가 같은 경우 true, 아니면 false return
		return front == rear;
	}
	
	// 큐가 가득 차있는 상태 확인하는 isFull()
	public boolean isFull() {
		// rear 포인터가 큐의 마지막 인덱스와 동일하면 full 상태
		return rear == queueSize - 1; 
	}
	
	// 큐에 데이터 삽입하는 enqueue()
	// (1) Full인지 확인
	// (2) 데이터 삽입
	public void enqueue(char item) {
		if(isFull()) {
			System.out.println("Queue Full!");
		} else {
			queue[++rear] = item; // rear 다음 위치에 데이터 삽입
			num++;  			  // 데이터 수 증가
		}
	}
	
	
	// 큐에서 데이터 삭제하는 dequeue()
	// (1) Empty인지 확인
	// (2) 데이터 삭제 (삭제한 데이터 반환)
	public  char dequeue() {
		if(isEmpty()) {
			return 'E';
		} else {
			num--;    // 데이터 수 감소
			front++;  // front 증가 (front 다음 위치 값 삭제)
			return queue[front];
		}
	}	
	
	
	// 큐의 첫 번째 데이터 추출하는 peek()
	// 추출해서 반환
	public char peek() {
		if(isEmpty()) {
			System.out.println("peek 실패. Empty");
			return 'E';
		} else {
			// front 다음 데이터 추출해서 반환
			return queue[front + 1];
		}
	}
	
	// 큐 초기화하는 clear()
	public void clear() {
		front = rear = -1;
		System.out.println("clear!");
	}
	
	
	// 큐에 들어있는 모든 데이터를 출력하는 showQueue()
	// (1) 큐가 비었는지 확인
	// (2) 큐에 있는 모든 데이터 출력
	public void showQueue() {
		if(isEmpty()) {
			System.out.println("Queue Empty");
		} else {
			System.out.print("Queue items : ");
			//front + 1 위치부터 rear까지 출력
			for(int i=front+1; i<=rear; i++) {
				System.out.print(i + ":" + queue[i] + " ");
			}
		}
	}
		
	// 데이터 개수를 반환하는 numOfData()
	public int numOfData() {
		return num;
	}
}

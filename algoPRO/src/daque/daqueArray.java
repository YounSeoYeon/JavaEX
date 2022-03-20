package daque;

import java.util.ArrayDeque;
import java.util.Deque;

public class daqueArray {

	public static void main(String[] args) {
		Deque<String> dq = new ArrayDeque<String>();
		// 다형성이용한거임
		
		System.out.println("데이터3개삽입");
		dq.add("포도");
		System.out.println(dq);
		dq.add("배");
		System.out.println(dq);
		dq.add("수박");
		System.out.println(dq);
		dq.offer("사과");
		System.out.println(dq); 
		
		System.out.println("앞쪽에삽입");
		dq.addFirst("바나나");
		System.out.println(dq);
		
		System.out.println("삽입");
		dq.add("복숭아");
		System.out.println(dq);
		
		dq.addLast("복숭아");
		System.out.println(dq);
		
		System.out.println("데크순회");
		for(String a:dq) {
			System.out.print(a + " ");
		}
		
		System.out.println("데이터꺼내기");
		System.out.println("remove : "+dq.remove());
		System.out.println(dq);
		
		//찾아서 삭제
		System.out.println("사과 remove : "+dq.remove("사과"));
		System.out.println(dq);
		
		//없는거 삭제
		System.out.println("딸기 remove : "+dq.remove("딸기"));
		System.out.println(dq);
		
		System.out.println("앞쪽에삽입");
		dq.addFirst("복숭아");
		System.out.println(dq);
		
		//같은거있을때삭제되는거-앞에꺼하나만삭제
		System.out.println("복숭아 remove : "+dq.remove("복숭아"));
		System.out.println(dq);
		
		//전체삭제
		
		System.out.println("removeall : "+dq.removeAll(dq));
		System.out.println(dq);
		
		System.out.println("데이터4개삽입");
		dq.add("포도");
		dq.add("배");
		dq.add("수박");
		dq.offer("사과");
		System.out.println(dq); 
		
		System.out.println("poll : "+dq.poll());
		System.out.println(dq); 
		
		System.out.println("pollfirst : "+dq.pollFirst());
		System.out.println(dq);
		
		//데크를 스택처럼 사용할때 
		
		System.out.println("push 수행");
		dq.push("밤");
		dq.push("밤");
		System.out.println(dq);
		
		System.out.println("pop 수행 : "+dq.pop()); // 밤맨앞에 삭제
		System.out.println(dq);
		
		System.out.println("\npeek 수행 : " + dq.peek()); // 맨 앞의 값 출력
		System.out.println("\n데크 사이즈 : " + dq.size()); // 현재 데이터 수
		
		System.out.println("\n데크 순회");

	}

}

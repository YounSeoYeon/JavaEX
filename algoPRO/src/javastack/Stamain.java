package javastack;

import java.util.Stack;

//자바유틸의 stack 임포트해서사용

public class Stamain {

	public static void main(String[] args) {
		Stack<String> a = new Stack<String>();
		
		try {
			a.push("춘향");
			a.push("몽룡");
			a.push("학도");
			
			for(int i=0; i<a.size(); i++) {
				System.out.println(i+" : "+a.get(i));
			}
			
			System.out.println("최상위값 : "+a.peek());
			System.out.println("스택크기 : "+a.size());
			System.out.println("몽룡들어있나? "+a.contains("몽룡"));
			System.out.println("리한나들어있나? "+a.contains("리한나"));
			
			System.out.println("pop수행 : "+a.pop());
			System.out.println("pop수행 : "+a.pop());
			
			for(int i=0; i<a.size(); i++) {
				System.out.println(i+" : "+a.get(i));
			}
			
			System.out.println("clear수행");
			a.clear();

			System.out.println("비어있나? "+a.empty());
		
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

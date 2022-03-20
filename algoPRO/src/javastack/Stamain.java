package javastack;

import java.util.Stack;

//�ڹ���ƿ�� stack ����Ʈ�ؼ����

public class Stamain {

	public static void main(String[] args) {
		Stack<String> a = new Stack<String>();
		
		try {
			a.push("����");
			a.push("����");
			a.push("�е�");
			
			for(int i=0; i<a.size(); i++) {
				System.out.println(i+" : "+a.get(i));
			}
			
			System.out.println("�ֻ����� : "+a.peek());
			System.out.println("����ũ�� : "+a.size());
			System.out.println("�������ֳ�? "+a.contains("����"));
			System.out.println("���ѳ�����ֳ�? "+a.contains("���ѳ�"));
			
			System.out.println("pop���� : "+a.pop());
			System.out.println("pop���� : "+a.pop());
			
			for(int i=0; i<a.size(); i++) {
				System.out.println(i+" : "+a.get(i));
			}
			
			System.out.println("clear����");
			a.clear();

			System.out.println("����ֳ�? "+a.empty());
		
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

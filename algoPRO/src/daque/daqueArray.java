package daque;

import java.util.ArrayDeque;
import java.util.Deque;

public class daqueArray {

	public static void main(String[] args) {
		Deque<String> dq = new ArrayDeque<String>();
		// �������̿��Ѱ���
		
		System.out.println("������3������");
		dq.add("����");
		System.out.println(dq);
		dq.add("��");
		System.out.println(dq);
		dq.add("����");
		System.out.println(dq);
		dq.offer("���");
		System.out.println(dq); 
		
		System.out.println("���ʿ�����");
		dq.addFirst("�ٳ���");
		System.out.println(dq);
		
		System.out.println("����");
		dq.add("������");
		System.out.println(dq);
		
		dq.addLast("������");
		System.out.println(dq);
		
		System.out.println("��ũ��ȸ");
		for(String a:dq) {
			System.out.print(a + " ");
		}
		
		System.out.println("�����Ͳ�����");
		System.out.println("remove : "+dq.remove());
		System.out.println(dq);
		
		//ã�Ƽ� ����
		System.out.println("��� remove : "+dq.remove("���"));
		System.out.println(dq);
		
		//���°� ����
		System.out.println("���� remove : "+dq.remove("����"));
		System.out.println(dq);
		
		System.out.println("���ʿ�����");
		dq.addFirst("������");
		System.out.println(dq);
		
		//�����������������Ǵ°�-�տ����ϳ�������
		System.out.println("������ remove : "+dq.remove("������"));
		System.out.println(dq);
		
		//��ü����
		
		System.out.println("removeall : "+dq.removeAll(dq));
		System.out.println(dq);
		
		System.out.println("������4������");
		dq.add("����");
		dq.add("��");
		dq.add("����");
		dq.offer("���");
		System.out.println(dq); 
		
		System.out.println("poll : "+dq.poll());
		System.out.println(dq); 
		
		System.out.println("pollfirst : "+dq.pollFirst());
		System.out.println(dq);
		
		//��ũ�� ����ó�� ����Ҷ� 
		
		System.out.println("push ����");
		dq.push("��");
		dq.push("��");
		System.out.println(dq);
		
		System.out.println("pop ���� : "+dq.pop()); // ��Ǿտ� ����
		System.out.println(dq);
		
		System.out.println("\npeek ���� : " + dq.peek()); // �� ���� �� ���
		System.out.println("\n��ũ ������ : " + dq.size()); // ���� ������ ��
		
		System.out.println("\n��ũ ��ȸ");

	}

}

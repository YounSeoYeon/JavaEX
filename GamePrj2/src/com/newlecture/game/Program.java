package com.newlecture.game;

import java.awt.Canvas;
import java.awt.Graphics;

import javax.swing.JFrame;

import com.newlecture.game.ui.GameCanvas2Fighter;

public class Program {

	public static void main(String[] args) {
		
		//1. JFrame ������ ��ü win�� �����ϰ� 
		// ȭ������� ���� setvisible() �޼ҵ忡 true���� �־ ȣ���Ͻÿ�

		JFrame win = new JFrame();
		win.setVisible(true);

		//2. win ��ü�� �ʱ���°� ���� �ȵ� ũ�⸦ �����ϴ� setSize�޼ҵ带 ���ؼ�
		// ũ�⸦ �ʺ�500, ���� 700���� ��������.
		// �ݱ��ư�� ������ �ٷ� ���μ����� �����Ҽ� �ֵ��� setDefaultCloseOperation �޼ҵ带 ���ؼ�
		// JFrame.EXIT_ON_CLOSE�� ��������.
		
		win.setSize(500, 700);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		
		//3. Canvas ��ü canvas�� �����ϰ� �װ��� win��ü�� add()�޼ҵ带 ���ؼ�
		// win��ü�� �������� ���Խ�Ű��.
		
		//Canvas canvas = new Canvas();
		Canvas canvas = GameCanvas2Fighter.getInstance();
		win.add(canvas); // �����ӿ����� ĵ������ ���� ��������
		canvas.requestFocus(); // �̰������ Ű����� �ٷ� �ϴ°� �ܼ�â���� ����.
		
		//4. canvas��ü�� ȭ�鿡 �׸��� �׸��� ���ؼ� canvas�� getGraphics() �޼ҵ带 ���ؼ�
		// �׸��� �׸��� ������ �򵵷�����. ��ȯ�� Graphics��ü�� �̸��� g�� �ϰ� g��ü�� drawLine() �޼ҵ带
		// ���ؼ� (0,0)~(100,100) ��ġ�� ���� �׸���
				
//		Graphics g = canvas.getGraphics(); // = �����ϴ�!! canvas.getGraphics()�� ��ü�� ��ȯ�� ���� g�� ������.
//		g.drawLine(0, 0, 100, 100);
		
		//5. �� ���� ������ �ʴ°ɱ�? �� ������ �׸��׸��� ������ �����ؾ��Ѵ�.
		//setVisible() -> update() -> paint(); // update�� ȭ���� ����
		//repaint() -> update() -> paint();
		//Min=>Max -> update() -> paint();
		//resize() -> update() -> paint();
		// .. ��Ÿ��� -> update() -> paint();
		
		// ���� �׸��׸��� ���������� ��� �����ϰ� ������
		// paint() �޼ҵ� �ȿ��� �׸��� �׷�����.
		// ?? Canvas�� �ִ� paint �޼ҵ�??
		// -> Canvas ����� Ŭ�������� �������ϴ� ������� paint�޼ҵ带 �����ϰ� �ű⿡�� �׸��� �׸��� ��.
		
		//5. �׷� paint�޼ҵ� �������̵带 ���ؼ� CanvasŬ������ is a ����ϴ� GameCanvas�� �����ϰ� 
		//3�� �ڵ��Ͽ��� Canvas��ü�� �����ϴ� ��� GameCanvas ��ü�� �����Ͻÿ�.
		//GameCanvas���� paint �޼ҵ带 �������̵��ϰ� �� �ȿ��� ���ڷ� ���޵Ǵ� g��ü�� �̿��ؼ� 
		//drawLine() �޼ҵ�� ���� �׸��� �ڵ带 �ۼ��Ͻÿ�.
		
		
		
	}

}

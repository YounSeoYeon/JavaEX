package game;

import java.awt.Canvas;
import java.awt.Graphics;

import javax.swing.JFrame;

import game.ui.GameCanvas;

public class project {

	public static void main(String[] args) {
		
		// 1. JFrame ������ ��ü win�� �����ϰ�
		// ȭ������� ���� setvisible() �޼ҵ忡 true���� �־ ȣ���Ͻÿ�.
		
		// 2. win ��ü�� �ʱ���°� ���� �ȵ� ũ�⸦ �����ϴ� setSize�޼ҵ带 ���ؼ�
		// ũ�⸦ �ʺ�500, ���� 700���� ��������.
		// �ݱ��ư�� ������ �ٷ� ���μ����� �����Ҽ� �ֵ��� setDefaultCloseOperation �޼ҵ带 ���ؼ�
		// JFrame.EXIT_ON_CLOSE�� ��������.
		// 3. Canvas ��ü canvas�� �����ϰ� �װ��� win��ü�� add()�޼ҵ带 ���ؼ� win��ü�� �������� ���Խ�Ű��.
		// 4. canvas��ü�� ȭ�鿡 �׸��� �׸��� ���ؼ� canvas�� getGraphics() �޼ҵ带 ���ؼ�
		// �׸��� �׸��� ������ �򵵷�����. ��ȯ�� Graphics��ü�� �̸��� g�� �ϰ� g��ü�� drawLine() �޼ҵ带
		// ���ؼ� (0,0)~(100,100) ��ġ�� ���� �׸���
		// 5. �׷� paint�޼ҵ� �������̵带 ���ؼ� CanvasŬ������ is a ����ϴ� GameCanvas�� �����ϰ�
		// 3�� �ڵ��Ͽ��� Canvas��ü�� �����ϴ� ��� GameCanvas ��ü�� �����Ͻÿ�.
		// GameCanvas���� paint �޼ҵ带 �������̵��ϰ� �� �ȿ��� ���ڷ� ���޵Ǵ� g��ü�� �̿��ؼ�
		// drawLine() �޼ҵ�� ���� �׸��� �ڵ带 �ۼ��Ͻÿ�.
		
		JFrame win = new JFrame();
		win.setVisible(true);
		win.setSize(500, 700);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Canvas canvas = new GameCanvas();
		win.add(canvas);
		Graphics g = canvas.getGraphics();
		g.drawLine(0, 0, 100, 100);
		
		

				

	}

}

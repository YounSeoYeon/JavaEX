package ex9.window.graphic;

import java.awt.Canvas;
import java.awt.Graphics;

import javax.swing.JFrame;

public class framegraphicSU {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		Canvas canvas = new GameCanvasSU();
		frame.add(canvas);
		// frame.setSize(?,?); // ���������� // �ʺ����
		frame.setBounds(100,10,700,500); // ����������,x,y,�ʺ�,���� / ������ �÷��� ��ġ��������
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ���� �ܼ�����Ǵ°�
		frame.setVisible(true);
		
		// ĵ������ �׸��׸���
		Graphics g = canvas.getGraphics(); // �׸��׸��� �����ҷ����°���
		g.drawLine(10, 10, 100, 100);
		
		// ������ �׸� ������ �׸��� // ������� �ٽñ׷����� ȯ����!
		// canvas.paint(g); setVisicle()/repaint() - update() - paint() �̷� ��ƾ���� 
		// �׸��� �������� �ٽ� �׷���
	}

}

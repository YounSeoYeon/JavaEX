package ex9.window.graphic;

import java.awt.Canvas;
import java.awt.Graphics;

import javax.swing.JFrame;

public class framegraphicEX1 {

	public static void main(String[] args) {

		JFrame frame = new JFrame();
		Canvas canvas = new gameCanvasEX1();
		frame.add(canvas);
		
		frame.setBounds(100, 10, 700, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		Graphics g = canvas.getGraphics();
		g.drawLine(10, 10, 100, 100);
	}

}

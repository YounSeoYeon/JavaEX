package game;

import javax.swing.JFrame;

import ui.gamecan;

public class prj {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(500, 700);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
		gamecan canvas = new gamecan();
		frame.add(canvas);
		canvas.requestFocus();
		frame.validate();
	}

}

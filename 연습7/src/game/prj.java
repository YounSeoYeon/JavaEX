package game;

import javax.swing.JFrame;

import ui.gamecan;

public class prj {

	public static void main(String[] args) {
		JFrame fla = new JFrame();
		fla.setVisible(true);
		fla.setSize(500, 700);
		fla.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		gamecan can = gamecan.getinstance();
		fla.add(can);
		can.requestFocus();
		fla.validate();
		
	}

}

package game;

import javax.swing.JFrame;

import game.ui.gamecan;

public class pro1 {

	public static void main(String[] args) {
		
		JFrame fla = new JFrame();
		fla.setVisible(true);
		fla.setSize(500, 700);
		//fla.setResizable(false);
		fla.setTitle("비행기게임");
		fla.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		gamecan can = gamecan.getinstance();
		fla.add(can);
		can.requestFocus();
	
	}

}

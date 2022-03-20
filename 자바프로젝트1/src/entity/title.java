package entity;

import javax.swing.JFrame;

import ui.game;

public class title {

	public static void main(String[] args) {
		JFrame fla = new JFrame();
		fla.setVisible(true);
		fla.setSize(700, 700);
		fla.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		game vas = game.getinstance();
		fla.add(vas);
		vas.requestFocus();
		fla.validate();
	}

}

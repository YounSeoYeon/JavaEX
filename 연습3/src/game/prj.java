package game;

import java.awt.Canvas;

import javax.swing.JFrame;

import game.ui.GameCanvas;

public class prj {

	public static void main(String[] args) {
		
		JFrame fra = new JFrame();
		fra.setVisible(true);
		fra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fra.setSize(500, 700);
		
		Canvas can = GameCanvas.getinstance();
		fra.add(can);
		can.requestFocus();
		fra.validate(); // 화면에 출력되는게 잘 출력되는지 보고 강제로 출력하는거
		
				
	}

}

package item;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import ui.game;

public class Back {
	
	private int w;
	private int h;
	private Image img;
	
	public Back() {
		img = Toolkit.getDefaultToolkit().getImage("res/5.jpg");
		w = 700;
		h = 700;
	}

	public void draw(Graphics g) {
		g.drawImage(img, 0, 0, w, h, game.getinstance());
	}

	public void update() {		
	}

}

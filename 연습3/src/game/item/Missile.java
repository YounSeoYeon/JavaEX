package game.item;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import game.ui.GameCanvas;

public class Missile {
	
	private double x;
	private double y;
	private static Image img;
	private int speed;
	
	static {
		img = Toolkit.getDefaultToolkit().getImage("res/image/missile.png");		
	}
	
	public Missile(double x, double y) {
		this.x = x-10;
		this.y = y-20;
		speed = 10;
	}

	public void draw(Graphics g) {
		int x = (int)this.x;
		int y = (int)this.y;
		g.drawImage(img, x, y, GameCanvas.getinstance());
	}

	public void update() {
			y -= speed;		
	}

}

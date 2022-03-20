package item;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import ui.gamecan;

public class Mis {
	private double x;
	private double y;
	private Image img;
	private int speed;
	
	public Mis(double x, double y) {
		img = Toolkit.getDefaultToolkit().getImage("res/image/missile.png");
		this.x = x-10;
		this.y = y-20;	
		speed = 10;
	}

	public void draw(Graphics g) {	
		int x = (int)this.x;
		int y = (int)this.y;
		g.drawImage(img, x, y, gamecan.getinstance());
	}

	public void update() {
		y -= speed;
	}

	public boolean getout() {
		return !((0<x && x<500) && (0<y && y<700));
	}
}

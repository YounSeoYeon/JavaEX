package game.item;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import game.ui.gamecan;

public class Missile implements item{
	
	private Image mis;
	private double x;
	private double y;
	private int speed;
	
	public Missile(double x, double y) {
		this.x = x;
		this.y = y;
		speed = 10;
		mis = Toolkit.getDefaultToolkit().getImage("res/image/missile.png");
	}

	public void draw(Graphics g) {
		int x = (int)this.x-10;
		int y = (int)this.y-20;
		g.drawImage(mis, x, y, gamecan.getinstance());
	}

	public void update() {
		y -=10;
	}

	public boolean outsideOfBounds() {
		return !((0<x && x<500)&&(0<y && y<700));
	}

}

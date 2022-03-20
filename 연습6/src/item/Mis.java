package item;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import ui.gamecan;

public class Mis implements Item{
	private double x;
	private double y;
	private Image img;
	private int speed;

	public Mis(double x, double y) {
		img = Toolkit.getDefaultToolkit().getImage("res/image/missile.png");
		this.x = x-10;
		this.y = y-20;
		speed = 5;
	}

	public void draw(Graphics g) {
		int x = (int)this.x;
		int y = (int)this.y;
		g.drawImage(img, x, y, gamecan.getinstance());
	}

	public boolean indout() {
		return !((0<x)&&(x<500)&&(0<y)&&(y<700));
	}

	@Override
	public void update() {
		y -= speed;
	}

}

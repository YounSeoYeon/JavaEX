package game.item;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import game.ui.gamecan;

public class Background implements item {
	
	private double y;
	private int speed;
	private Image back;
	private int w;
	private int h;	
		
	public Background() {
		speed = 1;
		y = -(1200 - 700);
		w = 500;
		h = 500*1200/360;
		back = Toolkit.getDefaultToolkit().getImage("res/image/space.jpg");
	}
	
	public void movedown() {
		
	}
	
	public void update() {
		y++;
	}
	
	public void draw(Graphics g) {
		int y = (int)this.y;
		g.drawImage(back, 0, y, w, h, gamecan.getinstance());
	}

	@Override
	public boolean outsideOfBounds() {
		// TODO Auto-generated method stub
		return false;
	}

}

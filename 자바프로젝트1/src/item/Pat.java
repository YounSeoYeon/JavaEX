package item;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.Random;

import ui.game;

public class Pat {

	private double x;
	private double y;
	private double dx;
	private double dy;
	private Random rd;
	private Image img;
	
	public Pat() {		
		img = Toolkit.getDefaultToolkit().createImage("res/1.png");
		rd = new Random();
		x = rd.nextInt(800);
		y = rd.nextInt(800);		
	}
	
	public void draw(Graphics g) {
		int x = (int)this.x;
		int y = (int)this.y;
		g.drawImage(img, x, y, game.getinstance());
	}

	public void update() {		
		dx = ~(rd.nextInt(800));
		dy = ~(rd.nextInt(800));
		
		x ++;
		y ++;
		
		
	}
	public boolean getout() {
		return !(-150<x && x<950 && -150<y && y<950);
	}

}

package game.item;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

public class Button {
	private int x;
	private int y;
	private Color bgcolor;
	
	public Button(int x, int y) {
		this.x = x;
		this.y = y;
		bgcolor = Color.BLUE;
	}

	public void draw(Graphics g) {
		g.setColor(bgcolor);
		g.fillArc(x, y, 100, 100, 0, 360);
		g.setColor(bgcolor);
	}

	public void update() {		
	}

	public boolean pointin(int x, int y) {
		return ((this.x<x && x<this.x+100)&&(this.y<y && y<this.y+100));
	}

	public void press(boolean b) {
		if(b)
			bgcolor = Color.ORANGE;
		else 
			bgcolor = Color.BLUE;
	}
	
	

}

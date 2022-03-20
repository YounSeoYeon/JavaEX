package item;

import java.awt.Color;
import java.awt.Graphics;

public class Button {
	
	private int x;
	private int y;
	private Color bg;
	
	public Button(int x, int y) {
		bg = Color.BLUE;
		this.x = x;
		this.y = y;
	}

	public void draw(Graphics g) {
		g.setColor(bg);
		g.fillArc(x, y, 100, 100, 0, 360);
		g.setColor(bg);
	}

	public boolean point(int x, int y) {
		return ((this.x<x && x<this.x+100)&&(this.y<y && y<this.y+100));
	}

	public void click(boolean b) {
		if(b)
			bg = Color.GREEN;
		else
			bg = Color.BLUE;
	}


}

package item;

import java.awt.Color;
import java.awt.Graphics;

public class Button implements Item{
	private Color bgcolor;
	private int x;
	private int y;
	
	public Button(int x, int y) {
		bgcolor = Color.BLUE;
		this.x = x;
		this.y = y;
	}

	public void draw(Graphics g) {
		g.setColor(bgcolor);
		g.fillArc(x, y, 100, 100, 0, 360);
		g.setColor(bgcolor);
	}

	public boolean point(int x, int y) {
		return ((this.x<x && x<this.x+100)&&(this.y<y && y<this.y+100));
	}

	public void press(boolean b) {
		if(b)
			bgcolor = Color.ORANGE;
		else
			bgcolor = Color.BLUE;
	}

	public void update() {		
	}

	@Override
	public boolean indout() {
		// TODO Auto-generated method stub
		return false;
	}
	
}

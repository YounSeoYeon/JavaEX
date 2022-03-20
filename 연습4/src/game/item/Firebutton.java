package game.item;

import java.awt.Color;
import java.awt.Graphics;

public class Firebutton implements item{
	
	private int x;
	private int y;
	
	public Firebutton(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.blue);
		g.fillArc(x, y, 100, 100, 0, 360);
		g.setColor(Color.black);
	}

	public void update() {		
	}

	@Override
	public boolean outsideOfBounds() {
		// TODO Auto-generated method stub
		return false;
	}

}

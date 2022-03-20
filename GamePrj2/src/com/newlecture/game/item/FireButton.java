package com.newlecture.game.item;

import java.awt.Color;
import java.awt.Graphics;

public class FireButton {
	private int x;
	private int y;	
	
	public FireButton(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillArc(x, y, 100, 100, 0, 360);
		g.setColor(Color.black);
	}

}

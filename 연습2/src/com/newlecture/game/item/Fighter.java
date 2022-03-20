package com.newlecture.game.item;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import com.newlecture.game.ui.GameCanvas;

public class Fighter {
	
	private Image img;
	private int x;
	private int y;	
	
	public static final int UP = 0b0001; // 모든 파이터객체가 이 상수를 씀. 객체 다 움직일거잖아?
	public static final int RIGHT = 0b0010;
	public static final int DOWN = 0b0100;
	public static final int LEFT = 0b1000;
	
	public Fighter(int x, int y) {
		this.x = x;
		this.y = y;	
		img = Toolkit.getDefaultToolkit().getImage("res/image/fighter1.png");
	}

	public void draw(Graphics g) {
		g.drawImage(img, x, y, GameCanvas.getInstance());
	}

	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void moveBy(int direction) {	
		switch(direction) {
		case LEFT : 
			x -= 2;
			break;
		case UP : 
			y -= 2;
			break;	
		case RIGHT : 
			x += 2;
			break;	
		case DOWN : 
			y += 2;
			break;	
		}
	}

}

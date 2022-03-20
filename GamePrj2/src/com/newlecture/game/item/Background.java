package com.newlecture.game.item;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import com.newlecture.game.ui.GameCanvas2Fighter;

public class Background {

	private Image img;
	private double y;
	private int w;
	private int h; // 처음에 정해지고 안바껴서 여기다가 정의해줌
	
	private int speed;

	public Background() {
		img = Toolkit.getDefaultToolkit().getImage("res/image/space.jpg");
		y = -(1200-700); // 배경이 올라가야해서 처음자리! 이미지크기알아야 (이미지크기-윈도우높이)
		speed=1;
		
		w=500;
		h=500*1200/360; // 그림원래크기 360*1200임 비율맞쳐서 그리려고
	}

	public void moveDown() {

	}

	public void update() {
		y++;

	}

	public void draw(Graphics g) {
		int y = (int) this.y;
		//g.drawImage(img, 0, y, GameCanvas2Fighter.getInstance()); // 이거는 원래있는 그림크기로 할때
		
		
		
		g.drawImage(img, 0, y, w, h, GameCanvas2Fighter.getInstance());

	}

}

package com.newlecture.game.item;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import com.newlecture.game.ui.GameCanvas2Fighter;

public class Missile {
	
	private Image img;
	private double x;
	private double y;
	private int speed;
	
	public Missile(double x, double y) {
		img = Toolkit.getDefaultToolkit().getImage("res/image/missile.png");
		this.x=x;
		this.y=y;
	}
	
	// 점진적인 움직임 : 애니를 위해 꼭 필요한 메서드
	// 60fps로 동작하지만 게임스레드에서 호출되는 메서드
	public void update() {			
		y--;
	}
	
	// 60fps로 동작하지만 메인스레드에서 움직임
	public void draw(Graphics g) {
		int x=(int)this.x-10;
		int y=(int)this.y-20;
		g.drawImage(img, x, y, GameCanvas2Fighter.getInstance());
	}

}

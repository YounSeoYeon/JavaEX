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
	
	// �������� ������ : �ִϸ� ���� �� �ʿ��� �޼���
	// 60fps�� ���������� ���ӽ����忡�� ȣ��Ǵ� �޼���
	public void update() {			
		y--;
	}
	
	// 60fps�� ���������� ���ν����忡�� ������
	public void draw(Graphics g) {
		int x=(int)this.x-10;
		int y=(int)this.y-20;
		g.drawImage(img, x, y, GameCanvas2Fighter.getInstance());
	}

}

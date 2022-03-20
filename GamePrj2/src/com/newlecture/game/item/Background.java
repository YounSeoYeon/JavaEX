package com.newlecture.game.item;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import com.newlecture.game.ui.GameCanvas2Fighter;

public class Background {

	private Image img;
	private double y;
	private int w;
	private int h; // ó���� �������� �ȹٲ��� ����ٰ� ��������
	
	private int speed;

	public Background() {
		img = Toolkit.getDefaultToolkit().getImage("res/image/space.jpg");
		y = -(1200-700); // ����� �ö󰡾��ؼ� ó���ڸ�! �̹���ũ��˾ƾ� (�̹���ũ��-���������)
		speed=1;
		
		w=500;
		h=500*1200/360; // �׸�����ũ�� 360*1200�� �������ļ� �׸�����
	}

	public void moveDown() {

	}

	public void update() {
		y++;

	}

	public void draw(Graphics g) {
		int y = (int) this.y;
		//g.drawImage(img, 0, y, GameCanvas2Fighter.getInstance()); // �̰Ŵ� �����ִ� �׸�ũ��� �Ҷ�
		
		
		
		g.drawImage(img, 0, y, w, h, GameCanvas2Fighter.getInstance());

	}

}

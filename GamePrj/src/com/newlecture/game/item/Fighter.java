package com.newlecture.game.item;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import com.newlecture.game.ui.GameCanvas2Fighter;

public class Fighter {
	
	public static final int move_up = 1;
	public static final int move_right = 2;
	public static final int move_down = 3;
	public static final int move_left = 4;

	private Image img;
	private double x;
	private double y;
	private double vx; // �����̴� ��. �ִϸ��̼�
	private double vy;
	private double dx; // ������
	private double dy;
	private int distance; // �̰� �ʱⰪ1���ؾ���. �ֳĸ� �����Ŷ�. �����̴°������¿뵵
	private int speed;

	public Fighter(int x, int y) {
		
		this.x = x;
		this.y = y;
		dx = dy = vx = vy = 0; // �̰� �Ƚᵵ �ʱⰪ0���� �ڵ����õ�.
		distance = 1; // ���������
		speed = 2;
		img = Toolkit.getDefaultToolkit().getImage("res/image/fighter1.png");

	}

	//���̰Ŵ� ���ν����忡�� ����Ǵ°��� / ���ο��� ���� �����̶�� ������ �ǵ鿩��.
	public void move(int x, int y) {
//		this.x = x;
//		this.y = y;
		
		//distance += 15; �� �̰ŷ� ���� �ִ� ������ �Ȱ��� �ð����� �����ؼ� �ӵ��� �ٴٸ�
		
		double w = (dx-this.x);
		double h = (dy-this.y);
		distance = (int) Math.sqrt(w*w+h*h); // �̰ŷ� �ϸ� �ӵ��� �Ȱ���.
		dx = x;
		dy = y;
		
		vx = (dx-this.x) / distance * speed; // 15��� distance�� ����
		vy = (dy-this.y) / distance * speed;
	}
	
	// �ִϸ��̼����� ���̷��� �ؿ��� �ʼ�!! 
	// �Լ��ۼ��ϸ� �װ� ���ν����忡�� �����̴°��� �������� �����̴°��� ��Ȯ�� �˰��־����
	// ���̰Ŵ� (���ӽ�����)���������忡�� ����Ǵ°���. ������ ���� ���ν����� ����Ǹ鼭 ���� �� ����Ǵ°�!!
	public void updates() {
		
		//�����Ǻ��� ���� ����Ǿ����. �ȱ׷��� ������ ���°� �ѹ� �鰡�°���(����Ǵ°� �ѹ�������)
		x += vx;
		y += vy;

		if(distance <= 1) {
			vx = vy = 0;
			return; // 0�� �Ǹ� �ؿ����� ������ �ȵǵ��� �̰� �Ⱦ��� ��� distance����.
		}
		
		/*		
		x += vx;
		y += vy;
		*/
		
		distance -= speed;
	}
	
	// ��repaintȣ�������ν� �̰ŵ�(���ӽ�����)���������忡�� ����Ǵ°���.
	public void draw(Graphics g) {
		
		// GameCanvas2Fighter canvas = new GameCanvas2Fighter();
		GameCanvas2Fighter canvas = GameCanvas2Fighter.getInstance(); // �̰� ���� ����. �����Ҷ�
		int x = (int) this.x;
		int y = (int) this.y;
		
		int offx = img.getWidth(canvas)/2; // �������߽ɺη� �����ϴ°�
		int offy = img.getHeight(canvas)/2;
		
		System.out.println(offx+", "+offy);
		
		//g.drawImage(img,x,y,null); // ���⼭ this�� ����ĵ������ �ƴ�. null�� ���� �� 
		g.drawImage(img, x-offx, y-offy, GameCanvas2Fighter.getInstance());
		g.drawRect(x, y, 64, 64); // �̹����׷����±���Ȯ���Ϸ���
	}


	public void moveBy(int direction) {
		switch(direction) {
		case move_left:
			x -= 2;
			break;
		case move_up:
			y -= 2;
			break;	
		case move_right:
			x += 2;
			break;
		case move_down:
			y += 2;
			break;				
		}
		
	}

}

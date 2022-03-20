package com.newlecture.game.item;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import com.newlecture.game.ui.GameCanvas2Fighter;

public class Fighter {
	
	public static final int move_up = 1;
	public static final int move_right = 2;
	public static final int move_down = 4;
	public static final int move_left = 8;
	public static final int move_none=0;

	private Image img;
	private double x;
	private double y;
	private int imgIndexDuration; // �ε����� ��ȭ�ϴµ� �����̵Ǵ�����(�ڿ������� ��ȭ�ϵ���)
	private double vx; // �����̴� ��. �ִϸ��̼�
	private double vy;
	private double dx; // ������
	private double dy;
	private int distance; // �̰� �ʱⰪ1���ؾ���. �ֳĸ� �����Ŷ�. �����̴°������¿뵵
	private int speed;
	private int direction;
	private int imgIndex;

	public Fighter(int x, int y) {
		
		this.x = x;
		this.y = y;
		dx = dy = vx = vy = 0; // �̰� �Ƚᵵ �ʱⰪ0���� �ڵ����õ�.
		distance = 1; // ���������
		speed = 3;
		direction = move_none;
		img = Toolkit.getDefaultToolkit().getImage("res/image/fighter.png");
		imgIndex = 3;
		imgIndexDuration = 0;

	}

	//���̰Ŵ� ���ν����忡�� ����Ǵ°��� / ���ο��� ���� �����̶�� ������ �ǵ鿩��.
	public void move(int x, int y) {
//		this.x = x;
//		this.y = y;
		
		//distance += 15; �� �̰ŷ� ���� �ִ� ������ �Ȱ��� �ð����� �����ؼ� �ӵ��� �ٴٸ�
		
		double w = (dx-this.x);
		double h = (dy-this.y);
		
		//distance�� 0�� �Ǵ°� �����ϱ����ؼ�
		if((this.x-speed<x && x<this.x+speed) &&
				(this.y-speed<y && y<this.y+speed))
			return;
		
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
		
		if((vx<0)||(direction & move_left) == move_left && imgIndex>0 && imgIndexDuration==0)
			imgIndex--;
		
		else if((vx>0)||(direction & move_right) == move_right && imgIndex<6 && imgIndexDuration==0)
			imgIndex++;
		
		else if(vx ==0 && direction==0)
			imgIndex = 3;
		
		imgIndexDuration ++;
		imgIndexDuration %= 5; // 0-1-2-3-4-0-1-2...(��ӹݺ��ϰԲ�) ���� Ŀ������ �ε��� �ٲ�¼ӵ� ����
		
		//��ư�����ڸ��� �ٷ� �����̵����ϰ� ���ʿ� �ű�. �ǵ����ڸ���
		if((direction & move_left) == move_left)
			x -= speed;
		if((direction & move_up) == move_up)
			y -= speed;
		if((direction & move_right) == move_right)
			x += speed;		
		if((direction & move_down) == move_down)
			y += speed;
		
		System.out.println(Integer.toBinaryString(direction));
		
		//�����Ǻ��� ���� ����Ǿ����. �ȱ׷��� ������ ���°� �ѹ� �鰡�°���(����Ǵ°� �ѹ�������)
		x += vx;
		y += vy;

		//if(distance <= 1) {
		
		//���������� ���ǵ�ڽ� ���� �ȿ� ���Դٸ� ���� 0���� �������
		if((this.x-speed<x && x<this.x+speed) &&
				(this.y-speed<y && y<this.y+speed))		
		{
			vx = vy = 0;
			return; // 0�� �Ǹ� �ؿ����� ������ �ȵǵ��� �̰� �Ⱦ��� ��� distance����.
		}
		
		//distance -= speed;
	}
	
	// ��repaintȣ�������ν� �̰ŵ�(���ӽ�����)���������忡�� ����Ǵ°���.
	public void draw(Graphics g) {
		
		// GameCanvas2Fighter canvas = new GameCanvas2Fighter();
		GameCanvas2Fighter canvas = GameCanvas2Fighter.getInstance(); // �̰� ���� ����. �����Ҷ�
		int x = (int) this.x;
		int y = (int) this.y;
		
		int w = img.getWidth(canvas)/7; // �������߽ɺη� �����ϴ°�
		int h = img.getHeight(canvas);
		
		int offx = w/2;
		int offy = h/2;
		
		int dx1 = x-offx;
		int dy1 = y-offy;
		int dx2 = dx1+w;
		int dy2 = dy1+h;
		
		int sx1 = 0+w*imgIndex;
		int sy1 = 0;
		int sx2 = sx1+w;
		int sy2 = sy1+h;
		
		System.out.println(offx+", "+offy);
		
		//g.drawImage(img,x,y,null); // ���⼭ this�� ����ĵ������ �ƴ�. null�� ���� �� 
		//g.drawImage(img, x-offx, y-offy, canvas);
		g.drawImage(img, 
				dx1,dy1,dx2,dy2, 
				sx1,sy1,sx2,sy2,
				canvas);
		g.drawRect(x-offx, y-offy, 64, 64); // �̹����׷����±���Ȯ���Ϸ���
	}
	
	public Missile fire() {
		return new Missile(x,y-32);
	}


	public void moveBy(int direction) {
		//direction�� move_up�� �ֳ�?
		this.direction=direction;
		}
		
	}


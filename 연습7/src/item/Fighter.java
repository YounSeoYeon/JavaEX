package item;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import ui.gamecan;

public class Fighter {
	
	public static final int NONE = 0;
	public static final int UP = 0b0001;
	public static final int RIGHT = 0b0010;
	public static final int DOWN = 0b0100;
	public static final int LEFT = 0b1000;
	private int w;
	private int h;
	private double x;
	private double y;
	private double dx;
	private double dy;
	private double vx;
	private double vy;
	private int distance;	
	private int dir;
	private int speed;
	private Image img;
	private int imgind;
	private int inter;

	public Fighter(double x, double y) {
		img = Toolkit.getDefaultToolkit().getImage("res/image/fighter.png");
		this.x = x;
		this.y = y;
		dx = dy = vx = vy = 0;
		imgind = 3;
		distance = 1;
		dir = NONE;
		speed = 5;
		inter = 0;
	}

	public void move(int x, int y) {

		if((this.x-speed<x && x<this.x+speed) && (this.y-speed<y && y<this.y+speed)) {
				return;		
		}
		
		dx = x;
		dy = y;
		
		double w = dx-this.x;
		double h = dy-this.y;
		distance = (int)Math.sqrt(w*w+h*h);		
		
		vx = w/distance*speed;
		vy = h/distance*speed;				
	}

	public void moveby(int direction) {
		dir = direction;
	}

	public void draw(Graphics g) {		
		Canvas can = gamecan.getinstance();
		w = img.getWidth(can)/7;
		h = img.getHeight(can);
		
		int x = (int)this.x;
		int y = (int)this.y;
		int offx = w/2;
		int offy = h/2;
		int dx1 = x-offx;
		int dy1 = y-offy;
		int dx2 = dx1+w;
		int dy2 = dy1+h;
		int sx1 = w*imgind;
		int sy1 = 0;
		int sx2 = sx1+w;
		int sy2 = h;
		g.drawImage(img, 
				dx1, dy1, dx2, dy2, 
				sx1, sy1, sx2, sy2, 
				gamecan.getinstance());
		g.drawRect(x, y, 64, 64);
	}
	

	public void update() {		
		
		if((vx<0 || (dir&LEFT)==LEFT) && imgind>0 && inter==0)
			imgind--;
		else if((vx>0 || (dir&RIGHT)==RIGHT) && imgind<6 && inter==0)
			imgind++;
		else if((vx==0 && dir==0))
			imgind=3;
		inter ++;
		inter %=3;
		
		
		if((dir & UP) == UP)
			y -= speed;
		if((dir & RIGHT) == RIGHT)
			x += speed;
		if((dir & DOWN) == DOWN)
			y += speed;
		if((dir & LEFT) == LEFT)
			x -= speed;
		
		x += vx;
		y += vy;
		
		if((dx-speed<x && x<dx+speed)&&(dy-speed<y && y<dy+speed)) {
			vx = vy = 0;		
			return;
		}
		
		distance -= speed;
		System.out.printf("%f,%f\n",x,y);
	}

	public Mis fire() {
		return new Mis(x,y-32);		
	}


}

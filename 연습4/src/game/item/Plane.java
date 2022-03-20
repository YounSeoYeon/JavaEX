package game.item;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import game.ui.gamecan;

public class Plane implements item{
	
	public static final int NONE = 0;
	public static final int LEFT = 0b1000;
	public static final int UP = 0b0001;
	public static final int RIGHT = 0b0010;
	public static final int DOWN = 0b0100;

	private Image img;
	private int imgindex;
	private int imgindexduration;
	private double x;
	private double y;
	private double dx;
	private double dy;
	private double vx;
	private double vy;
	private int distance ;
	private int direction;
	private int speed;

	public Plane(int x, int y) {
		this.x = x;
		this.y = y;
		dx = dy = vx = vy = 0;
		
		distance = 1;
		direction = NONE;
		speed = 5;
		img = Toolkit.getDefaultToolkit().getImage("res/image/fighter.png");
		imgindex = 3;
		imgindexduration = 0;
	}
	
	public void moveBy(int dir) {
		direction = dir;
	}
	
	public Missile fire() {
		return new Missile(x,y-32);
	}

	public void draw(Graphics g) {
		gamecan ca = gamecan.getinstance();
		int x = (int) this.x;
		int y = (int) this.y;
		
		int w = img.getWidth(ca)/7;
		int h = img.getHeight(ca);
		
		int offx = w/2;
		int offy = h/2;
		
		int dx1 = x-offx;
		int dy1 = y-offy;
		int dx2 = dx1+w;
		int dy2 = dy1+h;
		int sx1 = w*imgindex;
		int sy1 = 0;
		int sx2 = sx1+w;
		int sy2 = h;
				
		g.drawImage(img, 
				dx1, dy1, dx2, dy2, 
				sx1, sy1, sx2, sy2, 
				ca);
		g.drawRect(x-offx, y-offy, 64, 64);
	}

	public void move(int x, int y) {
		if((this.x-speed<x && x<this.x+speed)&&(this.y-speed<y && y<this.y+speed)) 
		{
			return;
		}
		
		dx = x;
		dy = y;
		
		double w = (dx-this.x);
		double h = (dy-this.y);
		distance = (int)Math.sqrt(w*w+h*h); 

		vx = (dx - this.x) / distance*speed;
		vy = (dy - this.y) / distance*speed;
	}

	public void update() {
		
		if((vx<0 || (direction&LEFT) == LEFT) && imgindex>0 && imgindexduration==0)
			imgindex--;
		else if ((vx>0 || (direction&RIGHT) == RIGHT) && imgindex<6 && imgindexduration==0)
			imgindex++;
		else if (vx==0 && direction==0)
			imgindex = 3;
		
		imgindexduration++;
		imgindexduration %= 10;
		
		if((direction&UP) == UP) // dir&up!=0ÀÌ°ÅµµµÊ
			y -= speed;
		if((direction&RIGHT) == RIGHT)
			x += speed;
		if((direction&DOWN) == DOWN)
			y += speed;
		if((direction&LEFT) == LEFT)
			x -= speed;	
		
		x += vx;
		y += vy;		

		if ((dx-speed<x && x<dx+speed)&&(dy-speed<y && y<dy+speed)) {
			vx = 0;
			vy = 0;
			return;
		} 		
		distance -= speed;
	}

	@Override
	public boolean outsideOfBounds() {
		// TODO Auto-generated method stub
		return false;
	}



}

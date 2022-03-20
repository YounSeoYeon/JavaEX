package item;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import ui.gamecan;

public class Fig implements Item{
	
	private double x;
	private double y;
	private double vx;
	private double vy;
	private double dx;
	private double dy;
	private int speed;
	private int dis; 
	private Image img;
	private int dir;
	public static final int NONE = 0;
	public static final int UP = 0b0001;
	public static final int RIGHT = 0b0010;
	public static final int DOWN = 0b0100;
	public static final int LEFT = 0b1000;
	
	public Fig(double x, double y) {
		img = Toolkit.getDefaultToolkit().getImage("res/image/fighter1.png");
		this.x = x;
		this.y = y;
		dx = dy = vx = vy = 0;
		dis = 1;
		speed = 5;
		dir = NONE;	
		}

	public void draw(Graphics g) {	
		int x = (int) this.x;
		int y = (int) this.y;
		int offx = 32;
		int offy = 32;
		g.drawImage(img, x-offx, y-offy, gamecan.getinstance());
		g.drawRect(x, y, 64, 64);
	}
	
	public void move(int x, int y) {
		
		if ((this.x - speed < x && x < this.x + speed) && (this.y - speed < y && y < this.y + speed)) {
			return;		
		}
		
		dx = x;
		dy = y;
		
		double w = dx-this.x;
		double h = dy-this.y;
		dis = (int)Math.sqrt((w*w+h*h));
		
		vx = w /dis*speed;
		vy = h /dis*speed;
	}

	public void moveby(int direction) {
		this.dir = direction;	
	}
	
	public void update() {			
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
		
		if ((dx - speed < x && x < dx + speed) && (dy - speed < y && y < dy + speed)) {
			vx = vy = 0;
			return;		
		}
		
		dis -= speed;
	}

	public Mis fire() {
		return new Mis(x,y-32);
	}

	@Override
	public boolean indout() {
		// TODO Auto-generated method stub
		return false;
	}


	

}

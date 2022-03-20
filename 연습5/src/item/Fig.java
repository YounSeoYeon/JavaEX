package item;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import ui.gamecan;

public class Fig {
	
	private double x;
	private double y;
	private double vx;
	private double vy;
	private double dx;
	private double dy;
	private int imgindex;
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
		img = Toolkit.getDefaultToolkit().getImage("res/image/fighter.png");
		this.x = x;
		this.y = y;
		dx = dy = vx = vy = 0;
		imgindex = 3;
		dis = 1;
		speed = 3;
		dir = 0;	
		}

	public void draw(Graphics g) {
		Canvas ca = gamecan.getinstance();
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
		g.drawRect(x, y, 64, 64);
	}
	
	public void move(int x, int y) {

		if((this.x-speed<x && x<this.x+speed)&&(this.y-speed<y && y<this.y+speed)) 
		{
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
		if((vx<0 || (dir&LEFT) == LEFT) && imgindex>0)
			imgindex--;
		else if ((vx>0 || (dir&RIGHT) == RIGHT) && imgindex<6)
			imgindex++;
		else if (vx==0 && dir==0)
			imgindex = 3;
		
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
		
		if((dx-speed<x && x<dx+speed)&&(dy-speed<y && y<dy+speed)) 
		{
			vx = vy = 0;
			return;
		}
		
		dis -= speed;
	}


	

}
